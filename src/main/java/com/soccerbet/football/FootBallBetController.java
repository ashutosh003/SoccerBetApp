package com.soccerbet.football;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FootBallBetController {

    @GetMapping("/getUserInfo")
    public String retrieveHelloWorld() {
        return "Gave you user Info";
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public String updateUSerInfo() {
        return "Updated your user Info";
    }
}
