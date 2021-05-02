package com.wipro;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test{

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		Movie movie = (Movie) context.getBean("movie");
		movie.setMovieID("M001");
		movie.setMovieActor("Tom Cruise");
		movie.setMovieName("The Firm");
		System.out.println(movie);
	}

}
