package examples;

/*
* ROLL THE DICE GAME:
* 1. Roll the dice for the user (generates a random number between 1-6)
* 2. After each roll, tell user on which game space they are on and how many spaces they have to go to win.
* 3. Repeat this for additional 4 times (total 5 rolls).
* 4. If user gets 20 before 5 rolls, user wins and end the game.
* 5. If user get more than or less than 20, they lose
* */
public class RollTheDiceGame {
    public static void main (String[] args){
        int min = 1;
        int max = 6;
        int totalSpace = 20;
        int currentSpace = 0;
        String gameStatus = "less than 20";

        //Printing the rules of the game.
        System.out.println("-----Welcome to the roll a dice game!!!-----");
        System.out.println("1. You have 5 times to roll a dice and reach to 20 spaces.");
        System.out.println("2. Dice will roll a random number between " + min + " and " + max +".");
        System.out.println("======================================================================\n");

        //Repeat this for additional 4 times (total 5 rolls).
        for (int i=1; i<=5; i++) {

            System.out.println("Rolling the dice for " + i + "th time.");
            //Roll the dice for the user (generates a random number between 1-6)
            int dicedNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
            System.out.println("Diced number: " + dicedNumber);
            currentSpace = currentSpace + dicedNumber;

            //After each roll, tell user on which game space they are on and how many spaces they have to go to win.
            System.out.println("You are currently on " + currentSpace + " space on the board. You need to get " + (totalSpace - currentSpace) + " more spaces to win.\n");

            //If user gets 20 before 5 rolls, user wins and end the game.
            if (currentSpace == totalSpace){
                gameStatus = "User wins";
                break;
            }
            //If user get more than or less than 20, they lose
            else if (currentSpace > totalSpace) {
                gameStatus = "more than 20";
                break;
            }
        }

        //Print result
        System.out.println("==========RESULT==========");
        if (gameStatus.equals("User wins")){
            System.out.println("Congratulations, you have won the game!");
        }
        else if(gameStatus.equals("more than 20")){
            System.out.println("Sorry, you have lost the game. You went over by " + (currentSpace - totalSpace) + " spaces.");
        }
        else if(gameStatus.equals("less than 20")){
            System.out.println("Sorry, you have lost the game. You were short by " + (totalSpace - currentSpace) + " spaces.");
        }
    }
}
