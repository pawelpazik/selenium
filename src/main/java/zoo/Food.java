package zoo;

public class Food {
    String foodType;
    long calories;
    //konstruktor - wysoływanie, gdy użyjemy słowa kluczowego 'new'
    // left alt + insert
    public Food(String foodType, long calories) {
        this.foodType = foodType;
        this.calories = calories;
    }
}

