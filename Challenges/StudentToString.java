public class StudentToString {
    String Name;
    int RollNo;
    int Class; 
    int Age;
     
    public StudentToString(String Name, int RollNo, int Class, int Age) {
        this.Name = Name;
        this.RollNo = RollNo;
        this.Class = Class;
        this.Age = Age;
    }

    @Override
    public String toString() {
        return "Student name is: " + Name;
    }
    public static void main(String[] args) {
        StudentToString student = new StudentToString("Prakash", 01, 8, 15); 
        System.out.println(student);
    }
}
