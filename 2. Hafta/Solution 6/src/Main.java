import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int say,i,c=0,t=0;
        ArrayList cift = new ArrayList();
        ArrayList tek = new ArrayList();

        Random degerler = new Random();

        for (i = 0; i < 10; i++){
            say = degerler.nextInt(1000);
            if(say%2==0){
                cift.add(say);
                c++;
            }
            else {
                tek.add(say);
                t++;
            }
        }
        System.out.println("Çift değerlerin sayısı: "+c+" Çift değerler: "+cift);
        System.out.println("Tek değerlerin sayısı: "+t+" Tek değerler: "+tek);
    }
}
