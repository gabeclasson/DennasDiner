package com.example.dennasdiner;

public class Food {
    private String foodName, description;
    private double price;
    private int imageResourceID;

    public static final Food[] breakfastFoods = {
            new Food("Eggs", "Three unfertilized ova of one or more members of the species Gallus gallus domesticus, thoroughly mixed with your selection of fermented solid bovine milk solids and animal flesh, cooked until safe to eat", 8.99, R.drawable.omelet),
            new Food ("Pancakes", "3 pankcakes, choice of meat, potato", 7.95, R.drawable.pancakes),
            new Food("Waffles", "Belgian waffles, whipped cream, fresh fruit", 7.50, R.drawable.waffles)
    };

    public static final Food[] lunchFoods = {
            new Food("Pizza", "A 12 inch one topping pizza. Freshly baked with authentic Italian dough, and roma red tomato sauce.", 12.99, R.drawable.pizza),
                    new Food ("The Denna \"Special\"", "Celery. Lots of celery. Served with artisinal celery juice.", 0.99, R.drawable.celery),
            new Food("Chicken & Waffles", "Belgian waffles, and two pieces of our hand-breaded buttermilk fried chicken. Syrup available on request.", 11.99, R.drawable.chickenandwaffles)
    };

    public Food(String foodName, String description, double price, int imageResourceID){
        this.foodName = foodName;
        this.description = description;
        this.price = price;
        this.imageResourceID = imageResourceID;
    }

    @Override
    public String toString(){
        return foodName;
    }


    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public void setImageResourceID(int imageResourceID) {
        this.imageResourceID = imageResourceID;
    }
}
