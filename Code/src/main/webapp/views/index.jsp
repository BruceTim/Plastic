<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%= basePath %>"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>5 Gallon Water Bottle Caps & Plastic Water Bottle Caps on sale - Best manufacturer</title>
    <meta name="keywords" content="China 5 Gallon Water Bottle Caps distributor, China Plastic Water Bottle Caps wholesaler, China Mineral Water Bottle Caps manufacturer, China No Spill Water Bottle Caps exporter" />
    <meta name="description" content="Shenzhen Baoan District Xixiang Jingli Plastic Products Factory， is a supplier and exporter of 5 Gallon Water Bottle Caps, Plastic Water Bottle Caps and Mineral Water Bottle Caps, we has good quality products & service from China.">
    <link type="text/css" rel="stylesheet" href="resources/css/style.css" media="all" />
    <link type="text/css" rel="stylesheet" href="resources/css/index.css" media="all" />
    <link type="text/css" rel="stylesheet" href="resources/css/list.css" media="all" />
    <link type="text/css" rel="stylesheet" href="resources/css/seo.css" media="all" />
    <script type="text/javascript" src="resources/plugins/jquery/jquery-1.11.1.min.js"></script>
    <script type="text/javascript" src="resources/plugins/jsrender/jsrender.min.js"></script>
    <script type="text/javascript" src="resources/js/index.js"></script>
    <script type="text/javascript" src="resources/js/functions.js"></script>
    <!--[if lt IE 9]>
        <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
        <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script type="text/javascript">
        function open_img(a,event){
            var div = a.parentNode;
            function get_pos(div){
                var pos={'left':0,'top':0}
                while(1){
                    if(!div){
                        break;
                    }
                    pos['left']+=div.offsetLeft;
                    pos['top']+=div.offsetTop;
                    div=div.offsetParent;
                }
                return pos;
            }
            var pos=get_pos(div);
            var show=document.getElementById("p_o");
            if(a.className=='col'){
                a.className='ope'
                show.style.width=121+'px';
                show.style.height='auto';
                show.style.visibility='visible';
                show.style.left=pos['left']+"px";
                show.style.top=pos['top']+17+"px";
            }else{
                a.className='col'
                show.style.visibility='hidden';
            }
        }
    </script>
    <script>
        $(function () {

        });
    </script>
</head>

<body>
<div id="maoytID" style="width:115px; height:79px;z-index: 999;position:absolute;right:40px;bottom:60px; ">
    <a href="contactnow" >
        <img src="resources/img/floatimage_2.gif" alt="ContactNow"/>
    </a>
</div>
<div class="header">
    <div class="head">
        <div class="logo">
            <a href="index" title="China 5 Gallon Water Bottle Caps Manufacturer">
                <img alt="China 5 Gallon Water Bottle Caps Manufacturer" src="resources/img/logo.gif"/>
            </a>
        </div>
        <table style="width: 450px;" class="com" cellspacing="0" cellpadding="0">
            <tr valign="middle" align="left">
                <td>
                    <p><span style="font-size:20px" id="company-name">Shenzhen Baoan District Xixiang Jingli Plastic Products Factory</span></p>

                    <p><strong>South China leading manufacturer&nbsp;in &nbsp;water bottle and Non-spill&nbsp;caps.</strong></p>
                </td>
            </tr>
        </table>
        <table class="lge" cellspacing="0" cellpadding="0">
            <tr>
                <td colspan="2">
                    <b style=" margin-top: 10px;">Sales & Support <font id="hourZone"></font></b>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <b style="margin: 1px 0;"><a style="text-decoration: none; color:#000;font-size: 12px;" href="contactnow">Request A Quote</a></b>
                </td>
            </tr>
            <tr>
                <td width="111" class="map"></td>
                <td width="129">
                    <div class="sel" id="selectlang">
                        <span>Select Language</span>
                        <a style="cursor: pointer;" class="col"></a>
                    </div>
                </td>
            </tr>
        </table>
    </div>

    <div class="menu textf">
        <ul id="head_menu">
            <li class="cur"><a href="index">Home</a></li>
            <li><a href="products/view" >Products</a></li>
            <li><a href="aboutus">About Us</a></li>
            <li><a href="factory">Factory Tour</a></li>
            <li><a href="quality">Quality Control</a></li>
            <li><a href="contactus">Contact Us</a></li>
            <li><a href="contactnow">Request A Quote</a></li>
        </ul>
        <table  cellpadding="0" cellspacing="0" style="z-index:90">
            <tr>
                <td style="padding-right: 20px;">
                    <select id="category-search">
                        <option value="0">All Categories</option>
                        <option value="1">5 Gallon Water Bottle Caps</option>
                        <option value="2">Mineral Water Bottle Caps</option>
                        <option value="3">No Spill Water Bottle Caps</option>
                        <option value="4">5 Gallon Water Bottles</option>
                        <option value="5">3 Gallon Water Bottle</option>
                        <option value="6">5 Gallon Water Bottle Handle</option>
                        <option value="7">5 Gallon Water Bottle Pump</option>
                        <option value="8">5 Gallon Preform</option>
                        <option value="9">Personalized Water Bottle Labels</option>
                        <option value="10">Plastic Flat Bottle Caps</option>
                        <option value="11">Water Bottle Cap Parts</option>
                    </select>
                </td>
                <td width="310"><input class="text_wrap" type="text" id="keyword" value=""/></td>
                <td align="left">
                    <input type="button" id="btn-search" value="" class="submit_1" />
                </td>
            </tr>
        </table>
    </div>
    <script>dealZoneHour();</script>
</div>
<div class="guide text8">
    <a href="index">Home</a>
    <span class="index-bread"></span>
</div>
<div class="main">
    <div class="left fleft">
        <ul class="l_menu bbox text8" id="nav-categories">
            <li id="catelist" class="tit" >Browse Categories</li>
            <!--分类-->
            <li id="cate_76274" >
                <strong>
                    <a href=/supplier-76274-5-gallon-water-bottle-caps title="China 5 Gallon Water Bottle Caps Supplier">5 Gallon Water Bottle Caps</a>
                </strong>
                <font color="#4E4E4E" style="display: inline-block">(12)</font>
            </li>
            <li id="cate_76275" >
                <strong>
                    <a href=/supplier-76275-plastic-water-bottle-caps title="China Plastic Water Bottle Caps Supplier">Plastic Water Bottle Caps</a>
                </strong>
                <font color="#4E4E4E" style="display: inline-block">(13)</font>
            </li>
            <li id="cate_76276" >
                <strong><a href=/supplier-76276-mineral-water-bottle-caps title="China Mineral Water Bottle Caps Supplier">Mineral Water Bottle Caps</a></strong>
                <font color="#4E4E4E" style="display: inline-block">(12)</font>
            </li>
            <li id="cate_76277" >
                <strong><a href=/supplier-76277-no-spill-water-bottle-caps title="China No Spill Water Bottle Caps Supplier">No Spill Water Bottle Caps</a></strong>
                <font color="#4E4E4E" style="display: inline-block">(12)</font>
            </li>
            <li id="cate_76278" >
                <strong><a href=/supplier-76278-5-gallon-water-bottles title="China 5 Gallon Water Bottles Supplier">5 Gallon Water Bottles</a></strong>
                <font color="#4E4E4E" style="display: inline-block">(12)</font>
            </li>
            <li id="cate_76279" >
                <strong><a href=/supplier-76279-3-gallon-water-bottle title="China 3 Gallon Water Bottle Supplier">3 Gallon Water Bottle</a></strong>
                <font color="#4E4E4E" style="display: inline-block">(12)</font>
            </li>
            <li id="cate_76280" >
                <strong><a href=/supplier-76280-5-gallon-water-bottle-handle title="China 5 Gallon Water Bottle Handle Supplier">5 Gallon Water Bottle Handle</a></strong>
                <font color="#4E4E4E" style="display: inline-block">(14)</font>
            </li>
            <li id="cate_76281" >
                <strong><a href=/supplier-76281-5-gallon-water-bottle-pump title="China 5 Gallon Water Bottle Pump Supplier">5 Gallon Water Bottle Pump</a></strong>
                <font color="#4E4E4E" style="display: inline-block">(12)</font>
            </li>
            <li id="cate_76282" >
                <strong><a href=/supplier-76282-5-gallon-preform title="China 5 Gallon Preform Supplier">5 Gallon Preform</a></strong>
                <font color="#4E4E4E" style="display: inline-block">(12)</font>
            </li>
            <li id="cate_76285" >
                <strong><a href=/supplier-76285-personalized-water-bottle-labels title="China Personalized Water Bottle Labels Supplier">Personalized Water Bottle Labels</a></strong>
                <font color="#4E4E4E" style="display: inline-block">(3)</font>
            </li>
            <li id="cate_76286" >
                <strong><a href=/supplier-76286-plastic-flat-bottle-caps title="China Plastic Flat Bottle Caps Supplier">Plastic Flat Bottle Caps</a></strong>
                <font color="#4E4E4E" style="display: inline-block">(4)</font>
            </li>
            <li id="cate_76287" >
                <strong><a href=/supplier-76287-water-bottle-cap-parts title="China Water Bottle Cap Parts Supplier">Water Bottle Cap Parts</a></strong>
                <font color="#4E4E4E" style="display: inline-block">(7)</font>
            </li>
        </ul>
        <div class="clear10"></div>
        <!-- 证书 -->
        <div class="l_cf bbox" id="Certifications">

        </div>
    </div>
    <!-- static:2016-11-21 12:02:26 -->
    <div class="right fright">
        <div class="carousel" id="carousel">
            <div style="position: absolute; left: 5px; top:5px;">
                <span class="carousel-control active">1</span>
                <span class="carousel-control">2</span>
                <span class="carousel-control">3</span>
                <span class="carousel-control">4</span>
                <span class="carousel-control">5</span>
            </div>
            <div class="cb"></div>
            <div class="carousel-pictures">
                <table width="100%" height="100%">
                    <tr>
                        <td valign="middle" align="center" class="">
                            <a href="/sale-3737957-5-gallon-water-bottle-covers-2-in-1-add-not-leaking-gasket-12-gram.html" title="China 5 Gallon Water Bottle Covers 2 In 1 Add not leaking gasket 12. gramon sales">
                                <img src="resources/img/waiting.gif" alt="China 5 Gallon Water Bottle Covers 2 In 1 Add not leaking gasket 12. gramon sales" onerror ="this.onerror='';this.src='resources/img/nophoto.gif'"/>
                            </a>
                        </td>
                        <td valign="middle" align="center" class="hidden">
                            <a href="/sale-3737957-5-gallon-water-bottle-covers-2-in-1-add-not-leaking-gasket-12-gram.html" title="China 5 Gallon Water Bottle Covers 2 In 1 Add not leaking gasket 12. gramon sales">
                                <img src="resources/img/waiting.gif" alt="China 5 Gallon Water Bottle Covers 2 In 1 Add not leaking gasket 12. gramon sales" onerror ="this.onerror='';this.src='resources/img/nophoto.gif'"/>
                            </a>
                        </td>
                        <td valign="middle" align="center" class="hidden">
                            <a href="/sale-3737957-5-gallon-water-bottle-covers-2-in-1-add-not-leaking-gasket-12-gram.html" title="China 5 Gallon Water Bottle Covers 2 In 1 Add not leaking gasket 12. gramon sales">
                                <img src="resources/img/waiting.gif" alt="China 5 Gallon Water Bottle Covers 2 In 1 Add not leaking gasket 12. gramon sales" onerror ="this.onerror='';this.src='resources/img/nophoto.gif'"/>
                            </a>
                        </td>
                        <td valign="middle" align="center" class="hidden">
                            <a href="/sale-3737957-5-gallon-water-bottle-covers-2-in-1-add-not-leaking-gasket-12-gram.html" title="China 5 Gallon Water Bottle Covers 2 In 1 Add not leaking gasket 12. gramon sales">
                                <img src="resources/img/waiting.gif" alt="China 5 Gallon Water Bottle Covers 2 In 1 Add not leaking gasket 12. gramon sales" onerror ="this.onerror='';this.src='resources/img/nophoto.gif'"/>
                            </a>
                        </td>
                        <td valign="middle" align="center" class="hidden">
                            <a href="/sale-3737957-5-gallon-water-bottle-covers-2-in-1-add-not-leaking-gasket-12-gram.html" title="China 5 Gallon Water Bottle Covers 2 In 1 Add not leaking gasket 12. gramon sales">
                                <img src="resources/img/waiting.gif" alt="China 5 Gallon Water Bottle Covers 2 In 1 Add not leaking gasket 12. gramon sales" onerror ="this.onerror='';this.src='resources/img/nophoto.gif'"/>
                            </a>
                        </td>
                    </tr>
                </table>
            </div>
            <div class="carousel-caption">
                <a class="" href="/sale-3737957-5-gallon-water-bottle-covers-2-in-1-add-not-leaking-gasket-12-gram.html" title="China 5 Gallon Water Bottle Covers 2 In 1 Add not leaking gasket 12. gram on sales  for sale">
                    5 Gallon Water Bottle Covers 2 In 1 Add not leaking gasket 12. gram
                </a>
                <a class="hidden" href="/sale-3737957-5-gallon-water-bottle-covers-2-in-1-add-not-leaking-gasket-12-gram.html" title="China 5 Gallon Water Bottle Covers 2 In 1 Add not leaking gasket 12. gram on sales  for sale">
                    5 Gallon Water Bottle Covers 2 In 1 Add not leaking gasket 12. gram
                </a>
                <a class="hidden" href="/sale-3737957-5-gallon-water-bottle-covers-2-in-1-add-not-leaking-gasket-12-gram.html" title="China 5 Gallon Water Bottle Covers 2 In 1 Add not leaking gasket 12. gram on sales  for sale">
                    5 Gallon Water Bottle Covers 2 In 1 Add not leaking gasket 12. gram
                </a>
                <a class="hidden" href="/sale-3737957-5-gallon-water-bottle-covers-2-in-1-add-not-leaking-gasket-12-gram.html" title="China 5 Gallon Water Bottle Covers 2 In 1 Add not leaking gasket 12. gram on sales  for sale">
                    5 Gallon Water Bottle Covers 2 In 1 Add not leaking gasket 12. gram
                </a>
                <a class="hidden" href="/sale-3737957-5-gallon-water-bottle-covers-2-in-1-add-not-leaking-gasket-12-gram.html" title="China 5 Gallon Water Bottle Covers 2 In 1 Add not leaking gasket 12. gram on sales  for sale">
                    5 Gallon Water Bottle Covers 2 In 1 Add not leaking gasket 12. gram
                </a>
            </div>
        </div>
        <ul class="r_hot bbox fright text8" style="width:254px;" id="product-advice">
            <li class="tit">Products</li>
            <li>
                <div class="img_y12">
                    <table width="100%" height="41" cellpadding="0" cellspacing="0">
                        <tr>
                            <td valign="middle" align="center">
                                <a style="text-align: center; vertical-align: middle; display: table-cell; width: 55px; overflow: hidden; height: 39px; "  href="/sale-3737957-5-gallon-water-bottle-covers-2-in-1-add-not-leaking-gasket-12-gram.html" title="cheap 5 Gallon Water Bottle Covers 2 In 1 Add not leaking gasket 12. gram">
                                    <img style="margin-left:0;float: none; vertical-align: middle;" alt="cheap 5 Gallon Water Bottle Covers 2 In 1 Add not leaking gasket 12. gram" src="resources/img/photo/pm5175033-5_gallon_water_bottle_covers_2_in_1_add_not_leaking_gasket_12_gram.jpg"/>
                                </a>
                            </td>
                        </tr>
                    </table>
                </div>
                <div class="tit_y12">
                    <h2 style="font-weight: normal; padding: 0pt 5px;">
                        <a id="a0" href="/sale-3737957-5-gallon-water-bottle-covers-2-in-1-add-not-leaking-gasket-12-gram.html" title="5 Gallon Water Bottle Covers 2 In 1 Add not leaking gasket 12. gram for sale">5 Gallon Water Bottle Covers 2 In 1 Add not</a>
                    </h2>
                </div>
            </li>
            <li>
                <div class="img_y12">
                    <table width="100%" height="41" cellpadding="0" cellspacing="0">
                        <tr>
                            <td valign="middle" align="center">
                                <a style="text-align: center; vertical-align: middle; display: table-cell; width: 55px; overflow: hidden; height: 39px; "  href="/sale-4471009-non-spill-5-gallon-water-bottle-caps-pe-gasket-leaking-12-3gram.html" title="cheap Non Spill 5 gallon Water Bottle Caps PE gasket leaking 12.3gram">
                                    <img style="margin-left:0;float: none; vertical-align: middle;" alt="cheap Non Spill 5 gallon Water Bottle Caps PE gasket leaking 12.3gram" src="resources/img/photo/pm5531815-non_spill_5_gallon_water_bottle_caps_pe_gasket_leaking_12_3gram.jpg"/>
                                </a>
                            </td>
                        </tr>
                    </table>
                </div>
                <div class="tit_y12">
                    <h2 style="font-weight: normal; padding: 0pt 5px;">
                        <a id="a1" href="/sale-4471009-non-spill-5-gallon-water-bottle-caps-pe-gasket-leaking-12-3gram.html" title="Non Spill 5 gallon Water Bottle Caps PE gasket leaking 12.3gram for sale">Non Spill 5 gallon Water Bottle Caps PE</a>
                    </h2>
                </div>
            </li>
            <li>
                <div class="img_y12">
                    <table width="100%" height="41" cellpadding="0" cellspacing="0">
                        <tr>
                            <td valign="middle" align="center">
                                <a style="text-align: center; vertical-align: middle; display: table-cell; width: 55px; overflow: hidden; height: 39px; "  href="/sale-4448005-55mm-plastic-water-bottle-caps-add-not-leaking-gasket-for-3-gallon-water-bottles.html" title="cheap 55mm Plastic Water Bottle Caps Add not leaking gasket for 3 gallon water bottles">
                                    <img style="margin-left:0;float: none; vertical-align: middle;" alt="cheap 55mm Plastic Water Bottle Caps Add not leaking gasket for 3 gallon water bottles" src="resources/img/photo/pm5531828-55mm_plastic_water_bottle_caps_add_not_leaking_gasket_for_3_gallon_water_bottles.jpg"/>
                                </a>
                            </td>
                        </tr>
                    </table>
                </div>
                <div class="tit_y12">
                    <h2 style="font-weight: normal; padding: 0pt 5px;">
                        <a id="a2" href="/sale-4448005-55mm-plastic-water-bottle-caps-add-not-leaking-gasket-for-3-gallon-water-bottles.html" title="55mm Plastic Water Bottle Caps Add not leaking gasket for 3 gallon water bottles for sale">55mm Plastic Water Bottle Caps Add not</a>
                    </h2>
                </div>
            </li>
            <li>
                <div class="img_y12">
                    <table width="100%" height="41" cellpadding="0" cellspacing="0">
                        <tr>
                            <td valign="middle" align="center">
                                <a style="text-align: center; vertical-align: middle; display: table-cell; width: 55px; overflow: hidden; height: 39px; "  href="/sale-3875047-plastic-water-bottle-caps-three-piece-suit-and-not-leaking-gasket.html" title="cheap Plastic Water Bottle Caps three-piece suit and not leaking gasket">
                                    <img style="margin-left:0;float: none; vertical-align: middle;" alt="cheap Plastic Water Bottle Caps three-piece suit and not leaking gasket" src="resources/img/photo/pm5531819-plastic_water_bottle_caps_three_piece_suit_and_not_leaking_gasket.jpg"/>
                                </a>
                            </td>
                        </tr>
                    </table>
                </div>
                <div class="tit_y12">
                    <h2 style="font-weight: normal; padding: 0pt 5px;">
                        <a id="a3" href="/sale-3875047-plastic-water-bottle-caps-three-piece-suit-and-not-leaking-gasket.html" title="Plastic Water Bottle Caps three-piece suit and not leaking gasket for sale">Plastic Water Bottle Caps three-piece suit</a>
                    </h2>
                </div>
            </li>
            <li>
                <div class="img_y12">
                    <table width="100%" height="41" cellpadding="0" cellspacing="0">
                        <tr>
                            <td valign="middle" align="center">
                                <a style="text-align: center; vertical-align: middle; display: table-cell; width: 55px; overflow: hidden; height: 39px; "  href="/sale-3725121-eco-friendly-water-bottles-caps-smart-lids-food-grade-caps-for-5-gallon-water-jugs.html" title="cheap Eco Friendly Water Bottles Caps Smart Lids , Food grade caps for 5 gallon water jugs">
                                    <img style="margin-left:0;float: none; vertical-align: middle;" alt="cheap Eco Friendly Water Bottles Caps Smart Lids , Food grade caps for 5 gallon water jugs" src="resources/img/photo/pm5143072-eco_friendly_water_bottles_caps_smart_lids_food_grade_caps_for_5_gallon_water_jugs.jpg"/>
                                </a>
                            </td>
                        </tr>
                    </table>
                </div>
                <div class="tit_y12">
                    <h2 style="font-weight: normal; padding: 0pt 5px;">
                        <a id="a4" href="/sale-3725121-eco-friendly-water-bottles-caps-smart-lids-food-grade-caps-for-5-gallon-water-jugs.html" title="Eco Friendly Water Bottles Caps Smart Lids , Food grade caps for 5 gallon water jugs for sale">Eco Friendly Water Bottles Caps Smart Lids ,</a>
                    </h2>
                </div>
            </li>
        </ul>
        <div class="clear10"></div>
        <div class="r_pro bbox topProduct" id="topProduct">
            <div class="tit">Top Products</div>
            <div class="cb"></div>
            <h1 class="index-top-tip1" style="padding: 12px 10px 5px 22px; color:#036;font-weight: normal;">
                We are good quality supplier of 5 Gallon Water Bottle Caps, Plastic Water Bottle Caps and Mineral Water Bottle Caps from China
            </h1>
            <div class="cb"></div>
            <dl class="text8">
                <dt>
                    <a href='/sale-3875038-qs-sgs-5-gallon-water-bottle-caps-2-in-1-customized-color-10-5gram.html' title="Best QS / SGS 5 Gallon Water Bottle Caps 2 In 1 Customized Color 10.5gram">
                        <img onload="pic_reset(this,'140,100');" onerror="this.onerror='';this.src='resources/img/nophoto.gif'" src="resources/img/photo/pd5175124-qs_sgs_5_gallon_water_bottle_caps_2_in_1_customized_color_10_5gram.jpg" alt="Best QS / SGS 5 Gallon Water Bottle Caps 2 In 1 Customized Color 10.5gram"/>
                    </a>
                </dt>
                <dd>
                    <div>
                        <h2>
                            <a href='/sale-3875038-qs-sgs-5-gallon-water-bottle-caps-2-in-1-customized-color-10-5gram.html' title="QS / SGS 5 Gallon Water Bottle Caps 2 In 1 Customized Color 10.5gram onsales">QS / SGS 5 Gallon Water Bottle Caps 2 In 1 Customized Color 10.5gram</a>
                        </h2>
                    </div>
                </dd>
            </dl>
            <dl class="text8">
                <dt>
                    <a href='/sale-3875025-don-leak-sealing-lid-5-gallon-water-bottle-caps-55mm-bottle-neck.html' title="Best Don leak sealing lid 5 Gallon Water Bottle Caps 55mm bottle neck">
                        <img onload="pic_reset(this,'140,100');" onerror="this.onerror='';this.src='resources/img/nophoto.gif'" src="resources/img/photo/pd5143267-don_leak_sealing_lid_5_gallon_water_bottle_caps_55mm_bottle_neck.jpg" alt="Best Don leak sealing lid 5 Gallon Water Bottle Caps 55mm bottle neck"/>
                    </a>
                </dt>
                <dd>
                    <div>
                        <h2>
                            <a href='/sale-3875025-don-leak-sealing-lid-5-gallon-water-bottle-caps-55mm-bottle-neck.html' title="Don leak sealing lid 5 Gallon Water Bottle Caps 55mm bottle neck onsales">Don leak sealing lid 5 Gallon Water Bottle Caps 55mm bottle neck</a>
                        </h2>
                    </div>
                </dd>
            </dl>
            <dl class="text8">
                <dt>
                    <a href='/sale-3875007-18-9l-non-spill-5-gallon-water-jug-caps-36-5mm-height-5-gal-water-bottle-caps.html' title="Best 18.9L Non Spill 5 Gallon Water Jug Caps 36.5mm Height , 5 Gal Water Bottle Caps">
                        <img onload="pic_reset(this,'140,100');" onerror="this.onerror='';this.src='resources/img/nophoto.gif'" src="resources/img/photo/pd5143242-18_9l_non_spill_5_gallon_water_jug_caps_36_5mm_height_5_gal_water_bottle_caps.jpg" alt="Best 18.9L Non Spill 5 Gallon Water Jug Caps 36.5mm Height , 5 Gal Water Bottle Caps"/>
                    </a>
                </dt>
                <dd>
                    <div><h2><a href='/sale-3875007-18-9l-non-spill-5-gallon-water-jug-caps-36-5mm-height-5-gal-water-bottle-caps.html' title="18.9L Non Spill 5 Gallon Water Jug Caps 36.5mm Height , 5 Gal Water Bottle Caps onsales">18.9L Non Spill 5 Gallon Water Jug Caps 36.5mm Height , 5 Gal Water Bottle Caps</a></h2></div>
                </dd>
            </dl>
            <dl class="text8">
                <dt>
                    <a href='/sale-3875020-fda-5-gallon-water-bottle-caps-green-disposable-sticker-gasket.html' title="Best FDA 5 Gallon Water Bottle Caps green disposable sticker gasket">
                        <img onload="pic_reset(this,'140,100');" onerror="this.onerror='';this.src='resources/img/nophoto.gif'" src="resources/img/photo/pd5143221-fda_5_gallon_water_bottle_caps_green_disposable_sticker_gasket.jpg" alt="Best FDA 5 Gallon Water Bottle Caps green disposable sticker gasket"/>
                    </a>
                </dt>
                <dd>
                    <div>
                        <h2>
                            <a href='/sale-3875020-fda-5-gallon-water-bottle-caps-green-disposable-sticker-gasket.html' title="FDA 5 Gallon Water Bottle Caps green disposable sticker gasket onsales">FDA 5 Gallon Water Bottle Caps green disposable sticker gasket</a>
                        </h2>
                    </div>
                </dd>
            </dl>
            <div class="clear"></div>
            <dl class="text8">
                <dt>
                    <a href='/sale-5448288-pc-5-gallon-water-bottles-5-gallon-bottle.html' title="Best PC 5 Gallon Water Bottles / 5 gallon bottle">
                        <img onload="pic_reset(this,'140,100');" onerror="this.onerror='';this.src='resources/img/nophoto.gif'" src="resources/img/photo/pd8735662-pc_5_gallon_water_bottles_5_gallon_bottle.jpg" alt="Best PC 5 Gallon Water Bottles / 5 gallon bottle"/>
                    </a>
                </dt>
                <dd>
                    <div>
                        <h2>
                            <a href='/sale-5448288-pc-5-gallon-water-bottles-5-gallon-bottle.html' title="PC 5 Gallon Water Bottles / 5 gallon bottle onsales">PC 5 Gallon Water Bottles / 5 gallon bottle</a>
                        </h2>
                    </div>
                </dd>
            </dl>
            <dl class="text8">
                <dt>
                    <a href='/sale-5448288-pc-5-gallon-water-bottles-5-gallon-bottle.html' title="Best PC 5 Gallon Water Bottles / 5 gallon bottle">
                        <img onload="pic_reset(this,'140,100');" onerror="this.onerror='';this.src='resources/img/nophoto.gif'" src="resources/img/photo/pd8735662-pc_5_gallon_water_bottles_5_gallon_bottle.jpg" alt="Best PC 5 Gallon Water Bottles / 5 gallon bottle"/>
                    </a>
                </dt>
                <dd>
                    <div>
                        <h2>
                            <a href='/sale-5448288-pc-5-gallon-water-bottles-5-gallon-bottle.html' title="PC 5 Gallon Water Bottles / 5 gallon bottle onsales">PC 5 Gallon Water Bottles / 5 gallon bottle</a>
                        </h2>
                    </div>
                </dd>
            </dl>
            <dl class="text8">
                <dt>
                    <a href='/sale-5448288-pc-5-gallon-water-bottles-5-gallon-bottle.html' title="Best PC 5 Gallon Water Bottles / 5 gallon bottle">
                        <img onload="pic_reset(this,'140,100');" onerror="this.onerror='';this.src='resources/img/nophoto.gif'" src="resources/img/photo/pd8735662-pc_5_gallon_water_bottles_5_gallon_bottle.jpg" alt="Best PC 5 Gallon Water Bottles / 5 gallon bottle"/>
                    </a>
                </dt>
                <dd>
                    <div>
                        <h2>
                            <a href='/sale-5448288-pc-5-gallon-water-bottles-5-gallon-bottle.html' title="PC 5 Gallon Water Bottles / 5 gallon bottle onsales">PC 5 Gallon Water Bottles / 5 gallon bottle</a>
                        </h2>
                    </div>
                </dd>
            </dl>
            <dl class="text8">
                <dt>
                    <a href='/sale-5448288-pc-5-gallon-water-bottles-5-gallon-bottle.html' title="Best PC 5 Gallon Water Bottles / 5 gallon bottle">
                        <img onload="pic_reset(this,'140,100');" onerror="this.onerror='';this.src='resources/img/nophoto.gif'" src="resources/img/photo/pd8735662-pc_5_gallon_water_bottles_5_gallon_bottle.jpg" alt="Best PC 5 Gallon Water Bottles / 5 gallon bottle"/>
                    </a>
                </dt>
                <dd>
                    <div>
                        <h2>
                            <a href='/sale-5448288-pc-5-gallon-water-bottles-5-gallon-bottle.html' title="PC 5 Gallon Water Bottles / 5 gallon bottle onsales">PC 5 Gallon Water Bottles / 5 gallon bottle</a>
                        </h2>
                    </div>
                </dd>
            </dl>
            <div class="clear"></div>
            <dl class="text8">
                <dt>
                    <a href='/sale-5448288-pc-5-gallon-water-bottles-5-gallon-bottle.html' title="Best PC 5 Gallon Water Bottles / 5 gallon bottle">
                        <img onload="pic_reset(this,'140,100');" onerror="this.onerror='';this.src='resources/img/nophoto.gif'" src="resources/img/photo/pd8735662-pc_5_gallon_water_bottles_5_gallon_bottle.jpg" alt="Best PC 5 Gallon Water Bottles / 5 gallon bottle"/>
                    </a>
                </dt>
                <dd>
                    <div>
                        <h2>
                            <a href='/sale-5448288-pc-5-gallon-water-bottles-5-gallon-bottle.html' title="PC 5 Gallon Water Bottles / 5 gallon bottle onsales">PC 5 Gallon Water Bottles / 5 gallon bottle</a>
                        </h2>
                    </div>
                </dd>
            </dl>
            <dl class="text8">
                <dt>
                    <a href='/sale-5448288-pc-5-gallon-water-bottles-5-gallon-bottle.html' title="Best PC 5 Gallon Water Bottles / 5 gallon bottle">
                        <img onload="pic_reset(this,'140,100');" onerror="this.onerror='';this.src='resources/img/nophoto.gif'" src="resources/img/photo/pd8735662-pc_5_gallon_water_bottles_5_gallon_bottle.jpg" alt="Best PC 5 Gallon Water Bottles / 5 gallon bottle"/>
                    </a>
                </dt>
                <dd>
                    <div>
                        <h2>
                            <a href='/sale-5448288-pc-5-gallon-water-bottles-5-gallon-bottle.html' title="PC 5 Gallon Water Bottles / 5 gallon bottle onsales">PC 5 Gallon Water Bottles / 5 gallon bottle</a>
                        </h2>
                    </div>
                </dd>
            </dl>
            <dl class="text8">
                <dt>
                    <a href='/sale-5448288-pc-5-gallon-water-bottles-5-gallon-bottle.html' title="Best PC 5 Gallon Water Bottles / 5 gallon bottle">
                        <img onload="pic_reset(this,'140,100');" onerror="this.onerror='';this.src='resources/img/nophoto.gif'" src="resources/img/photo/pd8735662-pc_5_gallon_water_bottles_5_gallon_bottle.jpg" alt="Best PC 5 Gallon Water Bottles / 5 gallon bottle"/>
                    </a>
                </dt>
                <dd>
                    <div>
                        <h2>
                            <a href='/sale-5448288-pc-5-gallon-water-bottles-5-gallon-bottle.html' title="PC 5 Gallon Water Bottles / 5 gallon bottle onsales">PC 5 Gallon Water Bottles / 5 gallon bottle</a>
                        </h2>
                    </div>
                </dd>
            </dl>
            <dl class="text8">
                <dt>
                    <a href='/sale-5448288-pc-5-gallon-water-bottles-5-gallon-bottle.html' title="Best PC 5 Gallon Water Bottles / 5 gallon bottle">
                        <img onload="pic_reset(this,'140,100');" onerror="this.onerror='';this.src='resources/img/nophoto.gif'" src="resources/img/photo/pd8735662-pc_5_gallon_water_bottles_5_gallon_bottle.jpg" alt="Best PC 5 Gallon Water Bottles / 5 gallon bottle"/>
                    </a>
                </dt>
                <dd>
                    <div>
                        <h2>
                            <a href='/sale-5448288-pc-5-gallon-water-bottles-5-gallon-bottle.html' title="PC 5 Gallon Water Bottles / 5 gallon bottle onsales">PC 5 Gallon Water Bottles / 5 gallon bottle</a>
                        </h2>
                    </div>
                </dd>
            </dl>
            <div class="clear"></div>
            <dl class="text8">
                <dt>
                    <a href='/sale-5448288-pc-5-gallon-water-bottles-5-gallon-bottle.html' title="Best PC 5 Gallon Water Bottles / 5 gallon bottle">
                        <img onload="pic_reset(this,'140,100');" onerror="this.onerror='';this.src='resources/img/nophoto.gif'" src="resources/img/photo/pd8735662-pc_5_gallon_water_bottles_5_gallon_bottle.jpg" alt="Best PC 5 Gallon Water Bottles / 5 gallon bottle"/>
                    </a>
                </dt>
                <dd>
                    <div>
                        <h2>
                            <a href='/sale-5448288-pc-5-gallon-water-bottles-5-gallon-bottle.html' title="PC 5 Gallon Water Bottles / 5 gallon bottle onsales">PC 5 Gallon Water Bottles / 5 gallon bottle</a>
                        </h2>
                    </div>
                </dd>
            </dl>
            <dl class="text8">
                <dt>
                    <a href='/sale-5448288-pc-5-gallon-water-bottles-5-gallon-bottle.html' title="Best PC 5 Gallon Water Bottles / 5 gallon bottle">
                        <img onload="pic_reset(this,'140,100');" onerror="this.onerror='';this.src='resources/img/nophoto.gif'" src="resources/img/photo/pd8735662-pc_5_gallon_water_bottles_5_gallon_bottle.jpg" alt="Best PC 5 Gallon Water Bottles / 5 gallon bottle"/>
                    </a>
                </dt>
                <dd>
                    <div>
                        <h2>
                            <a href='/sale-5448288-pc-5-gallon-water-bottles-5-gallon-bottle.html' title="PC 5 Gallon Water Bottles / 5 gallon bottle onsales">PC 5 Gallon Water Bottles / 5 gallon bottle</a>
                        </h2>
                    </div>
                </dd>
            </dl>
            <dl class="text8">
                <dt>
                    <a href='/sale-5448288-pc-5-gallon-water-bottles-5-gallon-bottle.html' title="Best PC 5 Gallon Water Bottles / 5 gallon bottle">
                        <img onload="pic_reset(this,'140,100');" onerror="this.onerror='';this.src='resources/img/nophoto.gif'" src="resources/img/photo/pd8735662-pc_5_gallon_water_bottles_5_gallon_bottle.jpg" alt="Best PC 5 Gallon Water Bottles / 5 gallon bottle"/>
                    </a>
                </dt>
                <dd>
                    <div>
                        <h2>
                            <a href='/sale-5448288-pc-5-gallon-water-bottles-5-gallon-bottle.html' title="PC 5 Gallon Water Bottles / 5 gallon bottle onsales">PC 5 Gallon Water Bottles / 5 gallon bottle</a>
                        </h2>
                    </div>
                </dd>
            </dl>
            <dl class="text8">
                <dt>
                    <a href='/sale-5448288-pc-5-gallon-water-bottles-5-gallon-bottle.html' title="Best PC 5 Gallon Water Bottles / 5 gallon bottle">
                        <img onload="pic_reset(this,'140,100');" onerror="this.onerror='';this.src='resources/img/nophoto.gif'" src="resources/img/photo/pd8735662-pc_5_gallon_water_bottles_5_gallon_bottle.jpg" alt="Best PC 5 Gallon Water Bottles / 5 gallon bottle"/>
                    </a>
                </dt>
                <dd>
                    <div>
                        <h2>
                            <a href='/sale-5448288-pc-5-gallon-water-bottles-5-gallon-bottle.html' title="PC 5 Gallon Water Bottles / 5 gallon bottle onsales">PC 5 Gallon Water Bottles / 5 gallon bottle</a>
                        </h2>
                    </div>
                </dd>
            </dl>
            <div class="clear"></div>
        </div>
        <div class="clear10"></div>
        <div class="r_fac bbox text8" style="height: 230px;" id="factory">

        </div>
    </div>
</div>
<!--FLAG_FRBIZ_BEGIN-->
<div class="clear10"></div>
<div class="footer bbox text8">

</div>
<div class="reserved">
    Copyright © 2015 - 2016 5gallonwaterbottlecaps.com. All rights reserved.
</div>
<!--FLAG_FRBIZ_END-->
<!--FLAG_FRBIZ_static-->
<!-- static:2016-11-21 12:02:26 -->
</body>
    <script type="text/x-jsrender" id="template-footer">
    	<ul style="width: 120px;">
        	<li class="tit"><strong>About Us</strong></li>
        	<li>
        		<strong>
                	<a title="China " href="aboutus">Company Profile</a>
            	</strong>
        	</li>
        	<li>
        		<strong>
                	<a title=" factory" href="factory">Factory Tour</a>
            	</strong>
        	</li>
        	<li>
        		<strong>
                	<a title="Good Quality 5 Gallon Water Bottle Caps Supplier" href="quality">Quality Control</a>
            	</strong>
        	</li>
    	</ul>
        {{for data}}
        	<ul style="width: 196px;">
        		<li class="tit">
		      		<strong>
		      			<a href="products/categories/{{: #data.category.id}}/view" title="{{: #data.category.categoryName}} supplier">{{: #data.category.categoryName}}</a>
		      		</strong>
	      		</li>
	      		{{for #data.products}}
	      			<li>
		      			<strong>
		      				<a href="products/{{: #data.id}}/view" title="{{: #data.productName}} supplier">{{: #data.productName}}</a>
		      			</strong>
	      			</li>
	      		{{/for}}
	        </ul>
        {{/for}}
    	<ul style="width: 120px; border:none;">
        		<li class="tit"><strong>Contact Us</strong></li>
        		<li><strong><a title="Contact Info" href="contactus">Contact Info</a></strong></li>
        		<li><strong><a title="Request A Quote" href="contactnow">Request A Quote</a></strong></li>
        		<li><strong><a title="E-Mail" href="mailto:sales@szjlpg.com">E-Mail</a></strong></li>
    	</ul>
    	<div class="clear"></div>
    </script>

    <script type="text/x-jsrender" id="template-product-list">
		<div class="clear10"></div>
		<div class="r_pro bbox">
			<div class="tit">
				<h1 class="cate-product-title">{{: category.categoryName}}</h1><b style="color:#555;font-family: arial;margin-left: -5px;font-size: 14px;">({{: category.amount}})</b>
			</div>
			{{for pageInfo.list}}
				<div class="pro">
					<div class="pho">
						<a href="products/{{: #data.id}}/view" title="{{: #data.productName}}">
							{{for #data.pictures}}
								{{if #getIndex() == 0}}
									<img onerror="this.onerror='';this.src='resources/img/nophoto.gif'" src="{{: #data}}" alt="{{: #parent.parent.productName}}"
										onload="pic_reset(this,'140,100');" />
								{{/if}}
							{{/for}}
						</a>
					</div>
					<div style="width:525px;float: left;">
						<table width="100%" cellpadding="0" cellspacing="0">
							<tr>
								<td width="80%">
									<h2>
										<a href="products/{{: #data.id}}/view" title="{{: #data.productName}}"	class="texta4">
											{{: #data.productName}}
										</a>
									</h2>
								</td>
								<td valign="top" style="width:*;padding-left:10px;">
									<div class="sub">
										<a href="contactnow" class="submit_2"></a>
									</div>
								</td>
							</tr>
						</table>
						<div class="con text8">
							{{: #data.content}}...&nbsp;&nbsp;&nbsp;&nbsp;
							<a href="products/{{: #data.id}}/view" title="{{: #data.productName}}">
								Read More
							</a>
						</div>
						<span class="fleft">{{: #data.createTime}}</span>
					</div>
					<div class="clear"></div>
				</div>
			{{/for}}
			<div class="pages" style="">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td>
							<div>
								Page 1 of 2
								<a href="supplier-76274-5-gallon-water-bottle-caps.htm">|&lt;</a>
								<a href="supplier-76274-5-gallon-water-bottle-caps.htm">&lt;&lt;prev</a>
								<a href="supplier-76274-5-gallon-water-bottle-caps.htm" class="cur">1</a>&nbsp;
								<a href="supplier-76274p2-5-gallon-water-bottle-caps.htm">2</a>&nbsp;
								<a href="supplier-76274p2-5-gallon-water-bottle-caps.htm">next&gt;&gt;</a>
								<a href="supplier-76274p2-5-gallon-water-bottle-caps.htm"> &gt;|</a>
							</div>
						</td>
					</tr>
				</table>
			</div>
		</div>
    </script>
    <script type="text/x-jsrender" id="template-product-advice">
        <ul class="r_hot bbox fright text8" style="width:254px;" id="product-advice">
            <li class="tit">Products</li>
            {{for data}}
                <li>
                    <div class="img_y12">
                        <table width="100%" height="41" cellpadding="0" cellspacing="0">
                            <tr>
                                <td valign="middle" align="center">
                                    <a style="text-align: center; vertical-align: middle; display: table-cell; width: 55px; overflow: hidden; height: 39px; "  href="products/{{: id}}/view" title="{{: productName}}">
                                        {{for pictures}}
                                            {{if #getIndex() == 0}}
                                                <img onload="pic_reset(this,'55,36');" style="margin-left:0;float: none; vertical-align: middle;" alt="{{: #parent.parent.productName}}" src="{{: #data}}"/>
                                            {{/if}}
                                        {{/for}}
                                    </a>
                                </td>
                            </tr>
                        </table>
                    </div>
                    <div class="tit_y12">
                        <h2 style="font-weight: normal; padding: 0pt 5px;">
                            <a href="products/{{: id}}/view" title="{{: productName}}" style="font-size:0.8em;">{{: productName}}</a>
                        </h2>
                    </div>
                </li>
            {{/for}}
        </ul>
    </script>
    <script type="text/x-jsrender" id="template-topProduct">
        <div class="clear10"></div>
        <div class="r_pro bbox topProduct" id="topProduct">
            <div class="tit">Top Products</div>
            <div class="cb"></div>
            <h1 class="index-top-tip1"  style="padding: 12px 10px 5px 22px; color:#036;font-weight: normal;">
                We are good quality supplier of 5 Gallon Water Bottle Caps, Plastic Water Bottle Caps and Mineral Water Bottle Caps from China
            </h1>
            <div class="cb"></div>
            {{for data.list}}
                <dl class="text8">
                    <dt>
                        <a href='products/{{: #data.id}}/view' title="{{: #data.productName}}">
                            <img onload="pic_reset(this,'140,100');" onerror="this.onerror='';this.src='resources/img/nophoto.gif'" src="{{: #data.pictures[0]}}" alt="{{: #data.productName}}"/>
                        </a>
                    </dt>
                     <dd>
                        <div>
                            <h2>
                                <a href='products/{{: #data.id}}/view' title="{{: #data.productName}}">{{: #data.productName}}</a>
                            </h2>
                        </div>
                    </dd>
                </dl>
            {{/for}}
        </div>
    </script>

    <script type="text/x-jsrender" id="template-carousel">
        <div class="carousel" id="carousel">
            <div style="position: absolute; left: 5px; top:5px;">
                {{for data}}
                    <span class="carousel-control">{{: #getIndex() + 1}}</span>
                {{/for}}
            </div>
            <div class="cb"></div>
            <div class="carousel-pictures">
                <table width="100%" height="100%">
                    <tr>
                        {{for data}}
                            <td valign="middle" align="center" class="hidden">
                                <a href="products/{{: id}}/view" title="{{: productName}}">
                                    {{for pictures}}
                                        {{if #getIndex() == 0}}
                                            <img onload="pic_reset(this,'430,250');" src="{{: #data}}" alt="{{: #parent.parent.productName}}" onerror ="this.onerror='';this.src='resources/img/nophoto.gif'"/>
                                        {{/if}}
                                    {{/for}}
                                </a>
                            </td>
                        {{/for}}
                    </tr>
                </table>
            </div>
            <div class="carousel-caption">
                {{for data}}
                    <a class="hidden" href="products/{{: id}}/view" title="{{: productName}}">
                        {{: productName}}
                    </a>
                {{/for}}
            </div>
        </div>
    </script>

    <script type="text/x-jsrender" id="template-factory">
    	<div class="tit">Factory</div>
            <div class="flpho">
            	{{for aboutus.pictures}}
                	<img class="compic hidden" alt="China 5 Gallon Water Bottle Caps Company" src="{{: #data}}" />
            	{{/for}}
            	<div style="margin-top: -30px; padding-left:180px;">
                    {{for aboutus.pictures}}
                        <span class="picid">{{: #getIndex() + 1}}</span>
                    {{/for}}
                </div>
        	</div>
     	</div>
    	<strong ><a title="China 5 Gallon Water Bottle Caps factory" href="aboutus">{{:aboutus.companyName}}</a></strong>
    	<div class="con">
        	{{: aboutus.introduction}}
            <a title="China 5 Gallon Water Bottle Caps wholesaler" href="aboutus">Read More</a>
    	</div>
    	<div class="but">
        	<a href="contactnow" class="contact_us" ></a>
    	</div>
    	<div class="qu">
        	<a title="{{: aboutus.companyName}}" href="factoryTour">Factory Tour</a>
        	<a title="Good Quality 5 Gallon Water Bottle Caps Supplier" href="quality">Quality Control</a>
    	</div>
    </script>
    <script type="text/x-jsrender" id="template-Certifications">
    	<div class="tit">Certifications</div>
        	<div class="i_m_g">
                <a href="{{: qualityControl.picture}}" target="_blank" title="Good Quality 5 Gallon Water Bottle Caps on sale">
                    <img src="{{: qualityControl.picture}}" alt="Good Quality 5 Gallon Water Bottle Caps on sale">
                </a>
            </div>
        	<div class="clear10"></div>
        	<dl class="l_msy">
	        	<dd>I'm Online Chat Now</dd>
	        	<dt style="margin-top: 5px; ">
	            	<div class="two1" style="margin-right: 5px; ">
	                	<a href="mailto:{{: contactus.email}}" target="_blank">
	                    	<img src="resources/img/email.gif" height="19 ">
	                	</a>
	            	</div>
	       		</dt>
	    	</dl>
		<div class="l_but">
			<a href="contactnow" class="contact_us" ></a>
		</div>
    </script>
</html>