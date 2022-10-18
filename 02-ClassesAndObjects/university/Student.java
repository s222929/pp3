public class Student{
    String name;
    int age;
    int id;
    boolean isValid;
    double avg;
    int semestr;
    String studentId;
    //Object Behaiviours(methods)
    public void sayHello(){
        System.out.println("Hello World!");
    }
    public void displayName(){
        System.out.println("My name is "+ name);
    }
    public void displayAge(){
        System.out.println("My age is "+ age);
    }
    public void displayAll(){
        System.out.println("My name is "+ name+ "My semestr number is:"+ semestr+"My average grade:"+avg+"My student ID"+id);
    
    }
    public void display1(){
    isValid= !isValid;
    }
    public void display2(){
     System.out.println("Age is: "+age+"Id is: "+semestr);
    }
    public void displayValidity(){
        System.out.println("My name is" + name);
        System.out.println("Card validity is" + isValid);
        
    }
    public static void main(String[] args){
    Student student1 = new Student();
    student1.name = "Kostya";
    student1.age = 18;
    student1.studentId = "222929";
    student1.isValid = true;
    student1.semestr = 3;
    student1.avg = 4;
    student1.display1();
    student1.display2();
}
    
    
    
}