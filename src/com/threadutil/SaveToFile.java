package com.threadutil;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToFile {
    public static void main(String[] args) {
        String data = "Employee Name: Peter Sam Joes \nDepartment: Sales \nDesignation: Manager \nSalary: 35000";

        try {
            FileWriter writer = new FileWriter("data.txt");
            writer.write(data);
            writer.close();
            System.out.println("Data has been saved to the file.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}