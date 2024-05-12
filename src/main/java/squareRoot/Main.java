package squareRoot;

public class Main {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(65));

        Eiruvin esq = new Eiruvin();
        System.out.println(esq.sqrt(65));
        System.out.println("T " + esq.iterationsToN(65, .00000000001));
        System.out.println("T " + esq.accuracyInN(65, 19));

        System.out.println();
        Heron hsq = new Heron();
        System.out.println(hsq.sqrt(65));
        System.out.println("H " + hsq.iterationsToN(65, .001));
        System.out.println("H " + hsq.accuracyInN(65, 5));

        System.out.println();
        Bakhshali bsq = new Bakhshali();
        System.out.println(bsq.sqrt(65));

    }
}
