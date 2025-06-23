
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Restaurant {
    // মেনু: খাবারের নাম ও দাম
    Map<String, Double> menu = new HashMap<>();

    // গ্রাহকের রেটিং তালিকা
    List<Integer> ratings = new ArrayList<>();

    // মেনুতে আইটেম যোগ করা
    void addItem(String item, double price) {
        menu.put(item, price);
    }

    // মেনু থেকে আইটেম সরানো
    void removeItem(String item) {
        menu.remove(item);
    }

    // রেটিং যোগ করা
    void addRating(int rating) {
        ratings.add(rating);
    }

    // গড় রেটিং বের করা
    double averageRating() {
        return ratings.stream().mapToInt(Integer::intValue).average().orElse(0);
    }
}
