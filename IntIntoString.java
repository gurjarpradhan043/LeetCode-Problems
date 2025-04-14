package problemSolving;

public class IntIntoString {
    public static  String ConvertIntoString(int a) {
      return Integer.toString(a);
    }
    public static void main(String[] args) {
        int a = 10;
        String result = ConvertIntoString(a);
        System.out.println(result);

    }
}
