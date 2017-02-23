<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="/resources/scripts/cachebuster2.js"
	var="cachebusterjs" />
<c:url value="/resources/styles/cachebuster2.css" var="cachebustercss" />
<html>
<head>
<title>Spring MVC Resource Versioning</title>
<script src="https://code.jquery.com/jquery-2.2.3.min.js"
	integrity="sha256-a23g1Nt4dtEYOj7bR+vTu7+T8VP13humZFBJNIYoEJo="
	crossorigin="anonymous"></script>

<script src="${cachebusterjs}"></script>
<link href="${cachebustercss}" rel="stylesheet" />
</head>
<body>
	<h1>Hello versioned static resources world!</h1>

	<h4>The time on the server is ${serverTime}.</h4>

	<p>JS url: ${cachebusterjs}</p>

	<p>CSS url: ${cachebustercss}</p>

	<p>
		<button id="btnWelcome">Click Me</button>
	</p>




</body>
</html>
