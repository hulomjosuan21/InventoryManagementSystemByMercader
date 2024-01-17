
import com.formdev.flatlaf.FlatLightLaf;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginFrame extends javax.swing.JFrame {
    private final Database db = new Database();
    public LoginFrame() {
        initComponents();
    }
    
    private void login_Method(){
        try{
            String get_username = usernameinput.getText();
            char[] get_p = passwordinput.getPassword();
            String get_password = new String(get_p);
            short result = db.checkUserCredentials(get_username, get_password);

            switch (result) {
                case 1:
                    JOptionPane.showMessageDialog(this, "Login successful!");
                    String current_user = db.getUserId(get_username, get_password);
                    db.setCurrentUser(current_user, this);
                    System.out.println("Current user: "+current_user);            

                    MainFrame newApp = new MainFrame();    
                    newApp.setVisible(true);
                    this.dispose();
                    break;

                case 2:
                    JOptionPane.showMessageDialog(this, "Incorrect password!");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(this, "Incorrect username!");
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Invalid username and password!");
                    break;
            }   
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        usernameinput = new javax.swing.JTextField();
        passwordinput = new javax.swing.JPasswordField();
        loginbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        loginbtn.setText("login");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameinput, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(passwordinput)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(loginbtn)))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(usernameinput, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordinput, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(loginbtn)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        login_Method();
    }//GEN-LAST:event_loginbtnActionPerformed

    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField passwordinput;
    private javax.swing.JTextField usernameinput;
    // End of variables declaration//GEN-END:variables
}
