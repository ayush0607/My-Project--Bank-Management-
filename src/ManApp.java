import java.awt.Color;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ManApp.java
 *
 * Created on Apr 5, 2018, 10:50:48 AM
 */

/**
 *
 * @author ok
 */
public class ManApp extends javax.swing.JFrame {

    /** Creates new form ManApp */
    public ManApp() {
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

        show = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jsc = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        clear = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        l1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        show.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images(83).jpg"))); // NOI18N
        show.setText("  SHOW APPLICATIONS");
        show.setBorder(null);
        show.setBorderPainted(false);
        show.setContentAreaFilled(false);
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        getContentPane().add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 260, 70));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 60, 50));

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account_No.", "Name", "Loan_Amount", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb1.setOpaque(false);
        tb1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb1MouseClicked(evt);
            }
        });
        jsc.setViewportView(tb1);

        getContentPane().add(jsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 720, 230));

        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 70, 30));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app.jpg"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 110, 60));

        jScrollPane2.setBorder(null);

        ta1.setColumns(20);
        ta1.setRows(5);
        ta1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Details :"));
        jScrollPane2.setViewportView(ta1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 280, 130));
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 20));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rej.jpg"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 110, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capture101010.PNG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 260, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents
Connection con =null;
                Statement stmt=null;
                ResultSet rs=null;
int ac;
String st;
String table;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Manager1().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
       
      
          DefaultTableModel model1 = (DefaultTableModel)tb1.getModel();
            int rows=model1.getRowCount();

            if(rows>0) {
                for(int i=0;i<rows;i++) {
                    model1.removeRow(0);
                }
            }
            try {
                Class.forName("java.sql.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmodule","root","123");
                stmt=null;
                rs=null;
                stmt=con.createStatement();
                st = "Pending";
                String x ="Select * from loan where status = '"+st+"';";


                rs=stmt.executeQuery(x);
                while(rs.next()) {
                    ac=rs.getInt("accountno");
                    String nm=rs.getString("name");
                    String am=rs.getString("amount");
                    String dt=rs.getString("dot");
                    model1.addRow(new Object[]{ac,nm,am,dt});

                    ((DefaultTableCellRenderer) tb1.getTableHeader().getDefaultRenderer())
                            .setHorizontalAlignment((int)JLabel.CENTER_ALIGNMENT);
                    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                    centerRenderer.setHorizontalAlignment(JLabel.CENTER);
                    tb1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                    for(int y = 0;y<tb1.getColumnCount();y++){
                        tb1.getColumnModel().getColumn(y).setCellRenderer(centerRenderer);
                       
                    }

                }
                con.close();
stmt.close();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,"ERROR IN CONNECTIVITY");
                }
}//GEN-LAST:event_showActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tb1.getModel();
        int rows=model.getRowCount();

        if(rows>0) {
            for(int i=0;i<rows;i++) {
                model.removeRow(0);
            }
        }
        ta1.setText("");
}//GEN-LAST:event_clearActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
         try {
                Class.forName("java.sql.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmodule","root","123");                
                stmt=con.createStatement();
                st = "Approved";              
                String x ="update loan set status ='"+st+"'where accountno ='"+table+"'";
                int roweff = stmt.executeUpdate(x);
        
                DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
                Date d = new Date();
                l1.setText(dateformat.format(d));
                String dd = l1.getText();
                String y = "update loan set dot ='"+dd+"' where accountno ='"+table+"'";
                int roweff1 = stmt.executeUpdate(y);
               
                if (roweff ==0 || roweff1==0 )
               {
                   JOptionPane.showMessageDialog(rootPane,"SERVER PROBLEM");
               }
               else
               {    JOptionPane.showMessageDialog(rootPane,"APPLICATION APPROVED ON :"+dd);
                    show.doClick();
                    clear.doClick();
               }
                con.close();
stmt.close();
         }
         catch (Exception e) {
                JOptionPane.showMessageDialog(null,"ERROR IN CONNECTIVITY");
                }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void tb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1MouseClicked
// TODO add your handling code here:
        ta1.setText("");
        try {
            int row = tb1.getSelectedRow();
             table = (tb1.getModel().getValueAt(row, 0).toString());
            
              Class.forName("java.sql.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmodule","root","123");
                stmt=null;
                rs=null;
                stmt=con.createStatement();
                String x ="Select * from loan where accountno = '"+table+"'";
                rs=stmt.executeQuery(x);
                while(rs.next()) {
                    ac=rs.getInt("accountno");
                    String nm=rs.getString("name");
                    String am=rs.getString("amount");
                    ta1.append("ACCOUNT_NO : "+table+'\n');
                    ta1.append("NAME : "+nm+'\n');
                    ta1.append("LOAN AMOUNT : "+am+'\n');
                }
        }
        catch (Exception e) {
                JOptionPane.showMessageDialog(null,"ERROR IN CONNECTION");
                }
    }//GEN-LAST:event_tb1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try {
                Class.forName("java.sql.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmodule","root","123");
                stmt=con.createStatement();
                st = "Rejected";
                String x ="update loan set status ='"+st+"'where accountno ='"+table+"'";
                int roweff = stmt.executeUpdate(x);

                DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
                Date d = new Date();
                l1.setText(dateformat.format(d));
                String dd = l1.getText();
                String y = "update loan set dot ='"+dd+"' where accountno ='"+table+"'";
                int roweff1 = stmt.executeUpdate(y);

                if (roweff ==0 || roweff1==0 )
               {
                   JOptionPane.showMessageDialog(rootPane,"SERVER PROBLEM");
               }
               else
               {    JOptionPane.showMessageDialog(rootPane,"APPLICATION REJECTED  :"+'\n'+"VISIT BRANCH FOR DETAILS");
                    show.doClick();
                    clear.doClick();
               }
                con.close();
stmt.close();
         }
         catch (Exception e) {
                JOptionPane.showMessageDialog(null,"ERROR IN CONNECTIVITY");
                }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         this.getContentPane().setBackground(Color.WHITE);
      tb1.setOpaque(false);
      ((DefaultTableCellRenderer)tb1.getDefaultRenderer(Object.class)).setOpaque(false);
      jsc.setOpaque(false);
      jsc.getViewport().setOpaque(false);
      tb1.getTableHeader().setBackground(Color.WHITE);
      tb1.getTableHeader().setFont(new Font("Batang",Font.BOLD,16));
    }//GEN-LAST:event_formWindowOpened

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jsc;
    private javax.swing.JLabel l1;
    private javax.swing.JButton show;
    private javax.swing.JTextArea ta1;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables

}
