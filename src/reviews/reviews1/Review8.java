package reviews.reviews1;

public class Review8 {
    public static void main(String[] args) {
        int a = 10; //①
        double b = a; //②
        a = (int)b; //③ intにdoubleは代入できないので、明示的型変換
        a = (int)10000L; //④ intにlongは代入できないので、明示的型変換
        b = 10000L; //⑤
        b = (int)a; //⑥
        float f = (float)5.94; //⑦ floatにdoubleは代入できないので、明示的型変換
        short s = 10; //⑧
    }
}
