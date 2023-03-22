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
    <div class="row" style="margin-top:40px ;">
        <div class="col-5" style="border: 1px; ;">
            <div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="/img/${detail.anh}" class="d-block w-100" alt="Ảnh của nó">
                    </div>

                </div>
                <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"style="background-color: #3e3e3e"></span>
                    <span class="visually-hidden">Previous</span>
                </button>
                <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"style="background-color: #3e3e3e"></span>
                    <span class="visually-hidden">Next</span>
                </button>
            </div>
        </div>
        <div class="col-5">
            <h5>${detail.sanPham.ten}</h5>
            <h6>Combo 2 Son Kem Soft Matte Lip Cream #05 Rose Jams 3g</h6>
            <p><span>&#x2605;</span><span>&#x2605;</span><span>&#x2605;</span><span>&#x2605;</span><span>&#9734;  920</p>
            <p>$${detail.giaBan}</p>
            <p>Thương hiệu: Thương Hiệu Khác</p>
            <hr>
            <p> - Đầu cọ son vát nhẹ hình giọt nước giúp bạn ước lượng được lượng son lấy ra</p>
            <p>- Đầu cọ son vát nhẹ hình giọt nước giúp bạn ước lượng được lượng son lấy ra</p>
            <p> - Bảng màu son Romand Milk Tea Velvet Tint đa dạng với những tông màu ngọt ngào</p>
            <hr>
            <p>Màu: 06.Jasmine Tea</p>
             <form action="/user/produc/buy/${detail.id}" method="get">
            <div > Số Lượng : <input type="text" name="soLuongMua" value="1" style="width: 50px"></div>
            <br>
            <div class="row" style="margin-top:25px ;">
                <div class="col-1"></div>
                <button class="col-4"> mua </button>

                <div class="col-1"></div>
                <button type="submit" class="col-4" style="width:170px ; height:50px ;font-weight: 600; background-color: #f36f36; color: aliceblue;"> Thêm giỏ hàng</button>


            </div>
             </form>

        </div>
        <h4 style="margin-top: 30px;">THÔNG TIN SẢN PHẨM</h4>
        <h6>Xuất xứ : Hàn Quốc</h6>
        <h6>Trọng Lượng : 4.4gr</h6>
        <br>
        <p>Là son kem lì của thương hiệu Romand có chất son xốp mịn, độ lên màu chuẩn, dễ tán đều trên môi cùng bảng màu ngọt ngào, mùi thơm dịu nhẹ
            tựa ly trà sữa hương socola ngọt ngào, êm dịu cho bạn đôi môi ngọt ngào, xinh xắn thu hút mọi ánh nhìn.</p>
        <p>- Thiết kế có hình dạng thân trụ thon dài với vỏ son bằng nhựa mài lì trong suốt giúp bạn quan sát
            màu son bên trong dễ dàng hơn, thiết kế nổi bật độc đáo với phần nắp có màu vàng đồng nổi bật</p>
        <p>- Đầu cọ son vát nhẹ giúp bạn hình giọt nước có khoét nhỏ ở giữa cọ giúp bạn ước lượng được lượng son lấy ra,
            thao tác thoa son lên môi dễ dàng và tạo viền môi rõ nét, xinh xắn. </p>

        <br>
        <h6>Son Thỏi Lì  3.5g hiện đã có mặt tại Hasakia với 10 màu cho bạn có thể thỏa sức lựa chọn:</h6>
        <ul style="margin-left:40px ;">
            <li>Kind & Love - Màu Be Đào trẻ trung và đáng yêu.</li>
            <li>Speak To Me - Màu Đỏ Mận Chín quyến rũ.</li>
            <li>Focus On Me - Màu Đỏ San Hô rạng rỡ.</li>
            <li>Warming Wear - Màu Be Cam ấm áp.</li>
            <li>Holy Chic - Màu Đỏ Hồng lãng mạn.</li>
            <li>Red Muse - Màu Đỏ hiện đại và sành điệu.</li>
            <li>Murmuring - Màu Hồng Gạch ấm cúng hàng ngày.</li>
            <li>Smoke Pink - Màu Hồng Hun Khói ngọt ngào êm dịu.</li>
            <li>Over It - Cam Cổ Điển.</li>
            <li>Giving Pleasure - Trầm ấm, phong cách ấm áp màu Cam Đỏ.</li>
        </ul>

        <br>
        <h6>Ưu thế nổi bật</h6>
        <ul style="margin-left:40px ;">
            <li>Kết cấu mềm và nhẹ môi giúp đôi môi mềm mịn.</li>
            <li>Bột đàn hồi silicon giúp môi mềm và mịn khi thoa lên.</li>

            <li>Chứa các sắc tố màu cao và tinh tế, tạo màu sắc đậm nhạt như ý muốn.</li>
            <li>Phức hợp Semi solid hạt mỏng giúp bám màu lên môi tốt hơn, không lộ vân môi và không làm bong tróc tế bào chết môi.</li>
        </ul>

        <img src="https://media.hasaki.vn/wysiwyg/Chau/son-thoi-li-3ce-vo-trong-suot-3-5g-3.jpg"  style="width: 100%; height: 650px">

        <h6 style="margin-top: 30px;">Thông số sản Phẩm</h6>
        <table class="table table-bordered"style="margin-top: 30px;">
            <tr>
                <th>Barcode</th>
                <th>8809664982309</th>
            </tr>

            <tr>
                <td>Thương Hiệu	</td>
                <td>3CE</td>
            </tr>
            <tr>
                <td>Xuất xứ thương hiệu	</td>
                <td>Hàn Quốc</td>
            </tr>
            <tr>
                <td>Nơi sản xuất	</td>
                <td>Korea</td>
            </tr>
            <tr>
                <td>Đặc Tính	</td>
                <td>Dạng Lì</td>
            </tr>
        </table>

        <h4 style="margin-top: 20px;">Sản phẩm cùng loại</h4>

        <div class="row" style="margin-top: 30px" >
            <div class="col-lg-3 col-md-3 col-sm-6"
                 ng-repeat="product in products |filter : 'detaicunglooai' " style="margin-top:30px ;" >
                <div class="card" style="border: 0">
                    <a href="#h1"> <img src="" class="card-img-top" alt="..." /></a>
                    <div class="card-body">
                        <h5 class="card-title">{{product.ten_SP}}</h5>
                        <p>{{product.mo_Ta}}</p>
                        <p><span>&#x2605;</span><span>&#x2605;</span><span>&#x2605;</span><span>&#x2605;</span><span>&#9734;  920</p>
                        <p class="card-text" style="font-weight:900 ;">{{product.gia}}</p>

                    </div>
                </div>
            </div>
        </div>



        <h4 style="margin-top:30px ;">Hỏi đáp</h4>
        <p style="margin-top:30px ;">trần thị hương - 17/10/2022</p>
        <p>hạn dùng như thế nào ạ</p>



    </div>
</div>





</body>
</html>