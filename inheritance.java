class parent {
    void display() {
        System.out.println("This is the parent class.");
    }
}
class child extends parent {
    void display() {
        System.out.println("This is the child class.");
    }
}
public class inheritance {
public static void main(String args[]) {
    parent obj1 = new parent();
    obj1.display();
    child obj2 = new child();
    obj2.display();
}
}
