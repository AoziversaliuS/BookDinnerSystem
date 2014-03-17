<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String source = path+"/source/";
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
<script type="text/javascript"  src="/BookDinnerSystem/js/jquery.js"></script>
<script type="text/javascript">
function setHead(){
	$("#home").removeAttr("class");
	$("#manager").removeAttr("class");
	$("#admin").removeAttr("class");
	$("#login").removeAttr("class");
	$("#register").removeAttr("class");
	
	$("#manager").attr("class","active");
}

jQuery(function($){
setHead();


});




</script>
</head>

  
  <body>
  <jsp:include page="/basis/Head.jsp"></jsp:include>
      此处为餐馆自定义界面. <br>
  <jsp:include page="/basis/Bottom.jsp"></jsp:include>
  </body>
</html>
