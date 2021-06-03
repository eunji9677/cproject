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
        #contents3{
            position: absolute;
            left: 15%;
            top: 25%;
            width: 85%;
            height: 70%;
            border: 1px solid black;
            z-index: 1;
        }
        #searchForm {
            height: 100%;
            margin-left: 10px;
            margin-top: 10px;
            padding:0;
            text-align: center;
            /* position: absolute; 칸 모잘라서 지움*/
            top: 25%;
            left: 18%;
        }
        /* 탭 css */
		ul.tabs{
			margin: 0px;
			padding: 0px;
			list-style: none;
		}
		ul.tabs li{
			background: none;
			color: black;
			display: inline-block;
			padding: 5px 5px;
			cursor: pointer;
            width: 80px;
            text-align: center;
		}


		ul.tabs li.current{
			border-top: 2px solid skyblue;			
            background-color: #ddd;        
            border-top-left-radius: 8px;
            border-top-right-radius: 8px;
		}

		.tab-content{
			display: none;	
			
		}

		.tab-content.current{
			display: inherit;
		}       

        /* 테이블 css */
        #pdcTable,#pdcDetailTable{
            width: 100%;
            text-align: center;
            border: 1px solid black;
        }
        
        /* 컨테이너 파트 */
        #pdcInfo {
            float: left;
            width: 60%;
            height: 100%;
            overflow: scroll;
        }
        
        #pdcDetail{
            float: left;
            width: 40%;
            height: 100%;
            overflow: scroll;
        }

        #pdcInfo::after{
            content: "";
            display: block;
            clear: both;
        }

        #pdcDateInfo{
            width: 100%;
            height: 100%;
            overflow: scroll;
        }
</style>
</head>
<body>
<container1 id = contents1>
            <!-- 조회검색 폼 -->
                <form id="searchForm">
                    <table class="con1_search">
                        <tr>
                            <td>사업장</td>
                            <td style="width: 80px;"><input type="text" style="width: 100%; background-color: yellow;"/></td>
                            <td colspan="3"><input type="text" name="" disabled style="width: 100%;"/></td>
                            <td> <i class="fas fa-search" style="color: blue;"></i></td> 
        
                            <td colspan="5" style="width: 80px;">부서</td>
                            <td style="width: 80px;"><input type="text" style="width: 100%; background-color: yellow;"/></td>
                            <td><input type="text" name="" disabled/></td>
                            <td> <i class="fas fa-search" style="color: blue;"></i></td>
                            
                        </tr>
                        
                        <tr>
                            <td>작업예정일</td>
                            <td colspan="2" style="width: 50px;"><input type="date" style="width: 100%;"/></td>
                            <td>~</td>
                            <td ><input type="date" style="width: 100%;"/></td>
                            <td></td>
        
                            <td colspan="5" style="width: 80px;">사원</td>
                            <td style="width: 80px;"><input type="text" style="width: 100%; background-color: yellow;"/></td>
                            <td><input type="text" name="" disabled/></td>
                            <td> <i class="fas fa-search" style="color: blue;"></i></td>
                        </tr>
                    </table>
                    <ul class="tabs" style="left: 0px; bottom: 0px; position: absolute;">
                        <li class="tab-link current" data-tab="tab-1">품목별</li>
                        <li class="tab-link" data-tab="tab-2">날짜별</li>
                    </ul>
                </form>
        </container1>
        <div id="tab-1" class="tab-content current">
        <container2 id= contents2>
            <!-- 컨테이너 출력 -->
            <div id="pdcInfo">
                <table id="pdcTable">
                    <thead>
                        <td>품번</td>
                        <td>품명</td>
                        <td>규격</td>
                        <td>단위</td>
                        <td>일생산량</td>
                    </thead>
                    <!-- 테스트용 데이터, 추후 표현식으로 수정필요 -->
                    <tbody>
                   	<c:forEach var="info" items="${infoList}" >   
                     <tr>
                     	<td>${info.itemCode }</td>
                     	<td><a href="#">${info.itemName }</a></td>
                     	<td>${info.standard }</td>
                     	<td>${info.inventoryUnit }</td>
                     	<td>${info.dailyProduction }</td>
                     </tr>
                     </c:forEach>
                    </tbody>
                </table>
            </div>
            <!-- 컨테이너 출력 종료 -->
            <!-- 컨테이너 2 출력 -->
            <div id="pdcDetail">
                <table id="pdcDetailTable">
                    <thead>
                        <td><input type="checkbox" name="content2" onclick="selectAll2(this)"/></td>
                        <td>순서</td>
                        <td>작업예정일</td>
                        <td>수량</td>
                        <td>비고</td>
                        <!-- 테스트용 데이터, 추후 표현식으로 수정필요 -->
                    </thead>
                    <tbody>
                        <td><input type="checkbox" value = "check1" id="check" name="content2"/></td>
                        <td><input type="text"/></td>
                        <td><input type="date"/></td>
                        <td><input type="text"/></td>
                        <td><input type="text"/></td>
                    </tbody>
                </table>
            </div>
            <!-- 컨테이너 2 출력 종료 -->
        </container2>
    </div>
    <div id="tab-2" class="tab-content">
        <container id= contents3>
            <!-- 컨테이너 출력 -->
            <div id="pdcDateInfo">
                <table id="pdcDateTable">
                    <thead>
                        <td>품번</td>
                        <td>품명</td>
                        <td>규격</td>
                        <td>단위</td>
                        <td>일생산량</td>
                    </thead>
                    <!-- 테스트용 데이터, 추후 표현식으로 수정필요 -->
                    <tbody>
                        	<c:forEach var="info" items="${infoList}" >   
                     <tr>
                     	<td>${info.itemCode }</td>
                     	<td>${info.itemName }</td>
                     	<td>${info.standard }</td>
                     	<td>${info.inventoryUnit }</td>
                     	<td>${info.dailyProduction }</td>
                     </tr>
                     </c:forEach>
                    </tbody>
                </table>
            </div>
        </container>
      <script src="http://code.jquery.com/jquery-latest.js"></script> <!--제이쿼리최신버젼가져옴-->
     <script>
         $(document).ready(function(){
         
         $('ul.tabs li').click(function(){
             var tab_id = $(this).attr('data-tab');
     
             $('ul.tabs li').removeClass('current');
             $('.tab-content').removeClass('current');
     
             $(this).addClass('current');
             $("#"+tab_id).addClass('current');
         })
     
     })
      function selectAll2(selectAll){
            const checkbox = document.getElementsByName('content2');
            checkbox.forEach((checkbox) => {
                checkbox.checked = selectAll.checked;
            })
        }
         function selectAll3(selectAll){
             const checkbox = document.getElementsByName('content3');
             checkbox.forEach((checkbox) => {
                 checkbox.checked = selectAll.checked;
             })
         }
     </script>
</body>
</html>