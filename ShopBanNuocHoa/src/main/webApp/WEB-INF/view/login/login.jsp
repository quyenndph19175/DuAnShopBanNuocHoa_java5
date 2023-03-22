<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Login</title>
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
<body ng-app="Login">
<div class="container" ng-controller="myctrl">
    <div
            class="card"
            style="
          width: 40%;
          margin: auto;
          margin-top: 120px;
          background-color: bisque;
        "
    >
        <div class="container">

                <h4 class="text-center" style="font-weight: 750; margin-top: 30px">
                    Login
                </h4>
                <form action="/login/checkLogin" method="post">
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label"
                    >Username
                    </label>
                    <input
                            type="text"
                            class="form-control"
                            id="exampleFormControlInput1"
                            name="ma" value="${taiKhoan}"
                    />
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label"
                    >PassWord</label
                    >
                    <input
                            type="password"
                            class="form-control"
                            id="exampleFormControlInput1"
                            name="matKhau" value="${matkhaus}"
                    />
                </div>
                <p>
                    <a style="text-decoration: none; margin-left: 270px" href="##"
                    >forgot your Password</a
                    >
                </p>
                    <br>
                    <label for="exampleFormControlInput1" class="form-label"
                    >${mes}</label>
                     <button>Login</button>
                </form>

                <p
                        class="text-center"
                        style="margin-top: 30px; margin-bottom: 10px"
                >
                    <a style="text-decoration: none" href="/login/createAcc">Create account</a>
                </p>
                <p class="text-center">OR SIGN IN WITH YOUR SOCIAL MEDIA ACCOUNT</p>
                <div class="row" style="margin-bottom: 50px">
                    <img src="/img/fb.webp" style="width: 15%; margin-left: 85px"/>
                    <img src="/img/ytb.png " style="width: 15%"/>
                    <img src="/img/ista.png " style="width: 15%"/>
                    <img src="/img/teless.png " style="width: 15%"/>

                </div>

        </div>
    </div>
</div>

</body>
</html>





