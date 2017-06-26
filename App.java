import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    Animals rappy = new Animals();
      rappy.mName = "Rappy";
      rappy.mAge = 7;
      rappy.mSpecies = "Cat";
      rappy.mGender = "Female";
      rappy.mAvailableForAdopt = false;

    Animals vanilla = new Animals();
      vanilla.mName = "Vanilla";
      vanilla.mAge = 4;
      vanilla.mSpecies = "Dog";
      vanilla.mGender = "Female";
      vanilla.mAvailableForAdopt = false;

    Animals fluffy = new Animals();
      fluffy.mName = "Fluffy";
      fluffy.mAge = 10;
      fluffy.mSpecies = "Cat";
      fluffy.mGender = "Male";
      fluffy.mAvailableForAdopt = true;

    Animals killer = new Animals();
      killer.mName = "Killer";
      killer.mAge = 5;
      killer.mSpecies = "Komodo Dragon";
      killer.mGender = "Male";
      killer.mAvailableForAdopt = true;

    Animals[] allAnimals = {rappy, vanilla, fluffy, killer};

    System.out.println("Are you open to older pets?");
    String wantOlderPets = myConsole.readLine();

    if (wantOlderPets.contains("y")) {
      System.out.println("All Animals:");

      for (Animals individualAnimals : allAnimals) {
        if (individualAnimals.canBeAdopted() == true) {
        System.out.println( "----------------------" );
        System.out.println(individualAnimals.mName);
        System.out.println(individualAnimals.mAge);
        System.out.println(individualAnimals.mSpecies);
        System.out.println(individualAnimals.mGender);
        System.out.println(individualAnimals.mAvailableForAdopt);
        }
    } } else {
      //olderPet();
      for (Animals individualAnimals : allAnimals) {
        if (individualAnimals.olderPet() == true && individualAnimals.canBeAdopted() == true) {
        System.out.println( "----------------------" );
        System.out.println(individualAnimals.mName);
        System.out.println(individualAnimals.mAge);
        System.out.println(individualAnimals.mSpecies);
        System.out.println(individualAnimals.mGender);
        System.out.println(individualAnimals.mAvailableForAdopt);
      }
     }
   }
  }
}
