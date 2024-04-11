package squareRoot;

public class Eiruvin extends SquareRoot{

    public Eiruvin() {

    }

    //method to determine sqrt
    //find next closest sqrt
    //for however many times:
    //divide (num - next closest sqrt) by 5
    //add 1/5 to each side
    //repeat
    //new divide is the last 1/5th
    //add 1/5 to each side

    public double sqrt(int num) {
        return sqrt(num, 7);
    }

    @Override
    double feedNextApprox(double num, double curr) {
        return findNextApproximation(curr, num - curr * curr);
    }

    @Override
    double findNextApproximation(double currResult, double remainder) {
        double fifth = remainder / 5;
        currResult += 2 * getWidthOfRect(currResult, fifth);

        return currResult;
    }

    private double getWidthOfRect(double length, double area) {
        return area / length;
    }


    @Override
    double sqrt(int num, int iter) {
        double closestSqrtBelow = findClosestSqrtBelow(num);

        for(int i = 0; i < iter; i++) {
            closestSqrtBelow = feedNextApprox(num, closestSqrtBelow);
        }

        return closestSqrtBelow;
    }
}
