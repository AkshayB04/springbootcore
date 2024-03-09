package com.itvedant.springbootcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class FirstController {
    //When client send the request to the URL /
    //web server will call the method home mapped with this URL
   
    //String will be the name of the view file (html file)
    //that should be returned as the response
   
   //Dependency Injection
   @Autowired
   Student s;
   
   
   
   
    @RequestMapping("/")

    public String home(){
        System.out.println("Home Method Called");
        s.print();
        return "homepage.html";

    }

    @RequestMapping("/about")    
    public String about(){
        return "aboutus.html";
    }

    public String contactUs(){
        return null;

        
    }

}
