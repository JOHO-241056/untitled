package textbook.chapter3.practices;

public class Practice3 {
    public static void main(String[] args) {
        int isHungry = 1; //0もしくは1
        String food = "とろ〜り３種のチーズ牛丼"; //任意の文字列

        System.out.println("こんにちは");
        if(isHungry == 0){
            System.out.println("お腹がいっぱいです");
        } else {
            System.out.println("はらぺこです");
            System.out.println(food + "をいただきます");
            System.out.println("ごちそうさまでした");
        }
    }
}
