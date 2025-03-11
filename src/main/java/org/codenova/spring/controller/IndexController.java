package org.codenova.spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
    RequestMappingHandlerMapping 을 쓰게 되면 HttpRequestHandler 라는 interface 를 토대로 만들 필요가 없다,
    POJO (Plain Old Java Object) 형태로 Handler를 정의 내리면 됨.
 */
@Controller
public class IndexController {

    @RequestMapping({"/", "/index"})
    public ModelAndView indexHandle() {
        System.out.println("IndexHandler.index");

        // ModelAndView mav = new ModelAndView();
        // mav.setViewName("index");

        ModelAndView mav = new ModelAndView("indexView");
        mav.addObject("msg", "Hello Spring");   //req.setAttribute ..
        mav.addObject("numbers", new int[]{1,2,3,4});

        return mav;
    }

    @RequestMapping("/help")
    public void helpHandle() {
        System.out.println("IndexHandler.help");
    }
}
