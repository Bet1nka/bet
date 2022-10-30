package BetinaHW.SecondHW;

public class task3 {
    //
    //Дан следующий код, исправьте его там, где требуется (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
    //
    public static void main(String[] args) {

            try {
                int a = 90;
                int b = 3;
                System.out.println(a / b);
                printSum(23, 234);
                int[] abc = { 1, 2 };
                abc[3] = 9;
            } catch (NullPointerException ex) {
                System.out.println("Dont use null!");
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Index out of Bounds");
            }
        }


    private static void printSum(int a, int b) {
        System.out.println(a + b);
    }
}
