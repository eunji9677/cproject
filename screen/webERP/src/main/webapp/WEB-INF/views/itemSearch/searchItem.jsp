<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<c:set var="result" value="${param.result }" />
<%
   request.setCharacterEncoding("UTF-8");
%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>품목 검색창</title>
<c:choose>
	<c:when test="${result=='searchFailed'}">
		<script type="text/javascript">
		window.onload=function(){
			alert("품번이나 품명이 틀립니다. 다시 로그인 하세요.");
		}
		</script>
	</c:when>
</c:choose>
</head>
<body>
	<form name="frmSearch" method ="get" action="${contextPath}/itemSearch/searchItem.do">
		<table border="1" width="80%" align="center">
			<tr align="center">
				<td>품번</td>
				<td>품명</td>
			</tr>
			<tr align="center">
				<td>
					<input type="text" name="Item_Code" value="" size="20">
				</td>
				<td>
					<input type="text" name="Item_Name" value="" size="20">
				</td>
			</tr>
			<tr align="center">
				<td colspan="2">
					<input type="submit" value="검색">
					<input type="reset" value="다시 입력">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>