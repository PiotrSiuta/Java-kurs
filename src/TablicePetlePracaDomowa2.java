public class TablicePetlePracaDomowa2 {
/*
    public static void main(String[] args) {
        int[] numbers = new int [] {1,3,5,7,0};

        for (int i = 0;i<(numbers.length/2);i++) {
            int temp = numbers[i];  //dla i=0     i=1
            numbers[i] = numbers[numbers.length-1-i];
            numbers[numbers.length-1-i] = temp;
            System.out.println("iteracja numer " + i); // 4 element z tablicy po wczesniejsyzm odjeciu pierwszego elementu czyli dlugosc tablicy = 5
                                                        //dlugosc tablicy = 5 - 1 (pierwszy element tablicy ktory chcemy przestawic) - i ktore jest rowne 0 = 4
        }
        for (int i=0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
*/

    public static void main(String[] args) {
        int[] numbers1 = new int[] {2 ,3, 4, 5, 6, 7, 8};

        for (int i = 1; i < (numbers1.length) / 2; i++) {
            int temp = numbers1[i]; // pierwszy element z tablicy czyli dla i = 0 pierwszy element z tablicy to 3
            numbers1[i] = numbers1[numbers1.length - 1 - i]; //nadpisujemy pierwszy element z tablicy - 3 ostatnim elementem poprzez odjecie 1 oraz i=0 czyli 7 (dlugosc tablicy - 1 - i=0
            numbers1[numbers1.length - 1 - i] = temp;

            System.out.println("iteracja numer " + i);
        }

        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }
    }
}