package ai.vishal.movieinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ai.vishal.movieinfo.model.Movie;
import ai.vishal.movieinfo.repository.MovieRepo;
@RestController
public class MovieInfoController {
    @Autowired
    MovieRepo movieRepo;

    @GetMapping("/movie/{movieId}")
    public Movie getMovieInfo(@PathVariable String movieId){
        return movieRepo.findById(movieId).orElseThrow();
    }
}
