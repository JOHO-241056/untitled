package textbook.chapter3.practices;

public class Practice4 {
    public static void main(String[] args) {
        boolean tenki = true;
        if (tenki) { //tenkiだけでよい
            System.out.println("洗濯をします");
            System.out.println("散歩に行きます");
        } else { //elseの場合の処理をかっこで括れていない
            System.out.println("映画を見ます");
            System.out.println("寝ます");
        }
    }
}
