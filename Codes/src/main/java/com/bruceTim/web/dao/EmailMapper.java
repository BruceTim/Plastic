package com.bruceTim.web.dao;

import com.bruceTim.core.generic.GenericDao;
import com.bruceTim.web.model.Email;

public interface EmailMapper extends GenericDao<Email, Long>{

    int insert (Email record);

    int updateByPrimaryKey (Email record);
}