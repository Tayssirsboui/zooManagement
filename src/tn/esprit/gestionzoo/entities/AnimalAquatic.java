package tn.esprit.gestionzoo.entities;



public abstract class AnimalAquatic extends Animal{
    private String habitat ;




    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

 public AnimalAquatic(){


 }
 public AnimalAquatic( String family, String name, int age, boolean isMammal ,String habitat){
     super(family, name, age,isMammal);
        this.habitat=habitat;

 }
 public abstract void swim();
// {
//     System.out.println("This aquatic animal is swimming.");
// }

    @Override
    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o instanceof AnimalAquatic animalaquatic) {
            return animalaquatic.habitat.equals(habitat) && animalaquatic.getName().equals(super.getName()) && animalaquatic.getAge() == super.getAge();
        }
        return false;
    }


}
