package Lab2.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {


        Adopter adopter = new Adopter();
        System.out.println(adopter.getName());
        System.out.println(adopter.getType());
        System.out.println(adopter.getName() + " wants to adopt a dog from the shelter");

        VetDr vetDr = new VetDr();
        System.out.println(vetDr.getDrName());
        System.out.println(vetDr.getDrSpecialty());

        Food food = new Food();
        System.out.println(food.getType());
        System.out.println(food.getName());
        System.out.println(food.getAvailableQtyInKg());

        System.out.println(vetDr.getDrName() + "  her to buy special grains for her new dog " +
                "and she bought " + food.getName() + "grains");

        System.out.println("Tema Mostenirea in Java ");

//        Dog dog = new FrenchBulldog();
//        dog.setName("Masha");
//        dog.setAge(4);
//        dog.setFavFood("Salmon");
//        dog.setFavActivity("Play with kids");
//        dog.setHealth(10);
//        dog.setHunger(5);
//
//
//        Cat cat = new Birmanese();
//        cat.setName("Kitty");
//        cat.setAge(14);
//        cat.setColor("Beige");
//        cat.setFavActivity("Sleeping");
//        cat.setFavFood("Chips");
//        cat.setHealth(8);
//        cat.setHunger(7);


    }

}

