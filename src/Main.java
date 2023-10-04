import java.util.Arrays;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        System.out.println("Sortowanie metodą bąbelkową");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość tablicy liczbowej");
        int arrLen = scanner.nextInt();
        double[] tablicaLiczb = new double[arrLen];

        System.out.println(" ");

        fillArray(tablicaLiczb);

        System.out.println("Wylosowane liczby to :");

        for(int k = 0; k < tablicaLiczb.length; k++){
            System.out.printf("%.2f, ", tablicaLiczb[k]);
        }

        System.out.println(" ");

        double[] bubble = bubbleSort(tablicaLiczb);
        for(double el: bubble) System.out.printf("%.2f, ", el);

    }

public static void fillArray(double[] tablicaLiczb){
    for(int i = 0; i < tablicaLiczb.length; i++){
        tablicaLiczb[i] = ( Math.random() * (70 - 30) + 30);
    }
}

    public static double[] bubbleSort(double[] tablicaLiczb){
        double temp; //pomocnicza liczba do zmiany liczb w tabeli
        int sizeArr = tablicaLiczb.length;
        for (int j = sizeArr - 1; j >= 0 ; j--){
            for (int n = 0; n < j; n++){
                if(tablicaLiczb[n] > tablicaLiczb[n+1]){
                    temp = tablicaLiczb[n];
                    tablicaLiczb[n] = tablicaLiczb[n+1];
                    tablicaLiczb[n+1] = temp;
                }
            }
        }
        return tablicaLiczb;
    }
}