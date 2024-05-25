
//static keyword means it is accessible to everyone in the program and it becomes common to all the objects
class Student{
    String name;
    static String School; //here School is common for all the students, so we made it as static

    public String changeSchool(){
        School = "newSchool";
        return School;
    }
}

public class Static_keyword {
    public static void main(String[] args) {
        Student.School = "APS"; //we can assign the value of school by using the class directly because of the static keyword
        Student s1 = new Student();
        s1.name = "tony";
        System.out.println(s1.School);
        System.out.println(s1.changeSchool());
    }
}
