package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FeaturesCalculator {
    private ArrayList<ArrayList<Integer>> binary_mask;
    private Integer[] massCenter;
    private String filename;
    private int fullCells;

    public FeaturesCalculator(String filename){
        this.filename = filename;
        this.binary_mask = new ArrayList<ArrayList<Integer>>();
        this.massCenter = new Integer[2];
        this.fullCells = 0;
    }

    public void read_data(){
        try {
            File file = new File(filename);
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNextLine()){
                String data = fileReader.nextLine();
                ArrayList<Integer> dataArray = new ArrayList<Integer>();
                for (int i = 0; i < data.length(); i++) {
                    if (data.charAt(i)!= ' '){
                         if(((int) data.charAt(i)) == 48){
                             dataArray.add(0);
                         }else {
                             dataArray.add(1);
                             fullCells++;
                         }
                    }
                }
                binary_mask.add(new ArrayList<Integer>(dataArray));
            }
            fileReader.close();
        } catch (FileNotFoundException e){
            System.out.println("nie znaleziono pliku!");
            e.printStackTrace();
        }
    }

    public void calculate_mass_center(){

        massCenter[0] = 0;
        massCenter[1] = 0;

        for (int i = 0; i < binary_mask.size(); i++) {
            for (int j = 0; j < binary_mask.get(i).size(); j++) {
                if (binary_mask.get(i).get(j) == 1){
                    massCenter[0] += i;
                    massCenter[1] += j;
                }
            }
        }

        massCenter[0] = massCenter[0]/fullCells;
        massCenter[1] = massCenter[1]/fullCells;

    }

    public void save_results(){
        try{
            FileWriter fileWriter = new FileWriter(filename.replaceAll("\\.(txt)", "")+"_out.txt");
            String toWrite = "P:"+massCenter[1]+";"+massCenter[0];
            fileWriter.write(toWrite);
            fileWriter.close();
        }catch (IOException e){
            System.out.println("błąd");
            e.printStackTrace();
        }

    }

    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);
        System.out.println("podaj nazwe pliku:");
        String filename = scan.nextLine();
        System.out.println(System.getProperty("user.dir")+filename);
        scan.close();
        FeaturesCalculator calculator = new FeaturesCalculator(filename);
        calculator.read_data();
        calculator.calculate_mass_center();
        calculator.save_results();

    }

}
