package com.test.est.Controller;

import com.test.est.Service.ContactService;
import com.test.est.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class statciController {
    @Autowired
    private ContactService contactService;

    @GetMapping("/thank-you")
    public String thankyou(){
        return "thank-you";
    }
    @GetMapping("/index")
    public String showContactForm(Model model) {
        model.addAttribute("contact", new Contact());
        return "theme-dust";
    }

//    @GetMapping("/contact")
//    public String showContactForm(Model model) {
//        model.addAttribute("contact", new Contact());
//        return "contact-form";
//    }
    @PostMapping("/contact")
    public String submitContactForm(@ModelAttribute Contact contact) {
        contactService.saveContact(contact);
        return "redirect:/thank-you";
    }

//    @GetMapping("/home")
//    public String getName(){
//        return "theme-dust.html";
//    }
//    @PostMapping("/submit")
//    public String submitForm(@RequestParam("name") String name,
//                             @RequestParam("email") String email,
//                             @RequestParam("subject") String subject,
//                             @RequestParam("message") String message) {
//
//        return "redirect:/thankyou";
//    }



}
