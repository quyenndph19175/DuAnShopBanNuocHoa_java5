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
    <h3 class="text-center" style="font-weight: 700; margin-top: 50px">
        Product
    </h3>
    <hr style="margin-top:30px ;">
    <div class="row">
        <div class="col-2" style="margin-top: 60px;">
            <div class="card" style="width: 18rem">
                <br/>
                <h4
                        class="text-center"
                        style="color: black; background-color: aqua"
                >
                    Danh Mục
                </h4>
                <br/>
                <ul style="list-style: none" lass="text-center">
                    <li style="margin-top: 20px">
                        <a href="/sanPham/hienThi/1"

                           style="
                margin-left: 50px;
                text-decoration: none;
                font-size: 17px;
                font-weight: 600;
                margin-top: 70px;
                padding-top: 20px;
                color: black;
              "

                        >All</a


                        >
                    </li>
                    <li style="margin-top: 20px">
                        <a href="/sanPham/hienThi/cate/Dior"
                           style="
                margin-left: 50px;
                text-decoration: none;
                font-size: 17px;
                font-weight: 600;
                color: black;
              "
                        >Nước Hoa Dior</a
                        >
                    </li>
                    <li style="margin-top: 20px">
                        <a href="/sanPham/hienThi/cate/Xmen"
                           style="
                margin-left: 50px;
                text-decoration: none;
                font-size: 17px;
                font-weight: 600;
                color: black;
              "
                        >Nước Hoa Xmen</a
                        >

                    </li>

                    <li style="margin-top: 20px">
                        <a href="/sanPham/hienThi/cate/Gucci"
                           style="
                margin-left: 50px;
                text-decoration: none;
                font-size: 17px;
                font-weight: 600;
                color: black;
              "
                        >Nước Hoa Gucci</a
                        >
                    </li>
                    <li style="margin-top: 20px">
                        <a href="/sanPham/hienThi/cate/Versace"
                           style="
                margin-left: 50px;
                text-decoration: none;
                font-size: 17px;
                font-weight: 600;
                color: black;
              "
                        >Nước Hoa Versace</a
                        >
                    </li>
                    <li style="margin-top: 20px">
                        <a
                                ng-click="myFunc(5)"
                                style="
                margin-left: 50px;
                text-decoration: none;
                font-size: 17px;
                font-weight: 600;
                color: black;
              "
                        >Sơn móng tay</a
                        >
                    </li>
                    <li style="margin-top: 20px">
                        <a
                                style="
                margin-left: 50px;
                text-decoration: none;
                font-size: 17px;
                font-weight: 600;
                color: black;
              "
                        >Chăm sóc mặt</a
                        >
                    </li>

                    <li style="margin-top: 20px">
                        <a
                                style="
                margin-top: 20px;
                margin-left: 50px;
                text-decoration: none;
                font-size: 17px;
                font-weight: 600;
                color: black;
              "
                        >Mi Mắt</a
                        >
                    </li>
                    <li style="margin-top: 20px">
                        <a
                                style="
                margin-top: 20px;
                margin-left: 50px;
                text-decoration: none;
                font-size: 17px;
                font-weight: 600;
                color: black;
              "
                        >Sáp tóc</a
                        >
                    </li>
                </ul>
                <div class="card-body"></div>
            </div>
        </div>
        <div class="col-1"></div>
        <div class="col-9">


            <!---->

            <h4 style="margin-top: 75px">Sản Phẩm Khác</h4>
            <div class="row" style="margin-top: 30px">
                <div class="row">

                    <c:forEach var="d" items="${listSanPham}">
                        <div class="col-lg-2 col-md-2 col-sm-6">
                            <div class="card" style="border: 0">
                                <a href="/sanPham/detail/${d.id}"> <img src="/img/${d.anh}" class="card-img-top"
                                                                        alt="..."> </a>
                                <div class="card-body">
                                    <h5 class="card-title">${d.sanPham.ten}</h5>
                                    <p class="card-text">Some quick example te.</p>
                                    <p class="card-text"><span>$${d.giaBan}</span></p>
                                </div>
                            </div>
                        </div>

                    </c:forEach>

                </div>
            </div>
            <!--           -->
            <div>
                <c:if test="${totalPages>1}">
                    Trang [[${totalPages}]] + Item [${totalItems}] <br>

                    <%-------------------------------------------------------%>

                    <%--            ButTon_Last--%>
                    <c:if test="${currenPage>1 }">
                        Next <a href=" /sanPham/hienThi/${currenPage -1}">Last</a>

                    </c:if>
                    <%-------------------------------------------------------%>

                    <%--            Hiển thị ra các page có--%>
                    <c:forEach var="i" begin="1" end="${totalPages}">
                        <c:if test="${currentPage !=i}"> <a href=" /sanPham/hienThi/${i}"> [${i}] </a> </c:if>

                    </c:forEach>

                    <%-------------------------------------------------------%>

                    <%--            Next--%>
                    <c:if test="${currenPage< totalPages}">
                        <a href=" /sanPham/hienThi/${currenPage +1}">Next</a>

                    </c:if>


                </c:if>
            </div>

        </div>
    </div>
</div>


</body>
</html>