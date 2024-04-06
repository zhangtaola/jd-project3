package com.cykj.Controller;

import com.cykj.utils.ResponseDTO;
import com.cykj.vo.TestVO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Value("${server.port}")
    private Integer port;

    @RequestMapping("/test")
    public ResponseDTO test(){
        return ResponseDTO.success("调用商品成功"+port);
    }

    @RequestMapping("/test1")
    public ResponseDTO test1(int id){
        return ResponseDTO.success("调用商品成功"+port+"id是"+id);
    }
    @RequestMapping("/test2")
    public ResponseDTO test2(@RequestBody TestVO vo){
        return ResponseDTO.success("调用商品成功"+port + vo);
    }
}
