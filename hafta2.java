public class hafta2 {
    public static void main(String[] args) {
        //bir tamsayının 3 ve m5 ile bölünebilme durumunu kontrol eden bir program yazın.
        int sayi = 15; // Kontrol edilecek tamsayı
        if (sayi % 3 == 0 && sayi % 5 == 0) {
            System.out.println(sayi + " hem 3'e hem de 5'e tam bölünür.");
        }
        else if (sayi % 3 == 0) {
            System.out.println(sayi + " sadece 3'e tam bölünür.");
        }
        else if (sayi % 5 == 0) {
            System.out.println(sayi + " sadece 5'e tam bölünür.");
        } 
        else {
            System.out.println(sayi + " ya 3'e ya da 5'e tam bölünmez.");
        }
    }
}