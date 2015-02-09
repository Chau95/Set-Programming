/**
 * Created by Chau Duong on 1/22/2015.
 */
public class Movie {
    private String name;
    private int year;

    public Movie (String name, int year){
        this.name = name;
        this.year = year;
    }

    public String getName(){
        return this.name;
    }

    public int getYear(){
        return this.year;
    }

    public String toString(){
        String result = this.name + " (" + this.year + ")";
        return result;
    }

    public boolean equals(Movie otherMovie){
        if (this.name.equals(otherMovie.name) &&
                this.year == otherMovie.year){
            return true;
        }
        else
            return false;
    }
}