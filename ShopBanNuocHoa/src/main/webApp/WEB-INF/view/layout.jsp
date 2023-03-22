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
        a.navbar-brand {
            margin-top: 4px;
            margin-bottom: 4px;
        }
    </style>

    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
            crossorigin="anonymous"
    />
    <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8"
            crossorigin="anonymous"
    ></script>
    <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
    />
</head>
<body ng-app="demo_routing">


<nav class="navbar navbar-expand-lg bg-light">
    <div
            class="container-fluid"
            style="background: #f5f5f5; "
    >
        <a
                class="navbar-brand"
                href="/login/user"
                style="
          font-weight: 450;
          font-size: 18px;
          margin-left: 220px;
          color: blue;
        "
        >Login </a
        >
        <div ng-controller="logins">
            <a
                    class="navbar-brand"
                    href=""
                    style="
              font-weight: 200;
              font-size: 18px;
              margin-left: 170px;
            "
            >Chào <strong>${username}</strong> </a
            >
        </div>
        <button
                class="navbar-toggler"
                type="button"
                data-bs-toggle="collapse"
                data-bs-target="#navbarNavAltMarkup"
                aria-controls="navbarNavAltMarkup"
                aria-expanded="false"
                aria-label="Toggle navigation"
        >
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
                <a
                        class="navbar-brand"
                        href=""
                        style="
                  font-weight: 200;
                  margin-left: 45px;
                  font-size: 18px;
                "
                >| Free Shipping for all Order $50</a
                >
                <a
                        class="navbar-brand"
                        href=""
                        style="
                  font-weight: 200;
                  margin-left: 500px;
                  font-size: 18px;
                "
                >Ship to</a
                >
                <a
                        class="navbar-brand"
                        href=""
                        style="
                  font-weight: 200;
                  margin-left: 35px;
                  font-size: 18px;
                "
                >sell</a
                >
                <a
                        class="navbar-brand"
                        href=""
                        style="
                  font-weight: 200;
                  margin-left: 100px;
                  font-size: 18px;
                "
                ><i class="fa fa-shopping-bag"></i> <span ng-controller="productController"> {{con}}</span></a></a
                    >

            </div>
        </div>
    </div>
</nav>
<!---->
<header class="">
    <nav class="navbar navbar-expand-lg bg-light">
        <div
                class="container-fluid"
                style="background: black; color: aliceblue;margin-left: 130px"
        >
            <a
                    class="navbar-brand"
                    href="/home/hienThi"
                    style="
                color: white;
                font-weight: 200;
                font-size: 18px;
                margin-left: 430px;
              "
            >Trang Chủ</a
            >
            <button
                    class="navbar-toggler"
                    type="button"
                    data-bs-toggle="collapse"
                    data-bs-target="#navbarNavAltMarkup"
                    aria-controls="navbarNavAltMarkup"
                    aria-expanded="false"
                    aria-label="Toggle navigation"
            >
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div class="navbar-nav">
                    <a
                            class="navbar-brand"
                            href="/sanPham/hienThi/1"
                            style="
                    color: white;
                    font-weight: 200;
                    margin-left: 70px;
                    font-size: 18px;
                  "
                    >Sản Phẩm</a
                    >
                    <%--                    <a--%>
                    <%--                            class="navbar-brand"--%>
                    <%--                            href="#4"--%>
                    <%--                            style="--%>
                    <%--                    color: white;--%>
                    <%--                    font-weight: 200;--%>
                    <%--                    margin-left: 70px;--%>
                    <%--                    font-size: 18px;--%>
                    <%--                  "--%>
                    <%--                    >Quản Lý đơn Hàng</a--%>
                    <%--                    >--%>
                    <%--                    <a--%>
                    <%--                            class="navbar-brand"--%>
                    <%--                            href="#5"--%>
                    <%--                            style="--%>
                    <%--                    color: white;--%>
                    <%--                    font-weight: 200;--%>
                    <%--                    margin-left: 70px;--%>
                    <%--                    font-size: 18px;--%>
                    <%--                  "--%>
                    <%--                    >Quản lý sản phẩm</a--%>
                    <%--                    >--%>
                    <a
                            class="navbar-brand"
                            href="/user/gioHang/hienThi"
                            style="
                    color: white;
                    font-weight: 200;
                    margin-left: 70px;
                    font-size: 18px;
                  "
                    >Giỏ Hàng</a
                    >
                    <a
                            class="navbar-brand"
                            href="##"
                            style="
                  color: white;
                  font-weight: 200;
                  margin-left: 100px;
                  font-size: 18px;
                "
                    >Sản Phẩm Đã Mua</a

                    >
                    <a
                            class="navbar-brand"
                            href="/user/login/doimatkhau/hienthi"
                            style="
                    color: white;
                    font-weight: 200;
                    margin-left: 100px;
                    font-size: 18px;
                  "
                    >Đổi Mật khẩu</a

                    >

                </div>
            </div>
        </div>
    </nav>
</header>
<!--body-->

<div style="margin-top: 1px">

    <jsp:include page="${ view }"></jsp:include>


</div>

<!--foooter-->
<footer
        class="texx"
        style="margin-top: 70px; background-color: #1a1919; color: #ededed"
>
    <div class="container">
        <div class="row">
            <div class="col-md-3">
                <h6 style="margin-top: 65px">About HAKIA</h6>
                <p>Address: 1475 NW 30th St, Miami, FL 33142, USA</p>
                <p>Phone: +1 37.188.899</p>
                <p>Email: hasakiamiami@gmail.com</p>
            </div>

            <div class="col-md-2">
                <h6 style="margin-top: 65px">MY HAKIA</h6>
                <p>Beauty Insider</p>
                <p>Hakia Credit Card</p>
                <p>Community Profile</p>
                <p>Order Status</p>
                <p>Beauty Offers</p>
            </div>
            <div class="col-md-2">
                <h6 style="margin-top: 65px">Help</h6>
                <p>Shipping</p>
                <p>International Shipments</p>
                <p>Store Locations</p>
                <p>Online Ordering</p>
                <p>Accessibility</p>
            </div>
            <div class="col-md-4">
                <h5 style="margin-top: 65px">Join Our Newsletter Now</h5>
                <p>
                    Get E-mail updates about our latest shop and special offers.
                </p>
                <input
                        type="text"
                        style="
                  font-size: 16px;
                  padding-left: 20px;
                  color: #1c1c1c;
                  height: 46px;
                  border: 1px solid #ededed;
                "
                        placeholder="Enter your mail"
                />
                <button
                        type="submit"
                        class="site-btn"
                        style="
                  font-size: 14px;
                  color: #ffffff;
                  font-weight: 800;
                  text-transform: uppercase;
                  display: inline-block;
                  padding: 13px 30px 12px;
                  background: black;
                  border: 1px solid white;
                "
                >
                    Subscribe
                </button>
                <br/>
                <br/>
                <div class="img">
                    <img
                            src="/img/fb.webp"
                            class="img-circle"
                            width="35"
                            height="35"
                            style="margin-left: 10px"
                    />
                    <img
                            src="/img/ytb.png"
                            class="img-circle"
                            width="30"
                            height="30"
                            style="margin-left: 10px"
                    />
                    <img
                            src="/img/ista.png"
                            class="img-circle"
                            width="30"
                            height="30"
                            style="margin-left: 10px"
                    />
                    <img
                            src="/img/teless.png"
                            class="img-circle"
                            width="30"
                            height="30"
                            style="margin-left: 10px"
                    />
                </div>
            </div>
        </div>
        <br/>
        <br/>
        <div class="row">
            <div class="col-lg-12">
                <hr style="width: 100%; height: 1px; background-color: #7fad39"/>
            </div>
        </div>
    </div>
</footer>
<div class="cuoi" style="background: black; color: white">
    <div class="container">
        <div class="row">
            <div class="col-8">
                <p style="margin-top: 30px">
                    Copyright ©2022 All rights reserved | This template is made with
                    <a>Colorlib</a>
                </p>
            </div>
            <div class="col-4">
                <div class="Ogani_payment" style="margin-top: 30px">
                    <img
                            src="https://technext.github.io/ogani/img/payment-item.png"
                            alt=""
                    />
                </div>
            </div>
        </div>
    </div>
</div>
</div>


</body>
</html>