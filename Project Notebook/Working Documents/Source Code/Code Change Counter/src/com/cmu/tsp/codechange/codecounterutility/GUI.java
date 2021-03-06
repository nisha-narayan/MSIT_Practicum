package com.cmu.tsp.codechange.codecounterutility;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GUI.java
 *
 * Created on Apr 8, 2009, 5:36:00 PM
 */

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import com.cmu.tsp.codechange.base.Command;
import com.cmu.tsp.codechange.base.UserInterface;

import java.lang.* ;
import java.util.Map;

/**
 *
 * @author NISHA
 */
public class GUI extends javax.swing.JFrame implements UserInterface{

	protected Controller controller;
	
    /** Creates new form GUI */
    public GUI() {
    	initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setSize(200,100);
        jButton6.setText("EXIT");

        jLabel4.setText("<html>\n<body>\nUSER GUIDE AND MANUAL FOR  'GANG OF 4 FILE COMPARATOR'   <br>\n------------------------------------------------------------------------------ <br>\nThe following steps have to be performed to compare any two files and generate the number <br>\nof added , deleted and modified lines between the source and target files. <br>\n\n1. Select the source file by clicking on the 'browse' button near label ' source file'. <br>\n2. Select the target file by clicking on the 'browse' button near label  ' target file'. <br>\n3. Select the report file, where you want the output displayed or manually enter the filename of the report along with the path information. <br>\n4.Click on the 'compare' button to view a  result summary on the GUI.<br>\n5. Open the report file from its respective path location to view a detailed comparison result. <br>\n\n</body>\n\n</html>");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("mainFrame"); // NOI18N

        jLabel1.setText("SOURCE FILE");

        jLabel2.setText("TARGET FILE");

        jLabel3.setText("REPORT");
        jLabel6.setText("");

        jButton1.setText("COMPARE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

         jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });




        jButton2.setText("browse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("browse");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("browse");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("HELP");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel5.setText("<html> <body>  <center> <u> GANG  OF 4   FILE COMPARATOR </u> </center>\n<br> 1.   Please select a source file and a target file that you want to compare  \n<br> and a report file where you want to store the comparison results . \n<br> 2. To begin comparison , please hit the 'COMPARE' button <br> \n </body>  </html> ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                   
                    )
                .addGap(30, 30, 30)
               
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                 .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    
        
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jButton3))
                        .addGap(26, 26, 26)
                         
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addComponent(jButton1)
                            .addComponent(jButton6))))
                 
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGap(20)
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                
                
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton6))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jButton1))
//.addContainerGap(75, Short.MAX_VALUE)
                    
                .addContainerGap(125, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("SOURCE FILE");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
int returnVal = fc.showOpenDialog(GUI.this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            //This is where a real application would open the file.
            String fname = file.getPath();
            jTextField1.setText(fname) ;
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int returnVal = fc.showOpenDialog(GUI.this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();

            //This is where a real application would open the file.
            String fname = file.getPath();
            jTextField2.setText(fname) ;
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // TODO add your handling code here:
        String f1 = jTextField1.getText();
        String f2 = jTextField2.getText();
        String rep = jTextField3.getText();
        
        System.out.println("ffff");
        if(f1.equals("")){
           JOptionPane.showMessageDialog(GUI.this,"Select a source file 1");
        }else if(f2.equals("")){
           JOptionPane.showMessageDialog(GUI.this,"Select a source file 2");
        }else if(rep.equals("")){
           JOptionPane.showMessageDialog(GUI.this,"Select a Report file to store results");
        }else {
        	Command cmd = new CmdOneClickCompare(f1, f2, rep);
        	sendCommand(cmd);

            
          
           if (cmd.isSuccess() == true)
           {
             JOptionPane.showMessageDialog(GUI.this,"Comparison performed successfully! Check the report file for DETAILED RESULTS! ");
              Map output = controller.getChangeSummary();
           Integer n_add = (Integer)output.get("added");
           Integer n_del = (Integer)output.get("deleted");
           Integer n_chg = (Integer)output.get("changed");
           jLabel6.setText("<html> <body> <u>Change Line Summary </u><br> 1. Number of Added Lines:" +n_add + "<br> 2. Number of Deleted Lines:" +n_del+ " <br> 3. Number of Modified Lines : " + n_chg + "</body></html>");

           }
           else
           {
              String err =  cmd.getExceptionDescription();
              JOptionPane.showMessageDialog(GUI.this, err);

           }
           


        }
       
         // JOptionPane.showMessageDialog(GUI.this,f1);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         int returnVal = fc.showOpenDialog(GUI.this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();

            //This is where a real application would open the file.
            String fname = file.getPath();
            jTextField3.setText(fname) ;
    }//GEN-LAST:event_jButton4ActionPerformed
    }
         private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            jFrame1.setSize(400, 400);
    jFrame1.setVisible(true);
    //jFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         }//GEN-LAST:event_jButton5ActionPerformed


        private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
           this.setVisible(false);
    
    //jFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         }




    /**
     *
    * @param args the command line arguments
    */
   /* public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
   final JFileChooser fc = new JFileChooser();
   
	public void beginUserActions() {
		this.setVisible(true);
        this.setSize(600,600);
	}
	
	public void cleanUp() {
		// TODO Auto-generated method stub
		
	}
	
	public void initialize(Controller ctrl) {
		this.controller = ctrl;
	}
	
	public void sendCommand(Command cmd) {
		controller.executeCommand(cmd);
	}

}
