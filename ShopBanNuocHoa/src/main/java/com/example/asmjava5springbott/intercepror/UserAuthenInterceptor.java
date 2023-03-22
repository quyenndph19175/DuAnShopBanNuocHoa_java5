package com.example.asmjava5springbott.intercepror;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.net.http.HttpResponse;

@Component
public class UserAuthenInterceptor implements HandlerInterceptor {
    @Autowired
    HttpSession httpSession;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(httpSession.getAttribute("username")!=null){
            System.out.println("ok đã đăng nhập");
            return true;
        }
        httpSession.setAttribute("redirect-uri",request.getRequestURI());
        System.out.println("Chưa đăng nhập");
        response.sendRedirect("/login/user");
        return false;
    }

}
