package Lab2.AnimalRescue;

public class Animal {

    private String breed;
    private String name;
    private String color;
    private int age;
    private int health;
    private int hunger;
    private float height;
    private float weight;
    private String favFood;
    private String favActivity;

    public void sleep(){
        System.out.println("Sleeping");
    }
    public void eat(){
        System.out.println("eating");
    }
    public void walk(){
        System.out.println("Walking");
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
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
    public void setAge(int age) {
        this.age = age;
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