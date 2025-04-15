public class TransaksiPembelian10 {
    String kodeTransaksi;
    String namaPembeli;
    String tanggalPembelian;
    int qty;
    Barang10  brg = new Barang10() ;

    TransaksiPembelian10(){
        
    }
    TransaksiPembelian10(String kodeTransaksi,String namaPembeli,String tanggalPembelian, int qty, Barang10 brg){
        this.kodeTransaksi = kodeTransaksi;
        this.namaPembeli = namaPembeli;
        this.tanggalPembelian = tanggalPembelian;
        this.qty = qty;
        this.brg = brg;
    }

    void tampilDataTransaksi(){
        System.out.println("kode barang: "+ kodeTransaksi);
        System.out.println("kode barang: "+ namaPembeli);
        System.out.println("kode barang: "+ tanggalPembelian);
        System.out.println("kode barang: "+ qty);
    }
}
