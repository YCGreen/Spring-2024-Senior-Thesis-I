package squareRoot;

public class Newton extends SquareRoot {

    public Newton() {

    }

    public double sqrt(int num) {
        double closestSqrtBelow = findClosestSqrtBelow(num);

        for(int i = 0; i < 2; i++) {
            closestSqrtBelow = getNextGuess(closestSqrtBelow, num);
        }

        return closestSqrtBelow;
    }

    //newton's formula
    private double getNextGuess(double guess, int num) {
        return (guess + num / guess) / 2;
    }
}
