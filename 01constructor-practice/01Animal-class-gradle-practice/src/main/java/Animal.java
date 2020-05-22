import static java.lang.System.*;
/*package JungleDemo3;    //不加才可以過，除非src/main/java/ 之後還有資料夾的才要
IN GRADLE:
src/main/java/com/example/Main.java

IN JAVA CODE:
package com.example;
public class Main {
...}
*/

class Animal {
    private int age;
    private int weight;
     
    public Animal(int a, int w) {
        setAge(a);
        setWeight(w);
        System.out.println("使用兩個參數的建構子，Animal物件已建立....");
    }
     
    public Animal(int w) {
        setAge(3);
        setWeight(w);
        System.out.println("使用一個參數的建構子，Animal物件已建立....");
    }
 
    public Animal() {
        setAge(3);
        setWeight(15);
        System.out.println("使用沒有參數的建構子，Animal物件已建立....");
    }
     
     
    public int getAge() {
        return age;
    }
 
    public void setAge(int n) {
        if (n < 0) {
            age = 1;
        }
        else {
            age = n;
        }
    }
     
    public int getWeight() {
        return weight;
    }
     
    public void setWeight(int n) {
        if (n < 0) {
            weight = 1;
        }
        else {
            weight = n;
        }
    }
     
    public void speak() {
        System.out.println("哈囉，我已經" + getAge() + "歲，有" + getWeight() + "公斤重");
    }
}
 
class JungleDemo3 {
    public static void main(String[] args) {
        Animal puppy1 = new Animal(6, 70);
        puppy1.speak();
         
        Animal puppy2 = new Animal(142);
        puppy2.speak();
         
        Animal puppy3 = new Animal();
        puppy3.speak();
    }
}