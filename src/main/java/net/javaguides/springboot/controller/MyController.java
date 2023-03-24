package net.javaguides.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@RestController
public class MyController {

    @RequestMapping("/myData")
    public ModelAndView getData() {
        ModelAndView mv = new ModelAndView();
        List<String> data = Arrays.asList("data1", "data2", "data3");
        mv.addObject("myData", data);
        mv.setViewName("myView");
        return mv;
    }
}