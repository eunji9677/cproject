<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />

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
    	a{
    		text-decoration:none;
    	}
        #wrap{
            width: 300px;
            height: 400px;
            border: 1px solid black;
        }
        #searchBox{
            width: 100%;
            height: 23%;
            border: 1px solid black;
        }
        #button{
            margin-top: 3%;
            margin-right: 3%;
            text-align: right;
        }
        #search{
            margin-left: 30px;
        }
        #view{
        	width:100%;
        	height:77%;
        	overflow:scroll;
        }
    </style>
</head>
<body>
    <div id="wrap">
        <div id="searchBox">
            <table id="search">
                <tr>
                    <td>검색1</td>
                    <td><input type="text"/></td>
                </tr>
                <tr>
                    <td>검색2</td>
                    <td><input type="text"/></td>
                </tr>
            </table>
            <div id="button">
                <button>버튼1</button>
                <button>버튼2</button>
                <button>버튼3</button>
            </div>
        </div>
        <div id="view">
            <table style="width: 100%;">
                <tr align="center">
                    <td>품목코드</td>
                    <td>품명</td>
                    <td>규격</td>
                </tr>
                <c:forEach var="bom" items="${itemView}" >     
   <tr align="center">
      <td><a href="#">${bom.itemNumber}</a></td>
      <td><a href="#">${bom.itemName}</a></td>
      <td><a href="#">${bom.standard}</a></td>
    </tr>
    </c:forEach> 
            </table>
        </div>
    </div>
    
</body>
</html>