package com.imooc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by heitizi on 2017/3/28.
 */
@RestController
public class Hello2Controller {

    @Autowired
    private GirlProperties girlProperties;


    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String say(){
//        return "fafa";
        return girlProperties.getCupSize();
    }

}
