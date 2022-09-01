public class App {
  public static void main(String[] args) {
    

    Item healingpotion = new Item("Healingpotion", 99, 7.5F, 10, "restores 50 hp", false);
    healingpotion.saMyName();
    healingpotion.saMyAttributes();

    Item manapotion = new Item("Manapotion", 99,  5.5F, 10, "restores 100 mp", false);
    manapotion.saMyName();
    manapotion.saMyAttributes();

    Item elixir = new Item("Elixir", 179, 12.5F, 10, "heals 50 hp and restores 100 mp", false);
    elixir.saMyName();
    elixir.saMyAttributes();

    Pet dragon = new Pet(); 
    dragon.name = "Zero";
    dragon.trustlevel = 1;
    dragon.level = 1;
    dragon.ishappy = false;
    dragon.saMyPetName();
  }
}
