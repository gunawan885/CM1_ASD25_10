public class Service10 {
    TransaksiPembelian10 trs[] = new TransaksiPembelian10[5];
    int index;

    void tambahDataTransaksi(TransaksiPembelian10 trp){
        if (index<trs.length) {
            trs[index] = trp;
            index++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }

    void searching(String nama){
        int found=-1;   
        for (int j = 0; j < trs.length; j++) {
            if (nama.equalsIgnoreCase(trs[j].brg.nama)) {
                System.out.println("Posisi: "+(j+1));
                System.out.println("Kode Transaksi: "+trs[j].kodeTransaksi);
                System.out.println("Nama Pembeli: "+trs[j].namaPembeli);
                System.out.println("Tanggal Pembelian: "+trs[j].tanggalPembelian);
                System.out.println("Nama Barang: "+trs[j].brg.nama);
                System.out.println("Kuantitas: "+trs[j].qty);
                System.out.println("Harga: "+trs[j].brg.harga);
                found++;
        }
        }
        if (found==-1) {
            System.out.println("data tidak ditemukan");
        }
    }

    void sorting(TransaksiPembelian10[] datatr){
        for (int i = 0; i < datatr.length-1; i++) {
            for (int j = 1; j < datatr.length; j++) {
                if (datatr[j].brg.nama.compareToIgnoreCase(datatr[j-1].brg.nama)<0) {
                    TransaksiPembelian10 temp = datatr[j];
                    datatr[j]=datatr[j-1];
                    datatr[j-1]=temp;
                }
            }
        }
        for (TransaksiPembelian10 transaksiPembelian10 : datatr) {
            transaksiPembelian10.tampilDataTransaksi();
        }
    }
}
