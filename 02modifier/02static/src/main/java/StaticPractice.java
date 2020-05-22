class ShowTime{
    static double startTime = 21.15;
    double endTime = 23.50;

    static void showStartTime()
    {   //static 屬性
        System.out.println("21.15");
    }
    
    //overload with a parameter
    static void showStartTime(double x)
    {   //static 屬性
        System.out.println(x);
    }

    public void showEndTime()
    {   //無設定static
        System.out.println("23.50");
    }
}
public class StaticPractice {

    public static void main(String[] args) {
        //ShowTime showTime = new ShowTime();  //沒有實做Show
        System.out.println(ShowTime.startTime);
        //System.out.println(ShowTime.endTime);
        ShowTime.showStartTime();
        //ShowTime.showEndTime();
        ShowTime.showStartTime(ShowTime.startTime);
        //ShowTime.showStartTime(ShowTime.endTime);//endTime未宣告
    }
}
/*
註解掉的地方因為ShowTime沒有實做所以會error
其他可以印出來是因為宣告static，已經分配記憶體所以找的到，
但仍然不可以使用未宣告的參數

注意:
使用上仍要用Class.methodName/Class.parameterName
不可以少了Class.
因為它仍然屬於該Class，不是獨立的
*/