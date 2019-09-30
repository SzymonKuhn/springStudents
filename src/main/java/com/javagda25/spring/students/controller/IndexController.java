package com.javagda25.spring.students.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping (path = "/demo/") //dodatek przed wszystkimi urlami tej klasy
public class IndexController {
    @RequestMapping (path = "/index", method = RequestMethod.GET)
    public String wyswieltMojaStroneHelloWorldTySpringu() {
        return "strona-hello";
    }

    @GetMapping ("/hello")
    public String wyswietlHello() {
        return "strona-hello";
    }

    @GetMapping ("/helloTo") //np. helloTo?imie=Pawel
    public String wyswietlHelloTo (Model model,
                                   @RequestParam(name="imie", required = false) String parametrImie) {
        model.addAttribute("atrybutImie", parametrImie);

        return "strona-hello-to";
    }


    @GetMapping ("/helloMyBaby/{babyName}")
    public String wyswietlHelloToBaby (Model model,
                                   @PathVariable(name = "babyName") String variable) {
        model.addAttribute("atrybutImie", variable);
        return "strona-hello-to";
    }

}
