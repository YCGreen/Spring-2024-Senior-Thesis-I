package squareRoot;

public class Main {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(65));

        Eiruvin esq = new Eiruvin();
        System.out.println(esq.sqrt(65));
        System.out.println(esq.iterationsToN(65, .00001));
        System.out.println(esq.accuracyInN(65, 50));

   /*     System.out.println();
        Heron hsq = new Heron();
        System.out.println(hsq.sqrt(65));
        System.out.println(hsq.iterationsToN(65, .00001)); //stalling here
        System.out.println(hsq.accuracyInN(65, 3));

   /*     Bakhshali bsq = new Bakhshali();
        System.out.println(bsq.sqrt(65));
        System.out.println(bsq.iterationsToN(65, .00001));
        System.out.println(bsq.accuracyInN(65, 7)); */

        //next step: how many iterations do you need to get certain accuracy
        //if i do 10 iterations how much accuracy do i get
        //make it cubic

    }
}
