package com.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtUtils {

    // 密钥（至少32字节）
    private static final Key KEY = Keys.hmacShaKeyFor(
            "my-secret-key-for-jwt-1234567890".getBytes()
    );

    // token 有效期：12小时
    private static final long EXPIRE = 12 * 60 * 60 * 1000L;

    /**
     * 生成 token
     * @param id       用户id
     * @param username 用户名
     * @return JWT token 字符串
     */
    public static String generateToken(Integer id, String username) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("id", id);
        claims.put("username", username);

        // 生成 token
        return Jwts.builder()
                .claims(claims)                          // 改：setClaims → claims
                .issuedAt(new Date())                    // 改：setIssuedAt → issuedAt
                .expiration(new Date(System.currentTimeMillis() + EXPIRE))  // 改：setExpiration → expiration
                .signWith(KEY)                           // 改：去掉第二个参数 SignatureAlgorithm
                .compact();

    }

    /**
     * 解析 token，返回 Claims（里面包含 id 和 username）
     * token 无效或过期会抛异常
     */
    public static Claims parseToken(String token) {
        return Jwts.parser()                            // 改：parserBuilder → parser
                .verifyWith((javax.crypto.SecretKey) KEY) // 改：setSigningKey → verifyWith
                .build()
                .parseSignedClaims(token)               // 改：parseClaimsJws → parseSignedClaims
                .getPayload();                           // 改：getBody → getPayload

    }
}