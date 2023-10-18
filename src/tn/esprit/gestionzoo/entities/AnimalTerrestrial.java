package tn.esprit.gestionzoo.entities;

public class AnimalTerrestrial extends Animal{
    private int nbrLegs ;

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    public AnimalTerrestrial(){}

    public AnimalTerrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }


    @Override
    public String toString() {
        return super.toString() + ", nbrLegs:" + nbrLegs;

    }
}
