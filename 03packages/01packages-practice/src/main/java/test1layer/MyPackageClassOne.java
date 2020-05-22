package test1layer;

//在哪層的資料夾，就package資料夾名，更多層就用.隔開
//這是統一標準，如果不遵守資料夾名package也可以，只是不好管理

public class MyPackageClassOne {
//要用public才可以被import

    public void showString(){
        System.out.println("This is MyPackageClassOne in test1layer!");
    }

    public void showStringTest1(String aBCD){
        System.out.println("This is MyPackageClassOne " + aBCD);
    }
}