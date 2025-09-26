package fide.ratings.api.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import fide.ratings.api.entity.Player;
import fide.ratings.api.enums.Countries;
import fide.ratings.api.enums.Flag;
import fide.ratings.api.enums.Gender;

public class PlayerRowMapper implements RowMapper<Player> {

    @Override
    public Player mapRow(ResultSet rs, int rowNum) throws SQLException {
        Player player = new Player();
        player.setId(rs.getLong("fide_id"));
        player.setName(rs.getString("name"));
        player.setCountry(Countries.fromCode(rs.getString("country")));
        player.setGender(Gender.fromCode(rs.getString("sex")));
        player.setTitle(rs.getString("title"));
        player.setWTitle(rs.getString("w_title"));
        player.setOTitle(rs.getString("o_title"));
        player.setFoaTitle(rs.getString("foa_title"));
        player.setRating(rs.getInt("rating"));
        player.setGames(rs.getInt("games"));
        player.setCoefficient(rs.getInt("k"));
        player.setRapidRating(rs.getInt("rapid_rating"));
        player.setRapidGames(rs.getInt("rapid_games"));
        player.setRapidCoefficient(rs.getInt("rapid_k"));
        player.setBlitzRating(rs.getInt("blitz_rating"));
        player.setBlitzGames(rs.getInt("blitz_games"));
        player.setBlitzCoefficient(rs.getInt("blitz_k"));
        player.setBirthday(rs.getInt("birthday"));
        player.setFlag(Flag.fromCode(rs.getString("flag")));

        return player;
    }
}
