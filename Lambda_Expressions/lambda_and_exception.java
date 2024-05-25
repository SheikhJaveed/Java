
interface Student {
    void studentData(String name) throws Exception;
}
public class lambda_and_exception {
    public static void main(String[] args) {
        // lamba expression
        /*The name parameter is part of the lambda expression and
         represents the input parameter to the studentData method.*/
        Student student = name -> {
            System.out.println("The Student name is: " + name);
            throw new Exception();
        };
        try {
            student.studentData("Adithya");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}