public class MyClass {
  public static void main(String[] args) {
    try {
        //試著執行此段
        //有例外狀況時呼叫catch
        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[0]);
    } catch (Exception e) {
        //如果try執行有exception，執行此段
        //沒有則不會進入此段
        System.out.println("Something went wrong.");
    } finally {
        //不論結果都會執行此行
        System.out.println("The 'try catch' is finished.");
    }
  }
}
