import java.util.ArrayList;

public class Timetable {
    private final ArrayList<String[]> schedule;

    // Constructor
    public Timetable() {
        this.schedule = new ArrayList<>();
    }

    // Method to add schedule
    public void addSchedule(String day, String time, String subject, String teacher) {
        schedule.add(new String[]{day, time, subject, teacher});
    }

    // Method to display the schedule in table format
    public void displaySchedule() {
        System.out.println("+------------+-------------+-----------------+----------------+");
        System.out.println("|    Day     |    Time     |     Subject     |    Teacher     |");
        System.out.println("+------------+-------------+-----------------+----------------+");
        for (String[] entry : schedule) {
            System.out.printf("| %-10s | %-11s | %-15s | %-14s |%n",
                    entry[0], entry[1], entry[2], entry[3]);
        }
        System.out.println("+------------+-------------+-----------------+----------------+");
    }

    // Method to save schedule to a file
    public void saveToFile(String filename) {
        try (java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter(filename))) {
            writer.write(String.format("+------------+-------------+-----------------+----------------+%n"));
            writer.write(String.format("|    Day     |    Time     |     Subject     |    Teacher     |%n"));
            writer.write(String.format("+------------+-------------+-----------------+----------------+%n"));
            for (String[] entry : schedule) {
                writer.write(String.format("| %-10s | %-11s | %-15s | %-14s |%n",
                        entry[0], entry[1], entry[2], entry[3]));
            }
            writer.write(String.format("+------------+-------------+-----------------+----------------+%n"));
            System.out.println("Timetable saved to " + filename);
        } catch (Exception e) {
            System.out.println("Error saving timetable: " + e.getMessage());
        }
    }
}
