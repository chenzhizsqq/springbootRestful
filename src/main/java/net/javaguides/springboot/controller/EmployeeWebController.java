package net.javaguides.springboot.controller;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@CrossOrigin("*")   //是Spring Boot中的一个注解，它用于解决跨域访问的问题。
@RestController
public class EmployeeWebController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping("/employeeData")                      //能够通过，http://localhost:8080/employeeData，去访问
    public ModelAndView getData() {
        ModelAndView mv = new ModelAndView();
        List<Employee> data = employeeRepository.findAll();
        mv.addObject("employeeData", data);     //把数据添加到，http://localhost:8080/employeeData，去
        mv.setViewName("employeeView");                     //使用employeeView.html模板去显示
        return mv;
    }
}