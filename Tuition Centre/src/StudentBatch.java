// class for list of students
public class StudentBatch {
    // --data section--

    // what is a StudentBatch?
    // a StudentBatch is a list of students registered in a batch
    // "list of students" ??? --> an array of student

    private Student students[] = new Student[10];
    private int currsz = 0;

    public int getCurrsz() {
        return currsz;
    }

    // --operation or methods--

    // constructor
    public StudentBatch() {

    }

    // method to add student into the array of students
    public void add(Student s) {
        students[currsz] = s;
        currsz++;
    }

    // find a particular student
    // return data type is boolean, parameter is string
    public boolean find(String name) {
        // loop through the array of students
        // for each student in students[]
        // check whether the name is the same as that in student[]
        for (int i=0; i<currsz; i++) {
            if (students[i].getName().getFName() == name)
                return true;
        }
        return false;
    }
}
