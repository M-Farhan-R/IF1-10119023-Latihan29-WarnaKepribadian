/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan29.warnakepribadian;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program :
 *
 */
import java.util.Scanner;

public class IF110119023Latihan29WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    
    //dari stackoverflow
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    
    public static final String fav = "Warna Favoritmu adalah ";
    
    public void merah(){
        System.out.println(fav.concat(ANSI_RED).concat("MERAH").concat(ANSI_RESET));
        System.out.println("1. Periang,");
        System.out.println("2. Pemberani,");
        System.out.println("3. Berani mengambil risiko dalam setiap langkah,");
        System.out.println("4. Menyukai tantangan,");
        System.out.println("5. Kurang sabar,");
        System.out.println("6. Dapat menahan marah namun jika sudah tahap puncak toleransi"
                + ", kemarahan akan slit dikontrol,");
        System.out.println("7. Memiliki energi kehangatan dan cinta.");
    }
    public void hijau(){
        System.out.println(fav.concat(ANSI_GREEN).concat("HIJAU").concat(ANSI_RESET));
        System.out.println("1. Romantis,");
        System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
        System.out.println("3. Teguh pada prinsip,");
        System.out.println("4. Menginginkan kesempurnaan,");
        System.out.println("5. Mudah cemburu,");
        System.out.println("6. Mudah merasa iri,");
        System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
    }
    public void kuning(){
        System.out.println(fav.concat(ANSI_YELLOW).concat("KUNING").concat(ANSI_RESET));
        System.out.println("1. Optimis,");
        System.out.println("2. Suka bergaul,");
        System.out.println("3. Periang,");
        System.out.println("4. Senang menolong,");
        System.out.println("5. Lincah dan aktif,");
        System.out.println("6. Tidak suka meremehkan kekurangan orang lain,");
        System.out.println("7. Loyal,");
        System.out.println("8. Hangat,");
        System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali"
                + " goyah dan tidak stabil,");
        System.out.println("10. Cenderung penakut.");
    }
    public void biru(){
        System.out.println(fav.concat(ANSI_BLUE).concat("BIRU").concat(ANSI_RESET));
        System.out.println("1. Menyenangkan,");
        System.out.println("2. Bijaksana,");
        System.out.println("3. Pembawaan diri tenang saat menghadapi masalah,");
        System.out.println("4. Dinamis,");
        System.out.println("5. Senang berbagi,");
        System.out.println("6. Bersahabat,");
        System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang,");
        System.out.println("8. Menyembunyikan perasaan karena karakternya yang "
                + "cenderung mencari jalan damai.");
    }
    public void ungu(){
        System.out.println(fav.concat(ANSI_PURPLE).concat("UNGU").concat(ANSI_RESET));
        System.out.println("1. Optimis,");
        System.out.println("2. Tidak pernah ragu,");
        System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki "
                + "mental yang kuat,");
        System.out.println("4. Memiliki ambisi yang besar,");
        System.out.println("5. Memiliki empati yang besar,");
        System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,");
        System.out.println("7. Terkadang bersikap keras.");
    }
    public static void main(String[] args) {
        System.out.println(ANSI_RED+"YUK "+ANSI_GREEN+"CEK "+ANSI_YELLOW+"KEPRIBADIAN "
                +ANSI_CYAN+"DARI "+ANSI_PURPLE+"WARNA "+ANSI_BLUE+"FAVORITMU");
        System.out.println("");
        System.out.println(ANSI_RED_BACKGROUND+ANSI_WHITE+"\t MERAH\t\t"+ANSI_RESET);
        System.out.println(ANSI_GREEN_BACKGROUND+ANSI_WHITE+"\t HIJAU\t\t"+ANSI_RESET);
        System.out.println(ANSI_YELLOW_BACKGROUND+ANSI_WHITE+"\t KUNING\t\t"+ANSI_RESET);
        System.out.println(ANSI_BLUE_BACKGROUND+ANSI_WHITE+"\t BIRU\t\t"+ANSI_RESET);
        System.out.println(ANSI_PURPLE_BACKGROUND+ANSI_WHITE+"\t UNGU\t\t"+ANSI_RESET);
        System.out.println("");
        
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        System.out.print("PILIH WARNA FAVORITMU : ");
        String warna = scan.next();
        System.out.print("NAMA KAMU \t: ");
        String nama = scan1.next();
        System.out.println();
        
        IF110119023Latihan29WarnaKepribadian kelas = new IF110119023Latihan29WarnaKepribadian();
        System.out.println("===HASIL TEST KEPRIBADIAN "+nama.toUpperCase()+"===");
        switch(warna.toLowerCase()){
            case "merah":
                kelas.merah();
                break;
            case "kuning":
                kelas.kuning();
                break;
            case "hijau":
                kelas.hijau();
                break;
            case "biru":
                kelas.biru();
                break;
            case "ungu":
                kelas.ungu();
                break;
        }
    }

}
