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
            width: 35%;
            height: 80%;
            border: 1px solid black;
            z-index: 1;
        }
        #contents2{
            position: absolute;
            left: 50%;
            top: 15%;
            width: 50%;
            height: 80%;
            z-index: 1;
            border: 1px solid black;
        }
	#table1 {
            text-align: center; width: 100%; padding-top: 20px;
            padding-right: 10%; padding-left: 2px;
            overflow: hidden;
            border: 1px solid #ccc;
        }
        #table1 td{
            width: 100%;
        }
        #contents2{
            position: absolute;
            left: 50%;
            top: 15%;
            width: 50%;
            height: 80%;
            z-index: 1;
            border: 1px solid black;
        }
        #table2 {
            width: 100%; padding-top: 20px; padding-left: 50px; text-align: left;
            border-collapse: separate; border-spacing: 0 15px; 
        }
        #reqInput {
            background-color: rgb(255, 255, 149);
            text-align: center;
        }
</style>
</head>
<body>
<container id = contents1 style="overflow: auto;">
            <table id="table1">
                
                <tr>
                    <td align="center">회사코드</td>
                    <td align="center">회사명</td>
                    <td align="center">구분</td>
                </tr>
                <tr>
                    <td id="textbox1">
                        <input type=text name="companyCode"
                        style="background-color: rgb(235, 235, 235); 
                        border-style: none;
                        text-align: center;" pattern="[0-9]{4}" maxlength="4"/>
                    </td>
                    <td>
                        <input type=text name="companyName"
                        style="background-color: rgb(235, 235, 235); 
                        border-style: none;
                        text-align: center;"/>
                    </td>
                    <td>
                        <select name="companyType"
                        style="background-color:rgb(235, 235, 235); 
                        border-style: none;
                        text-align: center;" >
                            <option value="default">법인/개인</option>
                            <option value="0">0.법인</option>
                            <option value="1">1.개인</option>
                        </select>
                    </td>
                </tr>
            </table>
        </container>
        <container id="contents2">
            <table id="table2">
                <tr>
                    <p><td colspan = "3" span style="color:black" align="center">기본정보등록</td></p>
                </tr>
                <tr>
                    <td align="center">회계연도</td>
                    <td>
                        제
                        <input type="text" name="fiscalYear" id="reqInput"
                        style="width: 60px" pattern="[0-9]{3}" maxlength="3"/>
                        기
                    </td>
                    <td>
                        <input type="date" name="startDate" id="reqInput">
                        ~
                        <input type="date" name="endDate" id="reqInput"/>
                        <button>필독</button>
                    </td>
                </tr>
                <tr>
                    <td align="center">사업자등록번호</td>
                    <td colspan="2">
                        <input type="text" name="registrationNumber" id="reqInput"
                        style="width: 240px;" pattern="[0-9]{10}" maxlength="10"/>
                    </td>
                </tr>
                <tr>
                    <td align="center">법인등록번호</td>
                    <td colspan="2">
                        <input type="text" name="cooperationNumber"
                        style="background-color: rgb(235,235,235);
                        border-style: none; width: 240px;
                        text-align: center;" pattern="[0-9]{13}" maxlength="13"/>
                        법인의 경우 필수입력항목
                    </td>
                </tr>
                <tr>
                    <td align="center">대표자성명</td>
                    <td colspan="2">
                        <input type="text" name="ceoName" id="reqInput"
                        style="width: 240px;"/>
                    </td>
                </tr>
                <tr>
                    <td align="center">주민등록번호</td>
                    <td colspan="2">
                        <input type="text" name="socialNumber"
                        style="background-color: rgb(235,235,235);
                        border-style: none; width: 240px;
                        text-align: center;" pattern="[0-9]{13}" maxlength="13"/>
                        개인의 경우 필수입력항목
                    </td>
                </tr>

                <tr>
                    <td align="center">본점우편번호</td>
                    <td colspan="2">
                        <input type="text" name="zipCode"
                        style="background-color: rgb(235,235,235);
                        border-style: none; width: 205px;
                        text-align: center;" pattern="[0-9]{5}" maxlength="5"/>
                        <i class="fas fa-search" style="color: blue;"></i>

                    </td>
                </tr>
                <tr>
                    <td align="center">본점주소</td>
                    <td colspan="2">
                        <input type="text" name="headAddress" id="reqInput"
                        style="width: 240px;"/>
                    </td>
                </tr>
                <tr>
                    <td align="center">본점번지</td>
                    <td colspan="2">
                        <input type="text" name="headStreetAddress" 
                        style="background-color: rgb(235,235,235);
                        border-style: none; width: 240px;
                        text-align: center;"/>
                    </td>
                </tr>
                <tr>
                    <td align="center">본점전화번호</td>
                    <td colspan="2">
                        <input type="text" name="headPhoneNumber"
                            style="background-color: rgb(235,235,235);
                            border-style: none; width: 240px;
                            text-align: center;" pattern="[0-9]{10}" maxlength="10"/>
                    </td>
                </tr>
                <tr>
                    <td align="center">업태</td>
                    <td colspan="2">
                        <input type="text" name="business" id="reqInput"
                        style="width: 240px;"/>
                    </td>
                </tr>
                <tr>
                    <td align="center">종목</td>
                    <td colspan="2">
                        <input type="text" name="specific" id="reqInput"
                        style="width: 240px;"/>
                    </td>
                </tr>
                <tr>
                    <td align="center">설립연월일</td>
                    <td colspan="2">
                        <input type="date" name="foundationYear"
                        style="background-color: rgb(235,235,235);
                        border-style: none;
                        text-align: center;"/>
                    </td>
                </tr>
                <tr>
                    <td align="center">사용여부</td>
                    <td>
                        <select name="" id="">
                            <option value="1">1.사용</option>
                            <option value="0">0.미사용</option>
                        </select>
                    </td>
                </tr>
            </table>
        </container>
</body>
</html>