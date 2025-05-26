package reviews.reviews1;

public class Review7 {
    public static void main(String[] args) {
        System.out.println(4 * 5 * 2 + 10 + "3" + 6 + 2); //①
//        System.out.println("10" + 4 * 3 - 5 + 8 / 4); //②  Stringに-演算子は使えない
        System.out.println(15 - 3 * 2 + "5" + 3 * 7); //③
        System.out.println("5" + 6 * 4 + 7 + 10 / 2); //④
//        System.out.println((10 + 5) * 3 - "2" + 4 * -5); //⑤ Stringに-演算子は使えない
        System.out.println(4 * (5 + 2) - 10 + "3" + 6 + 2); //⑥
        System.out.println("10" + (4 * 3 - 5) + 8 / 4); //⑦
//        System.out.println((15 - 3) * (2 + "5") + (3 * 7)); //⑧ Stringに*演算子は使えない
        System.out.println("5" + (6 * 4 + 7) + 10 / 2); //⑨
        System.out.println((3 + 4) * 2 + "20" + 12 / (4 + 2)); //⑩
    }
}
