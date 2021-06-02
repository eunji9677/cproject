<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
            border: 1px solid #ccc;
            z-index: 1;
        }
        #contents2{
            position: absolute;
            left: 15%;
            top: 25%;
            width: 25%;
            height: 70%;
            border: 1px solid #ccc;
            z-index: 1;
        }
        #contents3{
            position: absolute;
            left: 40%;
            top: 25%;
            width: 60%;
            height: 70%;
            z-index: 1;
            border: 1px solid #ccc;
        }
        .con1_search {
            margin: 10px;   
        }
        
        
        #contents1 td {
            text-align: center;
            letter-spacing: 1px;
            padding: 1px;
            font-family: 'Hanna';
        }
        #contents2 td {
            border-collapse: collapse;
            padding: 3px;
        }
        #contents3 td {
            border-collapse: collapse;
            padding: 3px;
        }

        
        #contents2, #contents3 td{
            border-collapse: collapse;    
        }
        
        #contents1 input[type="text"] {
            text-align: center;
        }
        
        #contents2 input[type="text"] {
            text-align: center;
            width: 100%;
        }
        #contents3 input {
            text-align: center;
        }        
        #contents2, #contents3 {
            overflow: auto;   
        }
      
        #table1 {
            width: 70%;
            padding-top: 20px;
            padding-left: 30px;
        }
        #table2 {
            width: 91%;
            text-align: center;
        }
        #table3 {
            padding-left: 30px;
            padding-top: 15px;
            width: 100%; 
        }
        #bottom1 {
            position: absolute;
            bottom: 0px;
        }
        
        #reqInput {
            background-color: rgb(255, 255, 149);
            text-align: center;
        }
</style>
</head>
<body>
<container1 id = contents1>
            <table id="table1">
                <tr>
                    <td>품목군</td>
                    <td>
                        <input type=text style="width:80px;">
                        <i class="fas fa-search" style="color: blue;"></i>
                    </td>
                    <td>
                        <input type=text>
                    </td>
                </tr>
                <tr>
                    <td>검색조건</td>
                    <td>
                        <select name="" id="">
                            <option value="0">0.시작문자열</option>
                            <option value="1">1.포함문자열</option>
                        </select>
                    </td>
                    <td>
                        <input type="text" value=" 품번 검색" id="search1">
                    </td>
                    <td>
                        <input type="text" value=" 품명 검색" id="search2">
                    </td>
                    <td>
                        <input type="text" value=" 규격 검색" id="search3">
                    </td>
                </tr>
            </table>
        </container1>
        <container2 id= contents2>
            <table id="table2">
                <thead>
                    <td><input type="checkbox" name="content" onclick="selectAll(this)"/></td>
                    <td>품번</td>
                    <td>품명</td>
                    <td>규격</td>
                </thead>
                <tbody>
                    <td><input type="checkbox" value = "check1" id="check" name="content"/></td>
                    <td>
                        <input type="text">
                    </td>
                    <td>
                        <input type="text">
                    </td>
                    <td>
                        <input type="text">
                    </td>
                </tbody>
            </table>
            <div id=bottom1>
                <table>
                    <td>조회품목수</td>
                    <td><input type="text" style="width: 50px;">개</td>
                </table>
            </div>
        </container2>
        <container3 id="contents3">
            <table id="table3">
                <tr>
                    <td align="center">품번</td>
                    <td>
                        <input type="text" disabled>
                    </td>
                </tr>
                <tr>
                    <td align="center">품명</td>
                    <td>
                        <input type="text" disabled>
                    </td>
                </tr>
                <tr>
                    <td align="center">규격</td>
                    <td>
                        <input type="text" disabled>
                    </td>
                </tr>
                <tr>
                    <td align="center">재고단위</td>
                    <td>
                        <input type="text" id="reqInput">
                    </td>
                </tr>
                <!-- <tr>
                    <td align="center">품목군</td>
                    <td>
                        <input type="text" style="width: 70px;">
                        <button>+</button>
                        <input type="text" style="width: 100px;">
                    </td>
                </tr> -->
                <tr>
                    <td align="center">LOT여부</td>
                    <td>
                        <select name="" id="reqInput">
                            <option value="0">0.미사용</option>
                            <option value="1">1.미사용</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td align="center">SET품목</td>
                    <td>
                        <select name="" id="reqInput">
                            <option value="0">0.부</option>
                            <option value="1">1.여</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td align="center">검사여부</td>
                    <td>
                        <select name="" id="reqInput">
                            <option value="0">0.무검사</option>
                            <option value="1">1.검사</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td align="center">사용여부</td>
                    <td>
                        <select id="reqInput">
                            <option value="0.">0.부</option>
                            <option value="1">1.여</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td align="center">LOT수량</td>
                    <td>
                        <input type="text">
                    </td>
                </tr>
                <tr>
                    <td align="center">도면번호</td>
                    <td>
                        <input type="text">
                    </td>
                </tr>
                <tr>
                    <td align="center">HS CODE</td>
                    <td>
                        <input type="text">
                    </td>
                </tr>
                <tr>
                    <td align="center">폭</td>
                    <td>
                        <input type="text">
                    </td>
                </tr>
                <tr>
                    <td align="center">길이</td>
                    <td>
                        <input type="text">
                    </td>
                </tr>
                <tr>
                    <td align="center">높이</td>
                    <td>
                        <input type="text">
                    </td>
                </tr>
                <tr>
                    <td align="center">원가</td>
                    <td>
                        <input type="text">
                    </td>
                </tr>
                <tr>
                    <td align="center">비고</td>
                    <td>
                        <input type="text">
                    </td>
                </tr>
            </table>
        </container3>
        <script>
        	var search_box1 = document.getElementById('search1');
        	var search_box2 = document.getElementById('search2');
        	var search_box3 = document.getElementById('search3');
        	search_box1.onfocus = function(){
                document.getElementById("search1").value = '';
            }
            search_box1.onblur = function(){
                document.getElementById("search1").value = ' 품번 검색';
            }
            search_box2.onfocus = function(){
                document.getElementById("search2").value = '';
            }
            search_box2.onblur = function(){
                document.getElementById("search2").value = ' 품명 검색';
            }
            search_box3.onfocus = function(){
                document.getElementById("search3").value = '';
            }
            search_box3.onblur = function(){
                document.getElementById("search3").value = ' 규격 검색';
            }
        </script>
        
</body>
</html>