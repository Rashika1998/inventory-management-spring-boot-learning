package com.rashika.inventorymanagement.inventory_management;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @Value("${welcome.message}")
    private String welcome_message;

    @GetMapping("/welcome")
    public String displayWelcomeMessage(){
        return welcome_message;
    }

}
