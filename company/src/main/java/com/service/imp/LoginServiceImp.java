package com.service.imp;

import com.dto.LoginDto;
import com.entity.Emp;
import com.enums.ErrorCode;
import com.expcetion.BusinessException;
import com.mapper.LoginMapper;
import com.service.LoginService;
import com.utils.JwtUtils;
import com.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginServiceImp implements LoginService {
    @Autowired
    private LoginMapper loginMapper;
    @Override
    public String login(LoginDto loginDto) {
        Emp emp = loginMapper.selectByUsername(loginDto.getUsername());
        if (emp == null){
            throw new BusinessException(ErrorCode.USER_NOT_FOUND);
        }
        boolean match = MD5Utils.encrypt(loginDto.getPassword()).equals(emp.getPassword());
        if (!match){
            throw new BusinessException(ErrorCode.PASSWORD_ERROR);
        }
        return JwtUtils.generateToken(emp.getId(),emp.getUsername());
    }
}
