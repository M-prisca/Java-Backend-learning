//Create a Java program that sets up a game character with a name, health points, 
// experience level, and tutorial status. 
// Fill in the blanks in the code to display the character's information correctly.

public class GameCharacter {

    public static void main(String[] args) {
        String characterName = "Hero";
        int healthPoints = 100;
        double experienceLevel = 1.5;
        boolean tutorialCompleted = false;
        System.out.println("\nCharacter: " + characterName + "\nHP: " + healthPoints + "\nLevel: " + experienceLevel
                + "\nTutorial Completed: " + tutorialCompleted + "\n");
    }
}