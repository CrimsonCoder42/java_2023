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

        int newValue = 50;
        if(newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not suppose to happen.");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

        System.out.println(s);



    }

}
