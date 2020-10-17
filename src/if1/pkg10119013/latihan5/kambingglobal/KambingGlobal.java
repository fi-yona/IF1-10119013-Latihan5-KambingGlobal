/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan5.kambingglobal;

/**
 *
 * @author Fiona Avila
 */

public class KambingGlobal {

    //variabel untuk menampilkan jumlah kambing
    int jumlahKambing = 88;
    
    public void getJumlahKambing(){
        System.out.println("Jumlah kambing : " + jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah : " + 
                            jumlahKambing);
    }
    
    public static void main(String[] args) {
        KambingGlobal kambingSusu = new KambingGlobal();
        
        //menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        //menambah satu kambing
        kambingSusu.tambahKambing();
        
        //menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
