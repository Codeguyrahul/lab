package lab_6_April;

import java.io.*;

public class FileReadWrite {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String choice;
        System.out.println("Enter 1 to store data or 2 to print data from file:");
        try {
            choice = br.readLine();
            switch (choice) {
                case "1":
                    System.out.println("Enter the data to be stored in file:");
                    String data = br.readLine();
                    FileWriter fw = new FileWriter("C:\\lab_6_April_1.txt");
                    fw.write(data);
                    fw.close();
                    System.out.println("Data stored successfully in file.");
                    break;
                case "2":
                    File f = new File("H:\\\\lab_6_April_1.txt");
                    if (!f.exists()) {
                        System.out.println("File does not exist.");
                    } else {
                        BufferedReader fileReader = new BufferedReader(new FileReader(f));
                        String l;
                        while ((l = fileReader.readLine()) != null) {
                            System.out.println(l);
                        }
                        fileReader.close();
                    }
                    break;
                default:
                    System.out.println("Invalid input. Please enter either 1 or 2.");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

