package com.accio.seeker.controller;

import com.accio.seeker.service.CardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController("cards")
@RequestMapping("/cards")
public class CardController {

    private final CardService cardService;

    @GetMapping
    public boolean getCardBySearchText(@RequestParam String searchText) {

        return cardService.testMethod();
    } 
}
