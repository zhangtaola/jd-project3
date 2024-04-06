package com.cykj.openfegin.impl;

import com.cykj.openfegin.GoodsControllerFeign;
import com.cykj.utils.ResponseDTO;
import org.springframework.stereotype.Component;

//@Component
public class GoodsControllerFeignImpl implements GoodsControllerFeign {
    @Override
    public ResponseDTO test() {
        return ResponseDTO.error(1005,"接口出错了，熔断器已打开");
    }
}
