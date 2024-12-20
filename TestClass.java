import java.io.BufferedReader;
import java.io.FileReader;

public class TestClass {
    public static void main(String[] args) {
        Timetable timetable = new Timetable();

        try (BufferedReader reader = new BufferedReader(new FileReader("input1.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim(); // Remove leading/trailing spaces
                if (line.isEmpty()) continue; // Skip empty lines

                String[] parts = line.split(" ");
                if (parts.length < 4) {
                    System.out.println("Skipping invalid line: " + line);
                    continue; // Skip lines with fewer than 4 parts
                }

                String day = parts[0];
                String time = parts[1];
                String subject = parts[2];
                String teacher = parts[3];

                // Add schedule entry
                timetable.addSchedule(day, time, subject, teacher);
            }
        } catch (Exception e) {
            System.out.println("Error reading input file: " + e.getMessage());
        }

        // Display the timetable
        timetable.displaySchedule();

        // Save the timetable to an output file
        timetable.saveToFile("output.txt");
    }
}
