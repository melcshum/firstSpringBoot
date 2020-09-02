package net.codejava.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

 

/**
 *
 * @author lcshum
 */
@Controller
public class WebController {
    @RequestMapping("/hello")
    public String sayHello(Model model){
        System.out.println("xxxxxxxxxxxSaying hello.....");
        model.addAttribute("message", "Wellcome to Spring Boot With Netbean IDE");
        return "hello";
    }
}
