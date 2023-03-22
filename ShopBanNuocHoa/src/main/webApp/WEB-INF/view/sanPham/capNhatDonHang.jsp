<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
            crossorigin="anonymous"></script>
    <style>
        table,
        th,
        td {
            border: 1px solid black;
            border-collapse: collapse;
        }

        button.b {
            width: 110px;
            height: 40px;
            color: aliceblue;
            background-color: rgb(255, 71, 26);
        }

        button.a {
            width: 110px;
            height: 40px;
            color: aliceblue;
            background-color: rgb(0, 204, 68);
        }
    </style>
</head>
<body>
<div class="container">
    <br>
    <br>

    <h3>Câp Nhật Đơn Hàng</h3>
    <br>
    <br>
    <br>
    <hr>

    <form action="/quanLyDonHang/capNhatDonHangs" method="post">
        <div class="row">
            <div class="col-7">
                <div class="row">
                    <div class="col-md-5">
                        <label for="">Ngày Ship</label>
                        <input type="datetime-local" name="ngayShip1" value="${dateTime.ngayShip}">
                    </div>

                    <div class="col-md-5">
                        <label for="">Ngày Nhận</label>
                        <input type="datetime-local" name="ngayNhan1" value="${dateTime.ngayNhan}">
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-5">
                        <label for="">Ngày Thanh Toan</label>
                        <input type="datetime-local" name="ngayThanhToan1" value="${dateTime.ngayThanhToan}">
                    </div>

                    <div class="col-md-5">
                        <label for="">Ngày Nhận</label>
                        <input type="datetime-local" name="bdaytime">
                    </div>
                </div>

            </div>
            <div class="col-5">
                <div class="col-md-5">
                    <br>
                    <td><select name="tinhTrang" style="margin-right: 50px;">
                        <c:forEach var="m" items="${status}">
                            <option id="${m.id}" value="${m.id}" ${tt == m.id ? "selected" : "" }>${m.ten} </option>
                        </c:forEach> </select></td>
                </div>
                <div class="col-md-5">
                    <button>Cập Nhật</button>
                </div>
            </div>
    </form>
</div>


</body>
</html>

<%--<td><select name="tinhTrang" style="margin-right: 50px;">--%>
<%--    <c:forEach var="m" items="${status}">--%>
<%--        <option id="${m.id}" value="${m.id}" ${sp.hoaDon.tinhTrang == m.id ? "selected" : "" }>${m.ten} </option>--%>
<%--    </c:forEach> </select></td>--%>