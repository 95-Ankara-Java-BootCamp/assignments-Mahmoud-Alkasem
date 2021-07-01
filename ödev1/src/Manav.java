import java.util.Scanner;

public class Manav {

    public static void main(String[] args) {
        int temp;
        double toplam=0;
        double [] prices=new double[5];
        String [] names= new String[5];
        prices[0]=2.14;prices[1]=3.67;prices[2]=1.11;prices[3]=0.95;prices[4]=5.00;
        names[0]="Armut";names[1]="Elma";names[2]="Domates";names[3]="Muz";names[4]="Patlıcan";

        Scanner in=new Scanner(System.in);
        for(int i=0;i<5;i++) {
            System.out.print(names[i] + " Kaç Kilo ? :");
            temp = in.nextInt();
            toplam += temp * prices[i];
        }
        System.out.println("Toplam Tutar : "+toplam +" TL");

    }
}
