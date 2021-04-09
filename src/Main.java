

public class Main {
    public static void main(String[] args) {
        Book[] book = new Book[10];
        book[0] = new ProgrammingBook("A", "A", 10, "A", "Java", "A");
        book[1] = new ProgrammingBook("B", "B", 20, "B", "Java2", "B");
        book[2] = new ProgrammingBook("C", "C", 15, "C", "Java", "C");
        book[3] = new ProgrammingBook("D", "D", 11, "C", "Java3", "C");
        book[4] = new ProgrammingBook("E", "E", 17, "E", "Java4", "E");
        book[5] = new FictionBook("F", "F", 23, "F", "F");
        book[6] = new FictionBook("G", "G", 67, "G", "G");
        book[7] = new FictionBook("H", "H", 6, "H", "H");
        book[8] = new FictionBook("I", "I", 9, "I", "I");
        book[9] = new FictionBook("J", "J", 76, "J", "J");
        // Tính tổng tiền :
        double total = 0;
        for (Book bien : book) {
            total += bien.getPrice();
        }
        System.out.println("Tổng tiền 10 cuốn sách là " + total);
        // Đếm số cuốn sách có ngôn ngữ là Java :
        int count = 0;
        for (Book bien2 : book) {
            if (bien2 instanceof ProgrammingBook) {
                if (((ProgrammingBook) bien2).getLanguage().equals("Java")) {
                    count++;
                }
            }
        }
        System.out.println("Số cuốn sách có ngôn ngữ là Java : " + count);
        // Sắp xếp :
        for (int i = 0; i < book.length; i++) {
            for (int j =i+1; j < book.length; j++) {
                Book trungGian;
                if (book[i].getPrice() > book[j].getPrice()) {
                    trungGian = book[i];
                    book[i] = book[j];
                    book[j]=trungGian;
                }
            }
        }
        for (Book i:book) {
            System.out.println(i);
        }
    }
}
