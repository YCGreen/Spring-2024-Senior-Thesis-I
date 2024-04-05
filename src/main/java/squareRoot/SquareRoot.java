package squareRoot;

public class SquareRoot {

    public SquareRoot() {

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
        double closestSqrtBelow = findClosestSqrtBelow(num, 0, num);

        for(int i = 0; i < 1000; i++) {
            closestSqrtBelow = findNextApproximation(closestSqrtBelow, num - closestSqrtBelow * closestSqrtBelow); //change so find returns square not root?
        }

        return closestSqrtBelow;
    }

    private double findNextApproximation(double currResult, double remainder) {
        double fifth = remainder / 5;
        currResult += 2 * getWidthOfRect(currResult, fifth);

        return currResult;
    }

    private int findClosestSqrtBelow(int max, int min, int origNum) { //change this so origNum is class field?
        int middle = (max - min) / 2 + min;

        if((max - min) % 2 == 1) {
            middle += 1;
        }

        int nextSqr = middle * middle;

         if (nextSqr < origNum) {
            if ((middle + 1) * (middle + 1) > origNum) {
                return middle;
            } else {
                return findClosestSqrtBelow(max, middle + 1, origNum);
            }
         }

         else if(nextSqr > origNum) {
             return findClosestSqrtBelow(middle - 1, min, origNum);
         }

         return middle;
    }

    private double getWidthOfRect(double length, double area) {
        return area / length;
    }






}
