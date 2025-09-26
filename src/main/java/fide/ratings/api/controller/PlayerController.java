package fide.ratings.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fide.ratings.api.dto.PlayerDTO;
import fide.ratings.api.enums.Countries;
import fide.ratings.api.enums.Flag;
import fide.ratings.api.enums.Gender;
import fide.ratings.api.enums.RatingTypes;
import fide.ratings.api.service.PlayerService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/players")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @GetMapping("/by-fide-id")
    public PlayerDTO getPlayerByFideId(@RequestParam Long Id) {
        return playerService.getPlayerByFideId(Id);
    }

    @GetMapping("/by-name")
    public List<PlayerDTO> getPlayerByName(@RequestParam String name) {
        return playerService.getPlayerByName(name);
    }

    @GetMapping("/top")
    public List<PlayerDTO> getTopPlayers(
            // @Parameter(name = "flag", description = "Possible values: MAN, INACTIVE_MAN,
            // WOMAN, WOMAN_INACTIVE", in = ParameterIn.QUERY, required = false)
            @RequestParam(value = "limit", required = false, defaultValue = "10") int limit,
            @RequestParam(value = "country", required = false) Countries country,
            @RequestParam(value = "type", required = false) RatingTypes ratingType,
            @RequestParam(value = "gender", required = false) Gender gender,
            @RequestParam(value = "flag", required = false) Flag flag) {

        return playerService.getTopPlayers(limit, country, ratingType, gender, flag);
    }
}
