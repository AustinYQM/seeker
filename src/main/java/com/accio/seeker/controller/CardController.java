package com.accio.seeker.controller;

import com.accio.seeker.service.CardService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController()
public class CardController {
    
    private final CardService cardService;

    @GetMapping("/")
    public String getCardBySearchText(@RequestParam  String searchText) {
        
        return "";

    }
}
