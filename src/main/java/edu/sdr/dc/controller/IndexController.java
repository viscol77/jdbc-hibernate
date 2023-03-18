package edu.sdr.dc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    /**
     * Sample of simple end-point
     */
    @GetMapping("/hello")
    public String getRates() {
        return "hello!!!";
    }

    /**
     * Try to reproduce a copy of this link: https://www.bnr.ro/nbrfxrates.xml
     * Open the browser and
     * @return rates
     */
    @GetMapping("/nbrfxrates.xml")
    public String getRatesAsXmlFormat() {
        //call a service which will return rates into XML format.
        return "hello!!!";
    }

}
