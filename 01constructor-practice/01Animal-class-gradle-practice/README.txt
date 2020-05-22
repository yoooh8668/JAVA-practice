In main function
    package JungleDemo3;    //不加才可以過，除非src/main/java/ 之後還有資料夾的才要


    Example:
        IN GRADLE:
            src/main/java/com/example/Main.java

        IN JAVA CODE:
            package com.example;
            public class Main {
            ...}

In build.gradle
    mainClassName = "JungleDemo3"   //這是執行主程式(含有main)的class name
    如果不需要參數(args)的話，就不用加run {}


之後執行gradle run 即可自動產生classes並build