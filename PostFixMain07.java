import java.util.Scanner;
public class PostFixMain07 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String P, Q;
    System.out.print("Masukkan Ekspresi Matematika (Infix) : ");
    Q = sc.nextLine();
    Q = Q.trim();
    Q = Q + ")";
    
    int total = Q.length();

    Postfix07 post = new Postfix07(total);
    P = post.konversi(Q);
    System.out.println("Postfix : " + P);

}
}

