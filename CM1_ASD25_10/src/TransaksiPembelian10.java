public class TransaksiPembelian10 {
    String kodeTransaksi;
    String namaPembeli;
    String tanggalPembelian;
    int qty;
    Barang10 brg;

    TransaksiPembelian10(){
        
    }

    TransaksiPembelian10(String kodeTransaksi,String namaPembeli,String tanggalPembelian,int qty, Barang10 brg){
        this.kodeTransaksi = kodeTransaksi;
        this.namaPembeli = namaPembeli;
        this.tanggalPembelian = tanggalPembelian;
        this.qty = qty;
        this.brg = brg;
    }

    void tampilDataTransaksi(){
        System.out.printf("%-18s %-19s %-21s %-18s %-13d %-12d \n", kodeTransaksi,namaPembeli,tanggalPembelian,brg.nama,qty,brg.harga);
    }
}
