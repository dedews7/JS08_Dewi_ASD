class Stack {
    int data[];
    int size;
    int top;

    public Stack(int size) {
        this.size = size;
        data = new int[size];
        top = -1;
    }


public boolean isFull() {
    if (top == size-1){
        return true;
    } else {
        return false;
    }
}

 public boolean isEmpty(){
    if (top == -1){
        return true;
    } else {
        return false;
    }
 }

    public void push(int dt) {
        if (!isFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Stack penuh");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            int x = data[top];
            top--;
            System.out.println("Data yang Dikeluarkan dari Stack: " + x);
        } else {
            System.out.println("Stock Masih Kosong");
        }
    }

    public void peek() {
        System.out.println("Elemen Teratas Stack Saat Ini: " + data[top]);
    }


    public void print() {
        System.out.println("Isi Stack: ");
        for(int i = top; i >= 0; i--) {
            System.out.println(data[i]+" ");
        }
        System.out.println(" ");
    }

    public void clear() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--){
                top--;
            }
            System.out.println("Stack Sudah Dikosongkan");
        } else {
            System.out.println("Stack Masih Kosong");
        }
    }
}