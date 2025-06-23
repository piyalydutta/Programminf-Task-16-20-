
import java.util.ArrayList;
import java.util.List;

class Movie {
    String title, director;
    List<String> actors = new ArrayList<>();
    List<String> reviews = new ArrayList<>();

    
    Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    
    void addActor(String actor) {
        actors.add(actor);
    }

    
    void addReview(String review) {
        reviews.add(review);
    }

    
    void displayReviews() {
        for (String review : reviews) {
            System.out.println("Review: " + review);
        }
    }
}
