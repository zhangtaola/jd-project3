package com.cykj.service.impl;

import com.cykj.mapper.UserMapper;
import com.cykj.pojo.CyAdmin;
import com.cykj.service.UserService;
import com.cykj.utils.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public ResponseDTO login(String acc, String pwd) {
        ResponseDTO dto = null;
        List<CyAdmin> res = userMapper.Login(acc, pwd);
        if (res.size() > 0 ){
            dto = ResponseDTO.success("登录成功",res);
        }else {
            dto = ResponseDTO.error("登录失败");
        }
        return dto;
    }
}
