/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Login.java
 *
 * Created on Nov 17, 2009, 3:03:21 PM
 */

/**
 *
 * @author Administrator

 */
 import java.awt.Color;
import java.io.FileInputStream;
import java.rmi.Naming;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.net.InetAddress;
import java.net.*;
import java.io.*;
public class Login extends javax.swing.JFrame {
	String nodename="";
	String ipaddress="";
	String address="";
	int ch=0;
	String port="";
	int portno=0;
	   /** Creates new form Login */
    public Login() {
        initComponents();
        setSize(525,350);
        txtnodename.requestFocus();
        setResizable(false);
        setLocation(500, 150);
        setTitle("Node");
        jTabbedPane1.remove(noderegistration);
		 try{
        	FileInputStream fileInputStream=new FileInputStream("address.txt");
        	while((ch=fileInputStream.read())!=-1){
        		address+=(char)ch;
        	}
        }catch(Exception e){
        	e.printStackTrace();
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        login = new javax.swing.JPanel();
        btncancel = new javax.swing.JButton();
        btnlogin = new javax.swing.JButton();
        lblnew = new javax.swing.JLabel();
        lblpwd = new javax.swing.JLabel();
        lblnode = new javax.swing.JLabel();
        txtnodename = new javax.swing.JTextField();
        txtpwd = new javax.swing.JPasswordField();
        noderegistration = new javax.swing.JPanel();
        lblnode1 = new javax.swing.JLabel();
        lblpwd1 = new javax.swing.JLabel();
        lblrepwd = new javax.swing.JLabel();
        txtnodename1 = new javax.swing.JTextField();
        txtpwd1 = new javax.swing.JPasswordField();
        txtrepwd = new javax.swing.JPasswordField();
        btnregister = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        lblback = new javax.swing.JLabel();
        lbltitle = new javax.swing.JLabel();

       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTabbedPane1.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N

        login.setFocusCycleRoot(true);
        login.setLayout(null);

        btncancel.setFont(new java.awt.Font("Book Antiqua", 3, 12)); // NOI18N
        btncancel.setText("Cancel");
        login.add(btncancel);
        btncancel.setBounds(290, 120, 70, 25);

        btnlogin.setFont(new java.awt.Font("Book Antiqua", 3, 12)); // NOI18N
        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        login.add(btnlogin);
        btnlogin.setBounds(200, 120, 80, 25);

        lblnew.setFont(new java.awt.Font("Book Antiqua", 3, 12)); // NOI18N
        lblnew.setText("New registration..");
        lblnew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblnewMouseClicked(evt);
            }
        });
        lblnew.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblnewFocusGained(evt);
            }
        });
        login.add(lblnew);
        lblnew.setBounds(90, 110, 100, 40);

        lblpwd.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        lblpwd.setText("Enter the Password");
        login.add(lblpwd);
        lblpwd.setBounds(100, 80, 110, 16);

        lblnode.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        lblnode.setText("Enter the nodename");
        login.add(lblnode);
        lblnode.setBounds(100, 50, 110, 16);

        txtnodename.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        login.add(txtnodename);
        txtnodename.setBounds(250, 50, 100, 20);
        login.add(txtpwd);
        txtpwd.setBounds(250, 80, 100, 20);

        jTabbedPane1.addTab("Login", login);

        noderegistration.setLayout(null);

        lblnode1.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        lblnode1.setText("Enter the Nodename");
        noderegistration.add(lblnode1);
        lblnode1.setBounds(100, 50, 120, 16);

        lblpwd1.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        lblpwd1.setText("Enter the Password");
        noderegistration.add(lblpwd1);
        lblpwd1.setBounds(110, 80, 110, 16);

        lblrepwd.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        lblrepwd.setText("Re-enter the password");
        noderegistration.add(lblrepwd);
        lblrepwd.setBounds(90, 110, 130, 16);

        txtnodename1.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        noderegistration.add(txtnodename1);
        txtnodename1.setBounds(260, 50, 100, 20);
        noderegistration.add(txtpwd1);
        txtpwd1.setBounds(260, 80, 100, 20);
        noderegistration.add(txtrepwd);
        txtrepwd.setBounds(260, 110, 100, 20);

        btnregister.setFont(new java.awt.Font("Book Antiqua", 3, 12)); // NOI18N
        btnregister.setText("Register");
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        noderegistration.add(btnregister);
        btnregister.setBounds(120, 160, 80, 25);

        btnclear.setFont(new java.awt.Font("Book Antiqua", 3, 12)); // NOI18N
        btnclear.setText("Clear");
        noderegistration.add(btnclear);
        btnclear.setBounds(230, 160, 70, 25);

        lblback.setFont(new java.awt.Font("Book Antiqua", 3, 12)); // NOI18N
        lblback.setText("<< back <<");
        lblback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbackMouseClicked(evt);
            }
        });
        noderegistration.add(lblback);
        lblback.setBounds(330, 160, 60, 20);

        jTabbedPane1.addTab("Node Registration", noderegistration);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(30, 60, 460, 230);

        lbltitle.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        lbltitle.setText("Node");
        getContentPane().add(lbltitle);
        lbltitle.setBounds(210, 20, 80, 30);
	

        pack();
    }// </editor-fold>

    private void lblbackMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jTabbedPane1.remove(noderegistration);
        jTabbedPane1.add("Login",login);
}

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
		String nodename=txtnodename1.getText();
    	String pwd=txtpwd1.getText();
    	String repwd=txtrepwd.getText();
    
		try{
			if((nodename.equals(""))||(pwd.equals(""))||(repwd.equals(""))){
    			JOptionPane.showMessageDialog(null, "The fields are empty");
			}else{
    			if(pwd.equals(repwd)){
					HMACInf dbUtility=(HMACInf)Naming.lookup(address+"/hmac");
    				int update=dbUtility. insertNode(nodename, pwd);
					if(update>0){
						jTabbedPane1.remove(noderegistration);
						jTabbedPane1.add("Login",login);
					}else{
						JOptionPane.showMessageDialog(null, "Problem in update the node registration plz try again");
						txtnodename1.setText("");
						txtpwd1.setText("");
						txtrepwd.setText("");
						txtnodename1.requestFocus();
					}

				}else{
						JOptionPane.showMessageDialog(null, "The password and repassword does not match")    ;
					txtpwd1.setText("");
    				txtrepwd.setText("");
    				txtpwd1.requestFocus();
				}
			}
		}catch (Exception e){
			e.printStackTrace();				
		}
	


      
}

    private void lblnewFocusGained(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
}

    private void lblnewMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jTabbedPane1.add("Node Registration",noderegistration);
        jTabbedPane1.remove(login);
       
        jTabbedPane1.setSelectedComponent(noderegistration);
}

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
		int update=0;
		try{
				nodename=txtnodename.getText();
    			String pwd=txtpwd.getText();
				if((nodename.equals(""))||(pwd.equals(""))){
        			JOptionPane.showMessageDialog(null, "The fields are empty  ");
        		}else{
					HMACInf dbUtility=(HMACInf)Naming.lookup(address+"/hmac");
    				update=dbUtility.checkNodeLogin(nodename, pwd);
					InetAddress inetAddress= InetAddress.getLocalHost();
    				ipaddress=inetAddress.getHostAddress();
					if(update>0){
						update=dbUtility.setNodeIPAddress(ipaddress,nodename);
						if(update>0){
							port=dbUtility.getNodePort(nodename);		
							this.dispose();
							new Node1(nodename,port);
						}
					}
				}
			
			 jTabbedPane1.remove(login);
			InetAddress inetAddress= InetAddress.getLocalHost();
    		ipaddress=inetAddress.getHostAddress();
		}catch(Exception e){
			e.printStackTrace();
		}
       
}

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnregister;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblback;
    private javax.swing.JLabel lblnew;
    private javax.swing.JLabel lblnode;
    private javax.swing.JLabel lblnode1;
    private javax.swing.JLabel lblpwd;
    private javax.swing.JLabel lblpwd1;
    private javax.swing.JLabel lblrepwd;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JPanel login;
    private javax.swing.JPanel noderegistration;
    private javax.swing.JTextField txtnodename;
    private javax.swing.JTextField txtnodename1;
    private javax.swing.JPasswordField txtpwd;
    private javax.swing.JPasswordField txtpwd1;
    private javax.swing.JPasswordField txtrepwd;
    // End of variables declaration

}
