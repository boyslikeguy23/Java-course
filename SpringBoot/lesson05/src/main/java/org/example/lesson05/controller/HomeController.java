package org.example.lesson05.controller;

import org.example.lesson05.entity.Info;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping
public class HomeController {
    @GetMapping
    public String index(){
        return "index";
    }

    @GetMapping("/profile")
    public String profile(Model model){
        //Mock data -> view
        //List<Info> profile = new Info();
        //profileList.add(new Info("Mai Xuan Tung", "mxt@gmail.com", "mxt2003.com", "0865020103", "266 Nguyen Huy Tuong"));
        //profileList.add(new Info("Mai Xuan Son", "mxs@gmail.com", "mxs2007.com", "09887754321", "266 Ng Huy Tuong"));
        Info profile = new Info("Devmaster Academy", "mxt@gmail.com", "mxt.com", "0865020103", "266");
        model.addAttribute("profileInfo", profile);
        //model.addAttribute("title", "Devmaster: Trang chủ");
        return "profile";
    }
    @GetMapping("/home")
    public String home(Model model) {
        List<Info> profileList = new ArrayList<Info>();
        profileList.add(new Info("Mai Xuan Tung", "mxt@gmail.com", "mxt2003.com", "0865020103", "266 Nguyen Huy Tuong"));
        profileList.add(new Info("Mai Xuan Son", "mxs@gmail.com", "mxs2007.com", "09887754321", "266 Ng Huy Tuong"));
        model.addAttribute("profileList", profileList);
        model.addAttribute("title", "Devmaster: Trang chủ");
        return "home";
    }
    @GetMapping("/about")
    public String about() {
        return "about";
    }
    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}
