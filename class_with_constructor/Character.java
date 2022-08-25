public class Character {
    // Attributes
    int strength;
    int agility;
    int intelligence;
    String name;

    // Method
    public void sayMyName() {
        System.out.println("Hello I am " + name + "\n");
    }

    public void sayMyStats() {
        System.out.println("My stats are" + "\n\n" + "STR: " + strength + " AGI:" + agility + " INT:" + intelligence + "\n");
    }

    public void sayMyGameMasterLevel(int gameMasterLevel, String clan) {
        System.out.println("Lvl: " + gameMasterLevel + " Clan" + clan);
    }

    // Constructor
    public Character(int str, int agi, int intel, String characterName) {
        strength = str;
        agility = agi;
        intelligence = intel;
        name = characterName;
    }
}
