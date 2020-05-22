import static java.lang.System.*;

class Animal {
    private int age;
    private int weight;
     
    public Animal(int a, int w) {
        this.age = a;
        this.weight = w;
    }
    
    //如果需要使用 this ，必須放在建構子定義中的第一行。
    public Animal(int w) {
        //this(3, w);
        this.age = 3;
        this.weight = w;
        speak();
        System.out.println("TESTTEST");
        
    }
     
    public Animal() {
        //this(3, 15);
        this.age = 3;
        this.weight = 15;
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
        puppy1.getWeight();
        puppy1.setWeight(100);
        puppy1.getAge();
        puppy1.setAge(100);
        puppy1.speak();
        
        Animal puppy2 = new Animal(142);
        puppy2.speak();
        puppy2.getWeight();
        puppy2.setWeight(100);
        puppy2.getAge();
        puppy2.setAge(100);
        puppy2.speak();
                 
        Animal puppy3 = new Animal();
        puppy3.speak();
        puppy3.getWeight();
        puppy3.setWeight(100);
        puppy3.getAge();
        puppy3.setAge(100);
        puppy3.speak();
        
    }
}