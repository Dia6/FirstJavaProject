package Lab2.AnimalRescue;

public class Animal {

    private String breed = "French Bulldog";
    private String name = "Masha";
    private String color = "White and black";
    private float age = 4.4f;
    private int health = 9;
    private int hunger = 8;
    private String favFood = "avocado";
    private String favActivity = "chewing plastic toys";

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void speak(){
        System.out.println("Bark");
    }
    public void eat(){
        System.out.println("Chew");
    }
    public void sleep(){
        System.out.println("Zzzz");
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