package com.accio.seeker.repository;

import com.accio.seeker.repository.specification.CardSpecs;
import com.accio.seeker.representation.entity.CardEntity;
import com.accio.seeker.representation.enums.EKeyword;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<CardEntity, Long>, JpaSpecificationExecutor<CardEntity> {
  
  List<CardEntity> findAllBySubTypesIn(Collection<EKeyword> subTypes);
  default List<CardEntity> searchAllText(String text) {
    // List<EKeyword> keyWordMatches = 
    //     Arrays.stream(EKeyword.values())
    //     .map(EKeyword::getPrettyName)
    //     .map(String::toLowerCase)
    //     .filter(keyword -> keyword.contains(text))
    //     .map(EKeyword::fromPrettyName)
    //     .toList();
    
    // List<CardEntity> keywordResults = findAllBySubTypesIn(keyWordMatches);
    
    // keywordResults.addAll(findAll(CardSpecs.searchAllText(text)));
    // return keywordResults;
    
    return findAll(CardSpecs.searchAllText(text));
  }
}
