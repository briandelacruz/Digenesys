/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digenesys1;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author April
 */
public class RegularExp {
    StringBuffer strbuf = new StringBuffer();
    
    public static void main(String[] args){
        
    } 
      
    public void regExpression (String text){
        useCaseOutput ucOut = new useCaseOutput();
        if(text.contains("create ")||text.contains("Create ")){
            String []split1 = null;
            
            if(text.contains("create a"))
                split1 = text.split("create a ");
            else if (text.contains("Create a"))
                split1 = text.split("Create a ");
            else if (text.contains("Create "))
                split1 = text.split("Create ");
            else if (text.contains("create "))
                split1 = text.split("create ");
            
            String part1 = split1[1];
            String []split2 = part1.split(" with");
            String part2 = split2[0];
            
            ucOut.actorstr = split2[0];
            
            strbuf.append(part2 + "\n");
            String []split3 = part1.split(": ");
            String part3 = split3[1];
            String []split4 = part3.split("\\s.");
            String part4 = split4[0];
            strbuf.append(part4 + "\n");
            String []split5 = part3.split(",");
            
            
            for (int i=0; i<split5.length; i++){
                strbuf.append(split5[i]+ "\n");
                ucOut.act[i] = split5[i];
            }
            
            
            JOptionPane.showMessageDialog(null, "Tokens: \n" + strbuf);
            ucOut.main(null);
        }
        else{
            JOptionPane.showMessageDialog(null,"The string does not follow the format");
        }
    }
     
}
