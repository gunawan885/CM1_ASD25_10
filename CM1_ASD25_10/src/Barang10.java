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
        System.out.println("kode barang: "+ kodeBarang);
        System.out.println("kode barang: "+ nama);
        System.out.println("kode barang: "+ kategori);
        System.out.println("kode barang: "+ stok);
        System.out.println("kode barang: "+ harga);
    }
    
}