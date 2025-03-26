package kr.ac.kopo.leehanseock.firstspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example02Controller {
    @RequestMapping(value="/exam02", method=RequestMethod.GET)
    public String RequestMethod() {
        return "@RestController 연습중";
    }

}
