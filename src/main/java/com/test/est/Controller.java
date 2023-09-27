package com.test.est;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/name")

    public String getName(){

        return "Mazen";

    }
    @GetMapping("/names")
    public List<String> getNames(){

        List<String> nameas = new ArrayList<>();
        nameas.add("MMae");
        nameas.add("ahemd");
        nameas.add("Nserer");
        return nameas;
    }
}
