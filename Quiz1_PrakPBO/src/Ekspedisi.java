import java.util.Scanner;

public class Ekspedisi {
    public static Scanner sc = new Scanner(System.in);

    public static void mainMenu() {
        System.out.println("======Ekspedisi Pengiriman======");
        System.out.println("Pilih tipe pengiriman: ");
        System.out.println("1. Udara\n2. Darat\n3. Laut");
        switch (sc.nextInt()) {
            case 1:
                menuUdara();
                break;
            case 2:
                menuDarat();
                break;
            case 3:
                menuLaut();
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                mainMenu();
                break;
        }
    }

    public static void menuUdara() {
        System.out.println("=====Udara=====");
        System.out.println("Masukan berat barang (dalam kg):");
        float berat = sc.nextFloat();
        sc.nextLine();
        System.out.println("Barang berharga?(y/n)");
        boolean berharga = sc.nextLine().equals("y");
        System.out.println("Ukuran barang (dalam cm) ");
        System.out.println("Masukan panjang barang: ");
        float panjang = sc.nextFloat();
        System.out.println("Masukan lebar barang: ");
        float lebar = sc.nextFloat();
        System.out.println("Masukan tinggi barang: ");
        float tinggi = sc.nextFloat();
        System.out.println("Gunakan Asuransi?(y/n)");
        boolean asuransi = sc.next().equals("y");
        System.out.println("Masukan tipe pengiriman");
        System.out.println("1. Express\n2. Regular");
        Udara udara;
        if (sc.nextInt() == 1) {
            udara = new Udara(berharga, berat, panjang, lebar, tinggi, asuransi, tipePengirimanUdara.EXPRESS);
        } else {
            udara = new Udara(berharga, berat, panjang, lebar, tinggi, asuransi, tipePengirimanUdara.REGULAR);
        }
        hitungTotalBiaya(udara);
        mainMenu();
    }

    public static void menuDarat() {
        System.out.println("=====Darat=====");
        System.out.println("Masukan berat barang (dalam kg):");
        float berat = sc.nextFloat();
        sc.nextLine();
        System.out.println("Barang berharga?(y/n)");
        boolean berharga = sc.nextLine().equals("y");
        Darat darat = new Darat(berharga, berat);
        hitungTotalBiaya(darat);
        mainMenu();
    }

    public static void menuLaut() {
        System.out.println("=====Laut=====");
        System.out.println("Masukan berat barang (dalam kg):");
        float berat = sc.nextFloat();
        sc.nextLine();
        System.out.println("Barang berharga?(y/n)");
        boolean berharga = sc.nextLine().equals("y");
        System.out.println("Ukuran barang (dalam cm) ");
        System.out.println("Masukan panjang barang: ");
        float panjang = sc.nextFloat();
        System.out.println("Masukan lebar barang: ");
        float lebar = sc.nextFloat();
        System.out.println("Masukan tinggi barang: ");
        float tinggi = sc.nextFloat();
        System.out.println("Gunakan Asuransi?(y/n)");
        boolean asuransi = sc.next().equals("y");
        Laut laut = new Laut(berharga, berat, panjang, lebar, tinggi, asuransi);
        hitungTotalBiaya(laut);
        mainMenu();
    }

    public static void hitungTotalBiaya(Transportasi transportasi){
        System.out.println("Jumlah barang: ");
        int jumlah = sc.nextInt();
        double totalPrice = 0;
        for (int i = 0; i < jumlah; i++) {
            totalPrice += transportasi.hitungBiaya();
        }
        System.out.println("Total Price: Rp" + totalPrice);
    }

    public static void main(String[] args) {
        mainMenu();
    }
}