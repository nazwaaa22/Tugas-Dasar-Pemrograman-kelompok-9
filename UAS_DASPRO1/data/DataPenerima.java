package data;

import java.util.Scanner;

public class DataPenerima {
    private String namaPenerima;
    private String alamatPenerima;
    private String nomorTeleponPenerima;

    Scanner input = new Scanner(System.in);

    public void inputDataPenerima() {
        System.out.println("=== Data Penerima ===");
        System.out.print("Nama Penerima: ");
        namaPenerima = input.nextLine();
        System.out.print("Alamat Penerima: ");
        alamatPenerima = input.nextLine();
        System.out.print("Nomor Telepon Penerima: ");
        nomorTeleponPenerima = input.nextLine();
    }

    public void displayInfoPenerima() {
        System.out.println("Data Penerima:");
        System.out.println("Nama: " + namaPenerima);
        System.out.println("Alamat: " + alamatPenerima);
        System.out.println("Nomor Telepon: " + nomorTeleponPenerima);
    }
}
