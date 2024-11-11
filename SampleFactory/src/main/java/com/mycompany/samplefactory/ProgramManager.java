/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.samplefactory;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author samuelaga
 */
public class ProgramManager {
    public Date sessionStart;
    public Date sessionEnd;
    
    public void startSession(){
        
        //TODO implement this logic right
        boolean hasCustomInputOutput = "y".equals(this.getStrOptionInput("Do you want to specify the input/output folders (y/n)? \n").toLowerCase())?true:false ;
        int selectedOption;
        this.showOptions();
        while(true){
            selectedOption = this.getIntOptionInput("Faire votre choix");
            System.out.print("L'option selectionée est: "+ selectedOption + "\n");
            switch(selectedOption){
                case 0:
                    System.out.print("Option 0\n");
                    break;
                case 1:
                    //Download
                    FileManager FM = new FileManager();
                    //FM.YTDirectDownload();
                    //TODO: implement the option of specifying the input folder
                    System.out.print("Option 1\n");
                    String link=this.getStrOptionInput("Enter the yt video Link");
                    System.out.print("Given link -> "+ link + "\n");
                    break;
                case 2:
                    //Download and convert
                    System.out.print("Option 2\n");
                    break;
                case 3:
                    //convert
                    System.out.print("Option 3\n");
                    break;
                case 4:
                    //Convert all
                    System.out.print("Option 4\n");
                    break;
                case 5:
                    //Empty all
                    System.out.print("Option 5\n");
                    break;
                case 6:
                    //Empty all
                    this.showOptions();
                    break;
            }
            if(selectedOption == 0){
                break;
            }
            this.showOptions();
        }
    }
    
    
    private void showOptions(){
        //int optionInput;
        String strOptions = "Choose one of the following options \n";
        strOptions += "1- Télecharger le YT video en format mp3\n";
        strOptions += "2- Télecharger et converter le YT video au format accepté pour SP404MK2\n";
        strOptions += "3- Formater une archive mp3 qui est localisée dans les fichier d'input avec les characteristiques acceptées pour le sampleur.\n";
        strOptions += "4- Formater tous les archives mp3 dans le fichier d'input et faire leur copie dans le fichier output\n";
        strOptions += "5- Efacer les fichiers input et output.\n";
        strOptions += "6- Voir menu.\n";
        strOptions += "0- Sortir.\n";
        System.out.print(strOptions);
    }
    
    private int getIntOptionInput(String _message){
        
        System.out.println(_message);
        int optionInput;
        Scanner sInput = new Scanner(System.in);
        optionInput = sInput.nextInt();
        return optionInput;
    }
    
    private String getStrOptionInput(String _message){
        
        System.out.println(_message);
        String optionInput;
        Scanner sInput = new Scanner(System.in);
        optionInput = sInput.nextLine();
        return optionInput;
    }
    
}
