/*
 * because of the exams and
 * the lack of time, I did not
 * fix the errors in the code
 * I am sorry for that
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    
    // method to printing the area of the greenhouse
    public static void printArea(Section[] sections){
        int area = 0;
        for(int i = 0; i < sections.length; i++){
            area += sections[i].getArea();
        }
        System.out.println("The area of the greenhouse is " + area + " square meters.");
    }

    // method to printing the average temperature of the greenhouse
    public static void printAvgTemp(Section[] sections){
        double avgTemp = 0;
        for(int i = 0; i < sections.length; i++){
            avgTemp += sections[i].getTempRange().getAvgTemp();
        }
        avgTemp /= sections.length;
        System.out.println("The average temperature of the greenhouse is " + avgTemp + " degrees Celsius.");
    }

    // method to printing every plant in the greenhouse
    public static void printPlants(Section[] sections){
        for(int i = 0; i < sections.length; i++){
            System.out.println("Section " + (i+1) + ":");
            for(int j = 0; j < sections[i].getPlants().length; j++){
                System.out.println(sections[i].getPlants()[j].toString());
            }
        }
    }

    // methode to printing every avalible plant in the greenhouse
    public static void printAvaliblePlants(Section[] sections){
        for(int i = 0; i < sections.length; i++){
            System.out.println("Section " + (i+1) + ":");
            for(int j = 0; j < sections[i].getPlants().length; j++){
                if(sections[i].getPlants()[j].getTempRange().isAvalible()){
                    System.out.println(sections[i].getPlants()[j].toString());
                }
            }
        }
    }

    // method to printing plant information off of a file
    public static void printPlantInfo(Section[] sections){
        try{
            Scanner input = new Scanner(new File("plants.txt"));
            while(input.hasNextLine()){
                String line = input.nextLine();
                String[] info = line.split(",");
                for(int i = 0; i < sections.length; i++){
                    for(int j = 0; j < sections[i].getPlants().length; j++){
                        if(sections[i].getPlants()[j].getName().equals(info[0])){
                            System.out.println(sections[i].getPlants()[j].toString());
                        }
                    }
                }
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
    }

    // main method
    public static void main(String[] args) {
        // create a new section
        Section[] sections = new Section[3];
        sections[0] = new Section(100, new TempRange(20, 30));
        sections[1] = new Section(200, new TempRange(20, 30));
        sections[2] = new Section(300, new TempRange(20, 30));
        sections[0].setPlants(new Plant[]{new Plant("Cactus", new TempRange(20, 30)), new Plant("Cactus", new TempRange(20, 30)), new Plant("Cactus", new TempRange(20, 30))});
        sections[1].setPlants(new Plant[]{new Plant("Cactus", new TempRange(20, 30)), new Plant("Cactus", new TempRange(20, 30)), new Plant("Cactus", new TempRange(20, 30))});
        sections[2].setPlants(new Plant[]{new Plant("Cactus", new TempRange(20, 30)), new Plant("Cactus", new TempRange(20, 30)), new Plant("Cactus", new TempRange(20, 30))});
        // print the area of the greenhouse
        printArea(sections);
        // print the average temperature of the greenhouse
        printAvgTemp(sections);
        // print every plant in the greenhouse
        printPlants(sections);
        // print every avalible plant in the greenhouse
        printAvaliblePlants(sections);
        // print plant information off of a file
        printPlantInfo(sections);
    }
}
