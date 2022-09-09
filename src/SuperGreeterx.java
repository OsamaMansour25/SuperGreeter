import java.util.Scanner;

public class SuperGreeterx {
    public String start() {
        String start = "Det virker!";
        return start;
    }

    public static void main(String[] args) {

        SuperGreeterx sG = new SuperGreeterx();
        System.out.println(sG.start());

        Scanner sc = new Scanner(System.in);
        System.out.println("Indtast dit navn");
        String navn;
        navn = sc.nextLine();
System.out.println("Hej" + " " + navn);
        int alder;
        System.out.println("Hvor gammel er du?");
        alder = sc.nextInt();
        System.out.println("Hvor gammel er du i dag?" + alder);

    }
    }

