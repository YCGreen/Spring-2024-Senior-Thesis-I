package squareRoot;

public class Main {
    public static void main(String[] args) {
        Eiruvin esq = new Eiruvin();
        System.out.println(esq.sqrt(65));

        Persian psq = new Persian();
        System.out.println(psq.sqrt(65));

        Newton nsq = new Newton();
        System.out.println(nsq.sqrt(65));

        Heron hsq = new Heron();
        System.out.println(hsq.sqrt(65));

        //next step: approximate from above with eiruvin and persian
    }
}
