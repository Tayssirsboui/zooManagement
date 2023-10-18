package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class  Main{

    public static void main(String[] args) {


        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo();
        myZoo.setName("Wildlife Park");
        myZoo.setCity("Ariana");
        myZoo.setAnimals(new Animal[25]);


        Animal dog = new Animal("Canine", "Snoopy", 2, true);

        AnimalAquatic a1 =new AnimalAquatic();
        a1.setHabitat("mer");
        AnimalTerrestrial a2=new                                                                                                      AnimalTerrestrial();
        a2.setNbrLegs(4);
        Dolphin d=new Dolphin();
        Penguin p =new Penguin();


        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "leo", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();
        System.out.println(myZoo.isZooFull());
        Zoo myZoo2 = new Zoo("WaterPark", "Siliana");

        myZoo2.addAnimal(dog);
        System.out.println(Zoo.comparerZoo(myZoo,myZoo2));
        AnimalAquatic animalAquatic = new AnimalAquatic("Fish", "Sardine", 2, true, "Sea");
        AnimalTerrestrial animalTerrestrial = new AnimalTerrestrial("Panda", "Narla", 4, true, 2);
        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);


        System.out.println(animalAquatic);
        System.out.println(animalTerrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);
        animalAquatic.swim();
        dolphin.swim();
        penguin.swim();
    }
}