package data;
import java.util.Scanner;

public class pengguna {
    private String username;
    private String password;

    Scanner input = new Scanner(System.in);

    public void selamatDatang() {
        System.out.println("Selamat datang di layanan ekspedisi drone gembel!");
        menuUtama();
    }

    public void menuUtama() {
        int pilihan;
        do {
            System.out.println("\nMenu Utama:");
            System.out.println("1. Login");
            System.out.println("2. Daftar Akun");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    login();
                    break;
                case 2:
                    daftarAkun();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }

    public void daftarAkun() {
        System.out.println("\nProses pendaftaran pengguna...");
        System.out.print("Buat username: ");
        username = input.nextLine();
        System.out.print("Buat password: ");
        password = input.nextLine();
        System.out.println("Pendaftaran berhasil! Silakan login.");
    }

    public boolean login() {
        System.out.println("\nProses login pengguna...");
        System.out.print("Masukkan username: ");
        String inputUsername = input.nextLine();
        System.out.print("Masukkan password: ");
        String inputPassword = input.nextLine();

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login berhasil!");
            return true;
        } else {
            System.out.println("Username atau password salah. Login gagal!");
            return false;
        }
    }
}
