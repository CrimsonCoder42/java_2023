package HelloWorld;

public class ChallengeOne {
    public static void main(String[] args) {
        // create a double variable with a value of 20.00

        double twenty = 20.00;

        // create a second variable of type double with a value 80.00

        double eighty = 80.00;

        // add both numbers together, then multiply by 100.00

        double addThenMultiByOneHundred = (twenty + eighty) * 100;
        System.out.println("addThenMultiByOneHundred " + addThenMultiByOneHundred);

        // use the remainder operator, to figure out what the remainder from the result of the operation in step three, 40.00 will be.

        double remainderResult = addThenMultiByOneHundred % 40.00;
        System.out.println("remainderResult " + remainderResult);

        boolean remainderZero = remainderResult == 0.00;

        System.out.println(remainderZero);

        if (!remainderZero) {
            System.out.println("got some remainder");
        }
    }
}
