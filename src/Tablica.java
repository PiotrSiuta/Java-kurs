public class Tablica {

    public static void main(String[] args) {

/*        String[] imiona = new String[3];    //definiujemy tablice poprzez String[] (tak definiujemy ten typ danych), nadajemy nazwe ja jako imiona,
        imiona[0] = "Bartosz";
        imiona[1] = "Basia";                // nastepnie tworzymy nowa tablice i definiujemy ile ma elementow (3)
        imiona[2] = "Michał";

        System.out.println(imiona[0]);
        System.out.println(imiona[1]);
        System.out.println(imiona[2]);*/


        int [] lottoNumber = new int[] {1,2,3,4,5,6};
/*      System.out.println(lottoNumber[1]);
        System.out.println(lottoNumber[2]);
        System.out.println(lottoNumber[3]);
        System.out.println(lottoNumber[4]);
        System.out.println(lottoNumber[5]);
        System.out.println(lottoNumber[6]);*//*

        System.out.println(lottoNumber.length);*/

        for (int i = 0; i < 6; i++) {
            System.out.println("To jest " + lottoNumber[i] + " element tablicy");
        }
            System.out.println("Długośc tablicy wynosi " + lottoNumber.length);
    }
}


