<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
   
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title><tiles:insertAttribute name = "title"/></title>
<!-- cdn 으로 사용하는거는 네트워크가 돼야됨 사이트 닫아버리면 엉망이됨 > 편리하지만 다운받아서 넣는게 좋음 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<%-- <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel = "stylesheet">
 둘중에 하나만 사용 --%>
</head>
<body>
	<tiles:insertAttribute name = "header"/>
	
	<div class = "jumbotron" align = "center">
		<div class = "container">
			<h1 class = "display-3"><tiles:insertAttribute name = "heading"/></h1>
			<p><tiles:insertAttribute name = "subheading"/></p>
		</div>
	</div>
	
	<div class = "container">
		<div class = "row">
			<tiles:insertAttribute name = "content"/>
		</div>
	</div>
	
	<div class = "footer">
		<tiles:insertAttribute name ="footer"/>
	</div>
</body>
</html>