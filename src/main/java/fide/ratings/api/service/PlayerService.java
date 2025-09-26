package fide.ratings.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fide.ratings.api.dto.PlayerDTO;
import fide.ratings.api.entity.Player;
import fide.ratings.api.enums.Countries;
import fide.ratings.api.enums.Flag;
import fide.ratings.api.enums.Gender;
import fide.ratings.api.enums.RatingTypes;
import fide.ratings.api.repository.PlayerRepository;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public PlayerDTO getPlayerByFideId(Long id) {
        Player player = playerRepository.getPlayerByFideId(id);

        return returnForObject(player);
    }

    public List<PlayerDTO> getPlayerByName(String name) {
        return playerRepository.getPlayerByName(name)
                .stream()
                .map(p -> new PlayerDTO(p.getId(),
                        p.getName(),
                        p.getCountry(),
                        p.getGender(),
                        p.getTitle(),
                        p.getWTitle(),
                        p.getOTitle(),
                        p.getFoaTitle(),
                        p.getRating(),
                        p.getGames(),
                        p.getCoefficient(),
                        p.getRapidRating(),
                        p.getRapidGames(),
                        p.getRapidCoefficient(),
                        p.getBlitzRating(),
                        p.getBlitzGames(),
                        p.getBlitzCoefficient(),
                        p.getBirthday(),
                        p.getFlag()))
                .toList();
    }

    public List<PlayerDTO> getTopPlayers(int limit, Countries country, RatingTypes ratingType, Gender gender,
            Flag flag) {
        return playerRepository.getTopPlayers(limit, country, ratingType, gender, flag)
                .stream()
                .map(p -> new PlayerDTO(p.getId(),
                        p.getName(),
                        p.getCountry(),
                        p.getGender(),
                        p.getTitle(),
                        p.getWTitle(),
                        p.getOTitle(),
                        p.getFoaTitle(),
                        p.getRating(),
                        p.getGames(),
                        p.getCoefficient(),
                        p.getRapidRating(),
                        p.getRapidGames(),
                        p.getRapidCoefficient(),
                        p.getBlitzRating(),
                        p.getBlitzGames(),
                        p.getBlitzCoefficient(),
                        p.getBirthday(),
                        p.getFlag()))
                .toList();
    }

    public PlayerDTO returnForObject(Player player) {
        return new PlayerDTO(player.getId(),
                player.getName(),
                player.getCountry(),
                player.getGender(),
                player.getTitle(),
                player.getWTitle(),
                player.getOTitle(),
                player.getFoaTitle(),
                player.getRating(),
                player.getGames(),
                player.getCoefficient(),
                player.getRapidRating(),
                player.getRapidGames(),
                player.getRapidCoefficient(),
                player.getBlitzRating(),
                player.getBlitzGames(),
                player.getBlitzCoefficient(),
                player.getBirthday(),
                player.getFlag());
    }
}
