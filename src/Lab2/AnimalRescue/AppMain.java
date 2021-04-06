package Lab2.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println("My pet is a " + animal.type);
        System.out.println("My dog is " + animal.breed);
        System.out.println("She is a girl and her name is " + animal.name);
        System.out.println("She is " + animal.ageInYears + " years old");

        Adopter adopter = new Adopter();

        System.out.println(adopter.name);
        System.out.println(adopter.type);
        System.out.println(adopter.name + " wants to adopt a dog from the shelter");
        System.out.println(adopter.name + " took " + animal.name + " home with her yesterday");

        VetDr vetDr = new VetDr();
        System.out.println(vetDr.drName);
        System.out.println(vetDr.drSpecialty);

        Food food = new Food();
        System.out.println(food.type);
        System.out.println(food.name);
        System.out.println(food.availableQtyInKg);

        System.out.println(adopter.name + " took " + animal.name + " to Mr. " + vetDr.drName);
        System.out.println(vetDr.drName + "  her to buy special grains for her new dog " +
                "and she bought " + food.name + "grains");

    }

}

