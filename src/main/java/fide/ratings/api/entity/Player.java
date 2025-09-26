package fide.ratings.api.entity;

import fide.ratings.api.enums.Countries;
import fide.ratings.api.enums.Flag;
import fide.ratings.api.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    private Long id;
    private String name;
    private Countries country;
    private Gender gender;
    private String title;
    private String wTitle;
    private String oTitle;
    private String foaTitle;
    private int rating;
    private int games; // number games played in the last month
    private int coefficient;
    private int rapidRating;
    private int rapidGames;
    private int rapidCoefficient;
    private int blitzRating;
    private int blitzGames;
    private int blitzCoefficient;
    private int birthday; // year only
    private Flag flag; // can be i for inactive, w for woman, wi for inactive woman
}
