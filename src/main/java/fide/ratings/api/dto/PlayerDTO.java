package fide.ratings.api.dto;

import fide.ratings.api.enums.Countries;
import fide.ratings.api.enums.Flag;
import fide.ratings.api.enums.Gender;

public record PlayerDTO(Long id,
        String name,
        Countries country,
        Gender gender,
        String title,
        String wTitle,
        String oTitle,
        String foaTitle,
        int rating,
        int games,
        int coefficient,
        int rapidRating,
        int rapidGames,
        int rapidCoefficient,
        int blitzRating,
        int blitzGames,
        int blitzCoefficient,
        int birthday,
        Flag flag) {
}
