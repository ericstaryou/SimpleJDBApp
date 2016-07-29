/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqllink;
import javax.swing.JFrame;
import javax.swing.UIManager.*;
import javax.swing.*;
/**
 *
 * @author Eric
 */
public class SQLLink {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());

                    AddFriendUI lp = new AddFriendUI();
                    lp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    lp.setSize(700, 220);
                    lp.setVisible(true);
                }
            }
        }catch(Exception e){
            
        }
    }
    
}
