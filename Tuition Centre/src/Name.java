// make a separate class for name because main becomes complicated (got first name, middle name and last name)

public class Name {
    private String fname;   // local to the class
    private String lname;
    private String mname;

    // Blank Constructor
    public Name() {

    }

    // Constructor
    // no return type, name same as class
    public Name(String fname, String mname, String lname) {
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
    }

    public void setFName(String fname) {
        // public means it can be called anywhere within the project
        // attributes normally private
        // 'this' refers to the class attributes
        this.fname = fname;
    }

    public String getFName() {
        return fname;
    }

    public void setMName(String mname) {
        // 'this' refers to the class attributes
        this.mname = mname;
    }

    public String getMName() {
        return mname;
    }

    public void setLName(String lname) {
        // 'this' refers to the class attributes
        this.lname = lname;
    }

    public String getLName() {
        return lname;
    }
}
