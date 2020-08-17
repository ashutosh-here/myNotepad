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
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;
import javax.swing.text.Document;
public class myJframe extends javax.swing.JFrame {

    /**
     * Creates new form myJframe
     */
   
    public myJframe() {
        initComponents();
        
       
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txt = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        New = new javax.swing.JMenuItem();
        Open = new javax.swing.JMenuItem();
        Save = new javax.swing.JMenuItem();
        Print = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();
        cut = new javax.swing.JMenuItem();
        copy = new javax.swing.JMenuItem();
        paste = new javax.swing.JMenuItem();
        Oops = new javax.swing.JMenu();
        Undo = new javax.swing.JMenuItem();
        Redo = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("images/notebook.png")).getImage());

        txt.setColumns(20);
        txt.setFont(new java.awt.Font("Source Code Pro Black", 0, 18)); // NOI18N
        txt.setRows(5);
        txt.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(txt);

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        File.setText("File");
        File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileActionPerformed(evt);
            }
        });

        New.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        New.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myeditor/images/new.png"))); // NOI18N
        New.setText("New");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        File.add(New);

        Open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myeditor/images/add.png"))); // NOI18N
        Open.setText("Open");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        File.add(Open);

        Save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myeditor/images/save.png"))); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        File.add(Save);

        Print.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myeditor/images/print.png"))); // NOI18N
        Print.setText("Print");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });
        File.add(Print);

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myeditor/images/icons8-exit-24.png"))); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        File.add(Exit);

        jMenuBar1.add(File);

        Edit.setText("Edit");

        cut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myeditor/images/scissors.png"))); // NOI18N
        cut.setText("cut");
        cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutActionPerformed(evt);
            }
        });
        Edit.add(cut);

        copy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        copy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myeditor/images/copy.png"))); // NOI18N
        copy.setText("copy");
        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });
        Edit.add(copy);

        paste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        paste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myeditor/images/portable-document-format.png"))); // NOI18N
        paste.setText("paste");
        paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteActionPerformed(evt);
            }
        });
        Edit.add(paste);

        jMenuBar1.add(Edit);

        Oops.setText("Oops");
        Oops.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OopsActionPerformed(evt);
            }
        });

        Undo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Undo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myeditor/images/return.png"))); // NOI18N
        Undo.setText("Undo");
        Undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoActionPerformed(evt);
            }
        });
        Oops.add(Undo);

        Redo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Redo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myeditor/images/redo.png"))); // NOI18N
        Redo.setText("Redo");
        Redo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedoActionPerformed(evt);
            }
        });
        Oops.add(Redo);

        jMenuBar1.add(Oops);

        jMenu1.setText("Created by Ashutosh Tripathi ©2020");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    UndoManager um=new UndoManager();
   // Document dc= txt.getDocument();
  // txt.getDocument().addUndoableEditListener(um);

  
    
    
    @Override
    protected void processWindowEvent(WindowEvent e) {
        super.processWindowEvent(e); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
     // Create an object of JFileChooser class 
			JFileChooser j = new JFileChooser("c:"); 

			// Invoke the showsOpenDialog function to show the save dialog 
			int r = j.showOpenDialog(null); 

			// If the user selects a file 
			if (r == JFileChooser.APPROVE_OPTION) { 
				// Set the label to the path of the selected directory 
				File fi = new File(j.getSelectedFile().getAbsolutePath()); 

				try { 
					// String 
					String s1 = "", sl = ""; 

					// File reader 
					FileReader fr = new FileReader(fi); 

					// Buffered reader 
					BufferedReader br = new BufferedReader(fr); 

					// Initilize sl 
					sl = br.readLine(); 

					// Take the input from the file 
					while ((s1 = br.readLine()) != null) { 
						sl = sl + "\n" + s1; 
					} 

					// Set the text 
					txt.setText(sl); 
				} 
				catch (Exception e) { 
					JOptionPane.showMessageDialog(this,"The user cancelled the operation"); 
				} 
			} 
			// If the user cancelled the operation 
			else
				JOptionPane.showMessageDialog(this,"The user cancelled the operation"); 
       
       
       
    }//GEN-LAST:event_OpenActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        try { 
				// print the file 
				txt.print(); 
			} 
			catch (Exception e) { 
				JOptionPane.showMessageDialog(this,"The user cancelled the operation"+e.getMessage()); 
			} 
    }//GEN-LAST:event_PrintActionPerformed

    private void FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FileActionPerformed

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
        txt.setText(null);
    }//GEN-LAST:event_NewActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
    
       // Create an object of JFileChooser class 
			JFileChooser j = new JFileChooser("C:"); 

			// Invoke the showsSaveDialog function to show the save dialog 
			int r = j.showSaveDialog(null); 
                        
                     j.addChoosableFileFilter(new FileNameExtensionFilter("text file", "txt"));
                        
                    if (r == JFileChooser.APPROVE_OPTION) { 
                            
                        try{
                            BufferedWriter w = new BufferedWriter(new FileWriter(j.getSelectedFile().getAbsolutePath()+".txt")); 

					// Write 
					w.write(txt.getText()); 

					w.flush(); 
					w.close(); 
                            
                        }catch(Exception e){JOptionPane.showMessageDialog(this, "error:-"+e.getMessage());} 
}

                          
			// If the user cancelled the operation 
			else
				JOptionPane.showMessageDialog(this,"The user cancelled the operation"); 
       
       
       
       
    }//GEN-LAST:event_SaveActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutActionPerformed
                 txt.cut();        // TODO add your handling code here:
    }//GEN-LAST:event_cutActionPerformed

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
             txt.copy();        // TODO add your handling code here:
    }//GEN-LAST:event_copyActionPerformed

    private void pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteActionPerformed
        txt.paste();        // TODO add your handling code here:
    }//GEN-LAST:event_pasteActionPerformed

    private void OopsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OopsActionPerformed
                  // TODO add your handling code here:
    }//GEN-LAST:event_OopsActionPerformed

    private void UndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UndoActionPerformed
         
              try  {
                   // if (um.canUndo())
                   // {
                        um.undo();
                 Undo.setText(um.getUndoPresentationName());}catch(CannotRedoException e){}
    }//GEN-LAST:event_UndoActionPerformed

    private void RedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedoActionPerformed
      {
                try{  //  if (um.canRedo())
                   // {
                        um.redo();
                  Redo.setText(um.getRedoPresentationName());}catch(CannotRedoException e){}
        //Redo.setText(um.getRedoPresentationName());}catch(CannotRedoException e){}
    }//GEN-LAST:event_RedoActionPerformed
    }
    private void txtPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtPropertyChange
        // TODO add your handling code here:
        txt.getDocument().addUndoableEditListener(
         new UndoableEditListener() {
           @Override
            public void undoableEditHappened(UndoableEditEvent e) {
                um.addEdit(e.getEdit());
              //  updateButtons();
            }
                                      });
       
    }//GEN-LAST:event_txtPropertyChange
    
   
    
/*   public void updateButtons() {
    //undoButton.setText(undoManager.getUndoPresentationName());
    //redoButton.setText(undoManager.getRedoPresentationName());
    //undoButton.setEnabled(true);
   Undo.setEnabled(um.canUndo());
    //redoButton.setEnabled(true);
    Redo.setEnabled(um.canRedo());
	
	//mi21.setEnabled(um.canUndo());
    //redoButton.setEnabled(true);
   // mi22.setEnabled(um.canRedo());
  
  }  */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Edit;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenu File;
    private javax.swing.JMenuItem New;
    private javax.swing.JMenu Oops;
    private javax.swing.JMenuItem Open;
    private javax.swing.JMenuItem Print;
    private javax.swing.JMenuItem Redo;
    private javax.swing.JMenuItem Save;
    private javax.swing.JMenuItem Undo;
    private javax.swing.JMenuItem copy;
    private javax.swing.JMenuItem cut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem paste;
    private javax.swing.JTextArea txt;
    // End of variables declaration//GEN-END:variables









}
