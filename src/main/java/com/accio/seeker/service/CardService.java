package com.accio.seeker.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.stereotype.Component;

@Component
public class CardService {
  
  public String parseSearchText(String searchText) {
    //Sanatize input to all lowercase, so we don't have to worry about that
    searchText = searchText.toLowerCase();

    // Split into tokens based on whitespace
    List<String> tokens = new ArrayList<>(Arrays.asList(searchText.split("\\s+")));
    Map<String, String> tokenMap = new HashMap<>();
    //for each token, use startsWith to determine if it is a keyword
    tokens.forEach(token -> {
      if (token.startsWith("name")) {
        tokenMap.put("name", token);
      } else if (token.startsWith("lesson")) {
        tokenMap.put("lesson", token);
      } else if (token.startsWith("power")) {
        tokenMap.put("power", token);
      } else if (token.startsWith("type")) {
        tokenMap.put("type", token);
      } else if(token.startsWith("keyword")) {
        tokenMap.put("keyword", token);
      } else if(token.startsWith("text")) {
        tokenMap.put("text", token);
      } else if(token.startsWith("provides")) {
        tokenMap.put("provides", token);
      } else if(token.startsWith("flavor")) {
        tokenMap.put("flavor", token);
      } else if(token.startsWith("artist")) {
        tokenMap.put("artist", token);
      } else if(token.startsWith("rarity")) {
        tokenMap.put("rarity", token);
      } else if(token.startsWith("set")) {
        tokenMap.put("set", token);
      } else if(token.startsWith("number")) {
        tokenMap.put("number", token);
      } 
    });
    
    //For each token look for */=/|/! and split into key and value
    
    return searchText;
  }
}
