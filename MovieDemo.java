import java.util.*;

public class MovieDemo {
    public static void main(String[] args) {
        
        Movie m = new Movie("Inception", "Christopher Nolan");

       
        m.addActor("Leonardo DiCaprio");
        m.addActor("Joseph Gordon-Levitt");

       
        m.addReview("Mind-blowing visuals!");
        m.addReview("Amazing story and direction.");

        
        System.out.println("Movie: " + m.title);
        System.out.println("Directed by: " + m.director);
        System.out.println("\nActors:");
        for (String actor : m.actors) {
            System.out.println("- " + actor);
        }

        System.out.println("\nReviews:");
        m.displayReviews();
    }
}
