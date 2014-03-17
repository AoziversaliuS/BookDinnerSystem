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

<jsp:include page="/basis/Head.jsp"></jsp:include>


<!--Middle Part End-->
<jsp:include page="/basis/Bottom.jsp"></jsp:include>
<!--Javascripts-->
<script src="js/jquery-latest.js"></script>
<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="js/jquery.isotope.min.js"></script>
<script src="js/mediaelement-and-player.min.js"></script>
<script  type="text/javascript" src="js/jquery.flexslider-min.js"></script>
<script type="text/javascript" src="js/jquery.elastislide.js"></script>
<script type="text/javascript" src="js/jquery.tweet.js"></script><script type="text/javascript" src="fancybox/jquery.mousewheel-3.0.4.pack.js"></script>
<script type="text/javascript" src="fancybox/jquery.fancybox-1.3.4.pack.js"></script>
<script  type="text/javascript" src="js/jquery.validate.js"></script>
<script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=false"></script>
<script type="text/javascript" src="js/jquery.gmap.js"></script>
<script src="js/jflickrfeed.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>
