public class Main {

    public static void main(String[] args) {
        float birinciSayi = 1.5f, ikinciSayi = 2.8f, c;

        System.out.println("---Değişimden Önce---");
        System.out.println("birinci sayı: " + birinciSayi);
        System.out.println("ikinci sayı: " + ikinciSayi);

        System.out.println("---Değişimden Sonra---");
        c = birinciSayi;
        birinciSayi = ikinciSayi;
        ikinciSayi = c;

        System.out.println("birinci sayı: " + birinciSayi);
        System.out.println("ikinci sayı: " + ikinciSayi);
    }
}
