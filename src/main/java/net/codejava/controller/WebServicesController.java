/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.codejava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lcshum
 */
@RestController
public class WebServicesController {

    @GetMapping("/rest")
    public String takeRest() {

        // return "Taek some good Rest";
        
          return " {\"message\":\"Taek some good Rest\"}"     ;
    }
}
