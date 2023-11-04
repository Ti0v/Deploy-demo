package com.test.est.Controller;


import com.test.est.Service.ContactService;
import com.test.est.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

public class adminController {

    @Autowired
    private ContactService contactService;
    @GetMapping("private-admin/contacts")
    public String showAllContacts(Model model) {
        List<Contact> contacts = contactService.allContacts();
        model.addAttribute("contacts", contacts);
        return "all-contacts";
    }


}
