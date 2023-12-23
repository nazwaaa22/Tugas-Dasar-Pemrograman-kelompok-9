package data;

import java.util.Date;
import java.util.UUID;

public class PengirimanData {
    private String nomorResi;
    private String nomorInvoice;
    private double totalHarga;
    private Date tanggalPembayaran;

    public PengirimanData(double totalHarga) {
        this.nomorResi = generateNomorResi();
        this.nomorInvoice = generateNomorInvoice();
        this.totalHarga = totalHarga;
        this.tanggalPembayaran = new Date(); // Menggunakan tanggal saat ini sebagai tanggal pembayaran
    }

    public PengirimanData(DataPengirim dataPengirim, DataPenerima dataPenerima, String nomorResi2, String nomorInvoice2,
            double totalHarga2) {
    }

    private String generateNomorResi() {
        // Menggunakan UUID untuk menghasilkan nomor resi yang unik
        return UUID.randomUUID().toString();
    }

    private String generateNomorInvoice() {
        
        // Contoh sederhana: INV + timestamp
        return "INV" + System.currentTimeMillis();
    }


    public String getNomorResi() {
        return nomorResi;
    }

    public String getNomorInvoice() {
        return nomorInvoice;
    }
    public void displayInfoPengirimanData() {
        System.out.println("=== Informasi Pengiriman ===");
        System.out.println("Nomor Resi: " + nomorResi);
        System.out.println("Nomor Invoice: " + nomorInvoice);
        System.out.println("Total Harga: Rp " + totalHarga);
        System.out.println("Tanggal Pembayaran: " + tanggalPembayaran);
    }
    
}

