package data;

import java.util.Scanner;

public class PengirimanReguler {
    private String jenisBarang;
    private double beratBarang;
    private double hargaPerKg = 500000; 
    private String nomorResi;
    private String nomorInvoice;
    private double totalHarga;

    
    public PengirimanReguler() {
        this.nomorResi = generateNomorResi();
        this.nomorInvoice = generateNomorInvoice();
    }

    public void kalkulasiHarga() {
        totalHarga = beratBarang * hargaPerKg;
        System.out.println("Kalkulasi Harga untuk Pengiriman Reguler");
        System.out.println("Total Harga: Rp " + totalHarga);
    }

    public void dataBarang() {
        Scanner input = new Scanner(System.in);
        System.out.println("Memasukkan data barang untuk pengiriman reguler:");
        System.out.print("Nama barang: ");
        jenisBarang = input.nextLine();
        System.out.print("Berat barang (kg): ");
        beratBarang = input.nextDouble();
    }

    public void metodePembayaran() {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih metode pembayaran untuk Pengiriman Reguler:");
        System.out.println("1. Transfer bank");
        System.out.println("2. Kartu kredit");
        System.out.print("Pilih metode (1/2): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih transfer bank.");
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
    

    // Method untuk meng-generate nomor resi
    private String generateNomorResi() {
        // Logika peng-generate-an nomor resi (sesuaikan dengan kebutuhan)
        return "RESI" + System.currentTimeMillis();
    }

    // Method untuk meng-generate nomor invoice
    private String generateNomorInvoice() {
        // Logika peng-generate-an nomor invoice (sesuaikan dengan kebutuhan)
        return "INV" + System.currentTimeMillis();
    }

    // Getter untuk nomorResi
    public String getNomorResi() {
        return nomorResi;
    }

    // Getter untuk nomorInvoice
    public String getNomorInvoice() {
        return nomorInvoice;
    }

    // Getter untuk totalHarga
    public double getTotalHarga() {
        return totalHarga;
    }

    public void displayInfo() {
        System.out.println("Informasi Pengiriman Reguler:");
        System.out.println("Jenis Barang: " + jenisBarang);
        System.out.println("Berat Barang: " + beratBarang + " kg");
        System.out.println("Nomor Resi: " + nomorResi);
        System.out.println("Nomor Invoice: " + nomorInvoice);
        System.out.println("Total Harga: Rp " + totalHarga);
    }
    
    
}
