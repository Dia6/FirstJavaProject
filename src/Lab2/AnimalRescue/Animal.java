package Lab2.AnimalRescue;

public class Animal {

    private String breed;
    private String name;
    private String color;
    private float age;
    private int health;
    private int hunger;
    private String favFood;
    private String favActivity;
    private String sleep;
    private String eat;

    public String getSleep(){
        return sleep;
    }
    public void setSleep(String sleep){
        this.sleep = sleep;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

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
    public int getHealth() {
        return health;
    }
    public void setHealth(int healthLevel) {

        this.health = health;
    }
    public float getAge() {
        return age;
    }
    public void setAge(float ageInYears) {
        this.age = ageInYears;
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
    public int getHunger() {
        return hunger;
    }
    public void setHunger(int hunger){
        this.hunger = hunger;
    }
}