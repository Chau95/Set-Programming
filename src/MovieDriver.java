/**
 * Created by Chau Duong on 1/22/2015.
 */
import java.util.*;

public class MovieDriver {
    public static void main (String[] args) {
        System.out.println("Welcome to Movie Driver");

        //Creating Movies
        Movie m1 = new Movie("Lord of the Rings", 2004);
        Movie m2 = new Movie("Django Unchained", 2013);
        Movie m3 = new Movie("Tarzan", 1995);
        Movie m4 = new Movie("The Exorcist", 1975);
        Movie m5 = new Movie("Pulp Fiction", 1999);
        Movie m6 = new Movie("Good Will Hunting", 1995);
        Movie m7 = new Movie("Gone Girl", 2014);
        Movie m8 = new Movie("The Avengers", 2012);

        //Creating different sets of Movies
        Set<Movie> library = new HashSet<Movie>();
        Set<Movie> favorites = new HashSet<Movie>();
        Set<Movie> watched = new HashSet<Movie>();
        Set<Movie> comedy = new HashSet<Movie>();
        Set<Movie> drama = new HashSet<Movie>();

        //Adding movies to according sets.
        library.add(m1);
        library.add(m2);
        library.add(m3);
        library.add(m4);
        library.add(m5);
        library.add(m6);
        library.add(m7);
        library.add(m8);

        favorites.add(m1);
        favorites.add(m2);
        favorites.add(m3);
        favorites.add(m5);
        favorites.add(m7);

        watched.add(m1);
        watched.add(m3);
        watched.add(m7);

        drama.add(m7);
        drama.add(m4);
        drama.add(m5);

        comedy.add(m5);

        //Creating an iterator.
        Iterator<Movie> currentFav = favorites.iterator();
        System.out.println(currentFav.next());
        System.out.println(currentFav.next());

        System.out.println("Library is " + library);
        System.out.println("Favorite movies are" + favorites);

        SetHelper helper = new SetHelper();

        //This is a set for watched Drama Movies.
        Set<Movie> watchedDrama = helper.intersect(watched, drama);
        //This is a set of Unwatched Movies.
        Set<Movie> unwatched = helper.differences(library, watched);
        //This is a set for Comedy and Drama Movies
        Set<Movie> DramaComedy = helper.intersect (drama, comedy);
        //This is a set for Favourite Comedy and Drama Movies
        Set<Movie> favDramaComedy = helper.intersect (favorites, DramaComedy);

        //Creating a map to associate an int number of views along with a Movie
        Map<Movie, Integer> movieViews = new HashMap <Movie, Integer>();
        movieViews.put(m1, 2);
        movieViews.put(m3, 6);
        movieViews.put(m8, 0);
        //This map represents the number of views of my favorite movies
        Map<Set, Integer> favMovieViews = new HashMap <Set, Integer>();
        favMovieViews.put(favorites, 42);
        System.out.println("I have seen all my favorite movies: " + favMovieViews + " times!");

        Queue<Movie> playList = new LinkedList<Movie>();
        //Adds movie m1 to the end of playList
        playList.add(m1);
        playList.add(m4);
        playList.add(m7);
        playList.add(m2);
        //Peek at the first movie in the playList
        Movie firstToPlay = playList.element();
        //Testing stuffs
        System.out.println("The first movie in the play list is "
                + firstToPlay.toString());
        //Removes the first movie in the playList
        playList.remove();
        //Test it again
        System.out.println("Now the first movie in the play list is "
                + playList.peek());
    }
}