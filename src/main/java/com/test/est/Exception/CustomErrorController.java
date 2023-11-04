package com.test.est.Exception;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        // Return the name of your custom error page (e.g., "not-found")
        return "not-found";
    }


    public String getErrorPath() {
        return "/error";
    }
}

