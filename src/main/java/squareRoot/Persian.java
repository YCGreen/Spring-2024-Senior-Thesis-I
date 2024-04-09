package squareRoot;

public class Persian extends SquareRoot {

    public Persian() {

    }

    public double sqrt(int num) {
        double closest = findClosestSqrtBelow(num);
        closest += getNextGuess(closest, num);

        return closest;
    }

    private double getNextGuess(double guess, int num) {
        return (num - guess * guess) / (guess * 2 + 1);
    }

    //below: persian method to guess
    //below: derivative of numerator of guess
        //found by numer - (2*closestsqr + lastguess)
        //or deriv = closestsqr - (num + lastguess) * lastguess
        //divide deriv by (2*closestsqr + lastguess) + e2


    //above
    //below
}
