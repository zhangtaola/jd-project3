package com.cykj.openfegin.impl;

import com.cykj.openfegin.GoodsControllerFeign;
import com.cykj.utils.ResponseDTO;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class GoodsControllerFeignFallbackFactory implements FallbackFactory<GoodsControllerFeign> {
    @Override
    public GoodsControllerFeign create(Throwable cause) {
        cause.printStackTrace();//打印异常，或者将异常发送给运维人员
        System.out.println("熔断了，正在解决");
        //返回了GoodsControllerFeign的匿名实现类
        return new GoodsControllerFeign() {
            @Override
            public ResponseDTO test() {
                return ResponseDTO.error(1005,"熔断了，正在解决");
            }
        };
    }
}
