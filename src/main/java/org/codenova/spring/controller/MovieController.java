package org.codenova.spring.controller;


import org.codenova.spring.model.Movie;
import org.codenova.spring.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @RequestMapping("/create-proceed")
    public String createProceedHandle(@ModelAttribute Movie movie) {


        boolean r = movieRepository.create(movie);

        System.out.println("create =" + r);

        return "movie/create-proceed";
    }
}
