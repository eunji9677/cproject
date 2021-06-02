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
            padding: 10px;
            right: 0;
            top: 15%;
            width: 85%;
            height: 10%;
            border: 1px solid black;
            z-index: 1;
        }
        #contents2{
            position: absolute;
            right: 0;
            top: 25%;
            width: 85%;
            height: 35%;
            border: 1px solid black;
            z-index: 1;
        }
        #contents3{
            position: absolute;
            right: 0;
            top:60%;
            width: 85%;
            height: 35%;
            border: 1px solid black;
            z-index: 1;
        }
        .con1_search{
            padding:0;
            text-align: center;
            position: absolute;
            top: 25%;
            left: 18%;
        }
        #view1,#view2{
            width: 100%;
            text-align: center;
            border: 1px solid black;
        }
      
        /* ----------------버튼-------------------- */

        #view2 td:not(.ch){
            width: 8%;
            font-size: 15px;
            font-weight: bold;
        }
        #view2 td input{
            width: 100%;
        }
        #view1 td:not(#non){
            width: 14.5%;
        }
        #view1 td input{
            width: 100%;
        }
        #view1 th{
            width: 4%;
        }

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
            font-size: 12px;
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
</style>
</head>
<body>
<container1 id = contents1>
            <table class="con1_search">
                <tr>
                    <td>사업장</td>
                    <td>
                        <input type="text">
                        <i class="fas fa-search" style="color: blue;"></i>
                    </td> 
                    <td>
                        <input type="text">
                    </td>
                    <td>거래처</td>
                    <td>
                        <input type="text"">
                        <i class="fas fa-search" style="color: blue;"></i>
                    </td>
                    <td>
                        <input type="text"">
                    </td>
                </tr>
            </table>
            <div>
                <ul class="tabs" style="left:0px; bottom:0px; position: absolute;">
                    <li class="tab-link current" data-tab="tab-1" id="month_button">창고/장소</li>
                    <li class="tab-link" data-tab="tab-2" id="things_button">생산공정/작업장</li>
                    <li class="tab-link2" data-tab="tab-3" id="set_button">외주공정/작업장</li>
                </ul>
            </div>
        </container1>
        <container2 id="contents2">
            <table id="view1">
                <thead id="month" style="display: none;">
                    <!-- 창고/장소 탭1 -->
                    <th id="non"><input type="checkbox" name="content" onclick="selectAll(this)" /></th>
                    <th>창고코드</th>
                    <th>창고명</th>
                    <th>입고기본위치</th>
                    <th>출고기본위치</th>
                    <th>창고설명</th>
                    <th>사용여부</th>
                </thead>
                <thead id="things">
                    <!-- 생산공정/작업장 -->
                    <th id="non"><input type="checkbox" name="content" onclick="selectAll(this)" /></th>
                    <th>생산공정코드</th>
                    <th>생산공정명</th>
                    <th>입고기본위치</th>
                    <th>출고기본위치</th>
                    <th>공정설명</th>
                    <th>사용여부</th>
                </thead>
                <thead id="set" style="display: none;">
                    <th id="non"><input type="checkbox" name="content" onclick="selectAll(this)" /></th>
                    <th>외주공정코드</th>
                    <th>외주공정명</th>
                    <th>입고기본위치</th>
                    <th>출고기본위치</th>
                    <th>외주공정설명</th>
                    <th>사용여부</th>
                </thead>
                <!-- <tbody id="view1" style="display: none;">
                    <td id="non"><input type="checkbox" value = "check1" id="check" name="content"/></td>
                    <td><input type="text"/></td>
                    <td><input type="text"/></td>
                    <td><input type="text"/></td>
                    <td><input type="text"/></td>
                    <td><input type="text"/></td>
                    <td><select name="" id="">
                        <option value="1">사용</option>
                        <option value="2">미사용</option>
                    </select></td>
                </tbody> -->
            </table>
        </container2>
        <container3 id="contents3">
            <table id="view2">
                <tr id="set2">
                    <td>위치코드</td>
                    <td>위치명</td>
                    <td>위치설명</td>
                    <td>사용여부</td>
                </tr>
                <tr id="month2" style="display: none;">
                    <td>작업장코드</td>
                    <td>작업장명</td>
                    <td>작업장설명</td>
                    <td>사용여부</td>
                </tr>
                <!-- <tr>
                    <td><input type="text"/></td>
                    <td><input type="text"/></td>
                    <td><input type="text"/></td>
                    <td><select name="" id="">
                        <option value="1">사용</option>
                        <option value="2">미사용</option>
                    </select></td>
                </tr> -->
            </table>
        </container3>
        <script>
        var month_button = document.getElementById('month_button');
        var things_button = document.getElementById('things_button');
        var set_button = document.getElementById('set_button');
        month_button.onclick = function(){
            var month = document.getElementById('month');
            var things = document.getElementById('things');
            var set = document.getElementById('set');
            var month2 = document.getElementById('month2');
            var set2 = document.getElementById('set2');
            month.style.display = "block";
            set.style.display = "none";
            things.style.display = "none";
            month2.style.display = "block";
            set2.style.display = "none";
            things_button.removeAttribute('id');
            set_button.removeAttribute('id');
            month_button.removeAttribute('id');
        }
        things_button.onclick = function(){
            var month = document.getElementById('month');
            var things = document.getElementById('things');
            var set = document.getElementById('set');
            var month2 = document.getElementById('month2');
            var set2 = document.getElementById('set2');
            month.style.display = "none";
            set.style.display = "none";
            things.style.display = "block";
            month2.style.display = "none";
            set2.style.display = "block";
            things_button.removeAttribute('id');
            set_button.removeAttribute('id');
            month_button.removeAttribute('id');

        }
        set_button.onclick = function(){
            var month = document.getElementById('month');
            var things = document.getElementById('things');
            var set = document.getElementById('set');
            var month2 = document.getElementById('month2');
            var set2 = document.getElementById('set2');
            month.style.display = "none";
            set.style.display = "block";
            things.style.display = "none";
            month2.style.display = "none";
            set2.style.display = "block";
            things_button.removeAttribute('id');
            set_button.removeAttribute('id');
            month_button.removeAttribute('id');
        }
        </script>
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
    </script>
</body>
</html>