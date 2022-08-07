import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        double tutar,kdvOrani1=0.18,kdvOrani2=0.08,kdvTutar,toplamTutar;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen tutarı giriniz:");
        tutar= input.nextDouble();
        if (tutar<=1000&&tutar>0) {
            kdvTutar = tutar * kdvOrani1;
        }
        else {
            kdvTutar = tutar * kdvOrani2;
        }
        toplamTutar=tutar+kdvTutar;
        System.out.println("Kdv'siz Tutar: "+tutar);
        if (tutar<=1000&&tutar>0){
            System.out.println("Kdv Oranı: " +kdvOrani1);
        }
        else {
            System.out.println("Kdv Oranı: " +kdvOrani2);
        }
        System.out.println("Kdv Tutarı: "+kdvTutar);
        System.out.println("Toplam Tutar: "+toplamTutar);
    }
}
