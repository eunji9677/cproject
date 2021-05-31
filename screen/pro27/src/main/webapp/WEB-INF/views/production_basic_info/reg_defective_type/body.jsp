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
            height: 100%;
            width: 100%;
        }

</style>
</head>
<body>
<container1 id = contents1>
            <form id="searchForm">
                <table>
                    <tr>
                        <td>
                            불량코드
                        </td>
                        <td colspan="3">
                            <input type="text" name="factory" style="width: 100%;">
                        </td>
                        <td>
                            불량유형명
                        </td>
                        <td>
                            <input type="text" name="MDDate1" style="width: 250px;">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            불량군
                        </td>
                        <td>
                            <input type="text" name="department" style="width: 130px;">
                        </td>
                        <td>
                             <i class="fas fa-search" style="color: blue;"></i>
                        </td>
                        <td>
                            <input type="text" name="ckdepartment" style="width: 130px;" disabled >
                        </td>
                        <td>
                            불량설명
                        </td>
                        <td>
                            <input type="text" name="department" style="width: 250px;">
                        </td>
                        <td>
                            <input type="button" value="생산계획조회" style="padding: 5px; margin-left: 30px;" />
                        </td>
                    </tr>
                </table>
            </form>
        </container1>
        <container2 id= contents2>
            <div id="workOrderInfo">
                <table id="workOrderTable">
                    <thead>
                        <td><input type="checkbox" name="content" onclick="selectAll(this)"/></td>
                        <td>불량코드</td>
                        <td>불량유형명</td>
                        <td>불량군</td>
                        <td>사용여부</td>
                        <td>불량설명</td>
                    </thead>
                    <!-- 테스트용 데이터, 추후 표현식으로 수정필요 -->
                    <tbody>
                        <td><input type="checkbox" value = "check1" id="check" name="content"/></td>
                        <td><input type="text"/></td>
                        <td><input type="text"/></td>
                        <td><input type="text"/></td>
                        <td><input type="text"/></td>
                        <td><input type="text"/></td>
                    </tbody>
                </table>
            </div>
        </container2>
      
</body>
</html>