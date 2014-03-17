<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String source = path+"/source/";

 //            http://127.0.0.1:8080/BookDinnerSystem/ziYang/register.jsp
 
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

<script type="text/javascript"  src="/BookDinnerSystem/js/jquery.js"></script>
<script type="text/javascript">

function setHead(){
	$("#home").removeAttr("class");
	$("#manager").removeAttr("class");
	$("#admin").removeAttr("class");
	$("#login").removeAttr("class");
	$("#regist").removeAttr("class");
	
	$("#regist").attr("class","active");
	
}

jQuery(function($){
setHead();//重设html头部

		var name = false;
		var passWord = false;
		var passConfig = false;
		var realName = false;
		var personId = false;
		var age = false;
		var address = false;
		var phone = false;
		var email = false;
		var qq = false;
		var re = new RegExp(/^\w\w+@\w+\.[a-zA-Z]{2,7}$/);
		var ageRe = new RegExp(/^[0-9]{1,2}$/);
		var personIdRe = new RegExp(/^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{4}$/);
		$("#name,#passWord,#passConfig,#realName,#age,#personId,#address,#phone,#email,#qq").blur(function() {
			if ($("#name").val() == "") {
				name = false;
				$("#nameTest").html("*");
			} else {
				name = true;
				$("#nameTest").html("");
			}

			if ($("#passWord").val() == "") {
				passWord = false;
				$("#passWordTest").html("*");
			} else {
				passWord = true;
				$("#passWordTest").html("");
			}

			if ($("#passConfig").val() == "") {
				passConfig = false;
				$("#passConfigTest").html("*");
			} else if ($("#passConfig").val() == ($("#passWord").val())) {
				passConfig = true;
				$("#passConfigTest").html("");
			} else {
				passConfig = false;
				$("#passConfigTest").html("两次输入的密码不一致！");
			}
			
			if ($("#realName").val() == "") {
				realName = false;
				$("#realNameTest").html("*");
			} else {
				realName = true;
				$("#realNameTest").html("");
			}
			
			
			if ($("#age").val() == "") {
				age = false;
				$("#ageTest").html("<font color='red'>*</font>");
			} else if(ageRe.test($("#age").val())==false){
				age = false;
				$("#ageTest").html("请输入正确的年龄！");
			}else{
				age = true;
				$("#ageTest").html("");
			}
			
			if ($("#personId").val() == "") {
				personId = false;
				$("#personIdTest").html("<font color='red'>*</font>");
			} else if(personIdRe.test($("#personId").val())==false){
				personId = false;
				$("#personIdTest").html("错误的身份证格式！");
			}else{
				personId = true;
				$("#personIdTest").html("");
			}
			
			if ($("#address").val() == "") {
				address = false;
				$("#addressTest").html("*");
			} else {
				address = true;
				$("#addressTest").html("");
			}

			if (re.test($("#email").val())) {
				email = true;
				$("#emailTest").html("");
			}else if($("#email").val()==""){
			email = false;
			$("#phoneTest").html("*");
			} 
			 else {
				email = false;
				$("#emailTest").html("请输入正确的Email！");
			}

			if (/^1[3,4,5,8][0-9]\d{8}$/.test($("#phone").val())) {
				phone = true;
				$("#phoneTest").html("");
			}else if($("#phone").val()==""){
			phone = false;
			$("#phoneTest").html("*");
			} 
			else {
				phone = false;
				$("#phoneTest").html("请输入正确的手机号码！");
			}

			if (/^\d+$/.test($("#qq").val())) {
				qq = true;
				$("#qqTest").html("");
			}else if($("#qq").val()==""){
				qq = false;
				$("#qqTest").html("*");
			}
			else {
				qq = false;
				$("#qqTest").html("<font color='red'>请输入正确的qq号码！</font>");
			}
			if (name && passWord && passConfig && realName && age && personId && address && phone && email && qq) {
				$("#submit").removeAttr("disabled");
			} else {
			
				$("#submit").attr("disabled", "disabled");
			}

		});


});




</script>
</head>
  
  <body>
  
  
   <jsp:include page="/basis/Head.jsp"></jsp:include>
    
    
    
    <section class="clearfix" id="maincontainer">
<div class="container clearfix">
  <h1 class="heading1"><span>注册</span></h1>
</div>

<!--Middle Part Start-->
<section class="container clearfix">
  <div class="widthcolumn3-one clearfix">
    <h2 class="heading2">Regist</h2>
    <form class="contactform clearfix" method="post">
      <ul class="clearfix">
        <li>
          <label for="name" >用户名:</label>
          <input type="text"    value="" name="name" id="name">
          <font color="red" id="nameTest">*</font>
  
        </li>
        <li>
          <label for="passWord" >密码:</label>
          <input type="password"    value=""  name="passWord" id="passWord">
          <font color="red" id="passWordTest">*</font>
        </li>
        <li>
          <label for="passConfig" >确认密码:</label>
          <input type="password"   id="passConfig" value="" >
          <font color="red" id="passConfigTest">*</font>
        </li>
        <li>
          <label for="realName" >真实姓名:</label>
          <input type="text"   id="realName" name="realName" value="">
          <font color="red" id="realNameTest">*</font>
        </li>
        <li>
          <label for="sex" >性别:</label>
          <font color="gray" id="radio">男生</font>
          <input type="radio"   id="sex" name="sex" value="boy" checked="checked">
          <font color="gray" id="radio">女生</font>
          <input type="radio"   id="sex" name="sex" value="girl">
        </li>
        <li>
          <label for="age" >年龄:</label>
          <input type="text"   id="age" name="age" value="" >
          <font color="red" id="ageTest">*</font>
        </li>
        <li>
          <label for="personId">身份证号:</label>
          <input type="text"   id="personId"name="personId"  value=""  >
          <font color="red" id="personIdTest">*</font>
        </li>
        <li>
          <label for="address" >送餐地址:</label>
          <input type="text"   id="address" name="address" value="" >
          <font color="red" id="addressTest">*</font>
        </li>
        <li>
          <label for="phone" >手机号码:</label>
          <input type="text"  id="phone" name="phone" value="" >
          <font color="red" id="phoneTest">*</font>
        </li>
        <li>
          <label for="email" >邮箱地址:</label>
          <input type="text"   id="email" name="email" value="" >
          <font color="red" id="emailTest">*</font>
        </li>
        <li>
          <label for="qq" >QQ:</label>
          <input type="text"   id="qq" name="qq" value="" >
          <font color="red" id="qqTest">*</font>
        </li>
        <li>
          <input  class="linkbutton ml120" type="submit" value="注册" id="submit" disabled="disabled">
          <input class="linkbutton" type="reset" value="撤销">
        </li>
      </ul>
    </form>
  </div>
  <div class="widthcolumn4 last">
    <h3 class="heading3">Contact Info</h3>
    <p> Lorem Ipsum is simply<br>
      dummy text of the<br>
      typesetting industr<br>
      <br>
      Phone: (123) 456-7890<br>
      Fax: (123) 456-7890<br>
      Email: team@contactus.com<br>
      Web: yourcompanyname.com<br>
    </p>
  </div>
</section>
<!--Middle container End-->
    
    
    
    
    
    
    
    
    <jsp:include page="/basis/Bottom.jsp"></jsp:include>
  </body>
</html>
