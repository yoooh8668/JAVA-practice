import test1layer.MyPackageClassOne;
import test1layer.test2layer.MyPackageClassTwo;

//import packageName，與你(或其他人)在他的code裡面package的名稱一致
//就算import不同package，ClassName還是不可以不同(無法使用建構子，名稱重複)

public class TestPackages {
    public static void main(String[] args) {
        MyPackageClassOne test1 = new MyPackageClassOne();
        MyPackageClassTwo test2 = new MyPackageClassTwo();
        test1.showString();
        test1.showStringTest1("test text");
        test2.showString();
    }
}