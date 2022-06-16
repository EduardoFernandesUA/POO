package Aula12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Movie {
    protected String name;
    protected Double score;
    protected String rating;
    protected String genre;
    protected int runningTime;
    
    public Movie(String name, Double score, String rating, String genre, int runningTime) {
        this.name = name;
        this.score = score;
        this.rating = rating;
        this.genre = genre;
        this.runningTime = runningTime;
    }

    public String toString() {
        return String.format("\n%s\t%.1f\t%s\t%s\t%d", this.name, this.score, this.rating, this.genre, this.runningTime);
    }

}

public class Ex2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./src/Aula12/movies.txt");
        Scanner sc = new Scanner(file);

        List<Movie> movies = new ArrayList<>();
        Set<String> genres = new HashSet<>();
 
        sc.nextLine(); // read header
        while(sc.hasNextLine()){
            String[] row = sc.nextLine().split("\t");
            Double score = Double.parseDouble(row[1]);
            int runningTime = Integer.parseInt(row[4]);
            movies.add( new Movie(row[0], score, row[2], row[3], runningTime) );

            genres.add(row[3]);
        }

        movies.sort((s1,s2)->s1.name.toLowerCase().compareTo(s2.name.toLowerCase()));
        System.out.println(movies.toString());
        movies.sort((s1,s2)->s1.score.compareTo(s2.score));
        System.out.println(movies.toString());
        movies.sort((s1,s2)->s1.runningTime - s2.runningTime);
        System.out.println(movies.toString());

        System.out.println(genres.toString());
    }
}
