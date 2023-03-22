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

    <form action="/quanLySanPhamChiTiet/save2" method="post" enctype="multipart/form-data">

        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label"> ID Sản Phẩm Chi Tiêt : </label>
            <input type="text" class="form-control" style="width: 580px;" name="id1" value="${detail.id}">
        </div>
        Nhà Sản Xuât <select name="nsx.id" style="margin-right: 50px;">
        <c:forEach var="m" items="${nhaSx}">
            <%--    <option value="${m.id}" > ${m.categoryNname}</option>--%>
            <option id="${m.id}" value="${m.id}" ${idNsx == m.id ? "selected" : "" }>${m.ten} </option>
        </c:forEach> </select>

        Màu Sắc: <select name="mauSac.id" style="margin-right: 50px;">
        <c:forEach var="m" items="${mauSac}">
            <%--    <option value="${m.id}" > ${m.categoryNname}</option>--%>
            <option id="${m.id}" value="${m.id}" ${idmauS == m.id ? "selected" : "" }>${m.ten} </option>
        </c:forEach> </select>
        <br>
        Dòng Sản Phẩm: <select name="dongSanPham.id" style="margin-right: 50px;">
        <c:forEach var="m" items="${dongSanPham}">
            <%--    <option value="${m.id}" > ${m.categoryNname}</option>--%>
            <option id="${m.id}" value="${m.id}" ${idDongS == m.id ? "selected" : "" }>${m.ten} </option>
        </c:forEach> </select>


        Sản Phẩm: <select name="sanPham.id" style="margin-right: 50px;">
        <c:forEach var="m" items="${sanPham}">
            <%--    <option value="${m.id}" > ${m.categoryNname}</option>--%>
            <option id="${m.id}" value="${m.id}" ${idSanPham == m.id ? "selected" : "" }>${m.ten} </option>
        </c:forEach> </select>
        <br>
        <br>


        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label"> Năm bảo hành</label>
            <input type="text" class="form-control" style="width: 580px;" id="exampleFormControlInput1"
                   name="namBaoHanh" value="${detail.namBaoHanh}">
        </div>

        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label"> số Lượng tồn</label>
            <input type="text" class="form-control" style="width: 580px;" id="exampleFormControlInput1"
                   name="soLuongTon" value="${detail.soLuongTon}">
        </div>

        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label"> Giá Nhập</label>
            <input type="text" class="form-control" style="width: 580px;" id="exampleFormControlInput1" name="giaNhap"
                   value="${detail.giaNhap}">
        </div>

        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label"> Giá Bán</label>
            <input type="text" class="form-control" style="width: 580px;" id="exampleFormControlInput1" name="giaBan"
                   value="${detail.giaBan}">
        </div>

        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label"> Mô Tả</label>
            <input type="text" class="form-control" style="width: 580px;" id="exampleFormControlInput1" name="moTa"
                   value="${detail.moTa}">
        </div>

        Ảnh<input type="file" name="anh1">

        <button>Thêm Sản Phẩm</button>
        <button style="margin-left: 90px">Update Sản Phẩm</button>

    </form>
    <br>
    <br>
    <%--    hiển thị Table--%>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Ảnh</th>
            <th scope="col">Sản Phẩm</th>
            <th scope="col">Nhà SX</th>
            <th scope="col">Màu Sắc</th>
            <th scope="col">Dòng Sp</th>
            <th scope="col">Năm BaoH</th>
            <th scope="col">Số Lượng</th>
            <th scope="col">Giá Nhập</th>
            <th scope="col">Giá Bán</th>
            <th scope="col">Mô Tả</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>

        <c:forEach var="sp" items="${chiTietSanp}" varStatus="hi">
            <tr>
                <td><img src="/img/${sp.anh}" alt="" style="width: 120px;height: 140px"></td>
                <td>${sp.sanPham.ten}</td>
                <td>${sp.nsx.ten}</td>
                <td>${sp.mauSac.ten}</td>
                <td>${sp.dongSanPham.ten}</td>
                <td>${sp.namBaoHanh}</td>
                <td>${sp.soLuongTon}</td>
                <td>${sp.giaNhap}</td>
                <td>${sp.giaBan}</td>
                <td>${sp.moTa}</td>
                <td><a href="/quanLySanPhamChiTiet/remove/${sp.id}">delete</a></td>
                <td><a href="/quanLySanPhamChiTiet/edit/${sp.id}">update</a></td>


            </tr>
        </c:forEach>

        </tbody>
    </table>

    kaka<h1>${hi}</h1>


</div>

</body>
</html>