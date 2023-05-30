import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password;
        int right = 3, select;
        double balance = 0.0,price;


        while (right > 0) {
            System.out.print("Kullanıcı Adınız: ");
            userName = input.nextLine();
            System.out.print("Şifrenizi Girin: ");
            password = input.nextLine();

            if (userName.equals("brn") && password.equals("brn123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");

                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Para Miktarı: ");
                            price = input.nextDouble();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para Miktarı: ");
                            price = input.nextDouble();
                            if (price > balance){
                                System.out.println("Bakiye Yetersiz.");
                            }else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        default:
                    }

                } while (select != 4);
                System.out.println("Tekrar Görüşmek Üzere!..");
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                }
                System.out.println("Kalan Hakkınız: " + right);
            }
        }

    }
}
