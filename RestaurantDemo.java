public class RestaurantDemo {
    public static void main(String[] args) {
        Restaurant r = new Restaurant();

        // মেনুতে আইটেম যোগ
        r.addItem("Burger", 150.0);
        r.addItem("Pizza", 250.0);
        r.addItem("Pasta", 200.0);

        // রেটিং যোগ
        r.addRating(4);
        r.addRating(5);
        r.addRating(3);

        // মেনু দেখানো
        System.out.println("Menu:");
        for (String item : r.menu.keySet()) {
            System.out.println(item + " - Tk " + r.menu.get(item));
        }

        // গড় রেটিং দেখানো
        System.out.println("\nAverage Rating: " + r.averageRating());

        // একটি আইটেম সরানো
        r.removeItem("Pasta");
        System.out.println("\nUpdated Menu:");
        for (String item : r.menu.keySet()) {
            System.out.println(item + " - Tk " + r.menu.get(item));
        }
    }
}
