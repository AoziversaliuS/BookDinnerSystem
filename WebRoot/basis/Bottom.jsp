<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String source = path+"/source/";
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
<meta charset="utf-8">
<title>Tasty - Recipes, Food Website and Blog Template - Responsive, Html5, CSS3, jquery </title>
<meta name="description" content="Recipes Template, Food Template Recipes Blog Template, cooking, Food, chef, Responsive Template, html5 Template, html5, css3, jquery, responsive">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<script src="js/html5.js"></script>
<link href='http://fonts.googleapis.com/css?family=Noticia+Text:400,400italic,700,700italic|Crete+Round:400,400italic|Lobster|Lobster+Two:400,400italic,700,700italic' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="<%=source %>css/style.css">
<link id="color" rel="stylesheet" href="<%=source %>css/color1.css">
<link rel="stylesheet" type="text/css" href="<%=source %>fancybox/jquery.fancybox-1.3.4.css" media="screen" />
<link rel="stylesheet" href="<%=source %>css/mediaelementplayer.min.css" />
<link href="<%=source %>colorbox/colorbox.html" rel="stylesheet" type="text/css" media="screen" />
</head>
  
  <body>
   <!--Latest Event start-->
<section id="middleline" class="clearfix">
  <div class="midlinebg">
    <div class="container">
      <div class="roungloog"><img src="<%=source %>images/roundimg.png" alt="" title=""></div>
      <h1 class="textpadding"> 订餐网-世界闻名的订餐网站 </h1>
      <div class="event">
        <span class="eventdate">在这里</span>
        <span class="eventdate">，您能找到您所梦寐以求的食物。而且我们还提供送餐上门的服务。</span>
        <p><strong>In here,</strong>you can find what your dream for.</p>
      </div>
    </div>
  </div>
</section>
<!--Latest Event End-->


<!--Latest frob blog Start-->

<!--Latest frob blog End-->
<!--Middle Part End-->
<!--Footer Start-->
<footer id="footer" class="clearfix">
  <div class="footerbg clearfix">
    <ul class="footersection container">
      <li class="testimonial">
        <h4>奥兹小队</h4>
        <p class="testi">
          "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took
        </p>
    
        <span>Mr. Lorem Ipsum <br>
        C.E.O.</span>
      </li>
      <li class="links">
        <h4>李振洪</h4>
        <ul>
          <li>
            <a  href="recipedetails.html">Spicy Food Special</a>
          </li>
          <li>
            <a href="recipedetails.html">Cocktails</a>
          </li>
          <li>
            <a href="recipedetails.html">Snacks</a>
          </li>
          <li>
            <a href="recipedetails.html">Spicy Sea Food</a>
          </li>
          <li>
            <a href="recipedetails.html"> Tasty Special Food</a>
          </li>
        </ul>
      </li>
      <li class="twiitersection">
        <h4>陈健镇</h4>
        <div id="twitter">
        </div>
      </li>
      <li class="flickrsection">
        <h4>林子阳</h4>
        <div id="flickr">
          <ul id="cbox" class="thumbs">
          </ul>
        </div>
      </li>
    </ul>
  </div>
  
  <!--Social links Start-->
  <section id="social" class="container">
    <div class="leftline">@2012 All images & icons are copyright to their owners.</div>
    <div id="footersocial">
      <a class="facebook" title="Facebook" href="#">Facebook</a>
      <a class="twitter" title="Twitter" href="#">Twitter</a>
      <a class="linkedin" title="Linkedin" href="#">Linkedin</a>
      <a class="blooger" title="Blogger" href="#">Blogger</a>
      <a class="rss" title="rss" href="#">rss</a>
      <a class="dig" title="Dig" href="#">Dig</a>
      <a class="googleplus" title="Googleplus" href="#">Googleplus</a>
      <a class="skype" title="Skype" href="#">Skype</a>
      <a class="flickr" title="Flickr" href="#">Flickr</a>
    </div>
  </section>
  <!--Social links End-->
  <!--Go to Top-->
  <a title="Go Top" id="gotop" href="#">&nbsp;</a>
</footer>
<!--Footer End-->
  </body>
</html>
