package cn.org.yuwang.News.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by m1500 on 2016/8/2.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "hello";
    }
}
