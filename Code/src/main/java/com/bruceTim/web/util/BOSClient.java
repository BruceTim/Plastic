package com.bruceTim.web.util;

import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.services.bos.BosClient;
import com.baidubce.services.bos.BosClientConfiguration;
import com.baidubce.services.bos.model.BucketSummary;
import com.baidubce.services.bos.model.CannedAccessControlList;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

/**
 * Created by BruceTim on 2017/2/6.
 */
public class BOSClient {

    private String ACCESS_KEY_ID;
    private String SECRET_ACCESS_KEY;
    private String ENDPOINT;

    private String bucketName;

    private BosClient bosClient;

    public BOSClient(String accessKeyId, String accessKey, String endpoint, String brucket){
        this.ACCESS_KEY_ID = accessKeyId;
        this.SECRET_ACCESS_KEY = accessKey;
        this.ENDPOINT = endpoint;
        this.bucketName = brucket;

        BosClientConfiguration config = new BosClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ACCESS_KEY_ID,SECRET_ACCESS_KEY));
        config.setEndpoint(ENDPOINT);
        this.bosClient = new BosClient(config);
    }

    public void createBucket () {
        // 新建一个Bucket
        bosClient.createBucket(bucketName);//指定Bucket名称
    }

    public List<BucketSummary> listBuckets () {
        // 获取用户的Bucket列表
        return bosClient.listBuckets().getBuckets();
    }

    public boolean doesBucketExist () {
        return bosClient.doesBucketExist(bucketName);
    }

    public void deleteBucket () {
        // 删除Bucket
        bosClient.deleteBucket(bucketName);
    }

    public void setBucketPrivate () {
        bosClient.setBucketAcl(bucketName, CannedAccessControlList.Private);
    }

    public void setBucketPublicRead () {
        bosClient.setBucketAcl(bucketName, CannedAccessControlList.PublicRead);
    }

    public void setBucketPublicReadWrite () {
        bosClient.setBucketAcl(bucketName, CannedAccessControlList.PublicReadWrite);
    }

    public String putObject(String fileName, File file){
        if(doesBucketExist()){
            String tag = bosClient.putObject(bucketName, fileName, file).getETag();
            if (!"".equals(tag)) {
                return generatePresignedUrl(fileName, -1);
            }
        }
        return null;
    }

    public String putObject(String fileName, InputStream inputStream){
        if(doesBucketExist()){
            String tag = bosClient.putObject(bucketName, fileName, inputStream).getETag();
            if (!"".equals(tag)) {
                return generatePresignedUrl(fileName, -1);
            }
        }
        return null;
    }

    public String putObject(String fileName, byte[] bytes){
        if(doesBucketExist()){
            String tag = bosClient.putObject(bucketName, fileName, bytes).getETag();
            if (!"".equals(tag)) {
                return generatePresignedUrl(fileName, -1);
            }
        }
        return null;
    }

    public String putObject(String fileName, String fileString){
        if(doesBucketExist()){
            String tag = bosClient.putObject(bucketName, fileName, fileString).getETag();
            if (!"".equals(tag)) {
                return generatePresignedUrl(fileName, -1);
            }
        }
        return null;
    }

    /**
     * 生成文件URL
     * @param fileName
     * @param expirationInSeconds：指定的URL有效时长，时间从当前时间算起，为可选参数，不配置时系统默认值为1800秒。
     *                           如果要设置为永久不失效的时间，可以将expirationInSeconds参数设置为 -1，不可设置为其他负数。
     * @return URL String
     */
    public String generatePresignedUrl(String fileName, int expirationInSeconds) {

        URL url = bosClient.generatePresignedUrl(bucketName, fileName, expirationInSeconds);

        //指定用户需要获取的Object所在的Bucket名称、该Object名称、时间戳、URL的有效时长

        return url.toString();
    }

}
