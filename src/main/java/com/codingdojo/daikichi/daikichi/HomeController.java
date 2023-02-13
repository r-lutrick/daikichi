package com.codingdojo.daikichi.daikichi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class HomeController {

    @RequestMapping("/travel/{location}")
    public String travel(@PathVariable("location") String location) {
        return "Congratulations! You will soon travel to " + location;
    }

    @RequestMapping("/lotto/{number}")
    public String lotto(@PathVariable("number") Integer number) {
        String even = "You will take a grand journey in the near future, but be wary of tempting offers.";
        String odd = "You will take a grand journey in the near future, but be wary of tempting offers.";
        return number % 2 == 0 ? even : odd;
    }
}