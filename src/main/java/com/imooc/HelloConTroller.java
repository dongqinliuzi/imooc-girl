package com.imooc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by heitizi on 2017/3/28.
 */
@RestController
@RequestMapping(value = "/tizi")
public class HelloConTroller {
//    @Value("${high}")
//    private String cupSize;

//    @Value("${num}")
//    private Integer age;

//    @Value("${content}")
//    private String content;

    @RequestMapping(value = {"/hello","/hi"}, method = RequestMethod.GET)
    public String say(){
        return "Hello Spring Boot!";
//        return cupSize + age;
//        return content;
    }

//    @RequestMapping(value = "/cupsize", method = RequestMethod.GET)
//    public String cupSize(){
//        return cupSize + age;
//    }

    // /goods/goods_id/detail
    @RequestMapping(value = "/goods/{goods_id}/detail",method = RequestMethod.GET)
    public String getGoodsDetail(@PathVariable("goods_id") Integer goods_id ) {
        return "goods_id: " + goods_id ;
    }

    // /goods/detail?goods_id=1212
    @RequestMapping(value = "/goods/detail2",method = RequestMethod.GET)
    public String getDetail(@RequestParam("goods_id") Integer goods_id ) {
        return "goods_id: " + goods_id ;
    }

    // /goods/detail?goods_id=1212 //默认：/goods/detail?goods_id=0
    @RequestMapping(value = "/goods/detail3",method = RequestMethod.GET)
    public String getDetail3(@RequestParam(value = "id", required = false, defaultValue = "0") Integer goods_id ) {
        return "goods_id: " + goods_id ;
    }

}
