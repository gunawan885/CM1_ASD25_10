import java.util.Scanner;
public class MainToko {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Barang10 br[] = new Barang10[5];
        TransaksiPembelian10 tr[] = new TransaksiPembelian10[5];
        Service10 service = new Service10();
        boolean status = true;
        while (status) {
            System.out.println("========TOKO MANASUKA========");
            System.out.println("BANK MENU");
            System.out.println("1. Data Barang");
            System.out.println("2. Data Transaksi");
            System.out.println("3. Pencarian Data");
            System.out.println("4. Pengurutan Data");
            System.out.println("5. Exit");
            System.out.print("Choose Menu (1-5): ");
            int pilihan = sc.nextInt();
            sc.nextLine();
            
            br[0] = new Barang10("Br001","Leo Kripik", "Makanan", 10,1000);
            br[1] = new Barang10("Br002","You C1000 Botol", "Minuman", 10,7000);
            br[2] = new Barang10("Br003","Teh Pucuk Botol", "Minuman", 10,4000);
            br[3] = new Barang10("Br004","Rinso Cair", "Sabun", 10,7000);
            br[4] = new Barang10("Br005","Mama Lemon Cair", "Sabun", 10,1000);
            
            tr[0] = new TransaksiPembelian10("Tr001","Santi", "21-04-2024", 1, br[0]);
            tr[1] = new TransaksiPembelian10("Tr002","Vani", "21-04-2024", 2, br[1]);
            tr[2] = new TransaksiPembelian10("Tr003","Siska", "23-04-2024", 3, br[2]);
            tr[3] = new TransaksiPembelian10("Tr004","Meimei", "23-04-2024", 1, br[2]);
            tr[4] = new TransaksiPembelian10("Tr005","Ihsan", "24-04-2024", 1, br[1]);

            service.tambahDataTransaksi(tr[0]);
            service.tambahDataTransaksi(tr[1]);
            service.tambahDataTransaksi(tr[2]);
            service.tambahDataTransaksi(tr[3]);
            service.tambahDataTransaksi(tr[4]);

            switch (pilihan) {
                case 1:
                    System.out.println("Kode Barang     Nama Barang             Kategori     Stock     Harga");
                    for (Barang10 barang : br) {
                        barang.tampilDataBarang();
                    }
                    break;
                    
                    case 2:
                    System.out.println("Kode Transaksi     Nama Pembeli        Tanggal Pembelian     Nama Barang        kuantitas     Harga");
                    for (TransaksiPembelian10 transaksi : tr) {
                        transaksi.tampilDataTransaksi();
                    }
                    break;

                case 3:
                    System.out.print("Masukkan nama barang yang akan dicari:");
                    String cari = sc.nextLine();
                    service.searching(cari);
                break;

                case 4:
                    System.out.println("Mengurutkan Data berdasarkan Nama Barang");
                    service.sorting(tr);
                break;

                case 5:
                    System.out.println("Keluar dari Program");
                    status = false;
                    break;

                default:
                    System.out.println("Pilihan Tidak Valid");
                    break;
            }
        }
    }
}
