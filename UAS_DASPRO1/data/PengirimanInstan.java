package data;

import java.util.Scanner;

public class PengirimanInstan {
    private String jenisBarang;
    private double beratBarang;
    private double hargaPerKg = 800000; 
    private String nomorresi;
    private String nomorinvoice;
    private double totalHarga;

    // Constructor untuk menginisialisasi nomorResi dan nomorInvoice
    public PengirimanInstan() {
        this.nomorresi = generateNomorresi();
        this.nomorinvoice = generateNomorinvoice();
    }

    public void kalkulasiHarga() {
        totalHarga = beratBarang * hargaPerKg;
        System.out.println("Kalkulasi Harga untuk Pengiriman Instan");
        System.out.println("Total Harga: Rp " + totalHarga);
    }

    public void dataBarang() {
        Scanner input = new Scanner(System.in);
        System.out.println("Memasukkan data barang untuk pengiriman instan:");
        System.out.print("Nama barang: ");
        jenisBarang = input.nextLine();
        System.out.print("Berat barang (kg): ");
        beratBarang = input.nextDouble();
    }

    public void metodePembayaran() {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih metode pembayaran untuk Pengiriman Instan:");
        System.out.println("1. Transfer bank");
        System.out.println("2. Kartu kredit");
        System.out.print("Pilih metode (1/2): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih transfer bank.");
                System.out.println("Kode bayar  anda :");
                // Logika transfer bank
                break;
            case 2:
                System.out.println("Anda memilih kartu kredit.");
                // Logika kartu kredit
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }

    
    private String generateNomorresi() {
        
        return "RESI" + System.currentTimeMillis();
    }

  
    private String generateNomorinvoice() {

        return "INV" + System.currentTimeMillis();
    }

 
    public String getNomorresi() {
        return nomorResi;
    }


    public String getNomorinvoice() {
        return nomorInvoice;
    }


    public double getTotalHarga() {
        return totalHarga;
    }

    public void displayInfo() {
        System.out.println("Informasi Pengiriman Instan:");
        System.out.println("Jenis Barang: " + jenisBarang);
        System.out.println("Berat Barang: " + beratBarang + " kg");
        System.out.println("Nomor Resi: " + nomorResi);
        System.out.println("Nomor Invoice: " + nomorInvoice);
        System.out.println("Total Harga: Rp " + totalHarga);
    }
}
