package com.cykj.openfegin;


import com.cykj.openfegin.impl.GoodsControllerFeignFallbackFactory;
import com.cykj.openfegin.impl.GoodsControllerFeignImpl;
import com.cykj.utils.ResponseDTO;
import com.cykj.vo.TestVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient(value = "jd-goods",path = "/goods",fallback = GoodsControllerFeignImpl.class)
@FeignClient(value = "jd-goods",path = "/goods",fallbackFactory = GoodsControllerFeignFallbackFactory.class)
public interface GoodsControllerFeign {

    @RequestMapping("/test")
    ResponseDTO test();
//    @RequestMapping("/test1")
//    ResponseDTO test1(@RequestParam("id") int id);
//    @RequestMapping("/test2")
//    ResponseDTO test2(@RequestBody TestVO vo);

}
