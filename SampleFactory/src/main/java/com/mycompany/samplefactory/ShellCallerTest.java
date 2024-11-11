/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.samplefactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author samuelaga
 */
public class ShellCallerTest {
    
    public void shellCall(){
        String[] cmd = new String[] {"src/main/resources/ytdownload.sh","a","b"};
        ProcessBuilder pb = new ProcessBuilder(cmd);
        try{
            Process p = pb.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String s = null;
            while((s = reader.readLine()) != null){
                System.out.println(s);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
