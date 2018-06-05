import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Accountlog.java
 *
 * Created on Apr 21, 2018, 9:47:17 AM
 */

/**
 *
 * @author ok
 */
public class Accountlog extends javax.swing.JFrame {

    /** Creates new form Accountlog */
    public Accountlog() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        ltf1 = new javax.swing.JTextField();
        kp = new javax.swing.JLabel();
        lpf1 = new javax.swing.JPasswordField();
        ko = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jsp = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jButton48 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/21.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 90, 90));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("WELCOME");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 140, 20));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 170, 10));

        ltf1.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
        ltf1.setToolTipText("Enter Id");
        ltf1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "ACCOUNTANT_ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        ltf1.setOpaque(false);
        ltf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ltf1ActionPerformed(evt);
            }
        });
        ltf1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ltf1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ltf1FocusLost(evt);
            }
        });
        ltf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ltf1KeyTyped(evt);
            }
        });
        getContentPane().add(ltf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 320, 50));

        kp.setFont(new java.awt.Font("Arial", 0, 11));
        kp.setForeground(new java.awt.Color(204, 0, 51));
        kp.setText("ENTER  ID:");
        getContentPane().add(kp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 70, 20));

        lpf1.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18));
        lpf1.setToolTipText("Enter Password");
        lpf1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "KEYCODE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        lpf1.setOpaque(false);
        lpf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lpf1ActionPerformed(evt);
            }
        });
        lpf1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lpf1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lpf1FocusLost(evt);
            }
        });
        lpf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lpf1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lpf1KeyTyped(evt);
            }
        });
        getContentPane().add(lpf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 320, 50));

        ko.setForeground(new java.awt.Color(204, 0, 51));
        ko.setText("ENTER  PASSWORD:");
        getContentPane().add(ko, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 110, 20));

        jButton3.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jButton3.setText("Forgot Password...?");
        jButton3.setToolTipText("Forgot Pwd...");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jButton3MouseWheelMoved(evt);
            }
        });
        jButton3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jButton3MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton3MouseMoved(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 120, 30));

        jsp.setBackground(new java.awt.Color(51, 51, 51));
        jsp.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 120, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images(65).jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 320, 240));

        jButton48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        jButton48.setToolTipText("<< Back");
        jButton48.setBorderPainted(false);
        jButton48.setContentAreaFilled(false);
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton48, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 60, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents
Connection con =null;
Statement stmt=null;
ResultSet rs=null;
String user,pw;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("java.sql.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmodule", "root", "123");
            stmt = con.createStatement();
            String qq = "select * from accountant where Id='" + ltf1.getText() + "';";
            rs = stmt.executeQuery(qq);
            user=null;
            pw = null;
            while (rs.next()) {
                user = rs.getString("name");
                pw = rs.getString("password");
            }

            String upw = new String(lpf1.getPassword());
            if (upw.equals("")) {
                JOptionPane.showMessageDialog(null, "PLEASE ENTER THE PINCODE");
            } else if (upw.equals(pw)) {
                JOptionPane.showMessageDialog(null, "WELCOME" +'\n'+'\t'+ user + "Sir");
                dispose();
                new Account0().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "EITHER ACCOUNT NUMBER OR PINCODE IS INCORRECT");
                ltf1.setText("");
                lpf1.setText("");

            }
con.close();
stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SERVER CONNECTION FAILED ");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ltf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ltf1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_ltf1ActionPerformed

    private void ltf1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ltf1FocusGained
        kp.setVisible(false);        // TODO add your handling code here:
}//GEN-LAST:event_ltf1FocusGained

    private void ltf1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ltf1FocusLost
        // TODO add your handling code here:
        if(ltf1.getText().equals("")) {
            kp.setVisible(true);
        } else
            kp.setVisible(false);
}//GEN-LAST:event_ltf1FocusLost

    private void ltf1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ltf1KeyTyped
        // TODO add your handling code here:
}//GEN-LAST:event_ltf1KeyTyped

    private void lpf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lpf1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_lpf1ActionPerformed

    private void lpf1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lpf1FocusGained
        // TODO add your handling code here:
        ko.setVisible(false);
}//GEN-LAST:event_lpf1FocusGained

    private void lpf1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lpf1FocusLost
        // TODO add your handling code here:


    }//GEN-LAST:event_lpf1FocusLost

    private void lpf1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lpf1KeyPressed
        // TODO add your handling code here:
        String pincode = new String(lpf1.getPassword());
        int length=pincode.length();
        if(length>4) {
            JOptionPane.showMessageDialog(null, "PLEASE ENTER THE PINCODE UPTO 4 DIGITS");
            lpf1.setText("");
        }
}//GEN-LAST:event_lpf1KeyPressed

    private void lpf1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lpf1KeyTyped
        // TODO add your handling code here:
        char kc =evt.getKeyChar();
        if (!(kc>='0' && kc<='9')|| kc==KeyEvent.VK_BACK_SPACE || kc==KeyEvent.VK_DELETE) {
            evt.consume();
        }
}//GEN-LAST:event_lpf1KeyTyped

    private void jButton3MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jButton3MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseWheelMoved

    private void jButton3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseDragged

    private void jButton3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseMoved
        // TODO add your handling code here:
        jsp.setVisible(true);
}//GEN-LAST:event_jButton3MouseMoved

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("java.sql.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmodule", "root", "123");
            stmt = con.createStatement();
            String qq = "select * from accountant where Id='" + ltf1.getText() + "';";
            rs = stmt.executeQuery(qq);
            while (rs.next()) {
                user = rs.getString("name");
                pw = rs.getString("password");
                char b = pw.charAt(0);
                char c = pw.charAt(pw.length()-1);
                JOptionPane.showMessageDialog(null,user.toUpperCase()+ " SIR " +'\n'+'\t'+ "  Your hint is : " + b +"***"+c );
            }
            con.close();
            stmt.close();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR IN CONNECTIVITY" );
        }




    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         jsp.setVisible(false);
        ko.setVisible(false);
        kp.setVisible(false);
        this.getContentPane().setBackground(Color.WHITE);
    }//GEN-LAST:event_formWindowOpened

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        // TODO add your handling code here:
        new Welcome().setVisible(true);
        dispose();
}//GEN-LAST:event_jButton48ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accountlog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton48;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jsp;
    private javax.swing.JLabel ko;
    private javax.swing.JLabel kp;
    private javax.swing.JPasswordField lpf1;
    private javax.swing.JTextField ltf1;
    // End of variables declaration//GEN-END:variables

}
