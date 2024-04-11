package squareRoot;

import java.math.BigDecimal;

public abstract class SquareRoot {

    abstract double findNextApproximation(double currResult, double remainder);

    abstract double sqrt(int num, int iter);

    abstract double feedNextApprox(double curr, double next);

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

    public int iterationsToN(int num, double degree) {
        double curr = findClosestSqrtBelow(num);
        double next = feedNextApprox(num, curr);
        int iter = 1;

        while(Math.abs(curr - next) >= degree) {
            curr = next;
            next = feedNextApprox(num, curr);
            iter++;
        }

        return iter;
    }

    public double accuracyInN(int num, int iter) {
        double dec = getDiffSqrt(num, iter);
        String decStr = getStrAfterDec(dec);

        int ind = 0;
        int ch = decStr.charAt(ind);

        while(ch == '0') { //if there's nothing after 0 this will fail
            ind++;
            ch = decStr.charAt(ind);
        }

        return ind - 1;
    }

    private double getDiffSqrt(int num, int iter) {
        return Math.abs(Math.sqrt(num) - sqrt(num, iter));
    }

    private String getStrAfterDec(double dec) {
        BigDecimal bdDec = BigDecimal.valueOf(dec);
        String bdDecStr = bdDec.toPlainString();
        return bdDecStr.substring(bdDecStr.indexOf(".") + 1);
    }










}
