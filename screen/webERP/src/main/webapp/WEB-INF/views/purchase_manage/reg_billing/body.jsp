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
<script>
	function func_Popup(){
		var url = "mrpamount.do";
		var name = "mrpamount";
		var option = "width = 1500, height= 600, top = 100, left = 200"
		window.open(url, name, option);
	}
</script>
<style>
#contents1 {
	position: absolute;
	padding: 10px;
	right: 0;
	top: 15%;
	width: 85%;
	height: 10%;
	border: 1px solid black;
	z-index: 1;
}

#contents2 {
	position: absolute;
	right: 0;
	top: 25%;
	width: 85%;
	height: 35%;
	border: 1px solid black;
	z-index: 1;
}

#contents3 {
	position: absolute;
	right: 0;
	top: 60%;
	width: 85%;
	height: 35%;
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

#view1, #view2 {
	width: 100%;
	text-align: center;
	border: 1px solid black;
}

#total {
	position: absolute;
	bottom: 0;
	right: 0;
}

#button {
	position: absolute;
	top: 10px;
	right: 20px;
}

#contents3 {
	/* overflow: scroll; */
}

#total td {
	width: 10%;
}

#total td input {
	width: 100%;
}

#reqInput {
	background-color: rgb(255, 255, 149);
	text-align: center;
}
</style>
</head>
<body>
	<container1 id=contents1>
	<table class="con1_search">
		<tr>
			<td>사업장</td>
			<td style="width: 50px;"><input type="text" id="reqInput"
				style="width: 100%;" /></td>

			<td colspan="3"><input type="text" name="" disabled
				style="width: 100%;" /></td>
			<td><i class="fas fa-search" style="color: blue;"></i></td>
			<td colspan="5" style="width: 50px;">부서</td>
			<td style="width: 80px;"><input type="text" id="reqInput"
				style="width: 100%;" /></td>
			<td><input type="text" name="" disabled /></td>
			<td><i class="fas fa-search" style="color: blue;"></i></td>

		</tr>
		<tr>
			<td>요청일자</td>
			<td colspan="2" style="width: 80px;"><input type="date"
				id="reqInput" style="width: 100%;" /></td>
			<td>~</td>
			<td><input type="date" id="reqInput" style="width: 100%;" /></td>
			<td></td>
			<td colspan="5">사원</td>
			<td style="width: 80px;"><input type="text" id="reqInput"
				style="width: 100%;" /></td>
			<td><input type="text" name="" disabled /></td>
			<td><i class="fas fa-search" style="color: blue;"></i></td>
		</tr>
	</table>
	<div id="button">
		<input type="button" id="Popup" onclick="func_Popup();" value="소요량적용" />
	</div>
	</container1>
	<container2 id="contents2">
	<table id="view1">
		<thead align="center" style="background-color: gray">
			<td><input type="checkbox" name="content"/></td>
			<td>청구번호</td>
			<td>청구일자</td>
			<td>청구구분</td>
			<td>비고</td>
		</thead>
		<c:forEach var="cm" items="${cmList}">
			<tr align="center">
				<td><input type="checkbox" name="content" /></td>
				<td>${cm.claim_no}</td>
				<td>${cm.claim_date}</td>
				<td>${cm.claim_division}</td>
				<td>${cm.note}</td>
			</tr>
		</c:forEach>
	</table>
	</container2>
	<container3 id="contents3">
	<table id="view2">
				<thead align="center" style="background-color: gray">
			<td><input type="checkbox" name="content"/></td>
			<td>순서</td>
			<td>품번</td>
			<td>품명</td>
			<td>규격</td>
			<td>요청일</td>
			<td>재고단위</td>
			<td>재고단위수량</td>
			<td>청구단위</td>
			<td>청구단위수량</td>
			<td>주거래처</td>
		</thead>
		<c:forEach var="btm" items="${bottomList}">
			<tr align="center">
				<td><input type="checkbox" name="content" /></td>
				<td>${btm.sequence}</td>
					<td>${btm.itemNumber}</td>
					<td>${btm.itemName}</td>
					<td>${btm.standard}</td>
					<td>${btm.requestdate}</td>
					<td>${btm.inventory_unit}</td>
					<td>${btm.inventory_qy}</td>
					<td>${btm.claim_unit}</td>
					<td>${btm.claim_quantity}</td>
					<td>${btm.buyer}</td>
			</tr>
		</c:forEach>
	</table>
	<div id="total">
		<table>
			<tr>
				<td>발주수량합계</td>
				<td><input type="text" disabled /></td>
				<td>공급가합계</td>
				<td><input type="text" disabled /></td>
				<td>공급가합계</td>
				<td><input type="text" disabled /></td>
				<td>공급가합계</td>
				<td><input type="text" disabled /></td>
				<td>공급가합계</td>
				<td><input type="text" disabled /></td>
			</tr>
			<tr>
				<td>현재고</td>
				<td><input type="text" disabled /></td>
				<td>가용재고</td>
				<td><input type="text" disabled /></td>
				<td>입고예정량</td>
				<td><input type="text" disabled /></td>
			</tr>
		</table>
	</div>
	</container3>
</body>
</html>