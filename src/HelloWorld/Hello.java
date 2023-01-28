package HelloWorld;

public class Hello {
    public static void main(String[] args) {

        boolean isAlien = false;
        if(!isAlien){
            System.out.println("It is not an alien!");
            System.out.println("I am scared of aliens");
        }

        int topscore = 80;
        if (topscore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topscore > secondTopScore) && (topscore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topscore > 90 ) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

    }

}
