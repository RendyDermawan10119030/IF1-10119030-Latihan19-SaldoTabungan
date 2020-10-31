package if1.pkg10119030.latihan19.saldotabungan;
import java.util.Locale;
import java.util.Scanner;
/**
* Nama              :Rendy Dermawan
* NIM               :10119030
* Kelas             :IF1
* Deskripsi Program :
 */
public class SaldoTabungan {
    static Scanner scan = new Scanner(System.in);
    Locale locale = Locale.forLanguageTag("id");
    double saldo, bunga;
    int lama;
    
    private void masukkanSaldo(){
        System.out.print("Saldo Awal\t: Rp. ");
        saldo = Double.parseDouble(scan.next().replaceAll("[$,.]", ""));
        System.out.print("Bunga/Bulan(%)\t: ");
        bunga = scan.nextInt();
        System.out.print("Lama(Bulan)\t: ");
        lama = scan.nextInt();
    }

    private void hitungSaldo(){
        double bunga = this.bunga / 100 + 1;
        this.bunga = bunga;
    }
    private void tampilSaldo(){
        for(int i = 1; i <= lama; i++){
            saldo*= bunga;
            System.out.print("Saldo di bulan ke-"+i+"Rp.  ");
            System.out.printf(locale, "%,.0f%n", saldo);
        }
    }
    public static void main(String [] args){
        SaldoTabungan data = new SaldoTabungan();
        data.masukkanSaldo();
        data.hitungSaldo();
        data.tampilSaldo();
        System.out.println("(Developed by : Rendy Dermawan)");
    }
}
