
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harsh
 */
public class del extends javax.swing.JFrame {

    /**
     * Creates new form DEL
     */
    public del() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(745, 575));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        jLabel1.setText("rEMOVE BILL");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 13, 340, 44);

        jLabel2.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("CUST ID.");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(12, 92, 100, 22);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(160, 90, 143, 22);

        jButton1.setText("SHOW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(432, 88, 142, 25);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 144, 731, 10);

        jLabel3.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("CUST NAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(12, 175, 130, 22);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(160, 170, 299, 22);

        jLabel4.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("BOOK NAME");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(360, 250, 140, 22);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(160, 250, 103, 22);

        jLabel5.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("BOOK CODE");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(12, 249, 130, 22);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(510, 250, 210, 22);

        jLabel6.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("GENRE");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(12, 314, 80, 22);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(160, 310, 211, 22);

        jLabel10.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("DATE OF PURCHASE");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(12, 385, 210, 22);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(260, 380, 156, 22);

        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(533, 381, 173, 25);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 441, 731, 10);

        jButton3.setText("HOME");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(12, 482, 131, 25);

        jButton4.setText("CLOSE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(551, 480, 150, 25);

        jButton5.setText("SHOP");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(182, 482, 153, 25);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 730, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
jTextField2.setEditable(false);        // TODO add your handling code here:
jTextField3.setEditable(false);
jTextField4.setEditable(false);
jTextField5.setEditable(false);
jTextField6.setEditable(false);

    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String cid,cna,bco,bna,gen,dop;
cid=jTextField1.getText();
try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms","root","0000");
            java.sql.Statement stm=con.createStatement();
            String sql="select * from ord where cuid="+cid+"";
            ResultSet rs=stm.executeQuery(sql);
            while(rs.next()){
            cna=String.valueOf(rs.getString(1));
            bco=String.valueOf(rs.getString(3));
            bna=String.valueOf(rs.getString(4));
            gen=String.valueOf(rs.getString(5));
            dop=String.valueOf(rs.getString(6));
            
            jTextField2.setText(cna);
            jTextField3.setText(bco);
            jTextField4.setText(bna);
            jTextField5.setText(gen);
            jTextField6.setText(dop);
            
            }
                }
        catch (Exception e){JOptionPane.showMessageDialog(null, e);}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String cid=jTextField1.getText();        // TODO add your handling code here:
try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms","root","0000");
            java.sql.Statement stm=con.createStatement();
           String sql="delete from ord where cuid='"+cid+"';";
           
            
            int rs=stm.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "RECORD DELETED");
    }

catch (Exception e){JOptionPane.showMessageDialog(null, e);}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
home hp = new home();
            hp.show();
        dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
shopping ss = new shopping();
            ss.show(); 
            dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(del.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(del.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(del.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(del.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new del().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
