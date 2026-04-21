package com;

import com.utils.JwtUtils;
import com.utils.MD5Utils;
import io.jsonwebtoken.Claims;

public class main {
    public static void main(String[] args) {
        String encrypted = MD5Utils.encrypt("123456");
        System.out.println(encrypted);
        String token = JwtUtils.generateToken(1,"admin");
        System.out.println(token);
        Claims claims = JwtUtils.parseToken(token);
        Integer userId =(Integer)claims.get("id");
        String userName = (String) claims.get("username");
        System.out.println(userId+"和"+userName);
    }
}
