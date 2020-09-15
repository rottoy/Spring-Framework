package com.troller.report.controller.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/summoner")
public class SummonerController {

    @RequestMapping("/{id}")
    public String one(){ return "hello"; }

}
