import java.util.*;

public class Main {

    public static void main(String[] args) {

        int ghicit = 0;
        int incercari = 0;

        Set<Integer> lottoMachine = new NumGen().numere();
        System.out.println();
        Set<Integer> myOwnTicketOfSix = new NumGen().numere();


        for (int x : lottoMachine) {
            if (myOwnTicketOfSix.contains(x)) {
                ghicit++;
            }
        }
        System.out.println();

        switch (ghicit) {
            case 1:
                System.out.println("Ne pare rau, ai ghicit doar un numar");
                break;
            case 2:
                System.out.println("Ne pare rau, ai ghicit doar " + ghicit + " numere");
                break;
            case 3:
                System.out.println("Ai ghicit " + ghicit + " numere. Ai castigat la categoria a IV-a");
                break;
            case 4:
                System.out.println("Ai ghicit " + ghicit + " numere. Ai castigat la categoria a III-a");
                break;
            case 5:
                System.out.println("Ai ghicit " + ghicit + " numere. Ai castigat la categoria a II-a");
                break;
            case 6:
                System.out.println("Ai ghicit " + ghicit + " numere. Ai castigat la categoria I");
                break;
            default:
                System.out.println("Ne pare rau, nu ai ghicit niciun numar!");
                break;
        }


        Scanner opt = new Scanner(System.in);
        System.out.println("Doresti sa vezi din cate incercari nimeresti 3 numere?(da/nu): ");
        String n = opt.nextLine();

        if (n.equals("da")) {
            do {
                Set<Integer> newNumbers = new NumGen().numere();
                ghicit=0;
                System.out.println();
                incercari++;
                for (int x : lottoMachine) {
                    if (newNumbers.contains(x)) {
                        ghicit++;
                    }
                }
            }while(ghicit != 3);
            System.out.println();
            System.out.println("Salut, pentru a castiga 3 numere ai jucat de " +incercari+" ori");

        }
    }
}

