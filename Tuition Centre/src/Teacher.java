public class Teacher {
    // data
    private Name name;
    private String ic;
    private String address;
    private int numyearexp;
    private String datejoined;
    private int numofyearincenter;
    private String qualification;

    // constructors
    public Teacher() {

    }

    // setters or getters
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

    public void setNumyearexp(int numyearexp) {
        this.numyearexp = numyearexp;
    }

    public int getNumyearexp() {
        return numyearexp;
    }

    public void setDatejoined(String datejoined) {
        this.datejoined = datejoined;
    }

    public String getDatejoined() {
        return datejoined;
    }

    public void setNumofyearincenter(int numofyearincenter) {
        this.numofyearincenter = numofyearincenter;
    }

    public int getNumofyearincenter() {
        return numofyearincenter;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }


}
