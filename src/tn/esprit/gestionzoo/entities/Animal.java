package tn.esprit.gestionzoo.entities;

public class Animal {
   private String family;
    private String name;
    private int age ;
    private boolean isMammal ;


    public Animal(String family, String name, int age, boolean isMammal, String habitat) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public Animal(String family, String name, int age, boolean isMammal) {
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Un animal ne peut pas avoir un âge négatif ");
        } else {
            this.age = age;
        }

    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public Animal(){

    }
    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +

                '}';
    }
}
