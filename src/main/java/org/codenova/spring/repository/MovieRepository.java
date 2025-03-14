package org.codenova.spring.repository;


import lombok.AllArgsConstructor;
import org.codenova.spring.model.Movie;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

@Repository
@AllArgsConstructor
public class MovieRepository {

    private DataSource dataSource;

    public boolean create(Movie movie) {
        boolean result = false;
        try {
            Connection conn = dataSource.getConnection();

            Date releaseDate = Date.valueOf(movie.getReleaseDate());

            PreparedStatement ps = conn.prepareStatement("insert into movie values (null,?,?,?,?)");
            ps.setString(1, movie.getTitle());
            ps.setString(2, movie.getDescription());
            ps.setString(3, movie.getGenre());
            ps.setDate(4, releaseDate);

            ps.executeUpdate();

            result = true;

        } catch (Exception e) {
            System.out.println("MovieRepository.create error:"+e);
        }


        return result;
    }

}
