import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int kilo;
        double boy,index;


        Scanner intscanner = new Scanner(System.in);
        Scanner doublescanner = new Scanner(System.in);



        System.out.print("Boyunuzu giriniz(metre cinsinden):");
        boy = doublescanner.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        kilo = intscanner.nextInt();

        index = kilo /(boy* boy);

        System.out.println("Vücut Kütle İndeksiniz: "+index);


    }
}
