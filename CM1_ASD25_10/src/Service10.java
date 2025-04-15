public class Service10 {
    TransaksiPembelian10 trs[] = new TransaksiPembelian10[5];
    int data[];
    int index;
    int panjang;

    void tambahDataTransaksi(TransaksiPembelian10 trp){
        if (index<data.length) {
            trs[index] = trp;
            index++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }

    int searching(){

        return 0;
    }

    void sorting(int datatrs[], int panjang){
        this.panjang = panjang;
        data = new int [panjang];
        for (int i = 0; i < panjang; i++) {
            data[i] = datatrs[i];
        }
    }

    void selectionSort(){
        for (int i = 0; i < data.length-1; i++) {
            int min = i;
            for (int j = 1; j < data.length-i; j++) {
                if (data[j] > data[min]) {
                    min = j;
                }
            }
            int temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }
    }
}
