<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>

    <style>
        h5.card-title {
            margin-top: 30px;
        }

        p.card-text {
            font-weight: 800;
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
</head>
<body>

<!-- phần nội dung -->
<article>
    <!--side show-->
    <div class="container">
        <h2
                class="text-center"
                style="font-weight: 730; position: relative; margin-top: 40px"
        >
            HASAKIA
        </h2>

        <div
                id="carouselExampleControls1"
                class="carousel slide"
                data-bs-ride="carousel"
                style="margin-top: 40px"
        >
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img
                            src="/img/banner1.jpg"
                            class="d-block w-100"
                            style="width: 100%; height: 450px"
                    />
                </div>
                <div class="carousel-item">
                    <img
                            src="/img/banner2.jpg"
                            class="d-block w-100"
                            alt="..."
                            style="width: 100%; height: 450px"
                    />
                </div>
                <div class="carousel-item">
                    <img
                            src="/img/bannerChinh.jpg"
                            class="d-block w-100"
                            alt="..."
                            style="width: 100%; height: 450px"
                    />
                </div>
            </div>
            <button
                    class="carousel-control-prev"
                    type="button"
                    data-bs-target="#carouselExampleControls1"
                    data-bs-slide="prev"
            >
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button
                    class="carousel-control-next"
                    type="button"
                    data-bs-target="#carouselExampleControls1"
                    data-bs-slide="next"
            >
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>


        <!--Sản phẩm mới-->
        <hr style="color: black; margin-top: 33px; margin-bottom: 75px"/>
        <h4 style="margin-top: 75px">Sản Phẩm Mới Nhất</h4>
        <div class="row" style="margin-top: 30px">
            <div class="row">

                <c:forEach var="d" items="${sanPhamNew}">

                    <div class="col-lg-2 col-md-2 col-sm-6">
                        <div class="card" style="border: 0">
                            <a href="/home/${d.id}"> <img src="/img/${d.anh}" class="card-img-top" alt="..."> </a>
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


        <!--Sản phẩm bán chạy-->
        <hr style="color: black; margin-top: 33px; margin-bottom: 75px"/>
        <h4 style="margin-top: 75px">Sản Phẩm Bán Chạy</h4>
        <div class="row" style="margin-top: 30px">
            <div class="row">

                <c:forEach var="d" items="${spBanChay}">
                    <div class="col-lg-2 col-md-2 col-sm-6">
                        <div class="card" style="border: 0">
                            <a href="/home/${d.id}"> <img src="/img/${d.anh}" class="card-img-top" alt="..."> </a>
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

        <!--Sản phẩm khác-->
        <h4 style="margin-top: 75px">Sản Phẩm Khác</h4>
        <div class="row" style="margin-top: 30px">
            <div class="row">

                <c:forEach var="d" items="${spKhac}">
                    <div class="col-lg-2 col-md-2 col-sm-6">
                        <div class="card" style="border: 0">
                            <a href="/home/${d.id}"> <img src="/img/${d.anh}" class="card-img-top" alt="..."> </a>
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


        <!-- thêm-->
        <hr style="color: black; margin-top: 33px; margin-bottom: 75px"/>
        <div class="row" style="margin-top: 30px">
            <div class="col-lg-4 col-md-4 col-sm-6">
                <div class="card" style="background-color: #ff1493">
                    <h5 style="margin-top: 30px">Chăm sóc tóc K18 mới</h5>
                    <p style="margin-bottom: 30px">
                        Làm sạch, dầu gội đầu chứa peptide để làm rõ và chuẩn bị cho
                        việc điều trị mặt nạ của bạn.
                    </p>
                    <img
                            src="https://www.sephora.com/contentimages/homepage/092022/Homepage/RWD/2022-09-20-hp-marketing-banner-k18-peptide-prep-shampoos-us-ca-rwd-slice.jpeg?imwidth=400"
                            class="card-img-top"
                            alt="..."
                    />
                </div>
            </div>
            <!---->

            <div class="col-lg-4 col-md-4 col-sm-6">
                <div class="card" style="background-color: #83c75d">
                    <h5 style="margin-top: 30px">Kem dưỡng mắt Glow Recipe MỚI</h5>
                    <p style="margin-bottom: 30px">
                        Đánh bay quầng thâm và bọng mắt với vitamin C. Chiết xuất từ
                        ​​ổi chỉ có tại Sephora.
                    </p>
                    <img
                            src="https://www.sephora.com/contentimages/homepage/092022/Homepage/RWD/2022-9-26-hp-marketing-banner-glow-recipe-guava-eye-cream-and-guava-serum-us-ca-rwd-slice.jpeg?imwidth=400"
                            class="card-img-top"
                            alt="..."
                    />
                </div>
            </div>
            <!---->

            <div class="col-lg-4 col-md-4 col-sm-6">
                <div class="card">
                    <h5 style="margin-top: 30px">Cộng đồng Beauty Insider</h5>
                    <p style="margin-bottom: 30px">
                        Đặt câu hỏi, tham gia thử thách và nhận đề xuất từ ​​những người
                        giống như bạn.
                    </p>

                    <img
                            src="https://www.sephora.com/contentimages/homepage/062122/Homepage/RWD/2022-07-01-hp-reassurance-banner-community-evergreen-us-ca-rwd-slice.jpeg?imwidth=400"
                            class="card-img-top"
                            alt="..."
                    />
                </div>
            </div>
            <!---->
        </div>
        <!-- Đã Xem-->


        <!-- thêm-->
        <div class="row" style="margin-top: 50px">
            <div class="col-lg-4 col-md-4 col-sm-6">
                <div class="card">
                    <h5 style="margin-top: 30px">
                        Cam kết của chúng tôi đối với sự đa dạng,
                    </h5>
                    <p style="margin-bottom: 30px">
                        Với sự đa dạng từ sản phẩm của chúng tôi sẽ cho bạn thật nhiều
                        sự lựa chọn tốt nhất.
                    </p>
                    <img
                            src="https://www.sephora.com/contentimages/homepage/060222/Homepage/RWD/homepage-reassurance-banner-diversity-inclusion-desktop-mobile-us-ca-slice.jpeg?imwidth=400"
                            class="card-img-top"
                            alt="..."
                    />
                </div>
            </div>
            <!---->

            <div class="col-lg-4 col-md-4 col-sm-6">
                <div class="card">
                    <h5 style="margin-top: 30px">Phù hợp Với Từng loại da</h5>
                    <p style="margin-bottom: 30px">
                        Đánh bay quầng thâm và bọng mắt với vitamin C. Chiết xuất từ
                        ​​ổi chỉ có tại Sephora.
                    </p>
                    <img
                            src="https://www.sephora.com/contentimages/homepage/092022/Homepage/RWD/2022-9-26-hp-marketing-banner-glow-recipe-guava-eye-cream-and-guava-serum-us-ca-rwd-slice.jpeg?imwidth=400"
                            class="card-img-top"
                            alt="..."
                    />
                </div>
            </div>
            <!---->

            <div class="col-lg-4 col-md-4 col-sm-6">
                <div class="card">
                    <h5 style="margin-top: 30px">Clean + Planet tích cực</h5>
                    <p style="margin-bottom: 30px">
                        Thương hiệu với sứ mệnh thay đổi làn da của bạn và trái đất.
                    </p>

                    <img
                            src="https://www.sephora.com/contentimages/homepage/060222/Homepage/RWD/homepage-reassurance-banner-clean-planet-positive-desktop-mobile-us-ca-slice.jpeg?imwidth=400"
                            class="card-img-top"
                            alt="..."
                    />
                </div>
            </div>
            <!---->
        </div>
    </div>
</article>


</body>
</html>