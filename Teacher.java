public class Teacher {
    private String teacherName;
    private String subjectCode;

    // Constructor
    public Teacher(String teacherName, String subjectCode) {
        this.teacherName = teacherName;
        this.subjectCode = subjectCode;
    }

    // Getters
    public String getTeacherName() {
        return teacherName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    // Setters
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    // toString method
    @Override
    public String toString() {
        return teacherName + " teaches " + subjectCode;
    }
}
