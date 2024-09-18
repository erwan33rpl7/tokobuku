import java.util.Scanner;

public class pembelianalattulis {
    public static void main(String[] args) {
         int pilihan,jumlah=0;
        double harga=0,total,temporary=0;
        String tambahbeli;
        do{
        Scanner s = new Scanner (System.in);
        System.out.println("selamat datang di toko belajar kami");
        System.out.println("list item kami: ");
        System.out.println("1.buku tulis= 4000\n2.pensil= 2500\n3.penghapus= 1000\n4.penggaris= 2000");
        System.out.println("inputkan nomor yang ingin dibeli");
        pilihan=s.nextInt();
        System.out.println("mau beli berapa: ");
        jumlah=s.nextInt();

    switch (pilihan) {
        case 1:
            harga=4000;
            break;

            case 2:
            harga=2500;
            break;

            case 3:
            harga=1000;
            break;

            case 4:
            harga=2000;
            break;

    
        default:
            break;
    }
    total=harga*jumlah;
    temporary += total;
    System.out.println("apakah mau beli lagi");
    tambahbeli=s.next();
    
        }while(tambahbeli.equalsIgnoreCase("ya"));
        System.out.println("total yang dibayarkan: "+ temporary);

    }
    
}
