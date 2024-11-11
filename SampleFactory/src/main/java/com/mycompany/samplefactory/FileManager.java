/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.samplefactory;

// Importing Classes/Files
import java.io.*;
// Importing  specific File Class for directory access
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samuelaga
 */
public class FileManager {
    // TODO change scope of functions for this class, everything or most of it should be private
   protected String mainFolder;
   public FileManager(){
       this.mainFolder = System.getProperty("user.dir");
   }
   
   public String getMainFolder(){
       return this.mainFolder;
   }
   
   private void printMainFolder(){
       System.out.println(this.mainFolder);
   }
   
   public File[] getFilesInMain(){
       File mainDir = new File(this.mainFolder);
       try{
           File[] filesInMain = mainDir.listFiles();
           return filesInMain;
       } catch (Exception e){
           e.printStackTrace();
       }
       return null;
   }
   
   public File checkDirectory(File[] files, String targetDirectoryName){
       for(File file: files){
           if(targetDirectoryName.equals(file.getName()) && file.isDirectory()){
               try {
                   
                   System.out.println("Input directory found in path ->" + file.getCanonicalPath());
                   return file;
               } catch (IOException ex) {
                   Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
               }
           } 
       }
       return null;
   }
   
   public void downloadFile(String _VideoLink){
       try{
           Thread.sleep(1000);
       } catch (Exception e){
           e.printStackTrace();
       }
       
   }
    
}
