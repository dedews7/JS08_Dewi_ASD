class StrukBelanjaStack07 {
    private static final int MAX_SIZE = 8; // Maksimum 8 struk belanja
    private StrukBelanja07[] stackArray;
    private int top;

    public StrukBelanjaStack07() {
        stackArray = new StrukBelanja07[MAX_SIZE];
        top = -1;
    }

    public void push(StrukBelanja07 struk) {
        if (top < MAX_SIZE - 1) {
            top++;
            stackArray[top] = struk;
        } else {
            System.out.println("Stack Penuh! Tidak dapat menambahkan struk baru.");
        }
    }

    public StrukBelanja07 pop() {
        if (!isEmpty()) {
            StrukBelanja07 poppedStruk = stackArray[top];
            top--;
            return poppedStruk;
        } else {
            System.out.println("Stack Kosong! Tidak dapat mengambil struk.");
            return null;
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void display() {
        if (!isEmpty()) {
            System.out.println("Informasi Struk Belanja yang Tersimpan di dalam Stack:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stackArray[i]);
            }
        } else {
            System.out.println("Stack Kosong! Tidak ada struk belanja yang tersimpan.");
        }
    }
}
