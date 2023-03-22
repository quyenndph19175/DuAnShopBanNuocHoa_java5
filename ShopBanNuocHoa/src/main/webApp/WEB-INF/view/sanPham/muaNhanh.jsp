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
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<div class="container">
    <div class="row">
        <h4 style="margin-top: 35px" class="col-3">Sản Phẩm</h4>
        <div class="col-1"></div>
        <p style="margin-top: 35px" class="col-1">Giá mua</p>
        <p style="margin-top: 35px" class="col-1">số lượng</p>
        <p style="margin-top: 35px" class="col-1">Thành tiền</p>
    </div>

    <div class="row">
        <div class="col-8">
            <div
                    class="card mb-3"
                    style="max-width: 780px;border: 0px;"

                    style="margin-top: 30px; border: 0px;"
            >
                <hr>
                <div class="row g-0">
                    <div class="col-md-3">
                        <img src="/img/${spMua.anh}" class="d-block w-100" alt="Ảnh của nó">
                    </div>
                    <div class="col-md-4">
                        <div class="card-body">
                            <h5 class="card-title">${spMua.sanPham.ten}</h5>
                            <p class="card-text">
                                This is a wider
                            </p>

                        </div>
                    </div>

                    <div class="col-md-1">
                        <h5 style="margin-top:20px ;"></h5>
                        ${spMua.giaBan}</div>
                    <div class="col-md-2">
                        <p style="margin-top:20px ; margin-left: 50px;">${soLuong}</p>
                    </div>
                    <div class="col-md-2">
                        <p style="margin-top:20px ;"></p>

                       $${tonTien}</div>
                </div>
            </div>
        </div>


        <div class="col-4">
            <div class="card mb-3" style="max-width: 540px;">
                <div class="row">
                    <p style="margin-top: 20px; margin-left: 15px;" class="col-6">Thành tiền : <strong style="color: red;">$${tonTien}</strong></p>

                </div>
                <hr style="color: red; margin-top: 0px;">
                <p>Giao hàng</p>
                <ul>
                    <li>Ship nội thành Hà Nội, HCM : 20.000 đ</li>
                    <li>Ship hàng ngoại thành & toàn quốc : 30.000 đ</li>
                    <li>Ship hàng hỏa tốc trong vòng 2h : 30.000 đ</li>
                    <li>Miễn phí đơn hàng có giá trị trên 1 triệu đồng</li>
                </ul>
                <hr>
                <p>Thông tin thanh toán</p>
                <form action="/user/produc/buyproduc" method="post">
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label" style="margin-left: 80px;" >Họ Tên Người Nhận* </label>
                    <br>
                    <input type="text" style="width:270px ; height:30px ; margin-left:80px ;"name="tenNguoiNhan">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label" style="margin-left: 80px;" >Địa Chỉ*</label>
                    <br>
                    <input type="text" style="width:270px ; height:30px ; margin-left:80px ;"name="diaChi">
                </div>

                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label" style="margin-left: 80px;" name="sdt">Số điện thoại*</label>
                    <br>
                    <input type="text" style="width:270px ; height:30px ; margin-left:80px ;"name="sdt">
                </div>


            </div>
            </div>

            <button type="submit" class="col-4" style="width:420px ; font-weight: 600; height:50px ;background-color: #1f601f; color: aliceblue;">Mua Hàng</button>
        </form>
        </div>

    </div>
</div>


</div>
<hr />
</div>

</body>
</html>



</body>
</html>