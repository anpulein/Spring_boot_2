package com.galkin.spring_boot_2.interceptor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyClassInterceptor  implements HandlerInterceptor {

    private String token;

    public MyClassInterceptor(String token) {
        this.token = token;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestKey = request.getHeader("token");

        // Проверка на заголовок http запроса
        if (!requestKey.equals(token)) {
            response.getWriter().write("Error 403");
            response.setStatus(403);
            return false;
        }

        return true;

    }
}
