package textbook.chapter5.practices;

public class Practice4 {
    public static void main(String[] args) {
        double bottom = 10.0;
        double height = 5.0;
        double radius = 5.0;
        double triangleArea = calcTriangleArea(bottom, height);
        double circleArea = calcCircleArea(radius);

        System.out.println("三角形の底辺の長さが" + bottom + "cm、高さが" + height + "cmの場合、面積は" + triangleArea + "平方cm。");
        System.out.println("円の半径が" + radius + "cmの場合、面積は" + circleArea + "平方cm。");
    }

    private static double calcTriangleArea(double bottom, double height) {
        return bottom * height / 2;
    }

    private static double calcCircleArea(double radius) {
        return 3.14 * radius * radius;
    }
}
