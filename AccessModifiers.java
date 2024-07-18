import java.util.Scanner;
public class AccessModifiers {
    public int publicField = 1;
    protected int protectedField = 2;
    int defaultField = 3;
    private int PrivateField = 4;

    public void publicMethod() {
        System.out.println("Public Method");
        //accessing all fields from same class
        
    }
}


/*
public: 
      accessible by any other class
      members: members(fields, methods) 

protected:
      classes can not be declared as protected, it can only be used by packages
      members declared as 'protected' are accessible within the same package and by subclasses (even if they are in different packages)

default(no modifier):
      accessible only within the same package

private: 
      classes can not be declared as private
      memebers declared as 'private' are accessible only wihtin the same class

 */