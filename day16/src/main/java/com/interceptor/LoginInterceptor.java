package com.interceptor;

import com.utils.JwtUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public  boolean preHandle(HttpServletRequest request,
                              HttpServletResponse response,
                              Object handler)throws Exception{
        String token = request.getHeader("token");
        if (token==null||token.isEmpty()){
            response.setStatus(401);
            return false;
        }
        try {
            JwtUtils.parseToken(token);
        }catch (Exception e){
            response.setStatus(401);
            return false;
        }
        return true;
    }
}
