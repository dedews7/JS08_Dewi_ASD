public class Stack07 {
    int size;
    int top;
    Pakaian07 data[];

    public Stack07(int size) {
        this.size = size;
        data = new Pakaian07[size];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }

    public void push(Pakaian07 pkn) {
        if (!isFull()) {
            top++;
            data[top] = pkn;
        } else {
            System.out.println("Isi Stack Penuh!");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            Pakaian07 x = data[top];
            top--;
            System.out.println("Data yang Keluar: " + x.jenis + " " + x.warna
            + " " + x.merk + " " + x.ukuran + " " + x.harga);
        } else {
            System.out.println("Stack Masih Kosong");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen Teratas: " + data[top].jenis + " " + data[top].warna
            + " " + data[top].merk + " " + data[top].ukuran + " " + data[top].harga);
        } else {
            System.out.println("Stack Masih Kosong");
        }
    }

    public void print() {
        if (!isEmpty()) {
            System.out.println("Isi Stack: ");
            for (int i = top; i >= 0; i--) {
                System.out.println(data[i].jenis + " " + data[i].warna + " " 
                + data[i].merk + " " + data[i].ukuran + " " + data[i].harga + " ");
            }
            System.out.println("");
        } else {
            System.out.println("Stack Masih Kosong");
        }
    }

    public void clear() {
        if (!isEmpty()) {
            top = -1;
            System.out.println("Stack Sudah Dikosongkan");
        } else {
            System.out.println("Stack Masih Kosong");
        }
    }
    public void getMax() {
        if (!isEmpty()) {
            double maxPrice = data[0].harga;
            Pakaian07 maxPakaian = data[0];
            for (int i = 1; i <= top; i++) {
                if (data[i].harga > maxPrice) {
                    maxPrice = data[i].harga;
                    maxPakaian = data[i];
                }
            }
            System.out.println("Pakaian dengan Harga Tertinggi:");
            System.out.println(maxPakaian.jenis + " " + maxPakaian.warna
                    + " " + maxPakaian.merk + " " + maxPakaian.ukuran + " " + maxPakaian.harga);
        } else {
            System.out.println("Stack Masih Kosong");
        }
    }


}
