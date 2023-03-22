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
    <div class="card" style="width: 40%; margin: auto; margin-top: 120px; background-color: bisque;">
        <div class="container ">
            <form style="width: 90%; display: block;margin:auto ;">
                <h4 class="text-center" style=" font-size: 34px;font-weight:750 ; margin-top: 30px;">ForgotPassword</h4>
                <%--                <div class="row" style="margin-bottom:30px ;margin-top: 20px;">--%>
                <%--                    <img src="/img/fb.webp " style="width: 13%; margin-left: 110px;">--%>
                <%--                    <img src="/img/ista.png " style="width: 13%;">--%>
                <%--                    <img src="/img/ytb.png " style="width: 13%;">--%>
                <%--                    <img src="/img/teless.png " style="width: 13%;">--%>
                <%--                </div>--%>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">Email </label>
                    <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">First Name </label>
                    <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">Last Name </label>
                    <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="">
                </div>
                <button type="button" style="width:140px ;height:40px ; color: aliceblue; background-color: black; font-weight: 600;margin-left: 152px; margin-top: 25px; margin-bottom: 50px;">ForgotPassword</button>


            </form>
        </div>
    </div>
</div>
</body>
</html>