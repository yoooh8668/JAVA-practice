class AnimalOuter {
    int x = 10;
    public void run(int units) {
        System.out.println("動物(外部)移動" + units + "步");
    }
    class AnimalInner{
        public void run() {
            System.out.println("動物(內部)移動" + x + "步");
        }
    }
    static class AnimalInnerStatic{
        public void run(int uints) {
            System.out.println("動物(內部static)移動" + uints + "步");
        }
    }
}

public class AnimalInnerClassTest {
    public static void main(String[] args) {
        //static inner class
        //Can access it without creating an object of outerclass
        //InnerClassStatic still should be creat.
        //ClassOuter.ClassInner sName = new ClassOuter.ClassInner();
        System.out.println("InnerClassStatic");
        AnimalOuter.AnimalInnerStatic animalInnerStatic = new AnimalOuter.AnimalInnerStatic();
        animalInnerStatic.run(1);
        
        AnimalOuter animalOuter = new AnimalOuter();
        System.out.println("\nOuterClass");
        animalOuter.run(2);
        
        //normal innerclass should be creat after outerclass.
        //need to be created with sClassName of ClassOuter
        //ClassOuter.ClassInner sInnerName = sOuterName.new ClassInner();
        AnimalOuter.AnimalInner animalInner = animalOuter.new AnimalInner();
        System.out.println("\nInnerClass");
        animalInner.run();
        //ClassInner can access the variable of ClassOuter(x).
    }

}
