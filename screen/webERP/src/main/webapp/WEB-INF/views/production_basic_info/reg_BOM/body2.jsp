<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"    
    isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />

<%
  request.setCharacterEncoding("UTF-8");
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
		
        #contents2{
            position: absolute;
            left: 15%;
            top: 25%;
            width: 85%;
            height: 70%;
            border: 1px solid black;
            z-index: 1;
        }
        
        /* 컨테이너 스타일부 */
        #workOrderInfo {
            overflow: scroll;
            height: 97%;
            width: 100%;
        }
        #workOrderTable{
       		width:100%;
       	}
        /* 합계 출력부 */
        #resultWindow{
            height: 3%;
            background-color: gray;
            line-height: 5%;
        }
        #button{
            position: absolute;
            right: 10px;
            top: 10px;
        }


</style>
</head>
<body>

        <container2 id= contents2>
            <div id="workOrderInfo">
                <table id="workOrderTable">
                    <thead align="center" style="background-color:gray">
                        <td><input type="checkbox" name="content" onclick="selectAll(this)"/></td>
                        <td>No</td>
                        <td>품번코드</td>
                        <td>품명</td>
                        <td>규격</td>
                        <td>단위</td>
                        <td>정미수량</td>
                        <td>LOSS(%)</td>
                        <<td>필요수량</td>
                        <td>원가</td>
                        <td>외주단가</td>
                        <td>시작일자</td>
                        <td>종료일자</td>
                        <td>비고</td>
                    </thead>
                    <!-- 테스트용 데이터, 추후 표현식으로 수정필요 -->
         <c:forEach var="bom" items="${bomView}" >     
   <tr align="center">
   	  <td><input type="checkbox" name="content"/></td>
      <td>${bom.no}</td>
      <td>${bom.itemNumber}</td>
      <td>${bom.itemName}</td>
      <td>${bom.standard}</td>
      <td>${bom.unit}</td>
      <td>${bom.precisionQuantity}</td>
      <td>${bom.loss}</td>
      <td>${bom.precisionQuantity +bom.loss * 0.1 }</td>
      <td>${bom.actualCost}</td>
      <td>${bom.outSourcingUnitPrice}</td>
      <td>${bom.startDate}</td>
      <td>${bom.endDate}</td>
      <td>${bom.note}</td>
    </tr>
    </c:forEach> 
    <tr>
    <td><input type="checkbox" name="content"/></td>
    	<td><input type="text" style="width:100%" disabled/></td>
    	<td><input type="text" id="itemcode" ondblclick="search1('2')"/></td>
    	<td><input type="text" disabled/></td>
    	<td><input type="text"/></td>
    	<td><input type="text"/></td>
    	<td><input type="text"/></td>
    	<td><input type="text"/></td>
    	<td><input type="text"/></td>
    	<td><input type="text"/></td>
    	<td><input type="text"/></td>
    	<td><input type="text"/></td>
    	<td><input type="text"/></td>
    </tr>
   
                </table>
            </div>
            <!-- 합계 출력부 -->
            <div id="resultWindow">
                합 계 <span style="margin-left: 100px;">정미수량 <input type="text"></span><span style="margin-left: 100px;">필요수량 <input type="text"></span>
            </div>
            <!-- 합계 출력부 종료 -->
        </container2>
      <script>
      function search1(num){
    	  if(num == 1){
      	openWindowPop('http://localhost:8090/webERP/member/codehelper.do?div='+1,'codehelper');
    	  }
    	  else if(num == 2){
    	      	openWindowPop('http://localhost:8090/webERP/member/bomcodehelper.do?div='+2,'codehelper');

    	  }
      }
      	
      </script>
</body>
</html>