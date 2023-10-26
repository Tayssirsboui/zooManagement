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
    public boolean equals(Object o) { //equals prend comme parametre un objet
        if (this == o) return true; //on doit tester est ce l'objet est le meme que celui que j'utilise
        if (o == null) return false; //on doit tester si l'objet est null
        if (o instanceof AnimalAquatic animalaquatic) { //pour tester si l'animal est aquatic ou pas
            return animalaquatic.habitat.equals(habitat) && animalaquatic.getName().equals(super.getName()) && animalaquatic.getAge() == super.getAge();//on ajoute super car le nom et l'age sont utilisés depuis la classe mere
        }
        return false;
    }


}
