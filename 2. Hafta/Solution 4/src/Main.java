import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String cumle,sesli = "aeıioöuü";
        int i,t,s,l;

        Scanner input = new Scanner(System.in);

        System.out.print("Metni giriniz: ");
        cumle = input.nextLine();

        t = cumle.length();
        s = sesli.length();
        cumle.toLowerCase();

        for (i = 0; i < t; i++) {
            for (l = 0; l < s; l++){
                if(sesli.charAt(l) == cumle.charAt(i)) {
                    System.out.print(sesli.charAt(l)+" ");
                }
            }
        }
    }
}
