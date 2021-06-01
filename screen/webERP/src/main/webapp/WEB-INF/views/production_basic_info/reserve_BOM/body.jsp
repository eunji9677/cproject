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
            margin: 20px 10px;
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
        #workOrderTable{
            width: 100%;
            font-weight: bold;
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
                            <input type="text" name="factory" style="width: 120px; background-color: yellow;">
                        </Td>
                        <td>
                            <i class="fas fa-search" style="color: blue;"></i>
                        </td>
                        <td>
                            <input type="text" name="ckfactory" style="width: 120px;" disabled>
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
                            <input type="date" name="department" style="width: 120px; background-color: yellow;"><a href="#" onclick="showPopup();"></a>
                        </td>
                        <td>
                            <input type="checkbox">BOM 총전개
                        </td>
                        <td>
                            <input type="button" value="<< 이전품목" style="padding: 5px; margin-left: 70px;"></input>
                        </td>
                        <td>
                        <input type="button" value="다음품목 >>" style="padding: 5px;"></input>
                        </td>
                    </tr>
                </table>
                </form>
        </container1>
        <container2 id= contents2>
            <div id="workOrderInfo">
                <table id="workOrderTable">
                    <tr>
                        <td><input type="checkbox" name="content" onclick="selectAll(this)"/></td>
                        <td>LEVEL</td>
                        <td>순번</td>
                        <td>품번</td>
                        <td>품명</td>
                        <td>규격</td>
                        <td>단위</td>
                        <td>정미수량</td>
                        <td>LOSS(%)</td>
                        <td>필요수량</td>
                        <td>표준원가</td>
                        <td>실제원가</td>
                        <td>외주</td>
                        <td>사용여부</td>
                        <td>비고</td>
                    </tr>
                    <!-- BOM 역전개는 입력부 불필요 -->
                    
                </table>
            </div>
            <!-- 합계 출력부 -->
            <div id="resultWindow">
                합 계 <span style="margin-left: 100px;">정미수량 <input type="text"></span><span style="margin-left: 100px;">필요수량 <input type="text"></span>
            </div>
            <!-- 합계 출력부 종료 -->
        </container2>
      
</body>
</html>