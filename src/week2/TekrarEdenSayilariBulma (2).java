package week2;
public class TekrarEdenSayilariBulma {


    public static void main(String[] args) {

        // Ana dizimizi tanımlıyoruz.
        int[] dizi = {3,7,3,3,2,9,10,21,1,33,9,1};

        // Yeniden tekrar eden sayıları tutacak bir dizi oluşturuyoruz.
        int[] yenidizi = new int[dizi.length];

        // İndeks sayacı başlangıç değeri
        int indexSayac = 0;

        // Ana dizi boyunca döngü başlatıyoruz.
        for(int i = 0; i < dizi.length ; i++){

            // Her eleman için diğer elemanlarla karşılaştırma yapacağımız döngüyü başlatıyoruz.
            for(int a = 0; a < dizi.length ; a++){

                // İki farklı indeksteki elemanların eşitliğini kontrol ediyoruz.
                if((i != a) && (dizi[i]) == dizi[a]){

                    // Eğer tekrar eden bir eleman bulduysak ve daha önce bu elemanı işlemediysek,
                    // yenidiziye ekliyoruz.
                    if(!isFind(yenidizi , dizi[i])){
                        yenidizi[indexSayac++] = dizi[i];
                    }
                    break;// İç döngüyü sonlandırıyoruz
                }
            }

        }

        // Yenidizi içerisindeki elemanları sıfırdan farklı olanları yazdırıyoruz.
        for(int value : yenidizi){
            if(value !=0){
                System.out.println(value);
            }
        }

    }

    // Bir değerin bir dizide olup olmadığını kontrol eden bir yardımcı yöntem.
    static boolean isFind(int[] arr , int value){
        for (int i  : arr){

            if(i== value){
                return true;
            }

        }
        return false;
    }

}