import java.util.ArrayList;
import java.util.Scanner;

// Kelas Model untuk Akun ATM
class AkunATM {
    private String namaPemilik;
    private double saldo;
    private ArrayList<String> riwayatTransaksi; // Eksplorasi ArrayList untuk riwayat

    public AkunATM(String namaPemilik, double saldoAwal) {
        this.namaPemilik = namaPemilik;
        this.saldo = saldoAwal;
        this.riwayatTransaksi = new ArrayList<>();
        this.riwayatTransaksi.add("Akun diinisialisasi dengan saldo awal: Rp " + saldoAwal);
    }

    public void cekSaldo() {
        System.out.println("\n==================================");
        System.out.println("Nama Pemilik   : " + namaPemilik);
        System.out.println("Saldo Saat Ini : Rp " + saldo);
        System.out.println("==================================");
    }

    public void setorTunai(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            riwayatTransaksi.add("Setor tunai: +Rp " + jumlah);
            System.out.println("\n[BERHASIL] Berhasil melakukan setor tunai Rp " + jumlah);
        } else {
            System.out.println("\n[GAGAL] Jumlah setor tidak valid.");
        }
    }

    public void tarikTunai(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            riwayatTransaksi.add("Tarik tunai: -Rp " + jumlah);
            System.out.println("\n[BERHASIL] Berhasil melakukan tarik tunai Rp " + jumlah);
        } else {
            System.out.println("\n[GAGAL] Saldo tidak mencukupi atau jumlah tidak valid.");
        }
    }

    public void tampilkanRiwayat() {
        System.out.println("\n=== RIWAYAT TRANSAKSI (ArrayList) ===");
        if (riwayatTransaksi.isEmpty()) {
            System.out.println("Belum ada riwayat transaksi.");
        } else {
            for (int i = 0; i < riwayatTransaksi.size(); i++) {
                System.out.println((i + 1) + ". " + riwayatTransaksi.get(i));
            }
        }
    }
}

// Kelas Utama dengan Menu Interaktif Scanner
public class MainATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AkunATM akunUser = new AkunATM("Mahasiswa Unram", 1000000);
        int pilihan;

        do {
            System.out.println("\n==================================");
            System.out.println("      PROGRAM ATM SEDERHANA PBO   ");
            System.out.println("==================================");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Lihat Riwayat Transaksi"); //arraylist
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            if (scanner.hasNextInt()) {
                pilihan = scanner.nextInt();

                switch (pilihan) {
                    case 1:
                        akunUser.cekSaldo();
                        break;
                    case 2:
                        System.out.print("Masukkan jumlah setor: Rp ");
                        double setor = scanner.nextDouble();
                        akunUser.setorTunai(setor);
                        break;
                    case 3:
                        System.out.print("Masukkan jumlah tarik: Rp ");
                        double tarik = scanner.nextDouble();
                        akunUser.tarikTunai(tarik);
                        break;
                    case 4:
                        akunUser.tampilkanRiwayat();
                        break;
                    case 5:
                        System.out.println("\nTerima kasih telah menggunakan ATM Sederhana!");
                        break;
                    default:
                        System.out.println("\n[PILIHAN TIDAK VALID] Silakan masukkan angka 1 sampai 5.");
                }
            } else {
                System.out.println("\n[ERROR] Input harus berupa angka!");
                scanner.next(); 
                pilihan = 0;
            }
        } while (pilihan != 5);

        scanner.close();
    }
}