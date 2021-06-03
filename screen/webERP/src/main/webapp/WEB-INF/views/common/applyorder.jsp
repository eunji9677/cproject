<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<%
request.setCharacterEncoding("UTF-8");
%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>

<style>
a {
	text-decoration: none;
}

#wrap {
	width: 1400px;
	height: 450px;
	border: 1px solid black;
}

#searchBox {
	width: 100%;
	height: 23%;
	border: 1px solid black;
}

#button {
	margin-top: 3%;
	margin-right: 3%;
	text-align: right;
}

#search {
	margin-left: 30px;
}

#view {
	width: 1400px;
	height: 800px;
	overflow: scroll;
}
</style>
</head>
<body>
	<div id="wrap">
		<div id="searchBox">
			<table id="search">
				<tr>
					<td>주문기간</td>
					<td colspan="2" style="width: 80px;"><input type="date"
						id="reqInput" style="width: 100%;" /></td>
					<td>~</td>
					<td><input type="date" id="reqInput" style="width: 100%;" /></td>
					<td></td>
				</tr>
			</table>
			<div id="button">
				<button>조회</button>
				<button>선택적용</button>
				<button>취소</button>
			</div>
		</div>
		<div id="view">
			<table style="width: 100%;">
				<thead align="center" style="background-color: gray">
					<td><input type="checkbox" name="content"
						onclick="selectAll(this)" /></td>
					<td>주문번호</td>
					<td>순서</td>
					<td>주문일자</td>
					<td>승인일자</td>
					<td>고객</td>
					<td>품번</td>
					<td>품명</td>
					<td>규격</td>
					<td>단위</td>
					<td>주문수량</td>
					<td>적용수량</td>
					<td>주문잔량</td>
					<td>출하예정일</td>
					<td>비고</td>
				</thead>
				<c:forEach var="MpsOS" items="${mpsosList}">
					<tr align="center">
						<td><input type="checkbox" name="content" /></td>
						<td><a href="#">${MpsOS.ordersno}</a></td>
						<td><a href="#">${MpsOS.sequence}</a></td>
						<td><a href="#">${MpsOS.orderdate}</a></td>
						<td><a href="#">${MpsOS.okeydate}</a></td>
						<td><a href="#">${MpsOS.buyer}</a></td>
						<td><a href="#">${MpsOS.itemnumber}</a></td>
						<td><a href="#">${MpsOS.itemName}</a></td>
						<td><a href="#">${MpsOS.standard}</a></td>
						<td><a href="#">${MpsOS.unit}</a></td>
						<td><a href="#">${MpsOS.order_quantity}</a></td>
						<td><a href="#">${MpsOS.apply_quantity}</a></td>
						<td><a href="#">${MpsOS.order_Balance}</a></td>
						<td><a href="#">${MpsOS.expected_Date}</a></td>
						<td><a href="#">${MpsOS.note}</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>

</body>
</html>