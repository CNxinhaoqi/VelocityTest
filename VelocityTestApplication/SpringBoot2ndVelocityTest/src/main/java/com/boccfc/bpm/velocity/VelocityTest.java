package com.boccfc.bpm.velocity;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VelocityTest {

    @RequestMapping
    public String getIndexData(Model model){
        User user =new User();
        user.setName("velocity");
        user.setAge(10);
        user.setAddress("USA");
        model.addAttribute("user",user);
        return "velocity/index.vm";
    }
}
