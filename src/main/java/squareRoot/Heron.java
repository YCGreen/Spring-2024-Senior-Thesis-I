package squareRoot;

public class Heron extends SquareRoot {

    public Heron() {

    }

    public double sqrt(int num) {
        return sqrt(num, 10);
    }

    @Override
    double findNextApproximation(double num, double guess) {
        return (guess + num / guess) / 2;
    }

    @Override
    double sqrt(int num, int iter) {
        double closestSqrtBelow = findClosestSqrtBelow(num);

        for(int i = 0; i < iter; i++) {
            closestSqrtBelow = feedNextApprox(num, closestSqrtBelow);
        }

        return closestSqrtBelow;
    }

    @Override
    double feedNextApprox(double num, double guess) {
        return findNextApproximation(num, guess);
    }
}
