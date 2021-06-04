<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<%
   request.setCharacterEncoding("UTF-8");
%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
window.onload = function(){
	var itemcode = document.getElementById('itemcode');
	itemcode.onclick = function(){
		window.open('http://localhost:8090/webERP/member/codehelper.do','codehelper','width = 300, height = 200');
	}
}
</script>
<style>
#contents1{
            position: absolute;
            left: 15%;
            top: 15%;
            width: 85%;
            height: 10%;
            border: 1px solid black;
            z-index: 1;
        }
        #contents2{
            position: absolute;
            left: 15%;
            top: 25%;
            width: 85%;
            height: 70%;
            border: 1px solid black;
            z-index: 1;
        }
        .con1_search{
            padding:0;
            text-align: center;
            /* position: absolute; 칸 모잘라서 지움*/
            top: 25%;
            left: 5%;
        }
        #searchForm {
            height: 100%;
            margin: 20px 20px;
            padding:0;
            text-align: center;
        }
        /* 컨테이너 스타일부 */
        #workOrderInfo {
            overflow: scroll;
            height: 97%;
            width: 100%;
        }
        
         /* 합계 출력부 */
         #resultWindow{
            height: 3%;
            background-color: gray;
            line-height: 5%;
        }

</style>
</head>
<body>
<container1 id = contents1>
            <form id="searchForm">
                <table class="con1_search">
                    <tr>
                        <td>사업장</td>
                        <td style="width: 80px;"><input type="text" style="width: 100%; background-color: yellow;"/></td>
                        <td colspan="3"><input type="text" name="" disabled style="width: 100%;"/></td>
                        <td> <i class="fas fa-search" style="color: blue;"></i></td> 
    
                        <td colspan="4" style="width: 80px;">부서</td>
                        <td style="width: 80px;"><input type="text" style="width: 100%; background-color: yellow;"/></td>
                        <td><input type="text" name="" disabled/></td>
                        <td> <i class="fas fa-search" style="color: blue;"></i></td>
                        
                    </tr>
                    
                    <tr>
                        <td>외주처</td>
                        <td style="width: 50px;"><input type="text" style="width: 100%; background-color: yellow;"/></td>
                        <td colspan="3"><input type="text" style="width: 100%;"/></td>
                        <td> <i class="fas fa-search" style="color: blue;"></i></td>
    
                        <td colspan="4" style="width: 80px;">사원</td>
                        <td style="width: 80px;"><input type="text" style="width: 100%; background-color: yellow;"/></td>
                        <td><input type="text" name="" disabled/></td>
                        <td > <i class="fas fa-search" style="color: blue;"></i></td>

                        <td>
                            <input type="button" value="청구조회" style="padding: 5px; margin-left: 30px;"></input>
                        </td>
                        <td>
                            <input type="button" value="주문조회" style="padding: 5px;"></input>
                        </td>
                        <td>
                            <input type="button" value="생산계획조회" style="padding: 5px; " ondblclick="openWindowPop('codehelper.do#','codehelper')"></input>
                        </td>
                    </tr>
                </table>
            </form>
        </container1>
        <container2 id= contents2>
            <div id="workOrderInfo">
                <table id="workOrderTable">
					 <thead align="center" style="background-color:gray">
                        <td><input type="checkbox" name="content" onclick="selectAll(this)"/></td>
                        <td>외주지시번호</td>
                        <td>발주일</td>
                        <td>납기일</td>
                        <td>품번</td>
                        <td>품명</td>
                        <td>규격</td>
                        <td>단위</td>
                        <td>지시수량</td>
                        <td>단가</td>
                        <td>금액</td>
                        <td>상태</td>
                        <td>검사</td>
                        <td>비고</td>
                        </thead>

                    

                      <c:forEach var="out" items="${outsourcingView}" >   
                     <tr align="center">
                     <td><input type="checkbox" name="content"/></td>
                        <td>${out.workOrderNumber}</td>
                        <td>${out.instructionDate}</td>
                        <td>${out.dueDate}</td>
                        <td>${out.item_Code}</td>
                        <td>${out.item_Name}</td>
               		    <td>${out.standard}</td>
                        <td>${out.inventory_Unit}</td>
                        <td>${out.indicatedQuantity}</td>
                        <td>${out.unitPrice}</td>
                        <td>${out.price}</td>
                        <td>${out.status}</td>
                        <td>${out.inspection}</td>
                        <td>${out.note}</td>
                        
                     </tr>
                     </c:forEach>

                    
                    <!-- 테스트용 데이터, 추후 표현식으로 수정필요 -->
<tr align="center">
                        <td><input type="checkbox" name="content"/></td>
                        <td><input type="text"/></td>
                        <td><input type="date"/></td>
                        <td><input type="date"/></td>
                        <td><input type="text" id="itemcode" ondblclick="openWindowPop('/member/proplanreg.do#','proplanreg')"/></td>
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
                합 계 <span style="margin-left: 100px;"></span>지시수량 <input type="text"><span style="margin-left: 100px;">금액 <input type="text"></span>
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
          
</html>