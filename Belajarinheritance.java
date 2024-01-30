package belajar_inheritance2;

import java.util.Scanner;

public class Belajarinheritance {
    
    public static class Inheritancebangunruang {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Bola bola = new Bola();
            Balok balok = new Balok();
            Kubus kubus = new Kubus();
            Limassegitiga limassegitiga = new Limassegitiga();
            BangunRuang bangunruang = new BangunRuang(); // Pastikan BangunRuang didefinisikan

            System.out.println("1. Volume Bola");
            System.out.println("2. Luas Permukaan bola");
            System.out.println("3. Volume Kubus");
            System.out.println("4. Luas Permukaan Kubus");
            System.out.println("5. Volume Balok");
            System.out.println("6. Luas Permukaan Balok");
            System.out.println("7. Volume Limas Segitiga");
            System.out.println("8. Luas Permukaan Limas Segitiga");
            System.out.print("Yang ingin dihitung adalah : ");
            int pilih = scanner.nextInt();

            switch(pilih) {
                case 1:
                    System.out.print("Masukkan Jari jari : ");
                    bola.r = scanner.nextFloat();
                    bola.Volume();
                    break;

                case 2:
                    System.out.print("Masukkan Jari jari : ");
                    bola.r = scanner.nextFloat();
                    bola.Luaspermukaan();
                    break;

                case 3:
                    System.out.print("Masukkan Sisi : ");
                    kubus.s = scanner.nextFloat();
                    kubus.Volume();
                    break;

                case 4:
                    System.out.print("Masukkan Sisi : ");
                    kubus.s = scanner.nextFloat();
                    kubus.Luaspermukaan();
                    break;

                case 5:
                    System.out.print("Masukkan Panjang : ");
                    balok.p = scanner.nextFloat();
                    System.out.print("Masukkan Lebar : ");
                    balok.l = scanner.nextFloat();
                    System.out.print("Masukkan Tinggi : ");
                    balok.t = scanner.nextFloat();
                    balok.Volume(); 
                    balok.Luaspermukaan(); 
                    
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }
}