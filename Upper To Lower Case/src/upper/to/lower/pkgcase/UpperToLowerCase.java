/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upper.to.lower.pkgcase;

import java.util.Scanner;
import java.awt.datatransfer.*;
import java.awt.Toolkit;


public class UpperToLowerCase {

    public static void main(String[] args) {
        String Change;
        Scanner ChangeToLowerCase = new Scanner(System.in);
        System.out.println("Paste Your Essay Here!: ");
        
        Change = ChangeToLowerCase.nextLine();
        
        String Convert;
        Convert = Change.toLowerCase();
        
        
        StringSelection stringSelection = new StringSelection (Convert);
        Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
        clpbrd.setContents (stringSelection, null);
        
        System.out.println("Essay Saved To Clipbord");
    }
}
