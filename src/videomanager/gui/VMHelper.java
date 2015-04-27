/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videomanager.gui;

import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;

/**
 *
 * @author Matthew Wolff
 */
public class VMHelper extends javax.swing.JFrame {

    /**
     * Creates new form VMHelper
     * @param base the window to which this helper is bound.
     */
    public VMHelper(VideoManagerClient base) {
        initComponents();
        timer = new Timer(500, base.helper);
        this.base = base;
    }
    
    private final VideoManagerClient base;
    
    private final Timer timer;

    private final String[] messages = {
        "To get started, type the link of your video in the animated field...",
        "Next, select the characters that appear in the video",
        "When you have selected the characters, be sure to submit them",
        "Next, select your stages",
        "You can have more than one, but be sure to click add",
        "Type the names of the players here, type one name at at time",
        "Submit them to the system. Again, you can have more than two",
        "When you're all done, enter the video into the system"
    };
    private int index = 0;
    private final String[] tasks = {
        "Enter video URL...",
        "Select Characters",
        "Click add",
        "Select Stage",
        "Click add",
        "Enter player name",
        "Click add",
        "Finish"
    };
    
    public void nextTask()
    {
        //Probably merge the two indices
        //No need to check if there will be an out of bounds, you'll never request the next element when you're done.
        if(index==7) 
        {
            this.dispatchEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));
            base.nextHelp();
            timer.stop();
        }
        else
        {
            try {
                Element e = stepsDoc.getElement("last");
                stepsDoc.setOuterHTML(e,"<li id='complete'>"+tasks[index]+"</li>");
                stepsDoc.insertAfterEnd(e, "<li id='last'>"+tasks[++index]+"</li>");
                messageLabel.setText(messages[index]);
                timer.stop();
                base.nextHelp();
                timer.start();
            } catch (BadLocationException | IOException ex) {
                Logger.getLogger(VMHelper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private HTMLDocument stepsDoc;
    
    private void prepDocument()
    {
        try {
            stepsTextPane.setEditorKit(new HTMLEditorKit());
            stepsDoc = (HTMLDocument) stepsTextPane.getDocument();
            stepsDoc.insertAfterStart(stepsDoc.getDefaultRootElement(), "<ul><li id='last'>"+tasks[index]+"</li></ul>");
            StyleSheet style = stepsDoc.getStyleSheet();
            style.addRule("#last {color: red;} #complete {color: blue;}");
        } catch (BadLocationException | IOException ex) {
            Logger.getLogger(VMHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progressLabel = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        goBackButton = new javax.swing.JButton();
        messageLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stepsTextPane = new javax.swing.JTextPane();
        flashButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Help Wizard");

        progressLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        progressLabel.setText("Progress");

        goBackButton.setText("Go Back...");

        messageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messageLabel.setText(messages[index]);

        prepDocument();
        stepsTextPane.setEditable(false);
        stepsTextPane.setBackground(new java.awt.Color(240, 240, 240));
        jScrollPane1.setViewportView(stepsTextPane);

        flashButton.setText("flash me");
        flashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flashButtonActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(progressLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(progressBar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(messageLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(goBackButton)
                        .addGap(18, 18, 18)
                        .addComponent(flashButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(progressLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goBackButton)
                    .addComponent(flashButton)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void flashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flashButtonActionPerformed
        timer.start();
    }//GEN-LAST:event_flashButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        nextTask();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton flashButton;
    private javax.swing.JButton goBackButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel progressLabel;
    private javax.swing.JTextPane stepsTextPane;
    // End of variables declaration//GEN-END:variables
}
