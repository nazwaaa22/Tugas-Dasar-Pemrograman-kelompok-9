import java.util.Scanner;
import data.layanan;
import data.pengguna;
import data.PengirimanInstan;
import data.PengirimanReguler;
import data.DataPengirim;
import data.DataPenerima;
import data.PengirimanData;

public class utama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ///PENGGUNA
        pengguna user = new pengguna(); 
        user.selamatDatang();
        boolean loginBerhasil = user.login(); 

        if (loginBerhasil) {
            layanan layanan = new layanan();
            System.out.println("Selamat datang di layanan ekspedisi");

            System.out.print("Masukkan jumlah pengiriman: ");
            int jumlahPengiriman = input.nextInt();

            ///// KELAS LAYANAN
            DataPengirim[] dataPengirimArray = new DataPengirim[jumlahPengiriman];
            DataPenerima[] dataPenerimaArray = new DataPenerima[jumlahPengiriman];
            PengirimanData[] pengirimanDataArray = new PengirimanData[jumlahPengiriman];

            for (int i = 0; i < jumlahPengiriman; i++) {
                System.out.print("Silahkan pilih jenis pengiriman (1: Instan, 2: Reguler) untuk pengiriman ke-" + (i + 1) + ": ");
                int pilihan = input.nextInt();

                ///// KELAS DATA PENGIRIM
                // Input data pengirim
                DataPengirim dataPengirim = new DataPengirim();
                dataPengirim.inputDataPengirim();
                dataPengirimArray[i] = dataPengirim;
                
                //// KELAS DATA PENERIMA
                // Input data penerima
                DataPenerima dataPenerima = new DataPenerima();
                dataPenerima.inputDataPenerima();
                dataPenerimaArray[i] = dataPenerima;

                //// KELAS PENGIRIMAN DATA
                // Input pengiriman data
                if (pilihan == 1) {
                    PengirimanInstan instan = new PengirimanInstan();
                    layanan.jenisPengirimanInstan();
                    instan.dataBarang();
                    instan.kalkulasiHarga();
                    instan.metodePembayaran();
                    pengirimanDataArray[i] = new PengirimanData(instan.getTotalHarga()); // Perbaiki ini
                } else if (pilihan == 2) {
                    PengirimanReguler reguler = new PengirimanReguler();
                    layanan.jenisPengirimanReguler();
                    reguler.dataBarang();
                    reguler.kalkulasiHarga();
                    reguler.metodePembayaran();
                    pengirimanDataArray[i] = new PengirimanData(reguler.getTotalHarga()); 
                } else {
                    System.out.println("Maaf, input anda salah");
                    i--; 
                }
            }

         
            System.out.println("\nInformasi Seluruh Pengiriman:");
            for (PengirimanData pengirimanData : pengirimanDataArray) {
                pengirimanData.displayInfoPengirimanData();
                System.out.println("-----------------------------");
            }
        }
    }
}
