public class Barang10 {
    String kodeBarang;
    String nama;
    String kategori;
    int stok;
    int harga;
    
    public Barang10 (){

    }

    public Barang10(String kodeBarang,String nama, String kategori, int stock, int harga){
        this.kodeBarang = kodeBarang;
        this.nama = nama;
        this.kategori = kategori;
        stok = stock;
        this.harga = harga;
    }

    void tampilDataBarang(){
        System.out.printf("%-15s %-23s %-12s %-9d %-5d \n",kodeBarang,nama,kategori,stok,harga);
    }
    
}