public class Main {

    public static void main(String[] args) {
        long i = 2;
        int say = 0,m;
        boolean durum = true;

        System.out.println("*******1 - 1000000 arasındaki asal sayılar******");
        for(long num = 1000000; num >= i; i++){
            for(m = 2; m < i ;m++) {
                if (i % m == 0) {
                    durum = false;
                }
            }
            if (durum) {
                System.out.println(i);
            }
            else {
                durum = true;
            }
        }
    }
}
