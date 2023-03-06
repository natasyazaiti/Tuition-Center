public class TeacherList {
    private Teacher teachers[] = new Teacher[10];
    private int teachercount = 0;

    public TeacherList() {

    }

    public int getTeachercount() {
        return teachercount;
    }

    public void add(Teacher t) {
        teachers[teachercount] = t;
        teachercount++;
    }
}
