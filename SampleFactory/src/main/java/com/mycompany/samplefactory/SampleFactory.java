/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.samplefactory;

import java.io.File;

/**
 *
 * @author samuelaga
 */
public class SampleFactory {

    public static void main(String[] args) {
        //ProgramManager pm = new ProgramManager();
        //pm.startSession();
        //ShellCallerTest SCT = new ShellCallerTest();
        //SCT.shellCall();
        //System.out.print(System.getProperty("user.dir"));
        FileManager FMTest = new FileManager();
        System.out.println(FMTest.getMainFolder());
        File[] filesinmain = FMTest.getFilesInMain();
        System.out.println(filesinmain.length);
        File testInput = FMTest.checkDirectory(filesinmain,"input");
        if(testInput == null){System.out.println("No input Folder");}
    }
}
