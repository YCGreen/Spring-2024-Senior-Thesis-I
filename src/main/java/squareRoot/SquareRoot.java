package squareRoot;

public class SquareRoot {

    public SquareRoot() {

    }

    public int findClosestSqrtBelow(int num) {
        return findClosestSqrtBelow(num, 0, num);
    }

    private int findClosestSqrtBelow(int max, int min, int origNum) {
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









}
