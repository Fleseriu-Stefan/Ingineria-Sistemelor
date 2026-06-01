package lab11;

public class Restaurant {

    private static final Restaurant restaurant;
    private long usedWater; // ml

    static {
        restaurant = new Restaurant();
    }

    private Restaurant() {
        this.usedWater = 0;
    }

    public static Restaurant getRestaurant() {
        return restaurant;
    }

    public synchronized void washHands() {  // <-- synchronized
        for (int i = 0; i < 1000; i++) {
            this.usedWater++;
        }
    }

    public synchronized void washDishes() {  // <-- synchronized
        for (int i = 0; i < 1000; i++) {
            this.usedWater++;
        }
    }

    public long getUsedWater() {
        return usedWater;
    }
}
