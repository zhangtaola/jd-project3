package com.cykj.controller;


import com.cykj.openfegin.GoodsControllerFeign;
import com.cykj.service.UserService;
import com.cykj.utils.ResponseDTO;
import com.cykj.vo.LoginVO;
import com.cykj.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/user")
public class UserController {
    @Value("${myUser}")
    private String myUser;

    @Autowired
    private GoodsControllerFeign goodsControllerFeign;

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public ResponseDTO test(){

        ResponseDTO dto = goodsControllerFeign.test();
//        ResponseDTO responseDTO = goodsControllerFeign.test1(100);
//        TestVO vo = new TestVO();
//        vo.setAcc("zhangsan");
//        vo.setPwd("123456");
//        ResponseDTO responseDTO = goodsControllerFeign.test2(vo);
        return dto;
    }
    @RequestMapping("/login")
    public ResponseDTO login(@RequestBody LoginVO vo){
        System.out.println("myUser是：" + myUser);
        return userService.login(vo.getAcc(), vo.getPwd());
    }
}
