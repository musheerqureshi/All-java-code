package learning;

class Student{
    int rollNo;
    String studentName;
}



public class Mains {

    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.rollNo = 23;
        obj1.studentName = "Musheer";
        System.out.println(obj1.rollNo);
        System.out.println(obj1.studentName);

        Student obj2 = new Student();
        obj2.rollNo = 54;
        obj2.studentName = "Musheer Qureshi";
        System.out.println(obj2.rollNo);
        System.out.println(obj2.studentName);

    }
}
