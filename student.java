public class student {
    String name;
    int age;

    public student(String n, int a) {
        name = n;
        age = a;
        System.out.println("dont run");
    }

    public void print(){
        System.out.println("hi, i am " + name + " age " +  age);
    }
}
