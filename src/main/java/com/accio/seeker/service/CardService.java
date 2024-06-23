package com.accio.seeker.service;

import com.accio.seeker.repository.CardRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CardService {
    
    private final CardRepository cardRepository;
    public boolean testMethod() {
        return cardRepository.searchAllText("test") != null;
    }

    public String parseSearchText(String searchText) {
        // Sanatize input to all lowercase, so we don't have to worry about that
        searchText = searchText.toLowerCase();

        // Split into tokens based on whitespace
        List<String> tokens = new ArrayList<>(Arrays.asList(searchText.split("\\s+")));
        List<TokenOperator> tokenOperators = processTokens(tokens);
        
       

        // For each token look for */=/|/! and split into key and value

        return searchText;
    }
    
    private List<TokenOperator> processTokens(List<String> tokens) {
        return tokens.stream().map( token -> {
            TokenOperator.TokenKeyword keyword;
            TokenOperator.TokenOperand operand;
            String value;
            if(token.startsWith("name")) {
                keyword = TokenOperator.TokenKeyword.NAME;
                operand = TokenOperator.parseOperand(token.substring(4, 5));
                value = token.substring(6);
            } else if(token.startsWith("lesson")) {
                keyword = TokenOperator.TokenKeyword.LESSON;
                operand = TokenOperator.parseOperand(token.substring(6, 7));
                value = token.substring(8);
            } else if(token.startsWith("power")) {
                keyword = TokenOperator.TokenKeyword.POWER;
                operand = TokenOperator.parseOperand(token.substring(5, 6));
                value = token.substring(7);
            } else if(token.startsWith("type")) {
                keyword = TokenOperator.TokenKeyword.TYPE;
                operand = TokenOperator.parseOperand(token.substring(4, 5));
                value = token.substring(6);
            } else if(token.startsWith("keyword")) {
                keyword = TokenOperator.TokenKeyword.KEYWORD;
                operand = TokenOperator.parseOperand(token.substring(7, 8));
                value = token.substring(9);
            } else if(token.startsWith("text")) {
                keyword = TokenOperator.TokenKeyword.TEXT;
                operand = TokenOperator.parseOperand(token.substring(5, 6));
                value = token.substring(7);
            } else if(token.startsWith("provides")) {
                keyword = TokenOperator.TokenKeyword.PROVIDES;
                operand = TokenOperator.parseOperand(token.substring(8, 9));
                value = token.substring(10);
            } else if(token.startsWith("flavor")) {
                keyword = TokenOperator.TokenKeyword.FLAVOR;
                operand = TokenOperator.parseOperand(token.substring(7, 8));
                value = token.substring(9);
            } else if(token.startsWith("artist")) {
                keyword = TokenOperator.TokenKeyword.ARTIST;
                operand = TokenOperator.parseOperand(token.substring(7, 8));
                value = token.substring(9);
            } else if(token.startsWith("rarity")) {
                keyword = TokenOperator.TokenKeyword.RARITY;
                operand = TokenOperator.parseOperand(token.substring(7, 8));
                value = token.substring(9);
            } else if(token.startsWith("set")) {
                keyword = TokenOperator.TokenKeyword.SET;
                operand = TokenOperator.parseOperand(token.substring(4, 5));
                value = token.substring(6);
            } else if(token.startsWith("number")) {
                keyword = TokenOperator.TokenKeyword.NUMBER;
                operand = TokenOperator.parseOperand(token.substring(7, 8));
                value = token.substring(9);
            } else {
                keyword = TokenOperator.TokenKeyword.NONE;
                operand = TokenOperator.TokenOperand.NONE;
                value = token;
            }
            return new TokenOperator(keyword, operand, value);
        }).toList();
    }
}
