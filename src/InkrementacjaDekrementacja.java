public class InkrementacjaDekrementacja {

    public static void main(String[] args) {


        //inkrementacja zwieksza wartosc o jeden
        int a = 0;
        System.out.println("Wartość a = " + a); //warotsc rowna 0
        int b = a++;
        System.out.println("Wartość b = " + b);  //wartosc rowna 0
        System.out.println("Wartość a po inkrementacji = " + a); //wartosc rowna 1
        int c = a++;
        System.out.println("Wartość c = " + c); //wartosc rowna 1
        System.out.println("Wartość a po inkrementacji = " + a); //wartosc rowna 2


        //dekrementacja zmniejsza wartosc  jeden
        int d = 0;
        System.out.println("Wartosc d = " + d); //0
        int e = d--;
        System.out.println("Wartosc e = " + e); //0
        System.out.println("Wartosc d = " + d); //-1
        int f = --d;
        System.out.println("Wartosc f = " + f); //-2
        System.out.println("Wartosc d = " + d);// -2


    }
}
