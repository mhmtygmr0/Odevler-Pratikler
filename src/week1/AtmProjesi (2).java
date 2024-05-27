package week1;

import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String kullanici , sifre;
        int secim , para , bakiye = 0 , girishakki;

        System.out.print("Kullanıcı Adınız : ");
        kullanici = x.nextLine();
        System.out.print("Parolanız : ");
        sifre = x.nextLine();

        for (girishakki = 3; true; girishakki--){

            if(kullanici.equals("mehmet") && sifre.equals("0000")){

                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");

                System.out.println("1-Para yatırma \n" +
                        "2-Para Çekme \n" +
                        "3-Bakiye Sorgula \n" +
                        "4-Çıkış Yap");

                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                secim = x.nextInt();

                    switch (secim){

                        case 1 :
                            System.out.print("Para miktarı : ");
                            para = x.nextInt();
                            bakiye += para;
                            break;

                        case 2 :
                            System.out.print("Para miktarı : ");
                            para = x.nextInt();
                            if(bakiye >= para){
                                bakiye -= para;
                            }
                            else{
                                System.out.print("Yetersiz Bakiye..");
                            }
                            break;

                        case 3 :
                            System.out.println("Bakiyeniz : " + bakiye + " TL");
                            break;

                        case 4 :
                            System.out.println("Tekrar görüşmek üzere.");
                            break;

                        default:
                            System.out.println("Geçersiz seçim. Tekrar deneyiniz.");
                    }

                    break;

            }else {

                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");

                if (girishakki == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                    break;
                }
                else {
                    System.out.println("Kalan Hakkınız : " + girishakki);
                }

                System.out.print("Kullanıcı Adınız : ");
                kullanici = x.nextLine();
                System.out.print("Parolanız : ");
                sifre = x.nextLine();

            }
        }
    }
}