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
    <br>
    <h3>Quản Lý Đơn Hàng</h3>
    <hr>
    <br>
    <br>
    <br>
    <table class="table table-hover">
    <thead>
    <tr>
        <th scope="col">Sản Phẩm</th>
        <th scope="col">Mã Sản Phẩm</th>
        <th scope="col">Mã Hóa Đơn</th>
        <th scope="col">Ngày Mua</th>
        <th scope="col">Người nhận</th>
        <th scope="col">Địa Chỉ</th>
        <th scope="col">Số Lượng</th>
        <th scope="col">Tình Trạng</th>
        <th scope="col">Acction</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="sp" items="${spOrder}" varStatus="hi">
    <tr>

        <td><img src="/img/${sp.chiTietSanPham.anh}" alt="" style="width: 120px;height: 140px"></td>
        <td>${sp.chiTietSanPham.sanPham.ma}</td>
        <td>${sp.hoaDon.ma}</td>
        <td>${sp.hoaDon.ngayTao}</td>
        <td>${sp.hoaDon.tenNguoiNhan}</td>
        <td>${sp.hoaDon.diaChi}</td>
        <td>${sp.soLuong}</td>
        <td>${sp.hoaDon.tinhTrang ==1?"Chờ Xác Nhận":"Đang Ship"}</td>
        <td> <button><a href="/quanLyDonHang/updateTinhTrang/${sp.hoaDon.id}/${sp.hoaDon.tinhTrang}">Cập Nhật </a> </button></td>


    </tr>
    </c:forEach>

    </tbody>
</table>
</div>>
</body>
</html>


<%--<td><select name="tinhTrang" style="margin-right: 50px;">--%>
<%--    <c:forEach var="m" items="${status}">--%>
<%--        <option id="${m.id}" value="${m.id}" ${sp.hoaDon.tinhTrang == m.id ? "selected" : "" }>${m.ten} </option>--%>
<%--    </c:forEach> </select></td>--%>