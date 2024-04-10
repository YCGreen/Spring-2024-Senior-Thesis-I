package squareRoot;

public class Heron extends SquareRoot {

    public Heron() {

    }

    public double sqrt(int num) {
        double closestSqrtBelow = findClosestSqrtBelow(num);

        for(int i = 0; i < 2; i++) {
            closestSqrtBelow = findNextApproximation(closestSqrtBelow, num);
        }

        return closestSqrtBelow;
    }

    private double findNextApproximation(double guess, double num) {
        return (guess + num / guess) / 2;
    }
}
