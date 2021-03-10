import java.sql.SQLOutput;
import java.util.Scanner;

class Movie{
    int movie_id;
    String movie_name;
    String movie_rating;
    String director_name;
    double movie_budget;
    double movie_earnings;

    public Movie(int movie_id, String movie_name, String movie_rating, String director_name, double movie_budget, double movie_earnings) {
        this.movie_id = movie_id;
        this.movie_name = movie_name;
        this.movie_rating = movie_rating;
        this.director_name = director_name;
        this.movie_budget = movie_budget;
        this.movie_earnings = movie_earnings;
    }

    public Movie(Movie other){
        this.movie_id = other.movie_id;
        this.movie_name = other.movie_name;
        this.movie_rating = other.movie_rating;
        this.director_name = other.director_name;
        this.movie_budget = other.movie_budget;
        this.movie_earnings = other.movie_earnings;
    }

    public Movie(String movie_name){
        this.movie_name = movie_name;
    }
}

class Operations{

    public static double calculateTax(Movie m){
        return m.movie_earnings * 0.10;
    }

    public static Movie[] findMovies(String rating,Movie[] arr){
        Movie[] movies = new Movie[arr.length];
        int pointer =0;
        for(Movie m : arr){
            if(m.movie_rating.equals(rating)){
                movies[pointer] = m;
                pointer++;
            }
        }
        if(movies[0] == null){
            Movie[] ans = new Movie[3];
            ans[0] = new Movie("Inception");
            ans[0] = new Movie("Prestidge");
            ans[0] = new Movie("Interstellar");
            return ans;
        }
        return movies;
    }

    public static Movie[] searchByDirector(String name,Movie[] arr){
        Movie[] movies = new Movie[arr.length];
        int pointer =0;
        for(Movie m : arr){
            if(m.director_name.equals(name)){
                movies[pointer] = m;
                pointer++;
            }
        }
        if(movies[0] == null){
            Movie[] m1 = {null,null};
            return m1;
        }
        return movies;
    }
}

public class ProblemStatement2 {
    public static void main(String[] args) {

        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How Many Movies Data you will provide: ");
        int n = sc.nextInt();
        Movie[] movies_arr = new Movie[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter Movie id:");
            int id = sc.nextInt();

            System.out.println("Enter Movie Name:");
            String name = sc.nextLine();

            System.out.println("Enter Movie rating:");
            String rating = sc.nextLine();

            System.out.println("Enter Movie Director name:");
            String director_name = sc.nextLine();

            System.out.println("Enter Movie Budget:");
            double budget = sc.nextDouble();

            System.out.println("Enter Movie Earnings:");
            double earning = sc.nextDouble();

            Movie m = new Movie(id,name,rating,director_name,budget,earning);
            movies_arr[i] = m;
        }

        // calculate and print tax of highest budget movie
        Movie high = movies_arr[0];
        for (Movie m : movies_arr){
            if (m.movie_budget > high.movie_budget){
                high = m;
            }
        }
        System.out.println(Operations.calculateTax(high));

        //movies dircted by director
        System.out.println("ENter Director Name");
        String d = sc.nextLine();
        Movie[] dir = Operations.searchByDirector(d,movies_arr);

        // movie with matching ratings
        System.out.println("Enter rating");
        String rate = sc.nextLine();
        Movie[] rated = Operations.findMovies(rate,movies_arr);

    }
}
