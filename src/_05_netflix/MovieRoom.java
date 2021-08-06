package _05_netflix;

public class MovieRoom {
public static void main(String[] args) {
	Movie movie1 = new Movie("JurrasicPark", 4);
	Movie movie2 = new Movie("Up", 3);
	Movie movie3 = new Movie("StarWars", 5);
	Movie movie4 = new Movie("IronMan", 1);
	Movie movie5 = new Movie("Terminator", 3);
	String price = movie1.getTicketPrice();
	System.out.println(price);
	NetflixQueue NetflixQueue = new NetflixQueue();
	NetflixQueue.addMovie(movie1);
	NetflixQueue.addMovie(movie2);
	NetflixQueue.addMovie(movie3);
	NetflixQueue.addMovie(movie4);
	NetflixQueue.addMovie(movie5);
	NetflixQueue.getBestMovie();
	NetflixQueue.printMovies();
    Movie best = NetflixQueue.getBestMovie();
	System.out.println(best.getTitle());
	Movie second = NetflixQueue.getMovie(1);
	System.out.println(second.getTitle());
	
}
}
