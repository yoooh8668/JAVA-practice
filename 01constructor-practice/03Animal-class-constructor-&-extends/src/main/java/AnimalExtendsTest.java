class Animal {
    public void run(int units) { 
        System.out.println("動物移動" + units + "步"); 
    } 
}

class Dog extends Animal {  
    @Override  
    //@Override字樣 

    public void run(int units){  
        System.out.println("狗狗跑" + units + "步");  
    }
} 

class Cat extends Dog {  
    @Override  
    //@Override字樣 

    public void run(int units){  
        System.out.println("貓貓跑" + units + "步");  
    }
} 

/*
Cat繼承自Dog, Dog繼承自Animal
實做時==>子class可以當建構子實做父class
反之則不行
*/

public class AnimalExtendsTest {  

    public static void main(String[] args) {  

        Animal animalAnimal = new Animal();
        System.out.println("animalAnimal");  
        animalAnimal.run(1);

        Animal animalDog = new Dog(); //animalDog為Dog的實例  
        System.out.println("animalDog");  
        animalDog.run(2);  

        Animal animalCat = new Cat(); // animalCat為Cat的實例  
        System.out.println("animalCat");  
        animalCat.run(3);

        Dog dogDog = new Dog(); // dogDog為Dog的實例  
        System.out.println("dogDog");  
        dogDog.run(4);  

        Cat catCat = new Cat(); // catCat為Cat的實例  
        System.out.println("catCat");  
        catCat.run(5);

//        Cat catDog = new Dog(); // catDog為Dog的實例  
//        catDog.run(6);
//        由於Dog是Cat的父class，無法使用父class當建構子實做子class
//        表示Dog dogAnimal = new Animal();
//        或者Cat catAnimal = new Animal();
//        都是不行的

        Dog dogCat = new Cat(); // dogCat為Cat的實例  
        System.out.println("dogCat");  
        dogCat.run(7);

        System.out.println("實做時以建構子的函式(override後)為主");  
        
    }  

} 