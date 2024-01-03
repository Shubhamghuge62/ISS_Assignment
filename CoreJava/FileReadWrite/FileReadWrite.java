package com.iss;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

    public static void main(String[] args) {
        // Specify the file paths
        String inputFilePath = "C:\\Users\\shubham ghuge\\eclipse-workspace\\ISS\\src\\com\\iss\\input.txt";
        String outputFilePath = "C:\\Users\\shubham ghuge\\eclipse-workspace\\ISS\\src\\com\\iss\\output.txt";

        // Reading from a file
        try {
            // Open a FileReader to read from the input file
            FileReader fileReader = new FileReader(inputFilePath);

            // Wrap the FileReader in a BufferedReader for efficient reading
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Open a FileWriter to write to the output file
            FileWriter fileWriter = new FileWriter(outputFilePath);

            // Wrap the FileWriter in a BufferedWriter for efficient writing
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Read and write line by line
            String line;
            while ((line = bufferedReader.readLine()) != null) {
            	
                // Process the line
                String processedLine = processLine(line);

                // Write the processed line to the output file
                bufferedWriter.write(processedLine);
                
                // Add a new line for each line in the output file
                bufferedWriter.newLine();
            }

            // Close the input and output streams
            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("File read and write successful.");

        } catch (IOException e) {
            // Handle exceptions such as file not found or IO errors
            e.printStackTrace();
        }	
    }

    // Sample method to process each line (modify as needed)
    private static String processLine(String line) {
        // Converting each line to uppercase
        return line.toUpperCase();
    }
}

