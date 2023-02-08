package ai.vishal.movieinfo.model;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie {
    @Id
    String movieId;
    String description;
    String name;
    
    public Movie(String movieId, String description, String name) {
        this.movieId = movieId;
        this.description = description;
        this.name = name;
    }
    
}