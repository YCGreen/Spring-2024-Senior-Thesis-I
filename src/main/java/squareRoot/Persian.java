package squareRoot;

public class Persian extends SquareRoot {

    public Persian() {

    }

    public double sqrt(int num) {
        double closest = findClosestSqrtBelow(num);
        for(int i = 0; i < 10; i++) {
            closest += getNextGuess(closest, num);
        }
        return closest;
    }

    private double getNextGuess(double guess, int num) {
        return (num - guess * guess) / (guess * 2 + 1);
    }

}
