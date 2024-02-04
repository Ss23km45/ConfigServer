class Test123 {
    public void test() {
    }
}

class Base1 extends Test123 {
    public void test() {
         System.out.println("Base1");
    }
}

class Base2 extends Test123 {
    public void test() {
         System.out.println("Base2");
    }
}

public class Base {
    public static void main(String[] args) {
		/*
		 * Test123 obj = new Base1(); ((Base2) obj).test(); // CAST
		 */        
        String s = new String("5");
        System.out.println(1 + 10 + s + 1 + 10);
    }
}