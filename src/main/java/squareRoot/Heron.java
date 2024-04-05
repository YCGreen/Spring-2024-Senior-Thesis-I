package squareRoot;

public class Heron extends SquareRoot {

    public Heron() {

    }

    public double sqrt(int num) {
        double closestSqrtBelow = findClosestSqrtBelow(num);

        for(int i = 0; i < 10; i++) {
            closestSqrtBelow = (closestSqrtBelow + getNextGuess(closestSqrtBelow, num)) / 2;
        }

        return closestSqrtBelow;
    }

    private double getNextGuess(double guess, double num) {
        return num / guess; //this is identical to newton
    }
}
