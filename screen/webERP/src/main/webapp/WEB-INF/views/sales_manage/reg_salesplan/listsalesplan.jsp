<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    isELIgnored="false"  %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />

<%
  request.setCharacterEncoding("UTF-8");
%>    


<html>
<head>
<meta charset=UTF-8">
<title>회원 정보 출력창</title>
<style>
</style>
</head>
<body>
<div id="con">
<table border="1"  align="center"  width="80%">
    <tr align="center"   bgcolor="lightgreen">
      <td ><b>아이디</b></td>
      <td><b>비밀번호</b></td>
      <td><b>이름</b></td>
      <td><b>이메일</b></td>
      <td><b>가입일</b></td>
      <td><b>삭제</b></td>
   </tr>
   
 <c:forEach var="salesplan" items="${salesplansList}" >     
   <tr align="center">
      <td>${salesplan.Plan_Item_Code}</td>
      <td>${salesplan.Plan_Item_Name}</td>
      <td>${salesplan.Plan_Item_Unit}</td>
      <td>${salesplan.Plan_Item_Quantity}</td>
      <td>${salesplan.Plan_Uint_Price}</td>
      <td>${salesplan.Newplan_Item_Quabtity}</td>
      <td>${salesplan.Newplan_Item_Unit_Price}</td>
      <td>삭제하기</a></td>
    </tr>
  </c:forEach>   
</table>
<h1>회원가입</h1></a>
</div>
</body>
</html>
