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

    <form action="/quanLySanPhamTach/Save" method="post" >

        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label"> ID Sản Phẩm : </label>
            <input type="text" class="form-control" style="width: 580px;"  name="idsp1"value="${detail.id}">
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label"> Mã Sản Phẩm</label>
            <input type="text" class="form-control" style="width: 580px;" id="exampleFormControlInput1" name="ma" value="${detail.ma}">
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label"> Tên Sản Phẩm</label>
            <input type="text" class="form-control" style="width: 580px;" id="exampleFormControlInput1" name="ten" value="${detail.ten}">
        </div>
      <button>Thêm Sản Phẩm</button>                <button >Update Sản Phẩm</button>

    </form>
    <br>
    <br>
    <%--    hiển thị Table--%>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">ID Sản Phẩm</th>
            <th scope="col">Mã Sản Phẩm</th>
            <th scope="col">Tên Sản Phẩm</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>

        <c:forEach var="sp" items="${getSanPham}" varStatus="hi">
            <tr>
                <td>${sp.id}</td>
                <td>${sp.ma}</td>
                <td>${sp.ten}</td>

                <td><button><a href="/quanLySanPhamTach/edit/${sp.id}">update</a></button> </td>

            </tr>
        </c:forEach>

        </tbody>
    </table>

    kaka<h1>${hi}</h1>


</div>

</body>
</html>