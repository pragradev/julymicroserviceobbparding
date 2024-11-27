package io.pragra.learning.onboarding.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/onboarding")
public class OpenAgreement {

    @GetMapping("/newconnection")
    public String newAgreement(){
        return "Services has been added";
    }

}
