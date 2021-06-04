<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<%
request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
#contents1 {
	position: absolute;
	left: 15%;
	top: 15%;
	width: 85%;
	height: 10%;
	border: 1px solid black;
	z-index: 1;
}

#contents2 {
	position: absolute;
	left: 15%;
	top: 25%;
	width: 85%;
	height: 70%;
	border: 1px solid black;
	z-index: 1;
}

.con1_search {
	padding: 0;
	text-align: center;
	position: absolute;
	top: 25%;
	left: 18%;
}

#view1 {
	width: 100%;
	text-align: center;
	border: 1px solid black;
}

#total {
	position: absolute;
	bottom: 0;
	left: 0;
	width: 100%;
	text-align: center;
}

#total input {
	width: 7.7%;
	text-align: justify;
	border-style: none;
	background-color: rgb(223, 223, 223);
}

#total td {
	margin: 0;
	padding: 0;
}

#contents1 div {
	position: absolute;
	right: 20px;
	top: 10px;
}
</style>
</head>
<body>
	<container1 id=contents1>
	<table class="con1_search">
		<tr>
			<td>사업장</td>
			<td style="width: 70px;"><input type="text" style="width: 100%;" /></td>
			<td><i class="fas fa-search" style="color: blue;"></td>
			<td><input type="text" disabled /></td>
			<td>품번</td>
			<td style="width: 70px;"><input type="text" style="width: 100%;" /></td>
			<td><i class="fas fa-search" style="color: blue;"></td>
			<td><input type="text" disabled /></td>
		</tr>
		<tr>
			<td>전개구분</td>
			<td colspan="3"><select name="division" style="width: 80%;">
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4" selected>4</option>
			</select>
			<td>계정구분</td>
			<td colspan="3"><select name="division" style="width: 80%;">
					<option value="">원재료</option>
					<option value="">반제품</option>
					<option value="">제품</option>
			</select></td>
			</td>
		</tr>
	</table>
	<div>
		<button>소요량전개</button>
	</div>
	</container1>
	<container2 id=contents2>
	<table id="view1">
		<thead align="center" style="background-color: gray">
			<td><input type="checkbox" name="content"
				onclick="selectAll(this)" /></td>
			<td>품번</td>
			<td>품명</td>
			<td>규격</td>
			<td>소요일자</td>
			<td>순서</td>
			<td>예정발주일</td>
			<td>예정수량</td>
			<td>단위</td>
		</thead>
		<c:forEach var="mrp" items="${mrpList}">
			<tr align="center">
				<td><input type="checkbox" name="content" /></td>
				<td>${mrp.itemnumber}</td>
				<td>${mrp.itemname}</td>
				<td>${mrp.standard}</td>
				<td>${mrp.need_date}</td>
				<td>${mrp.sequence}</td>
				<td>${mrp.expected_order}</td>
				<td>${mrp.expected_quantity}</td>
				<td>${mrp.unit}</td>
			</tr>
		</c:forEach>
	</table>
	</container2>
</body>
</html>