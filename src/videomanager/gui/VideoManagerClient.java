/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videomanager.gui;

import java.io.File;
import javax.swing.JComponent;
import java.util.HashSet;
import javax.swing.DefaultListModel;
import videomanager.*;

/**
 *
 * A trivial amount of code was added by Matthew Wolff to expose fields necessary for his VMHelper class.
 * @author Quin Mese
 */
public class VideoManagerClient extends javax.swing.JFrame {

    /**
     * Creates new form VideoManagerClient
     */
    public VideoManagerClient() {
        initComponents();
        
        searchResults.setModel(resultVideos);
        
        
        //The following code is needed for proper instantiation of Helper class. Do not modify.
        JComponent[] temp = {
            videoTitle,
            VideoUrl,
            CharacterAdd,
            CharacterAddButton,
            StageAdd,
            StageAddButton,
            PlayerTag,
            PlayerAddButton,
            AddButton,
            SearchButton,
            searchResults,
        };
        helpers = temp;
    }
    
    final File libraryFile = new File("library.xml");
    Library videoLib = new Library(libraryFile);
    HashSet<Tag> Tags = new HashSet<>();
    DefaultListModel<Video> resultVideos = new DefaultListModel<> ();
    
    JComponent[] helpers;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panel1 = new java.awt.Panel();
        CharacterAdd = new javax.swing.JComboBox();
        CharacterAddButton = new javax.swing.JButton();
        StageAddButton = new javax.swing.JButton();
        StageAdd = new javax.swing.JComboBox();
        PlayerTag = new javax.swing.JTextField();
        CharacterLabel = new javax.swing.JLabel();
        StageLabel = new javax.swing.JLabel();
        PlayerLabel = new javax.swing.JLabel();
        PlayerAddButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        VideoUrlLabel = new javax.swing.JLabel();
        VideoUrl = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        CharacterTagLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        videoTitleLabel = new javax.swing.JLabel();
        videoTitle = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchResults = new javax.swing.JList();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        saveMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        helpMenuItem = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Video Manager");

        CharacterAdd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bowser", "Captain Falcon", "Donkey Kong", "Dr. Mario", "Falco", "Fox", "Gannondorf", "Ice Climbers", "Jigglypuff", "Kirby", "Luigi", "Link", "Mario", "Marth", "Mewtwo", "Mr.Game&Watch", "Ness", "Peach", "Pichu", "Pikachu", "Roy", "Samus", "Sheik", "Yoshi", "Young Link", "Zelda" }));

        CharacterAddButton.setText("Add");
        CharacterAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CharacterAddButtonActionPerformed(evt);
            }
        });

        StageAddButton.setText("Add");
        StageAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StageAddButtonActionPerformed(evt);
            }
        });

        StageAdd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Battlefield", "Dreamland", "Final Destination", "Fountain of Dreams", "Pokemon Stadium", "Yoshi's Story" }));

        CharacterLabel.setText("Characters");

        StageLabel.setText("Stages");

        PlayerLabel.setText("Players");

        PlayerAddButton.setText("Add");
        PlayerAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayerAddButtonActionPerformed(evt);
            }
        });

        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        VideoUrlLabel.setText("Video URL");

        videoTitleLabel.setText("VideoTitle");

        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        searchResults.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        searchResults.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchResultsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(searchResults);

        fileMenu.setText("File");

        saveMenuItem.setText("Save...");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        jMenuBar1.add(fileMenu);

        helpMenu.setText("Help");

        helpMenuItem.setText("Help...");
        helpMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(helpMenuItem);

        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CharacterLabel)
                    .addComponent(VideoUrlLabel)
                    .addComponent(VideoUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(videoTitleLabel)
                    .addComponent(videoTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PlayerLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(StageAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(StageAddButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PlayerTag, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4)
                                    .addComponent(PlayerAddButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CharacterAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CharacterAddButton))
                            .addComponent(StageLabel)
                            .addComponent(CharacterTagLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel1))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AddButton)
                                .addGap(26, 26, 26)
                                .addComponent(SearchButton)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(videoTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(videoTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VideoUrlLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VideoUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(CharacterLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CharacterAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CharacterAddButton))
                        .addGap(35, 35, 35)
                        .addComponent(StageLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(StageAddButton)
                                .addComponent(jLabel5))
                            .addComponent(StageAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PlayerLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PlayerTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PlayerAddButton)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CharacterTagLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(AddButton)
                    .addComponent(SearchButton))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlayerAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayerAddButtonActionPerformed
        String tag = PlayerTag.getText();
        Tags.add(new Tag("player",tag));
        jLabel3.setText(jLabel3.getText() + ' ' + tag);
        PlayerTag.setText("");
        
    }//GEN-LAST:event_PlayerAddButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clearAll();
        resultVideos.clear();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void CharacterAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CharacterAddButtonActionPerformed
        String tag = CharacterAdd.getSelectedItem().toString();
        Tags.add(new Tag("character",tag));
        String CharacterTagsText = CharacterTagLabel.getText() + " " + tag;
        CharacterTagLabel.setText(CharacterTagsText);
        
    }//GEN-LAST:event_CharacterAddButtonActionPerformed

    private void StageAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StageAddButtonActionPerformed
        String tag = StageAdd.getSelectedItem().toString();
        Tags.add(new Tag("stage",tag));
        jLabel2.setText(jLabel2.getText() + ' ' + tag);
    }//GEN-LAST:event_StageAddButtonActionPerformed

    private void helpMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpMenuItemActionPerformed
        new VMHelper(helpers).setVisible(true);
    }//GEN-LAST:event_helpMenuItemActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        videoLib.add(new Video(VideoUrl.getText(),videoTitle.getText(),Tags));
        clearAll();
    }//GEN-LAST:event_AddButtonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        resultVideos.clear();
        resultVideos = new QueryResult(videoLib, Tags).getResult();
        searchResults.setModel(resultVideos);
        clearAll();
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void searchResultsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchResultsMouseClicked
        resultVideos.get(searchResults.getSelectedIndex()).watch();
    }//GEN-LAST:event_searchResultsMouseClicked

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        videoLib.saveTo(libraryFile);
    }//GEN-LAST:event_saveMenuItemActionPerformed
   
    public void clearAll()
    {
        VideoUrl.setText("");
        videoTitle.setText("");
        CharacterTagLabel.setText("");
        jLabel2.setText("");
        jLabel3.setText("");
        PlayerTag.setText("");
        Tags.clear();
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VideoManagerClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VideoManagerClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VideoManagerClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VideoManagerClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VideoManagerClient().setVisible(true);
                //new VideoManagerClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JComboBox CharacterAdd;
    private javax.swing.JButton CharacterAddButton;
    private javax.swing.JLabel CharacterLabel;
    private javax.swing.JLabel CharacterTagLabel;
    private javax.swing.JButton PlayerAddButton;
    private javax.swing.JLabel PlayerLabel;
    private javax.swing.JTextField PlayerTag;
    private javax.swing.JButton SearchButton;
    private javax.swing.JComboBox StageAdd;
    private javax.swing.JButton StageAddButton;
    private javax.swing.JLabel StageLabel;
    private javax.swing.JTextField VideoUrl;
    private javax.swing.JLabel VideoUrlLabel;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem helpMenuItem;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Panel panel1;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JList searchResults;
    private javax.swing.JTextField videoTitle;
    private javax.swing.JLabel videoTitleLabel;
    // End of variables declaration//GEN-END:variables
}
