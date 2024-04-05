import java.util.Scanner;
public class StackMain07 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Stack07 stk = new Stack07(5);

   // char pilih;
    //do {
      //  System.out.print("Jenis : ");
//String jenis = sc.nextLine();
      //  System.out.print("Warna : ");
      //  String warna = sc.nextLine();
    //    System.out.print("Merk : ");
      //  String merk = sc.nextLine();
      //  System.out.print("Ukuran : ");
       // String ukuran = sc.nextLine();
       // System.out.print("Harga : ");
       // double harga = sc.nextDouble();


      //  Pakaian07 p = new Pakaian07(jenis, warna, merk, ukuran, harga);
      //  System.out.println("Apakah Anda Akan Menambahkan Data Baru ke Stack (y/n)? ");
        //pilih =sc.next().charAt(0);
       // sc.nextLine();
        //stk.push(p);
    //} while (pilih == 'y');
        
      //  stk.print();
        //stk.pop();
       // stk.peek();
        //stk.print();
        char pilih;
        do {
            System.out.println("Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            int choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Jenis : ");
                    String jenis = sc.nextLine();
                    System.out.print("Warna : ");
                    String warna = sc.nextLine();
                    System.out.print("Merk : ");
                    String merk = sc.nextLine();
                    System.out.print("Ukuran : ");
                    String ukuran = sc.nextLine();
                    System.out.print("Harga : ");
                    double harga = sc.nextDouble();
                    Pakaian07 p = new Pakaian07(jenis, warna, merk, ukuran, harga);
                    stk.push(p);
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.peek();
                    break;
                case 4:
                    stk.print();
                    break;
                case 5:
                    System.out.println("Program Berhenti.");
                    System.exit(0); // Keluar dari program
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }

            System.out.println("Apakah Anda ingin melanjutkan (y/n)?");
            pilih = sc.next().charAt(0);
            sc.nextLine(); 
        } while (pilih == 'y' || pilih == 'Y');
        
        sc.close(); 
}
}
