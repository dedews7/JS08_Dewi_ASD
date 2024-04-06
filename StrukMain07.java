public class StrukMain07 {
    public static void main(String[] args) {
        StrukBelanjaStack07 stack = new StrukBelanjaStack07();

        stack.push(new StrukBelanja07(1001, "01/01/2024", 3, 150000));
        stack.push(new StrukBelanja07(1002, "03/01/2024", 2, 100000));
        stack.push(new StrukBelanja07(1003, "05/01/2024", 4, 200000));
        stack.push(new StrukBelanja07(1004, "07/01/2024", 1, 50000));
        stack.push(new StrukBelanja07(1005, "09/01/2024", 5, 250000));
        stack.push(new StrukBelanja07(1006, "11/01/2024", 2, 100000));
        stack.push(new StrukBelanja07(1007, "13/01/2024", 3, 150000));
        stack.push(new StrukBelanja07(1008, "15/01/2024", 2, 100000));

        stack.display();

    
        System.out.println("\nStruk Belanja yang Diambil untuk Ditukarkan dengan Voucher:");
        for (int i = 0; i < 5; i++) {
            StrukBelanja07 struk = stack.pop();
            if (struk != null) {
                System.out.println(struk);
            } else {
                break;
            }
        }


        stack.display();
    }
}
