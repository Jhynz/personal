public class Character {
    int strength;
    int agility;
    int intelligence;
    float bodycount;
    char middleinitial;
    String pp;
    String trait;
    String name;

    public void sayMyName() {
        System.out.println("Hello I am " + name);
    }
    
    public void sayMyStrength() {
        System.out.println("My strength is " + strength);
    }

    public void sayMyAgility() {
        System.out.println("My agility is " + agility);
    }

    public void sayMyIntelligence() {
        System.out.println("My intelligence is " + intelligence);
    }

    public void sayMyBodycount() {
        System.out.println("My bodycount is " + bodycount);
    }

    public void sayMyPp() {
        System.out.println("I have a " + pp);
    }

    public void sayMyTrait() {
        System.out.println("I am a " + trait);
    }

    public void sayMyMiddleinitial() {
        System.out.println("My middle initial is " + middleinitial);
    }

}
