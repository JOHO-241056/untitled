package reviews.reviews2;

public class Review18 {
    public static void main(String[] args) {
        int num = 10; //ここに代入される値は正の整数である。
        int sum = 0;
        int i = 1;
        while (i <= num) {
            if(i % 2 == 1) sum += i;
            i++;
        }
        System.out.println("結果: " + sum);
    }
}