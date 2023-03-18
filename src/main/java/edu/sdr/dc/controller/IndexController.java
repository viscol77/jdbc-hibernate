package edu.sdr.dc.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    /**
     * Sample of simple end-point
     */
    @GetMapping(value = "/hello")
    public String getRates() {
        return "hello!!!";
    }

    /**
     * Try to reproduce a copy of this link: https://www.bnr.ro/nbrfxrates.xml
     * Open the browser, copy & past http://localhost:8081/nbrfxrates.xml, press enter
     * @return rates
     */
    @GetMapping(value = "/nbrfxrates.xml", produces = MediaType.APPLICATION_XML_VALUE)
    public String getRatesAsXmlFormat() {
        //call a service which will return rates into XML format.
        return "";
    }

}
