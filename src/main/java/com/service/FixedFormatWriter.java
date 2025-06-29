package src.main.java.com.service;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FixedFormatWriter {

    public static void main(String[] args) throws IOException {
        String filename = "customer.dat";

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(formatRecord("ID", "Name", "Balance"));
            writer.newLine();

            writer.write(formatRecord("0001", "Thiago Souza", "1250.75"));
            writer.newLine();
            writer.write(formatRecord("0002", "Gabi", "500.25"));
            writer.newLine();
            System.out.println("File created successfully: " + filename);
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }

    private static String formatRecord(String id, String name, String balance){
        String formattedId = String.format("%-10s", id).substring(0, 10);
        String formattedName = String.format("%-30s", name).substring(0, 30);
        String formattedBalance = String.format("%-9s", balance).substring(0, 9);

        return formattedId + formattedName + formattedBalance;
    }
}