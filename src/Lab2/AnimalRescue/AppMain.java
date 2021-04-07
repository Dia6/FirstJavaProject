package Lab2.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {

        Animal animal = new Animal();
        System.out.println("My pet is a " + animal.getType());
        System.out.println("My dog is " + animal.getBreed());
        System.out.println("She is a girl and her name is " + animal.getName());
        System.out.println("She is " + animal.getAgeInYears() + " years old");

        Adopter adopter = new Adopter();
        System.out.println(adopter.getName());
        System.out.println(adopter.getType());
        System.out.println(adopter.getName() + " wants to adopt a dog from the shelter");
        System.out.println(adopter.getName() + " took " + animal.getName()+ " home with her yesterday");

        VetDr vetDr = new VetDr();
        System.out.println(vetDr.getDrName());
        System.out.println(vetDr.getDrSpecialty());

        Food food = new Food();
        System.out.println(food.getType());
        System.out.println(food.getName());
        System.out.println(food.getAvailableQtyInKg());

        System.out.println(adopter.getName() + " took " + animal.getName() + " to Mr. " + vetDr.getDrName());
        System.out.println(vetDr.getDrName() + "  her to buy special grains for her new dog " +
                "and she bought " + food.getName() + "grains");

    }

}

