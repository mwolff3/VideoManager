package videomanager.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;

/**
 * Interactive help window to show the operation of this application.
 * This class was developed solely by Matthew Wolff in fulfillment of the Honors Option agreement for this class.
 * Evaluation of this class is not part of the main project and should have no affect on the project grade for any member of the development team;
 * evaluation should be used only to determine if Matthew Wolff has fulfilled the terms of the Honors Option agreement.
 * @author Matthew Wolff
 */
public class VMHelper extends javax.swing.JFrame {

    /**
     * Creates new form VMHelper.
     * Adds a WindowListener to stop the timer and restore the background of the currently animating object.
     * Adds a MouseListener to every help element passed in to listen for cues to proceed to the next help topic.
     * @param helpers
     */
    public VMHelper(final JComponent[] helpers) {
        initComponents();
        timer = new Timer(250, animator);
        this.helpComponents = helpers;
        restore = helpComponents[0].getBackground();
        timer.start();
        progressBar.setMaximum(helpComponents.length-1);
        this.addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
                JOptionPane.showMessageDialog(e.getComponent(), message, "Welcome!", JOptionPane.INFORMATION_MESSAGE);
            }

            @Override
            public void windowClosing(WindowEvent e) {
                timer.stop();
                helpComponents[index].setBackground(restore);
            }

            @Override
            public void windowClosed(WindowEvent e) {}

            @Override
            public void windowIconified(WindowEvent e) {}

            @Override
            public void windowDeiconified(WindowEvent e) {}

            @Override
            public void windowActivated(WindowEvent e) {}

            @Override
            public void windowDeactivated(WindowEvent e) {}
            
        });
        
        for(int i=0; i<helpComponents.length; i++)
        {
            if(i==0)
            {
                helpComponents[i].addMouseListener(new MouseListener() {

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if(e.getComponent().equals(helpComponents[index]))
                        nextTask();
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {}

                    @Override
                    public void mouseReleased(MouseEvent e) {}

                    @Override
                    public void mouseEntered(MouseEvent e) {}

                    @Override
                    public void mouseExited(MouseEvent e) {}
                    
                });
            }
            else helpComponents[i].addFocusListener(new FocusListener() {

                @Override
                public void focusGained(FocusEvent e) {
                    if(e.getComponent().equals(helpComponents[index]))
                        nextTask();
                }

                @Override
                public void focusLost(FocusEvent e) {
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
                
            });
        }
    }
    
    private Color restore;
    
    private final JComponent[] helpComponents;
    
    private final Timer timer;
    
    private final String[] messages = {
        "To get started, type the name of your video in the animated field...",
        "Next, add the URL to the video.",
        "Next, select the characters that appear in the video",
        "When you have selected the characters, be sure to submit them",
        "Next, select your stages",
        "You can have more than one, but be sure to click add",
        "Type the names of the players here, type one name at at time",
        "Submit them to the system. Again, you can have more than two",
        "When you're all done, enter the video into the system",
        "To search for a video, define your tags as before and press search",
        "Search results appear in this field. Click on a video to watch it",
    };
    
    private int index = 0;
    
    private final String[] tasks = {
        "Enter video name",
        "Enter video URL",
        "Select Characters",
        "Click add",
        "Select Stage",
        "Click add",
        "Enter player name",
        "Click add",
        "Click add video",
        "Press search",
        "Click a video",
    };
    
    private final String message = "Welcome to the interactive help menu. \nHere, prompts will be given that will guide you through proper usage of the system. \nThe appropriate places to click will be animated on the main program interface";
    
    /**
     * Advance the help dialog to the next step.
     */
    public void nextTask()
    {
        if(index==helpComponents.length-1) 
        {
            this.dispatchEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));
            timer.stop();
            helpComponents[index].setBackground(restore);
        }
        else
        {
            try {
                timer.stop();
                helpComponents[index].setBackground(restore);
                Element e = stepsDoc.getElement("last");
                stepsDoc.setOuterHTML(e,"<li id='complete'>"+tasks[index]+"</li>");
                stepsDoc.insertAfterEnd(e, "<li id='last'>"+tasks[++index]+"</li>");
                messageLabel.setText(messages[index]);
                step = 0;
                up = false;
                restore = helpComponents[index].getBackground();
                timer.start();
                progressBar.setValue(progressBar.getValue()+1);
            } catch (BadLocationException | IOException ex) {
                Logger.getLogger(VMHelper.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }
    
    private int step = 0;
    
    private boolean up = false;
    
    private final ActionListener animator = new ActionListener() {
            final int STEPS = 2;
            @Override
            public void actionPerformed(ActionEvent e) {
                JComponent flasher = helpComponents[index];
                if(up)
                    flasher.setBackground(flasher.getBackground().brighter());
                else 
                    flasher.setBackground(flasher.getBackground().darker());
                if(++step%STEPS==0)
                    up = !up;
            }
    };
    
    private HTMLDocument stepsDoc;
    
    private void prepDocument()
    {
        try {
            stepsTextPane.setEditorKit(new HTMLEditorKit());
            stepsDoc = (HTMLDocument) stepsTextPane.getDocument();
            stepsDoc.insertAfterStart(stepsDoc.getDefaultRootElement(), "<ul><li id='last'>"+tasks[index]+"</li></ul>");
            StyleSheet style = stepsDoc.getStyleSheet();
            style.addRule("#last {color: blue;} #complete {color: #999999;}");
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
        messageLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stepsTextPane = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Help Wizard");

        progressLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        progressLabel.setText("Progress");

        messageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messageLabel.setText(messages[index]);

        prepDocument();
        stepsTextPane.setEditable(false);
        stepsTextPane.setBackground(new java.awt.Color(240, 240, 240));
        jScrollPane1.setViewportView(stepsTextPane);

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
                    .addComponent(messageLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel progressLabel;
    private javax.swing.JTextPane stepsTextPane;
    // End of variables declaration//GEN-END:variables
}
