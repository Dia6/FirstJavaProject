package Lab2.AnimalRescue;

public class AppMain {
    public static void main(String[] args){
    Animal animal = new Animal();
        System.out.println("My pet is a " + animal.type);
        System.out.println("My dog is " + animal.breed);
        System.out.println("She is a girl and her name is " + animal.name);
        System.out.println("She is " + animal.ageInYears + "years old");


    }
}

