/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myeditor;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.event.WindowEvent;
import javax.swing.*; 
import java.io.*; 
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.undo.UndoManager;



public class Myeditor {

     public static void main(String[] args) {
        
        try {
    UIManager.setLookAndFeel( new FlatDarkLaf() );
} catch( Exception ex ) {
    System.err.println( "Failed to initialize LaF" );
}
        
        myJframe f=new myJframe();
        f.setBounds(0,0,700,500);
        f.setTitle("Notepad");
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        
        
        
       // UndoManager um=new UndoManager();
    
    //Oops undoRedo=new Oops(f);
    
    

    } 
    
    }
