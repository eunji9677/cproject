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
            /* position: absolute; 칸 모잘라서 지움*/
            top: 25%;
            left: 5%;
        }
        #searchForm {
            height: 100%;
            margin: 10px 20px;
            padding:0;
            text-align: center;
        }
        
        /* 컨테이너 스타일부 */
        #workOrderDetail{
            overflow: scroll;
            height: 100%;
        }
        #workOrderInfo {
            width: 100%;
            overflow: scroll;
            height: 90%;
        }
        /* 컨테이너 스타일부 종료 */
        /* 출력부 스타일부 */
        #detailPrint1{
            border: 1px solid;
            height: 10%;
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
    
                        <td colspan="5" style="width: 80px;">부서</td>
                        <td style="width: 80px;"><input type="text" style="width: 100%; background-color: yellow;"/></td>
                        <td><input type="text" name="" disabled/></td>
                        <td> <i class="fas fa-search" style="color: blue;"></i></td>
                        
                    </tr>
                    
                    <tr>
                        <td>지시기간</td>
                        <td colspan="2" style="width: 50px;"><input type="date" style="width: 100%;"/></td>
                        <td>~</td>
                        <td ><input type="date" style="width: 100%;"/></td>
                        <td></td>
    
                        <td colspan="5" style="width: 80px;">사원</td>
                        <td style="width: 80px;"><input type="text" style="width: 100%; background-color: yellow;"/></td>
                        <td><input type="text" name="" disabled/></td>
                        <td > <i class="fas fa-search" style="color: blue;"></i></td>

                        <td>
                            <input type="button" value="자재사용" style="padding: 5px; margin-left: 30px;"></input>
                        </td>
                        <td>
                            <input type="button" value="생산자원등록" style="padding: 5px;"></input>
                        </td>
                        <td>
                            <input type="button" value="검색상세" style="padding: 5px;"></input>
                        </td>
                    </tr>
                </table>
                </form>
        </container1>
        <container2 id="contents2">
             <div id="workOrderDetail">
                <table id="workOrderDetailTable">
                    <thead> 
                        <td><input type="checkbox" name="content" onclick="selectAll(this)"/></td>
                        <td>작업지시번호</td>
                        <td>자재출고상태</td>
                        <td>작업장</td>
                        <td>지시일</td>
                        <td>납기일</td>
                        <td>품번</td>
                        <td>품명</td>
                        <td>규격</td>
                        <td>단위</td>
                        <td>지시수량</td>
                        <td>실적수량</td>
                        <td>실적잔량</td>
                        <td>상태</td>
                        <td>검사</td>
                        <td>비고</td>
                    </thead>
                    <!-- 테스트용 데이터, 추후 표현식으로 수정필요 -->
                    <tbody>
                        <td><input type="checkbox" value = "check1" id="check" name="content"/></td>
                        <td><input type="text"/></td>
                        <td><input type="text"/></td>
                        <td><input type="text"/></td>
                        <td><input type="date"/></td>
                        <td><input type="date"/></td>
                        <td><input type="text"/></td>
                        <td><input type="text"/></td>
                        <td><input type="text"/></td>
                        <td><input type="text"/></td>
                        <td><input type="text"/></td>
                        <td><input type="text"/></td>
                        <td><input type="text"/></td>
                        <td><input type="text"/></td>
                        <td><input type="text"/></td>
                        <td><input type="text"/></td>
                    </tbody>
                </table>
            </div>
        </container2>
        <container3 id="contents3">
            <div id="workOrderInfo">
                <table id="workOrderTable">
                    <thead>
                        <td><input type="checkbox" name="content2" onclick="selectAll2(this)"/></td>
                        <td>작업실적번호</td>
                        <td>자재사용유무</td>
                        <td>실적일</td>
                        <td>공정</td>
                        <td>작업장</td>
                        <td>구분</td>
                        <td>실적수량</td>
                        <td>검사</td>
                        <td>비고</td>
                    </thead>
                    <!-- 테스트용 데이터, 추후 표현식으로 수정필요 -->
                    <tbody>
                        <td><input type="checkbox" value = "check1" id="check" name="content2"/></td>
                        <td><input type="text"/></td>
                        <td><input type="text"/></td>
                        <td><input type="date"/></td>
                        <td><input type="text"/></td>
                        <td><input type="text"/></td>
                        <td><input type="text"/></td>
                        <td><input type="text"/></td>
                        <td><input type="text"/></td>
                        <td><input type="text"/></td>     
                    </tbody>
                </table>
            </div>
            <!-- 컨테이너 출력 종료 -->
            <!-- 출력부 -->
            <div id="detailPrint1">
                입고 창고<input type="text" name="cargoName" style="width: 75px;"><a href="#" onclick="showPopup();"> <i class="fas fa-search"></i></a><input type="text" name="printCargoName" disabled>
                재작업<select>
                    <option>부</option>
                    <option>여</option>
                </select>
            </div>
        </container3>
      
</body>
</html>