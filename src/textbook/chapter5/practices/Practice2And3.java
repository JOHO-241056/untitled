package textbook.chapter5.practices;

public class Practice2And3 {
    public static void main(String[] args) {
        email("fugafuga", "hoge@example.com", "piyopiyo");
        email("foo@example.com", "bar");
    }

    private static void email(String title, String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました。");
        System.out.println("件名: " + title);
        System.out.println("本文: " + text);
    }

    private static void email(String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました。");
        System.out.println("件名: " + "無題");
        System.out.println("本文: " + text);
    }
}
