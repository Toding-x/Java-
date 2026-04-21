package com.controller;

import com.dto.LoginDto;
import com.result.Result;
import com.service.LoginService;
import com.vo.LoginVo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService loginService;
    @PostMapping()
    public Result login(@RequestBody @Valid LoginDto loginDto){
        String token = loginService.login(loginDto);
        return Result.success(new LoginVo(token));

    }
}
