package com.game.specification;

import com.game.entity.Player;
import com.game.entity.Profession;
import com.game.entity.Race;
import org.springframework.data.jpa.domain.Specification;

import java.util.Date;

public class PlayerSpecification {

    public static Specification<Player> nameLike(String name) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("name"), "%" + name + "%");
    }

    public static Specification<Player> titleLike(String title) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("title"), "%" + title + "%");
    }

    public static Specification<Player> raceIs(Race race) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("race"), race);
    }

    public static Specification<Player> professionIs(Profession profession) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("profession"), profession);
    }

    public static Specification<Player> bornBetween(Long after, Long before) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.between(root.get("birthday"), new Date(after), new Date(before));
    }

    public static Specification<Player> isBanned(Boolean banned) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("banned"), banned);
    }

    public static Specification<Player> experienceBetween(Integer after, Integer before) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.between(root.get("experience"), after, before);
    }

    public static Specification<Player> levelBetween(Integer after, Integer before) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.between(root.get("level"), after, before);
    }
}
