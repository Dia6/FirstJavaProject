package Lab2.AnimalRescue;

public class Animal {
    private String type = "Dog";
    private String breed = "French Bulldog";
    private String name = "Masha";
    private float ageInYears = 4.4f;
    private int healthLevel = 10;
    private int hungerLevel = 4;
    private String favFood = "Salmon";
    private String favActivity = "Chewing toys";

    public String getFavActivity() {
        return favActivity;
    }

    public void setFavActivity(String favActivity) {
        this.favActivity = favActivity;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {

        this.favFood = favFood;
    }

    public int getHealthLevel() {

        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {

        this.healthLevel = healthLevel;
    }

    public float getAgeInYears() {
        return ageInYears;
    }

    public void setAgeInYears(float ageInYears) {
        this.ageInYears = ageInYears;
    }

    public String getType() {
        return type;
    }

    public void setType(String getType) {
        this.type = getType;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
    public int getHungerLevel() {
        return hungerLevel;
    }
    public void setHungerLevel(int hungerLevel){
        this.hungerLevel = hungerLevel;
    }
}