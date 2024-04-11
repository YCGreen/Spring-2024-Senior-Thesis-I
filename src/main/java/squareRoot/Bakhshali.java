package squareRoot;

public class Bakhshali extends SquareRoot {

    public Bakhshali() {

    }

    @Override
    double findNextApproximation(double currResult, double remainder) {
        return 0;
    }

    public double sqrt(int num) {
        double closest = findClosestSqrtBelow(num);
        double inc = (num - closest * closest) / (2 * closest);
        return  closest + inc - inc * inc / (2 * (closest + inc));
    }

    @Override
    double sqrt(int num, int iter) {
        return 0;
    }

    @Override
    double feedNextApprox(double num, double curr) {
        return 0;
    }
}
