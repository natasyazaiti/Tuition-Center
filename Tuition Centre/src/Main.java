public class Main
{
    // application code
    public static void main(String[] args) throws Exception {

        Student jennie = new Student();
        Name name = new Name();
        name.setFName("Jennie");
        name.setMName("Ruby");
        name.setLName("Jane");
        jennie.setName(name);
        jennie.setIc("020304057482");
        jennie.setAddress("Kajang, Selangor");
        jennie.setYear("2023");
        jennie.setSchoolname("SMK Sri Bangi");

        Student aisyah = new Student();
        name = new Name();
        name.setFName("Aisyah");
        name.setMName("Dania");
        name.setLName("Romzi");
        aisyah.setName(name);
        aisyah.setIc("052304043222");
        aisyah.setAddress("Semenyih, Selangor");
        aisyah.setYear("2023");
        aisyah.setSchoolname("SMK Seksyen 3");

        Student nur = new Student();
        name = new Name("Nur", "Kamalia", "Zamri");
        nur.setName(name);
        nur.setIc("02030402890346");
        nur.setAddress("Hulu Langat, Selangor");
        nur.setYear("2023");
        nur.setSchoolname("SMK Jalan Tiga");

        // creating a batch object
        // StudentBatch 2023;   ~~if write like this, it become null. must put "new"
        StudentBatch sb2023 = new StudentBatch();
        sb2023.add(jennie);   // this is an add method
        sb2023.add(aisyah);
        sb2023.add(nur);

        // declare a method that allows for the following:
        // to find if a student named Nur exist in the batch
        boolean isIn = sb2023.find("Nur");

        // creating object for teacher
        // setting the details for the teachers
        Teacher cikguminah = new Teacher();
        name = new Name();
        name.setFName("Minah");
        name.setMName("Binti");
        name.setLName("Mino");
        cikguminah.setName(name);
        cikguminah.setIc("020497043456");
        cikguminah.setAddress("Selangor");
        cikguminah.setNumyearexp(6);
        cikguminah.setDatejoined("2 July 2019");
        cikguminah.setNumofyearincenter(4);
        cikguminah.setQualification("Degree in Mathematics");

        Teacher cikgudini = new Teacher();
        name = new Name();
        name.setFName("Dini");
        name.setMName("Binti");
        name.setLName("Nizam");
        cikgudini.setName(name);
        cikgudini.setIc("0040301053478");
        cikgudini.setAddress("Johor");
        cikgudini.setNumyearexp(1);
        cikgudini.setDatejoined("1 February 2022");
        cikgudini.setNumofyearincenter(1);
        cikgudini.setQualification("Degree in Education");

        Teacher cikguiman = new Teacher();
        name = new Name();
        name.setFName("Iman");
        name.setMName("Binti");
        name.setLName("Hamiruce");
        cikguiman.setName(name);
        cikguiman.setIc("030492039872");
        cikguiman.setAddress("Perak");
        cikguiman.setNumyearexp(10);
        cikguiman.setDatejoined("13 January 2021");
        cikguiman.setNumofyearincenter(2);
        cikguiman.setQualification("Degree in Science");

        // creating object for teacher list
        TeacherList tlist = new TeacherList();
        //adding teacher object into list
        tlist.add(cikguminah);
        tlist.add(cikgudini);
        tlist.add(cikguiman);

        // set marks for students
        for (int i=0; i<5; i++) {
            jennie.setMark(100, i);
        }

        aisyah.setMark(10, 0);
        aisyah.setMark(30, 1);
        aisyah.setMark(50, 2);
        aisyah.setMark(70, 3);
        aisyah.setMark(90, 4);

        nur.setMark(80, 0);
        nur.setMark(70, 1);
        nur.setMark(60, 2);
        nur.setMark(50, 3);
        nur.setMark(99, 4);

        //print number of teachers in the list
        System.out.println("Number of teachers = " + tlist.getTeachercount());

        // print number of students in a batch
        System.out.println("Number of students in 2023 = " + sb2023.getCurrsz());

        // print teacher details
        System.out.println("\n--- Tutors Background ---");
        // print cikguminah teacher details
        System.out.println("Tutor Name: " + cikguminah.getName().getFName() + " " + cikguminah.getName().getMName() + " " + cikguminah.getName().getLName());
        System.out.println("IC: " + cikguminah.getIc());
        System.out.println("Address: " + cikguminah.getAddress());
        System.out.println("Number of Years of Experience: " + cikguminah.getNumyearexp() + " years");
        System.out.println("Date Joined: " + cikguminah.getDatejoined());
        System.out.println("Number of Years in Center: " + cikguminah.getNumofyearincenter());
        System.out.println("Qualification: " + cikguminah.getQualification());

        // print cikgudini teacher details
        System.out.println("\nTutor Name: " + cikgudini.getName().getFName() + " " + cikgudini.getName().getMName() + " " + cikgudini.getName().getLName());
        System.out.println("IC: " + cikgudini.getIc());
        System.out.println("Address: " + cikgudini.getAddress());
        System.out.println("Number of Years of Experience: " + cikgudini.getNumyearexp() + " years");
        System.out.println("Date Joined: " + cikgudini.getDatejoined());
        System.out.println("Number of Years in Center: " + cikgudini.getNumofyearincenter());
        System.out.println("Qualification: " + cikgudini.getQualification());

        // print cikguiman teacher details
        System.out.println("\nTutor Name: " + cikguiman.getName().getFName() + " " + cikguiman.getName().getMName() + " " + cikguiman.getName().getLName());
        System.out.println("IC: " + cikguiman.getIc());
        System.out.println("Address: " + cikguiman.getAddress());
        System.out.println("Number of Years of Experience: " + cikguiman.getNumyearexp() + " years");
        System.out.println("Date Joined: " + cikguiman.getDatejoined());
        System.out.println("Number of Years in Center: " + cikguiman.getNumofyearincenter());
        System.out.println("Qualification: " + cikguiman.getQualification());

        // print student details
        System.out.println("\n--- Students Background ---");
        // print jennie student details
        System.out.println("Student Name: " + jennie.getName().getFName() + " " + jennie.getName().getMName() + " " + jennie.getName().getLName());
        System.out.println("IC: " + jennie.getIc());
        System.out.println("Address: " + jennie.getAddress());
        System.out.println("Year: " + jennie.getYear());
        System.out.println("School Name: " + jennie.getSchoolname());

        // calculate and print the avg, min, max marks for jennie
        System.out.println("Average marks for Jennie = " + jennie.calcAvg());
        System.out.println("Minimum marks for Jennie = " + jennie.calcMin());
        System.out.println("Maximum marks for Jennie = " + jennie.calcMax());

        // print aisyah student details
        System.out.println("\nStudent Name: " + aisyah.getName().getFName() + " " + aisyah.getName().getMName() + " " + aisyah.getName().getLName());
        System.out.println("IC: " + aisyah.getIc());
        System.out.println("Address: " + aisyah.getAddress());
        System.out.println("Year: " + aisyah.getYear());
        System.out.println("School Name: " + aisyah.getSchoolname());

        // calculate and print the avg, min, max marks for aisyah
        System.out.println("Average marks for Aisyah = " + aisyah.calcAvg());
        System.out.println("Minimum marks for Aisyah = " + aisyah.calcMin());
        System.out.println("Maximum marks for Aisyah = " + aisyah.calcMax());

        // print nur student details
        System.out.println("\nStudent Name: " + nur.getName().getFName() + " " + nur.getName().getMName() + " " + nur.getName().getLName());
        System.out.println("IC: " + nur.getIc());
        System.out.println("Address: " + nur.getAddress());
        System.out.println("Year: " + nur.getYear());
        System.out.println("School Name: " + nur.getSchoolname());

        // calculate and print the avg, min, max marks for nur
        System.out.println("Average marks for Nur = " + nur.calcAvg());
        System.out.println("Minimum marks for Nur = " + nur.calcMin());
        System.out.println("Maximum marks for Nur = " + nur.calcMax());
    }
}