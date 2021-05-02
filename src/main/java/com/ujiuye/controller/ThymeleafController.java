package com.ujiuye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/thymeleafs")
public class ThymeleafController {

    //测试日期对象
    @RequestMapping("/first")
    public String first(Model model){
        model.addAttribute("date",new Date());
        return "index.html";
    }

    //测试数值对象
    @RequestMapping("/second")
    public String second(Model model){
        model.addAttribute("num",345.6789);
        return "index.html";
    }

    //测试字符串对象
    @RequestMapping("/third")
    public String third(Model model){
        model.addAttribute("str","Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\r\n" +
                "Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\r\n" +
                "Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\r\n");
        return "index.html";
    }
}
