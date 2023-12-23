package data;
import java.util.Scanner;

public class DataPengirim {
    private String namaPengirim;
    private String alamatPengirim;
    private String nomorTeleponPengirim;

    Scanner input = new Scanner(System.in);

    public void inputDataPengirim() {
        System.out.println("=== Data Pengirim ===");
        System.out.print("Nama Pengirim: ");
        namaPengirim = input.nextLine();
        System.out.print("Alamat Pengirim: ");
        alamatPengirim = input.nextLine();
        System.out.print("Nomor Telepon Pengirim: ");
        nomorTeleponPengirim = input.nextLine();
    }

    public void displayInfoPengirim() {
        System.out.println("Data Pengirim:");
        System.out.println("Nama: " + namaPengirim);
        System.out.println("Alamat: " + alamatPengirim);
        System.out.println("Nomor Telepon: " + nomorTeleponPengirim);
    }
}
