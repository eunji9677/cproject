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
       
        .con1_search{
            padding:0;
            text-align: center;
            /* position: absolute; 칸 모잘라서 지움*/
            top: 25%;
            left: 5%;
        }
         #searchForm {
            height: 100%;
            margin: 25px 10px;
        }
        
        #button{
            position: absolute;
            right: 10px;
            top: 10px;
        }


</style>
</head>
<body>
<container1 id = contents1>
            <form id="searchForm">
                <table>
                    <tr>
                        <td>
                            모품목
                        </td>
                        <Td>
                            <input type="text" name="factory" value='${param.itemNumber }' style="width: 120px; background-color: yellow;">
                        </Td>
                        <td>
                            <a href="javascript:search1('1')"><i class="fas fa-search" style="color: blue;"></i></a>
                        </td>
                        <td>
                            <input type="text" name="ckfactory" value='${param.itemName }' style="width: 120px;" disabled>
                        </td>
                        <!-- 모품목 규격 -->
                        <td>
                            <input type="text" style="width: 150px; background-color: skyblue;" disabled>
                        </td>
                        <!-- 모품목 단위 -->
                        <td>
                            <input type="text" style="width: 120px; background-color: skyblue;" disabled>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            기준일자
                        </td>
                        <td colspan="2">
                            <input type="date" name="department" style="width: 120px;">
                        </td>
                        
                    </tr>
                </table>
                </form>
                <div id="button">
                    <input type="button" value="BOM 복사" style="padding: 5px; margin-left: 40px;"></input>
                    
                    <input type="button" value="일괄자재변경" style="padding: 5px;"></input>
                </div>
                
        </container1>
        
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