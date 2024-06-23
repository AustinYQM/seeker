package com.accio.seeker.repository.specification;

import com.accio.seeker.representation.entity.CardEntity;
import com.accio.seeker.representation.enums.EKeyword;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.JoinType;
import org.springframework.data.jpa.domain.Specification;

public class CardSpecs {

    public static Specification<CardEntity> searchAllText(String text) {
        return (root, query, cb) -> cb.or(
                cb.like(root.get("cardName"), "%" + text + "%"),
                cb.like(root.get("cardType"), "%" + text + "%"),
                cb.like(root.get("description"), "%" + text + "%"),
                cb.like(root.get("flavorText"), "%" + text + "%"),
                cb.like(root.get("lesson"), "%" + text + "%"),
                cb.like(root.get("prize"), "%" + text + "%"),
                cb.like(root.get("provideType"), "%" + text + "%"),
                cb.like(root.get("rarity"), "%" + text + "%"),
                cb.like(root.get("artist").get("artistName"), "%" + text + "%"),
                cb.like(root.get("toWin"), "%" + text + "%"));
    }
}
