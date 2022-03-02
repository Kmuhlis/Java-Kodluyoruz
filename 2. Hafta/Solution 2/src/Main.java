import java.util.ArrayList;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
	    int i,n;
        Scanner input = new Scanner(System.in);
        System.out.print("Hangi değere kadar bölünsün: ");
        n = input.nextInt();

        for(i = 1 ; i <= n ; i++) {
            if (i%3 == 0 && i%7 == 0) {
                System.out.println(i);
            }
        }
    }
}
