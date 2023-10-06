package tn.esprit.gestionzoo.entities;

public class Zoo {

   private Animal[] animals;
    private String name;
    private String city;
   private final int NBR_CAGES =25;
   private int nbrAnimal=0;

    public Zoo (){

    }
    public Zoo( String name, String city) {
       animals = new Animal[NBR_CAGES];
        this.name = name;
        this.city = city;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank()) {
            System.out.println("Le nom d’un tn.esprit.gestionzoo.entities.Zoo ne doit pas être vide.");
        } else {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void displayZoo(){
        System.out.println("My tn.esprit.gestionzoo.entities.Zoo :");
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages/Animals: " + NBR_CAGES);

    }


   public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (!isZooFull()) {
            animals[nbrAnimal] = animal;
            nbrAnimal++;
            return true;
        }else
            return false;
    }

    public void displayAnimals(){
        System.out.println("Liste des animaux de " + name + ":");
        for(int i=0; i<nbrAnimal; i++){
            System.out.println(animals[i]);
        }
    }
    public int searchAnimal(Animal animal){
        int index=-1;
        for(int i=0; i<nbrAnimal;i++){
            if(animal.getName() == animals[i].getName()){
                return i;
            }
        }
        return index;
    }
    public boolean removeAnimal(Animal animal){
     int indexAnimal = searchAnimal(animal);
     if (indexAnimal == -1)
         return false;
     for (int i = indexAnimal; i < nbrAnimal; i++) {
         animals[i] = animals[i + 1];

     }
     animals[nbrAnimal] = null;
     this.nbrAnimal--;
     return true;
 }

    public boolean isZooFull() {
        return nbrAnimal == NBR_CAGES;
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimal > z2.nbrAnimal)
            return z1;
        return z2;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NBR_CAGES + " N° animals: " + nbrAnimal;
    }


}
