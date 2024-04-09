package squareRoot;

public class Main {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(65));

        Eiruvin esq = new Eiruvin();
        System.out.println(esq.sqrt(65));

        Persian psq = new Persian();
        System.out.println(psq.sqrt(65));

        Newton nsq = new Newton();
        System.out.println(nsq.sqrt(65));

        Heron hsq = new Heron();
        System.out.println(hsq.sqrt(65));

        Bakhshali bsq = new Bakhshali();
        System.out.println(bsq.sqrt(65));

        //next step: how many iterations do you need to get certain accuracy
        //if i do 10 iterations how much accuracy do i get
        //make it cubic

    }
}
