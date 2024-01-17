
import com.formdev.flatlaf.FlatLightLaf;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainFrame extends javax.swing.JFrame implements AppInitializer{
    private final Database db = new Database();
    private final Utilities util = new Utilities();
    
    public MainFrame() {
        initComponents();
        initializer();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        refresh();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainBackground = new javax.swing.JPanel();
        backgroundLayeredPane = new javax.swing.JLayeredPane();
        dashboardPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        countProducts = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        usersPanel = new javax.swing.JPanel();
        imageAvatar1 = new ImageAvatar();
        fullnameLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        genderLabel = new javax.swing.JLabel();
        userTypeLabel = new javax.swing.JLabel();
        inventoryPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventoryTable = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        addProduct1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        addDescription1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        addQuantity1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        addCategory1 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        addPrice1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        addDate1 = new com.toedter.calendar.JDateChooser();
        addBtn1 = new javax.swing.JButton();
        editBtn1 = new javax.swing.JButton();
        deleteBtn1 = new javax.swing.JButton();
        loadBtn1 = new javax.swing.JButton();
        search1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        categoryPanel = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        addCategory2 = new javax.swing.JTextField();
        addBtn2 = new javax.swing.JButton();
        editBtn2 = new javax.swing.JButton();
        deleteBtn2 = new javax.swing.JButton();
        loadBtn2 = new javax.swing.JButton();
        search2 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        categoryTable = new javax.swing.JTable();
        salesPanel = new javax.swing.JPanel();
        returnitemPanel = new javax.swing.JPanel();
        pricelistPanel = new javax.swing.JPanel();
        reportPanel = new javax.swing.JPanel();
        settingsPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainBackground.setBackground(new java.awt.Color(255, 204, 255));

        backgroundLayeredPane.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TOTAL PRODUCTS");
        jLabel3.setOpaque(true);

        countProducts.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        countProducts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        countProducts.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(countProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(countProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        jLabel4.setBackground(new java.awt.Color(204, 255, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TOTAL PRODUCTS (old)");
        jLabel4.setOpaque(true);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));

        jLabel6.setBackground(new java.awt.Color(204, 255, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("OUT OF STOCKS");
        jLabel6.setOpaque(true);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));

        jLabel7.setBackground(new java.awt.Color(204, 255, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("PRODUCTS SOLD (today)");
        jLabel7.setOpaque(true);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));

        jLabel5.setBackground(new java.awt.Color(204, 255, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TOTAL SALES");
        jLabel5.setOpaque(true);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 204, 204));

        jLabel8.setBackground(new java.awt.Color(204, 255, 204));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TODAY'S SALES");
        jLabel8.setOpaque(true);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("0");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        backgroundLayeredPane.add(dashboardPanel, "card2");

        imageAvatar1.setForeground(new java.awt.Color(51, 51, 51));
        imageAvatar1.setBorderSize(2);
        imageAvatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nullProfile.jpg"))); // NOI18N

        fullnameLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        fullnameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fullnameLabel.setText("Example Name");

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameLabel.setText("Admin");

        jButton1.setText("Admin Settings");

        javax.swing.GroupLayout usersPanelLayout = new javax.swing.GroupLayout(usersPanel);
        usersPanel.setLayout(usersPanelLayout);
        usersPanelLayout.setHorizontalGroup(
            usersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(usersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(usersPanelLayout.createSequentialGroup()
                        .addGroup(usersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(imageAvatar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(usersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(usersPanelLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fullnameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(usersPanelLayout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(userTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 293, Short.MAX_VALUE))))
                    .addGroup(usersPanelLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        usersPanelLayout.setVerticalGroup(
            usersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usersPanelLayout.createSequentialGroup()
                .addGroup(usersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(usersPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(usersPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(usersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fullnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        backgroundLayeredPane.add(usersPanel, "card3");

        inventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(inventoryTable);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Product");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Description");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Quantity");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Category");

        addCategory1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Retail Price");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Date of Purchase");

        addBtn1.setText("ADD");
        addBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtn1ActionPerformed(evt);
            }
        });

        editBtn1.setText("EDIT");
        editBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtn1ActionPerformed(evt);
            }
        });

        deleteBtn1.setText("DELETE");
        deleteBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtn1ActionPerformed(evt);
            }
        });

        loadBtn1.setText("LOAD");
        loadBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadBtn1ActionPerformed(evt);
            }
        });

        search1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search1KeyReleased(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Search");

        javax.swing.GroupLayout inventoryPanelLayout = new javax.swing.GroupLayout(inventoryPanel);
        inventoryPanel.setLayout(inventoryPanelLayout);
        inventoryPanelLayout.setHorizontalGroup(
            inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inventoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(inventoryPanelLayout.createSequentialGroup()
                        .addGroup(inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inventoryPanelLayout.createSequentialGroup()
                                .addGroup(inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(inventoryPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                        .addGap(87, 87, 87))
                                    .addGroup(inventoryPanelLayout.createSequentialGroup()
                                        .addComponent(addProduct1)
                                        .addGap(2, 2, 2))
                                    .addGroup(inventoryPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(71, 71, 71))
                                    .addComponent(addPrice1))
                                .addGap(51, 51, 51))
                            .addGroup(inventoryPanelLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(addBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(76, 76, 76)))
                        .addGroup(inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inventoryPanelLayout.createSequentialGroup()
                                .addComponent(editBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(406, 406, 406))
                            .addGroup(inventoryPanelLayout.createSequentialGroup()
                                .addGroup(inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(inventoryPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                        .addGap(79, 79, 79))
                                    .addComponent(addCategory1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addDate1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(inventoryPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(31, 31, 31)))
                                .addGap(39, 39, 39)
                                .addGroup(inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inventoryPanelLayout.createSequentialGroup()
                                        .addGroup(inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, inventoryPanelLayout.createSequentialGroup()
                                                .addComponent(addDescription1)
                                                .addGap(47, 47, 47)
                                                .addComponent(addQuantity1))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, inventoryPanelLayout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(inventoryPanelLayout.createSequentialGroup()
                                                        .addComponent(deleteBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGap(74, 74, 74)
                                                        .addComponent(loadBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGap(67, 67, 67))
                                                    .addComponent(search1))))
                                        .addGap(10, 10, 10))
                                    .addGroup(inventoryPanelLayout.createSequentialGroup()
                                        .addGroup(inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(inventoryPanelLayout.createSequentialGroup()
                                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                                .addGap(113, 113, 113)
                                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                                            .addGroup(inventoryPanelLayout.createSequentialGroup()
                                                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(192, 192, 192)))
                                        .addGap(91, 91, 91)))))))
                .addGap(0, 0, 0))
        );
        inventoryPanelLayout.setVerticalGroup(
            inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inventoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel18)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGroup(inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inventoryPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(addDescription1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inventoryPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(addQuantity1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addCategory1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(inventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(deleteBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loadBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addContainerGap())
        );

        backgroundLayeredPane.add(inventoryPanel, "card4");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Category");

        addBtn2.setText("ADD");
        addBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtn2ActionPerformed(evt);
            }
        });

        editBtn2.setText("EDIT");
        editBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtn2ActionPerformed(evt);
            }
        });

        deleteBtn2.setText("DELETE");
        deleteBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtn2ActionPerformed(evt);
            }
        });

        loadBtn2.setText("LOAD");
        loadBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadBtn2ActionPerformed(evt);
            }
        });

        search2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search2KeyReleased(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Search");

        categoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(categoryTable);

        javax.swing.GroupLayout categoryPanelLayout = new javax.swing.GroupLayout(categoryPanel);
        categoryPanel.setLayout(categoryPanelLayout);
        categoryPanelLayout.setHorizontalGroup(
            categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(categoryPanelLayout.createSequentialGroup()
                        .addGroup(categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(categoryPanelLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(addBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                .addGap(76, 76, 76))
                            .addGroup(categoryPanelLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(categoryPanelLayout.createSequentialGroup()
                                        .addComponent(addCategory2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(categoryPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(51, 51, 51)))))
                        .addGroup(categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(categoryPanelLayout.createSequentialGroup()
                                .addComponent(editBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(80, 80, 80)
                                .addComponent(deleteBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                .addGap(74, 74, 74)
                                .addComponent(loadBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                .addGap(77, 77, 77))
                            .addGroup(categoryPanelLayout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addGroup(categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                                    .addGroup(categoryPanelLayout.createSequentialGroup()
                                        .addComponent(search2)
                                        .addGap(93, 93, 93)))))))
                .addContainerGap())
        );
        categoryPanelLayout.setVerticalGroup(
            categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, categoryPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31))
                .addGap(4, 4, 4)
                .addGroup(categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCategory2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(deleteBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loadBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addContainerGap())
        );

        backgroundLayeredPane.add(categoryPanel, "card5");

        javax.swing.GroupLayout salesPanelLayout = new javax.swing.GroupLayout(salesPanel);
        salesPanel.setLayout(salesPanelLayout);
        salesPanelLayout.setHorizontalGroup(
            salesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
        );
        salesPanelLayout.setVerticalGroup(
            salesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );

        backgroundLayeredPane.add(salesPanel, "card6");

        javax.swing.GroupLayout returnitemPanelLayout = new javax.swing.GroupLayout(returnitemPanel);
        returnitemPanel.setLayout(returnitemPanelLayout);
        returnitemPanelLayout.setHorizontalGroup(
            returnitemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
        );
        returnitemPanelLayout.setVerticalGroup(
            returnitemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );

        backgroundLayeredPane.add(returnitemPanel, "card7");

        javax.swing.GroupLayout pricelistPanelLayout = new javax.swing.GroupLayout(pricelistPanel);
        pricelistPanel.setLayout(pricelistPanelLayout);
        pricelistPanelLayout.setHorizontalGroup(
            pricelistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
        );
        pricelistPanelLayout.setVerticalGroup(
            pricelistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );

        backgroundLayeredPane.add(pricelistPanel, "card8");

        javax.swing.GroupLayout reportPanelLayout = new javax.swing.GroupLayout(reportPanel);
        reportPanel.setLayout(reportPanelLayout);
        reportPanelLayout.setHorizontalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
        );
        reportPanelLayout.setVerticalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );

        backgroundLayeredPane.add(reportPanel, "card9");

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
        );
        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );

        backgroundLayeredPane.add(settingsPanel, "card10");

        jPanel1.setBackground(new java.awt.Color(204, 153, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INVENTORY MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("DASHBOARD");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setText("USERS");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setText("CATEGORY");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setText("INVENTORY");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setText("SALES");
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setText("RETURN ITEM");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setText("PRICE LIST");
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setText("REPORT");
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setText("LOGOUT");
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainBackgroundLayout = new javax.swing.GroupLayout(mainBackground);
        mainBackground.setLayout(mainBackgroundLayout);
        mainBackgroundLayout.setHorizontalGroup(
            mainBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backgroundLayeredPane))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainBackgroundLayout.setVerticalGroup(
            mainBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainBackgroundLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backgroundLayeredPane)
                    .addGroup(mainBackgroundLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(59, 59, 59))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        Database get_db = new Database();
        FlatLightLaf.setup();
        if(get_db.isDatabaseConnected()){
            try{
                String value = get_db.getCurrentUser(new MainFrame());
                boolean checkUser = get_db.checkCurrentUser(value);
                java.awt.EventQueue.invokeLater(() -> {
                    if(!checkUser){
                        new LoginFrame().setVisible(true);
                    }else{
                        new MainFrame().setVisible(true);
                    }
                });
            }catch(SQLException e){
                e.printStackTrace();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Error: No database connected!", "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @Override
    public void users_call(){
        try {
            String get_id = db.getCurrentUser(this);
            String get_image = db.getImagePath(get_id);
            String get_fname = db.getFName(get_id);
            String get_lname = db.getLName(get_id);
            String get_fullname = get_fname + " " + get_lname;
            String get_username = db.getUName(get_id);
            String get_gender = db.getGender(get_id);
            String get_usertype = db.getUserType(get_id);
            
            if(get_usertype.equals("Female")){
                
            }else if(get_usertype.equals("Seller")){
                
            }else{
                
            }
            
            if(get_gender.equals("Male")){
                genderLabel.setIcon(new ImageIcon("src/icons/male.png"));
            }else if(get_gender.equals("Female")){
                genderLabel.setIcon(new ImageIcon("src/icons/female.png"));
            }else{
                genderLabel.setIcon(new ImageIcon("src/icons/nogender.png"));
            }         
            userTypeLabel.setText(get_usertype);
            usernameLabel.setText(get_username);
            fullnameLabel.setText(get_fullname);
            setImageToAvatar(imageAvatar1,get_image); 
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        switchPanel(backgroundLayeredPane, dashboardPanel);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        switchPanel(backgroundLayeredPane, usersPanel);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        switchPanel(backgroundLayeredPane, inventoryPanel);
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        switchPanel(backgroundLayeredPane, categoryPanel);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        switchPanel(backgroundLayeredPane, salesPanel);
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        switchPanel(backgroundLayeredPane, returnitemPanel);
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        switchPanel(backgroundLayeredPane, pricelistPanel);
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        switchPanel(backgroundLayeredPane, reportPanel);
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        logoutMethod();
    }//GEN-LAST:event_jLabel29MouseClicked

    private void logoutMethod(){
        try{
            db.setCurrentUser("nullUser", this);
            new LoginFrame().setVisible(true);
            this.dispose();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void addBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtn1ActionPerformed
        db.addInventoryValue(new String[]{addCategory1.getSelectedItem().toString(), addProduct1.getText(), addDescription1.getText(),addQuantity1.getText(),addPrice1.getText(), util.get_AddedDate(addDate1).toString()});        
        
        addProduct1.setText("");
        addDescription1.setText("");
        addQuantity1.setText("");
        addPrice1.setText("");
    }//GEN-LAST:event_addBtn1ActionPerformed

    private void editBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtn1ActionPerformed
        String newVal = util.getEditedValue1(inventoryTable); 
        int selectedCol = inventoryTable.getSelectedColumn();
        db.EditInventoryValue(newVal, selectedCol, util.get_RecordID(inventoryTable), inventoryPanel);
    }//GEN-LAST:event_editBtn1ActionPerformed

    private void deleteBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtn1ActionPerformed
        for(Object i : util.get_RecordIDs(inventoryTable)){
            db.DeleteInventoryRecord(i,inventoryPanel);
        }
    }//GEN-LAST:event_deleteBtn1ActionPerformed

    private void loadBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadBtn1ActionPerformed
        refresh();
    }//GEN-LAST:event_loadBtn1ActionPerformed

    private void addBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtn2ActionPerformed
        String value = addCategory2.getText();  
        db.addCategoryValue(new String[]{value, java.sql.Date.valueOf(LocalDate.now()).toString()},categoryPanel);
                
    }//GEN-LAST:event_addBtn2ActionPerformed

    private void editBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtn2ActionPerformed
        String newVal = util.getEditedValue1(categoryTable).toString();
        int getSelectedColumn = categoryTable.getSelectedColumn();
        db.EditCategoryValue(newVal, getSelectedColumn, util.get_RecordID(categoryTable), categoryPanel);      
    }//GEN-LAST:event_editBtn2ActionPerformed

    private void deleteBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtn2ActionPerformed
        for(Object i : util.get_RecordIDs(categoryTable)){
            db.DeleteCategoryRecord(i,categoryPanel);
        }
    }//GEN-LAST:event_deleteBtn2ActionPerformed

    private void loadBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadBtn2ActionPerformed
        refresh();
    }//GEN-LAST:event_loadBtn2ActionPerformed

    private void search1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search1KeyReleased
        String val = search1.getText();
        
        db.loadInventoryData(inventoryTable, val);
    }//GEN-LAST:event_search1KeyReleased

    private void search2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search2KeyReleased
        String val = search2.getText();
        
        db.loadCategoryData(categoryTable, val); 
    }//GEN-LAST:event_search2KeyReleased

    public void switchPanel(JLayeredPane layered, JPanel panel){
        layered.removeAll();
        layered.add(panel);
        layered.repaint();
        layered.revalidate();
    }
    
    public void refresh(){
        inventoryTable.setModel(db.DisplayInventoryData());
        categoryTable.setModel(db.DisplayCategoryData());
        addCategory1.setModel(new DefaultComboBoxModel(db.AddElementToComboBox())); 
        countProducts.setText(db.countProducts()+"x");  
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn1;
    private javax.swing.JButton addBtn2;
    private javax.swing.JComboBox<String> addCategory1;
    private javax.swing.JTextField addCategory2;
    private com.toedter.calendar.JDateChooser addDate1;
    private javax.swing.JTextField addDescription1;
    private javax.swing.JTextField addPrice1;
    private javax.swing.JTextField addProduct1;
    private javax.swing.JTextField addQuantity1;
    private javax.swing.JLayeredPane backgroundLayeredPane;
    private javax.swing.JPanel categoryPanel;
    private javax.swing.JTable categoryTable;
    private javax.swing.JLabel countProducts;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JButton deleteBtn1;
    private javax.swing.JButton deleteBtn2;
    private javax.swing.JButton editBtn1;
    private javax.swing.JButton editBtn2;
    private javax.swing.JLabel fullnameLabel;
    private javax.swing.JLabel genderLabel;
    private ImageAvatar imageAvatar1;
    private javax.swing.JPanel inventoryPanel;
    private javax.swing.JTable inventoryTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton loadBtn1;
    private javax.swing.JButton loadBtn2;
    private javax.swing.JPanel mainBackground;
    private javax.swing.JPanel pricelistPanel;
    private javax.swing.JPanel reportPanel;
    private javax.swing.JPanel returnitemPanel;
    private javax.swing.JPanel salesPanel;
    private javax.swing.JTextField search1;
    private javax.swing.JTextField search2;
    private javax.swing.JPanel settingsPanel;
    private javax.swing.JLabel userTypeLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JPanel usersPanel;
    // End of variables declaration//GEN-END:variables
}
