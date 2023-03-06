// this class represent one student

public class Student {
    // ---data/attributes---
    private Name name;  // class in a class, class 'Name' in class 'Student'
    private String ic;
    private String address;
    private String year;
    private String schoolname;
    private float marks[] = new float[5];

    // constructors
    public Student() {

    }

    // setters & getters
    public void setName(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getIc() {
        return ic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public String getSchoolname() {
        return schoolname;
    }

    // methods or operations
    public float calcAvg() {
        float sum = 0;
        for (int i=0; i<marks.length; i++) {
            sum += marks[i];
        }
        float avg = sum / marks.length;
        return avg;
    }

    public float calcMin() {
        float min = 100;
        for (int i=0; i<marks.length; i++) {
            if (marks[i] < min)
                min = marks[i];
        }
        return min;
    }

    public float calcMax() {
        float max = 0;
        for (int i=0; i<marks.length; i++) {
            if (marks[i] > max)
                max = marks[i];
        }
        return max;
    }

    public void setMark(float mark, int i) throws Exception {
        if (mark < 0) {
            throw new Exception("Error in mark detected");
        }
        marks[i] = mark;
    }

    void displayMarks() {
        // print the marks
        for (int i=0; i<marks.length; i++) {
            System.out.println("marks at index " + i + ": " + marks[i]);
        }
    }

    public static void main(String args[]) {
        Student stud0 = new Student();
        try {   // try block, something in here can cause exception
            stud0.setMark(10, 0);
            stud0.setMark(-10, 1);
        } catch (Exception ex) {    // catch block, action to be taken
                                    // in case of Exception
            System.out.println("Cannot continue");
            ex.printStackTrace();
        }
        stud0.displayMarks();
    }

    // this one not sure if correct or not
    public float getMark(int i) {
        return marks[i];
    }

}
