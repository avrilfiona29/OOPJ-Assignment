public class Subject {
    private String subjectName;
    private String subjectCode;

    // Constructor
    public Subject(String subjectName, String subjectCode) {
        this.subjectName = subjectName;
        this.subjectCode = subjectCode;
    }

    // Getters
    public String getSubjectName() {
        return subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    // Setters
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    // toString method
    @Override
    public String toString() {
        return subjectCode + " - " + subjectName;
    }
}
