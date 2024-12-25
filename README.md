# OOPJ-Assignment

# Timetable Management System
Link:https://www.youtube.com/watch?v=H7BzoyVbK5Q
## Software Requirements

1. **Java Development Kit (JDK)**: Version 8 or above is required to compile and run the project.
2. **IDE (Integrated Development Environment)**: 
   - IntelliJ IDEA, Eclipse, or any other IDE supporting Java.
3. **Operating System**: The project can be run on any operating system that supports Java, such as:
   - Windows
   - macOS
   - Linux
4. **Text File (input1.txt)**: The project requires an input text file (`input1.txt`) that contains the timetable data in a specified format.

---

## List of Classes and Interfaces

### 1. **TestClass**
   - **Attributes**: None (only contains the main method)
   - **Methods**:
     - `public static void main(String[] args)` - The entry point of the program that initializes the timetable, reads from `input1.txt`, adds the schedule entries, displays the timetable, and saves it to `output.txt`.

### 2. **Timetable**
   - **Attributes**:
     - `private final ArrayList<String[]> schedule`: A list of schedule entries, where each entry contains an array of day, time, subject, and teacher.
   - **Methods**:
     - `public Timetable()`: Constructor that initializes the schedule.
     - `public void addSchedule(String day, String time, String subject, String teacher)`: Adds a new schedule entry to the timetable.
     - `public void displaySchedule()`: Displays the timetable in a formatted table on the console.
     - `public void saveToFile(String filename)`: Saves the timetable to a file in the same format as displayed on the console.

### 3. **Subject**
   - **Attributes**:
     - `private String subjectName`: The name of the subject.
     - `private String subjectCode`: The code of the subject.
   - **Methods**:
     - `public Subject(String subjectName, String subjectCode)`: Constructor to initialize a subject with a name and code.
     - `public String getSubjectName()`: Returns the name of the subject.
     - `public String getSubjectCode()`: Returns the code of the subject.
     - `public void setSubjectName(String subjectName)`: Sets the name of the subject.
     - `public void setSubjectCode(String subjectCode)`: Sets the code of the subject.
     - `@Override public String toString()`: Returns the subject information in the format "subjectCode - subjectName".

### 4. **Teacher**
   - **Attributes**:
     - `private String teacherName`: The name of the teacher.
     - `private String subjectCode`: The code of the subject the teacher is assigned to.
   - **Methods**:
     - `public Teacher(String teacherName, String subjectCode)`: Constructor to initialize a teacher with a name and subject code.
     - `public String getTeacherName()`: Returns the name of the teacher.
     - `public String getSubjectCode()`: Returns the code of the subject taught by the teacher.
     - `public void setTeacherName(String teacherName)`: Sets the name of the teacher.
     - `public void setSubjectCode(String subjectCode)`: Sets the subject code assigned to the teacher.
     - `@Override public String toString()`: Returns the teacher information in the format "teacherName teaches subjectCode".

---

## Instructions for Running the Project

1. **Prepare the Input File**:
   - The input file (`input1.txt`) should contain data in the following format:
     ```
     Day Time Subject Teacher
     ```
     Example:
     ```
     Monday 09:00 Math Mr. Smith
     Tuesday 10:00 Science Mrs. Johnson
     ```

2. **Run the Program**:
   - Compile and run the `TestClass` class. It will:
     - Read the input data from `input1.txt`.
     - Add the entries to the timetable.
     - Display the timetable on the console.
     - Save the timetable to `output.txt`.

3. **Output**:
   - The timetable will be displayed in the following format:
     ```
     +------------+-------------+-----------------+----------------+
     |    Day     |    Time     |     Subject     |    Teacher     |
     +------------+-------------+-----------------+----------------+
     | Monday     | 09:00       | Math            | Mr. Smith      |
     | Tuesday    | 10:00       | Science         | Mrs. Johnson   |
     +------------+-------------+-----------------+----------------+
     ```

   - The timetable will also be saved in the same format to the `output.txt` file.

---

## Additional Notes

- Ensure that the `input1.txt` file is in the same directory as the compiled Java files.
- The program assumes that the input file follows the correct format with each line containing exactly 4 parts: day, time, subject, and teacher.
- If there are invalid lines in the input (less than 4 parts), they will be skipped, and a message will be printed indicating that the line was skipped.

---

This README provides a complete overview of the Timetable Management System project, including the software requirements, a description of the classes and their methods, and instructions for running the program.

---

We have taken reference from ChatGPT and also taken help from our classmate Abhishek Kini. 

---
Linkedin Profiles:
https://www.linkedin.com/in/avril-fiona-8410792b3/
https://www.linkedin.com/in/gagana-nayak-74225733b/
https://www.linkedin.com/in/deeksha-k-ab4a1033a

