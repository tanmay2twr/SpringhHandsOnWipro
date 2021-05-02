package com.wipro;

import org.springframework.stereotype.Component;

@Component
public class Movie {
private String movieID;
private String movieName;
private String movieActor;
public String getMovieID() {
	return movieID;
}
public void setMovieID(String movieID) {
	this.movieID = movieID;
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public String getMovieActor() {
	return movieActor;
}
public void setMovieActor(String movieActor) {
	this.movieActor = movieActor;
}
@Override
public String toString() {
	return "Movie [movieID=" + movieID + ", movieName=" + movieName + ", movieActor=" + movieActor + "]";
}


}
