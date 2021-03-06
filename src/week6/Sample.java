package week6;


import java.util.Date;

public class Sample {
    public static void main(String[] args) {
        /*Student s1 = new Student(1);
        s1.setFirstName("Pritesh");
        s1.setLastName("Patel");*/

        float[] dalveerMarks = {80, 80, 80, 80, 80};
        Student dalveer = new Student(789821,
                "Dalveer",
                "Singh",
                new Date(),
                Gender.Male,
                "String address",
                "String city",
                "String pinCode",
                "String cellPhone",
                "String email",
                "String department",
                dalveerMarks);
        dalveer.calculateTotalMarks();
        dalveer.calculatePercentage();
        dalveer.calculateGrade();


        float[] dwarkeshMarks = {90, 90, 90, 90, 90};
        Student dwarkesh = new Student(789822,
                "Dwarkesh",
                "Singh",
                new Date(),
                Gender.Male,
                "String address",
                "String city",
                "String pinCode",
                "String cellPhone",
                "String email",
                "String department",
                dwarkeshMarks);
        dwarkesh.calculateTotalMarks();
        dwarkesh.calculatePercentage();
        dwarkesh.calculateGrade();

        System.out.println("Dalveer Grades: " + dalveer.getGrade());
        System.out.println("Dwarkesh Grades: " + dwarkesh.getGrade());
    }
}
