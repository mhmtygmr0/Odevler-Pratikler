package week2;
public class BHarfiYazdiranProgram {
    public static void main(String[] args) {

        // B harfini oluşturmak için bir 2D dizi kullanılır.
        String[][] letter = new String[7][4];

        // Döngülerle her bir hücreye "*" veya boşluk atanır, B harfine benzer bir şekil oluşturulur.
        for (int i = 0; i < letter.length; i++) {

            for (int j = 0; j < letter[i].length; j++) {

                if (i == 0 || i == 3 || i == 6) {
                    // Satırın üst, orta ve alt kısımlarında "*" bulunur.
                    letter[i][j] = " * ";

                } else if (j == 0 || j == 3) {
                    // Sol ve sağ köşelerde "*" bulunur.
                    letter[i][j] = " * ";

                } else {
                    // Diğer hücreler boşlukla doldurulur.
                    letter[i][j] = "   ";

                }

            }

        }

        // Oluşturulan B harfi ekrana basılır.
        for (String[] row : letter){

            for (String col : row){
                System.out.print(col);
            }

            System.out.println();
        }
    }
}