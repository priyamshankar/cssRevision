public class StudentMarksCard {

    private String studentName;
    private String rollNumber;
    private int englishMarks;
    private int mathMarks;
    private int scienceMarks;

    // Constructor
    public StudentMarksCard(String studentName, String rollNumber, int englishMarks, int mathMarks, int scienceMarks) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.englishMarks = englishMarks;
        this.mathMarks = mathMarks;
        this.scienceMarks = scienceMarks;
    }

    // Getters and Setters
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getEnglishMarks() {
        return englishMarks;
    }

    public void setEnglishMarks(int englishMarks) {
        this.englishMarks = englishMarks;
    }

    public int getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(int mathMarks) {
        this.mathMarks = mathMarks;
    }

    public int getScienceMarks() {
        return scienceMarks;
    }

    public void setScienceMarks(int scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    // Method to calculate total marks
    public int getTotalMarks() {
        return englishMarks + mathMarks + scienceMarks;
    }

    // Method to calculate average marks
    public double getAverageMarks() {
        return getTotalMarks() / 3.0;
    }

    // Method to calculate grade
    public String getGrade() {
        double average = getAverageMarks();
        if (average >= 90) {
            return "A+";
        } else if (average >= 80) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display marks card
    public void displayMarksCard() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("English Marks: " + englishMarks);
        System.out.println("Math Marks: " + mathMarks);
        System.out.println("Science Marks: " + scienceMarks);
        System.out.println("Total Marks: " + getTotalMarks());
        System.out.println("Average Marks: " + getAverageMarks());
        System.out.println("Grade: " + getGrade());
    }
}