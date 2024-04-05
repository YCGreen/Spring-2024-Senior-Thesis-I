package squareRoot;

public class Persian extends SquareRoot {

    public Persian() {

    }

    public double sqrt(int num) {
        double closest = findClosestSqrtBelow(num);
        return closest + (num - closest*closest)/(closest*2+1);
    }
}
