package com.example.demo.controller;

import com.example.demo.Entity.Restorent;
import com.example.demo.Service.RestorentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
    private final RestorentService service;
    public HomeController (RestorentService service){
        this.service=service;
    }
   @RequestMapping("/")
   public String index(){
       return "index";
   }
   @GetMapping("/about")
    public String har(){
       return "about";
   }

   @GetMapping("/contact")
    public String sch(){
       return "contact";
   }
   @GetMapping("/service")
    public String he(){
       return "service";
   }
   @GetMapping("/menu")
    public String pan(){
       return "menu";
   }
   @GetMapping("/team")
    public String pandit(){
       return "team";
   }
   @GetMapping("/testimonial")
    public String pandey(){
       return "testimonial";
   }
    @GetMapping("/booking")
    public String hr(Model model){
        model.addAttribute("booking",new Restorent());
        return "booking";
    }
    @PostMapping(value = "/booking")
    public String ho(@ModelAttribute("booking") Restorent restorent){
        service.SaveRestorent(restorent);
        return "success";
    }
}
