/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan3;

/**
 *
 * @author victus
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Latihan3 {
    //define directory path  
    private static final String dir_path = "D:\\kuliah\\semester 3\\PBO (bu yuricha)\\public_file\\";
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Masukkan Nama File : ");
        String fileName = scanner.nextLine();
        String content = bacaFile(fileName);
        
        if(content == null){
            System.out.println("Error: File not found.");
        }else{
            System.out.println(content);
        }
        
    }
    
    private static String bacaFile(String fileName){    
        try{
            //concat dir path with file name
            String hensin = dir_path + fileName;

            //attempt to open the file
            File fileData = new File(hensin);
            Scanner fileReader = new Scanner(fileData);

            // Read and print the contents of the file
                System.out.println("Isi File :");
            while (fileReader.hasNextLine()) {
                String isi = fileReader.nextLine();
                System.out.println(isi);
            }
            
            //close the file reader
            fileReader.close();
            
            return "\nExecution Done!";
        }catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
            return null;
        } catch (SecurityException e) {
            System.out.println("Error: Security exception occurred.");
            return null;
        } catch (IOException e) {
            System.out.println("Error reading the file.");
            return null;
        }
        
    }
}
