class Student {
    private String firstName;
    private String lastName;
    private String indexNumber;
    private int attendance;
    private int grade;

    public Student(String firstName, String lastName, String indexNumber, int attendance, int grade) {
        if (firstName != null) {
            this.firstName = firstName;
        } else {
            this.firstName = "Unknown";
        }
        if (lastName != null) {
            this.lastName = lastName;
        } else {
            this.lastName = "Unknown";
        }
        this.indexNumber = indexNumber;
        this.attendance = attendance;
        if (attendance < 50) {
            this.grade = 2;
        } else {
            this.grade = grade;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
        if (attendance < 50) {
            this.grade = 2;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Jan", "Kowalski", "123456", 70, 4);
        System.out.println(student1.getFirstName()); // Jan
        System.out.println(student1.getLastName()); // Kowalski
        System.out.println(student1.getIndexNumber()); // 123456
        System.out.println(student1.getAttendance()); // 70
        System.out.println(student1.getGrade()); // 4

        Student student2 = new Student(null, null, "654321", 40, 3);
        System.out.println(student2.getFirstName()); // Unknown
        System.out.println(student2.getLastName()); // Unknown
        System.out.println(student2.getIndexNumber()); // 654321
        System.out.println(student2.getAttendance()); // 40
        System.out.println(student2.getGrade()); // 2

        student1.setFirstName("Adam");
        student1.setLastName("Nowak");
        student1.setAttendance(30);
        System.out.println(student1.getFirstName()); // Adam
        System.out.println(student1.getLastName()); // Nowak
        System.out.println(student1.getIndexNumber()); // 123456
        System.out.println(student1.getAttendance()); // 30
        System.out.println(student1.getGrade()); // 2

        student2.setFirstName("Anna");
        student2.setLastName("Kowalczyk");
        student2.setGrade(5);
        System.out.println(student2.getFirstName()); // Anna
        System.out.println(student2.getLastName()); // Kowalczyk
        System.out.println(student2.getIndexNumber()); // 654321
        System.out.println(student2.getAttendance()); // 40
        System.out.println(student2.getGrade()); // 5
    }
}