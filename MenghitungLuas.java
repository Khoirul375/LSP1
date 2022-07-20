import java.util.Scanner;
/**
 *
 * @author Siswa
 */
public class MenghitungLuas {

    /**
     * @param args the command line arguments
     */
    
    private static int PersegiPanjang(int panjang, int lebar){
        //Rumus Luas Persegi Panjang = panjang * lebar
        int luas = panjang * lebar;
        return luas;
    }
    
    private static int BujurSangkar(int sisi){
        //Rumus Luas Persegi = sisi * sisi
        int luas = sisi * sisi;
        return luas;
    }
    
    private static double Lingkaran(int diameter){
        //Rumus Luas Lingkaran = phi * r * r
        //r = 1/2 * diameter (jari-jari)
        //phi = 22/7 atau 3.14
        
        double r = 0.5 * diameter;
        double luas = 0;
        if(r % 7 == 0){
            luas = 22 * (r*r/7);
        }else{
            luas = 3.14 * r * r;
        }
        return luas;
    }
    
    private static boolean CekValue(String value){
        try {
                Integer.parseInt(value);
                return true;
            } catch (NumberFormatException ex)
            {
                return false;
            }
    }
    
    public static void main(String[] args) {
        String ulg = "y";
        while (ulg.equals("y"))
        {
        Scanner input = new Scanner(System.in);

        //Pilihan untuk hitung luas      
        System.out.println("Menu Utama :");
        System.out.println("1.Menghitung Luas Persegi Panjang");
        System.out.println("2.Menghitung Luas Bujur Sangkar");
        System.out.println("3.Menghitung Luas Lingkaran");
        System.out.println();
        System.out.print("Silahkan Pilih Menu (1/2/3) : ");
        String pilihan = input.nextLine();
        System.out.println("================================================="); 
        switch(pilihan){
            case "1":
                System.out.println("Menghitung Luas Persegi Panjang");
                System.out.print("Masukkan Panjang : ");
                String panjang = input.nextLine();
                System.out.print("Masukkan Lebar : ");
                String lebar = input.nextLine();
                if(CekValue(panjang) && CekValue(lebar)){
                    int p = Integer.parseInt(panjang);
                    int l = Integer.parseInt(lebar);
                    int luas = PersegiPanjang(p,l);
                    System.out.println("Luas Persegi Panjang Adalah : "+luas);
                }else{
                    System.out.println("Nilai yang anda masukan harus integer");
                }
                break;
            case "2":
                System.out.println("Menghitung Luas Bujur Sangkar");
                System.out.print("Masukkan Sisi : ");
                String sisi = input.nextLine();
                if(CekValue(sisi)){
                    int s = Integer.parseInt(sisi);
                    int luas = BujurSangkar(s);
                    System.out.println("Luas Persegi Adalah : "+luas);
                }else{
                    System.out.println("Nilai yang anda masukan harus integer");
                }
                break;
            case "3":
                System.out.println("Menghitung Luas Lingkaran");
                System.out.print("Masukkan Diameter : ");
                String diameter = input.nextLine();
                if(CekValue(diameter)){
                    int d = Integer.parseInt(diameter);
                    double luas = Lingkaran(d);
                    System.out.println("Luas Lingkaran Adalah : "+luas);
                }else{
                    System.out.println("Nilai yang anda masukan harus integer");
                }
                break;
            default:
                System.out.println("Pilihan Anda tidak terdaftar");
        } 
        System.out.println("=================================================");
        System.out.print("Apakah anda ingin mengulang? (y/t)");
            ulg = input.next();
        }
    }        
}