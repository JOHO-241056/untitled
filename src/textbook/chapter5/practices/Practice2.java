package textbook.chapter5.practices;

public class Practice2 {
    public static void main(String[] args) {
        email("fugafuga", "hoge@example.com", "piyopiyo");
    }

    private static void email(String title, String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました。");
        System.out.println("件名: " + title);
        System.out.println("本文: " + text);
    }
}
