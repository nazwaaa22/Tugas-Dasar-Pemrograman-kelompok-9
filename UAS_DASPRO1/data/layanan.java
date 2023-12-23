package data;
import java.util.Scanner;

public class layanan {
    public void jenisPengirimanInstan() {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih layanan pengiriman instan:");

        for (int i = 1; i <= 3; i++) {
            System.out.println(i + ". Layanan instan ke-" + i);
        }
        System.out.print("Pilih layanan (1-3): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih layanan instan, kecepatan maksimal 8 jam, dengan jarak maksimal 30.000 km, dengan harga Rp. 800.000/kg");
               
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }

    public void jenisPengirimanReguler() {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih layanan pengiriman reguler:");
        for (int i = 1; i <= 3; i++) {
            System.out.println(i + ". Layanan reguler ke-" + i);
        }
        System.out.print("Pilih layanan (1-3): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih layanan reguler dengan waktu tempuh maksimal 24 jam, dengan jarak maksimal 300.000 km, dengan harga 500.000/kg");
                
                break;              
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}
