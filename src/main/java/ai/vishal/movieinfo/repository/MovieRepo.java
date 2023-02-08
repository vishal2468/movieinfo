package ai.vishal.movieinfo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ai.vishal.movieinfo.model.Movie;

public interface MovieRepo extends MongoRepository<Movie,String>{
    
}
