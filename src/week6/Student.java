package week6;

import sun.util.calendar.BaseCalendar;

import java.util.Date;

public class Student {
    private int student_id;
    private String  first_name;
    private String last_name;
    private Date birth_date;
    private Enum gender; //Enum
    private String address;
    private String  city;
    private String cell_phone;
    private String email;
    private String department;
    private float  marks[];
    private float total_marks;
    private float percentage;
    private String grade; //A, A+

    public Student(int student_id, String first_name, String last_name, Date birth_date, Enum gender, String address, String city, String cell_phone, String email, String department, float[] marks, float total_marks, float percentage, String grade) {
        this.student_id = student_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.birth_date = birth_date;
        this.gender = gender;
        this.address = address;
        this.city = city;
        this.cell_phone = cell_phone;
        this.email = email;
        this.department = department;
        this.marks = marks;
        this.total_marks = total_marks;
        this.percentage = percentage;
        this.grade = grade;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setFullName(String last_name) {
        this.last_name = last_name;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public Enum getGender() {
        return gender;
    }

    public void setGender(Enum gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCell_phone() {
        return cell_phone;
    }

    public void setCell_phone(String cell_phone) {
        this.cell_phone = cell_phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float[] getMarks() {
        return marks;
    }

    public void setMarks(float[] marks) {
        this.marks = marks;
    }

    public float getTotal_marks() {
        return total_marks;
    }

    public void setTotal_marks(float total_marks) {
        this.total_marks = total_marks;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
