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
            width: 25%;
            height: 80%;
            border: 1px solid black;
            z-index: 1;
        }
        #contents2{
            position: absolute;
            left: 40%;
            top: 15%;
            width: 60%;
            height: 80%;
            z-index: 1;
            border: 1px solid black;
        }
         #table1 {
            text-align: center; width: 100%; padding-top: 10px;
            padding-right: 10%; padding-left: 2px;
        }
        #table2 {
            width: 100%; padding-top: 10px; padding-left: 10px; text-align: center;
            border-collapse: separate; border-spacing: 0 15px; border: 1px solid black;
        }
        #table3 {
            width: 100%; padding-top: 10px; padding-left: 10px; text-align: center;
            border-collapse: separate; border-spacing: 0 15px;
        }
        #table1 td{
            border: 1px solid black;
        }      
</style>
</head>
<body>
<container id = contents1>
            <table id="table1">
                <tr>
                    <td><input type="checkbox" name="content" onclick="selectAll(this)"/></td>
                    <td>코드</td>
                    <td>관리항목명</td>
                </tr>
                <tr>
                    <td><input type="checkbox" value = "check1" id="check" name="content"/></td>
                    <td>AG</td>
                    <td>지역그룹구분</td>
                </tr>
                <tr>
                    <td><input type="checkbox" value = "check1" id="check" name="content"/></td>
                    <td>AM</td>
                    <td>지역관리구분</td>
                </tr>
                <tr>
                    <td><input type="checkbox" value = "check1" id="check" name="content"/></td>
                    <td>LA</td>
                    <td>재고조정구분</td>
                </tr>
                <tr>
                    <td><input type="checkbox" value = "check1" id="check" name="content"/></td>
                    <td>LP</td>
                    <td>구매자재구분</td>
                </tr>
                <tr>
                    <td><input type="checkbox" value = "check1" id="check" name="content"/></td>
                    <td>LQ</td>
                    <td>품질검사구분</td>
                </tr>
                <tr>
                    <td><input type="checkbox" value = "check1" id="check" name="content"/></td>
                    <td>LS</td>
                    <td>영업관리구분</td>
                </tr>
                <tr>
                    <td><input type="checkbox" value = "check1" id="check" name="content"/></td>
                    <td>P1</td>
                    <td>생산설비</td>
                </tr>
                <tr>
                    <td><input type="checkbox" value = "check1" id="check" name="content"/></td>
                    <td>P2</td>
                    <td>작업팀</td>
                </tr>
                <tr>
                    <td><input type="checkbox" value = "check1" id="check" name="content"/></td>
                    <td>P3</td>
                    <td>작업SHIFT</td>
                </tr>
                <tr>
                    <td><input type="checkbox" value = "check1" id="check" name="content"/></td>
                    <td>PC</td>
                    <td>결재조건</td>
                </tr>
                <tr>
                    <td><input type="checkbox" value = "check1" id="check" name="content"/></td>
                    <td>PU</td>
                    <td>구매단가유형</td>
                </tr>
                <tr>
                    <td><input type="checkbox" value = "check1" id="check" name="content"/></td>
                    <td>SU</td>
                    <td>영업단가유형</td>
                </tr>
                <tr>
                    <td><input type="checkbox" value = "check1" id="check" name="content"/></td>
                    <td>TM</td>
                    <td>거래처분류</td>
                </tr>
                <tr>
                    <td><input type="checkbox" value = "check1" id="check" name="content"/></td>
                    <td>TS</td>
                    <td>배송방법</td>
                </tr>
                <tr>
                    <td><input type="checkbox" value = "check1" id="check" name="content"/></td>
                    <td>V1</td>
                    <td>고객성향구분</td>
                </tr>
                <tr>
                    <td><input type="checkbox" value = "check1" id="check" name="content"/></td>
                    <td>V2</td>
                    <td>고객등급구분</td>
                </tr>
                <tr>
                    <td><input type="checkbox" value = "check1" id="check" name="content"/></td>
                    <td>WD</td>
                    <td>대여구분</td>
                </tr>
                <tr>
                    <td><input type="checkbox" value = "check1" id="check" name="content"/></td>
                    <td>WE</td>
                    <td>위탁적재장소</td>
                </tr>
                <tr>
                    <td><input type="checkbox" value = "check1" id="check" name="content"/></td>
                    <td>Z1</td>
                    <td>품목대분류</td>
                </tr>
            </table>
        </container>

        <container id="contents2">
            <table id="table2">
                <tr>
                    <td align="center">코드</td>
                    <td>
                        <input type="text">
                    </td>    
                    <td align="center">관리내역명</td>
                    <td>
                        <input type="text">
                    </td>
                    <!-- <td align="center">사용여부</td>
                    <td>
                        <select name="" id="">
                            <option value="2">전체</option>
                            <option value="0">0.미사용</option>
                            <option value="1">1.사용</option>
                        </select>
                    </td>
                    <td>
                        <button>재조회</button>
                    </td> -->
                </tr>
            </table>
            <table id="table3">
                <thead>
                    <td align="center">관리내역코드</td>
                    <td align="center">관리항목명</td>
                    <td align="center">품목군설명</td>
                    <td align="center">비고</td>
                </thead>
                <tbody>
                    <td>
                        <input type="text">
                    </td>
                    <td>
                        <input type="text">
                    </td>
                    <td>
                        <input type="text">
                    </td>
                    <td>
                        <input type="text">
                    </td>
                    <!-- <td>
                        <select name="" id="">
                            <option value="1">사용</option>
                            <option value="0">미사용</option>
                        </select>
                    </td> -->
                </tbody>
            </table>
        </container>
</body>
</html>