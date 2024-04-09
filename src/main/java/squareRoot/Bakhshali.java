package squareRoot;

public class Bakhshali extends SquareRoot {

    public Bakhshali() {

    }

    public double sqrt(int num) {
        double closest = findClosestSqrtBelow(num);
        double inc = (num - closest * closest) / (2 * closest);
        return  closest + inc - inc * inc / (2 * (closest + inc));
    }
}
