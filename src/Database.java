import java.awt.Component;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Database {
    private final String url = "jdbc:mysql://localhost:3306/imsdb?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private final String username = "root";
    private final String password = ""; 
  
    protected static Connection connection;
    protected static Statement statement;
    protected static PreparedStatement prepare;   
    protected static ResultSet result;   
    
    public final String inventoryTable = "inventorytable";
    public final String[] inventoryColumns = {"productID","Category","ProductName",
        "Description","Quantity","RetailPrice","DateOfPurchase"};
    
    public final String categoryTable = "categorytable";
    public final String[] categoryColumns = {"categoryID","categoryName","dateCreated"};
    
    private final static String apptable = "apptable";
    private final static String[] appcolumns = {"appID","currentUser"};
    
    public final String userstable = "userstable";
    
    private final String[] userscolumns = {"userId","firstname","lastname","username","password",
        "birthdate","gender","profileImgPath","userType"};
    
    public final String[] listOfUserType = {"Admin","Seller"};    
    
    public Database(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
            this.statement = connection.createStatement();
        }catch(Exception e){
          
        }        
    }
    
    public boolean isDatabaseConnected() {
        try {
            return connection != null && !connection.isClosed();
        } catch (SQLException e) {
            return false;
        }
    } 
    
    public DefaultTableModel DisplayInventoryData(){
        String query = "SELECT * FROM " + inventoryTable;

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Product ID","Category","Product Name","Description","Quantity","Retail Price","Date of Purchase"});
        try {
            ResultSet result = statement.executeQuery(query);
            ResultSetMetaData metaData = result.getMetaData();
            int numberOfColumns = metaData.getColumnCount();

            while (result.next()) {
                Object[] rowData = new Object[numberOfColumns];
                for (int i = 1; i <= numberOfColumns; i++) {
                    rowData[i - 1] = result.getObject(i);
                }
                model.addRow(rowData);
            }

            result.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return model;
    }
    
    public void addInventoryValue(String[] values){
        String query = "INSERT INTO "+inventoryTable+
                " ("+inventoryColumns[1]+","+inventoryColumns[2]+","+inventoryColumns[3]+
                ","+inventoryColumns[4]+","+inventoryColumns[5]+","+inventoryColumns[6]+") VALUES (?,?,?,?,?,?)";
        
        try {
            prepare = connection.prepareStatement(query);
            prepare.setObject(1, values[0]);
            prepare.setObject(2, values[1]);
            prepare.setObject(3, values[2]); 
            prepare.setObject(4, values[3]); 
            prepare.setObject(5, values[4]); 
            prepare.setObject(6, values[5]);

            prepare.executeUpdate();
            prepare.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void EditInventoryValue(Object newVal, int colIdx, Object ID, Component parentComponent){
        String query = "UPDATE "+inventoryTable+" SET "+inventoryColumns[colIdx]+" = ? WHERE ("+inventoryColumns[0]+" = ?)";
        
        try{
            if(colIdx != 6){
                prepare = connection.prepareStatement(query);
                prepare.setObject(1, newVal);
                prepare.setObject(2, ID);
            }else{
                java.sql.Date sqlDate = java.sql.Date.valueOf(newVal.toString());
                prepare = connection.prepareStatement(query);
                prepare.setObject(1, sqlDate);
                prepare.setObject(2, ID);
                               
            }
            
            prepare.executeUpdate();
            prepare.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(parentComponent, "Something went wrong!");
        }
    }
    
    public void DeleteInventoryRecord(Object ID, Component parentComponent){
        String query = "DELETE FROM "+inventoryTable+" WHERE "+inventoryColumns[0]+" = ?";
        
        try{
            prepare = connection.prepareStatement(query);
            prepare.setObject(1, ID);
            
            prepare.executeUpdate();
            prepare.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(parentComponent, "Something went wrong!");
        }
    }
    
    public DefaultTableModel DisplayCategoryData(){
        String query = "SELECT * FROM " + categoryTable;

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Category ID","Category Name","Date Added"});
        try {
            ResultSet result = statement.executeQuery(query);
            ResultSetMetaData metaData = result.getMetaData();
            int numberOfColumns = metaData.getColumnCount();

            while (result.next()) {
                Object[] rowData = new Object[numberOfColumns];
                for (int i = 1; i <= numberOfColumns; i++) {
                    rowData[i - 1] = result.getObject(i);
                }
                model.addRow(rowData);
            }

            result.close();
        } catch (SQLException e) {
        
        }
        return model;
    }
    
    public void addCategoryValue(String[] values, Component parentComponent){
        String query = "INSERT INTO "+categoryTable+" ("+categoryColumns[1]+","+categoryColumns[2]+") VALUES (?,?)";
       
        try{
            prepare = connection.prepareStatement(query);
            prepare.setObject(1, values[0]);
            prepare.setObject(2, values[1]);
            
            prepare.executeUpdate();
            prepare.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(parentComponent, "Something went wrong!");
        }
    }
    
    public void EditCategoryValue(Object newVal, int colIdx, Object ID,Component parentComponent){
        String query = "UPDATE "+categoryTable+" SET "+categoryColumns[colIdx]+" = ? WHERE ("+categoryColumns[0]+" = ?)";
        
        try{
            if(colIdx != 3){
                prepare = connection.prepareStatement(query);
                prepare.setObject(1, newVal);
                prepare.setObject(2, ID);
            }else{
                java.sql.Date sqlDate = java.sql.Date.valueOf(newVal.toString());
                prepare = connection.prepareStatement(query);
                prepare.setObject(1, sqlDate);
                prepare.setObject(2, ID);
                               
            }
            
            prepare.executeUpdate();
            prepare.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(parentComponent, "Something went wrong!");
        }
    }
    
    public void DeleteCategoryRecord(Object ID,Component parentComponent){
        String query = "DELETE FROM "+categoryTable+" WHERE "+categoryColumns[0]+" = ?";
        
        try{
            prepare = connection.prepareStatement(query);
            prepare.setObject(1, ID);
            
            prepare.executeUpdate();
            prepare.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(parentComponent, "Something went wrong!");
        }
    }
    
    public String[] AddElementToComboBox(){
        String query = "SELECT " + categoryColumns[1] + " FROM " + categoryTable;
        
        List<String> getVal = new ArrayList<>();
        
        try {
            ResultSet result = statement.executeQuery(query);
            while (result.next()) {
                getVal.add(result.getString(categoryColumns[1]));
            }
            result.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return getVal.toArray(new String[0]);
    }    
    
    //-----------------------------------------------------------------------------//
    
    public boolean isValueExists(String valueToCheck, String column,String table){
        boolean exist = false;
        String query = "SELECT * FROM "+table+" WHERE "+column+" = LOWER(?)";
        try{
            prepare = connection.prepareStatement(query);
            prepare.setString(1, valueToCheck.toLowerCase());
            
            ResultSet result = prepare.executeQuery();
            
            if(result.next()){
                exist = true;
            }
            
            prepare.close();
            result.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return exist;
    }
    
    public void loadInventoryData(javax.swing.JTable table, String search) {
        try{
            String query = "SELECT * FROM "+inventoryTable+" WHERE "
                    + String.join(" LIKE ? OR ", inventoryColumns) + " LIKE ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                for (int i = 1; i <= inventoryColumns.length; i++) {
                    preparedStatement.setString(i, "%" + search + "%");
                }

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) table.getModel();
                    model.setRowCount(0);

                    while (resultSet.next()) {
                        Object[] row = new Object[inventoryColumns.length];
                        for (int i = 0; i < inventoryColumns.length; i++) {
                            row[i] = resultSet.getObject(inventoryColumns[i]);
                        }
                        model.addRow(row);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void loadCategoryData(javax.swing.JTable table, String search) {
        try{
            String query = "SELECT * FROM " + categoryTable + " WHERE "
                    + String.join(" LIKE ? OR ", categoryColumns) + " LIKE ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                for (int i = 1; i <= categoryColumns.length; i++) {
                    preparedStatement.setString(i, "%" + search + "%");
                }

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) table.getModel();
                    model.setRowCount(0);

                    while (resultSet.next()) {
                        Object[] row = new Object[categoryColumns.length];
                        for (int i = 0; i < categoryColumns.length; i++) {
                            row[i] = resultSet.getObject(categoryColumns[i]);
                        }
                        model.addRow(row);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public int countProducts(){
        String query = "SELECT COUNT(*) FROM " + inventoryTable;
        int count = 0;
        try {
            ResultSet result = statement.executeQuery(query);
            while (result.next()) {
               count = result.getInt(1);
            }
            result.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }
    
    public String getCurrentUser(Component p_c) throws SQLException{
        String query = "SELECT "+appcolumns[1]+" FROM "+apptable+" WHERE "+ appcolumns[0] + " = 1";
        
        try{
            prepare = connection.prepareStatement(query);
            result = prepare.executeQuery();
            
            if(result.next()){
                return result.getString(appcolumns[1]);
            }
            
            prepare.close();
            result.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(p_c, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }finally{
            prepare.close();
            result.close();  
        }
        return null;           
    }  
    
    public void setCurrentUser(String _id,Component p_c) throws SQLException{
        String query = "UPDATE "+apptable+" SET "+appcolumns[1]+" = ? WHERE "+appcolumns[0]+" = 1";
        
        try{
            prepare = connection.prepareStatement(query);
            prepare.setString(1, _id);
            
            prepare.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(p_c, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }finally{
            prepare.close();
        }
    }
    
    public short checkUserCredentials(String u_n, String u_p) throws SQLException {
        String query = "SELECT * FROM " + userstable;
        try {
            prepare = connection.prepareStatement(query);
            result = prepare.executeQuery();

            while (result.next()) {
                String username = result.getString(userscolumns[3]);
                String password = result.getString(userscolumns[4]);

                if (u_n.equals(username) && u_p.equals(password)) {
                    return 1;
                } else if (u_n.equals(username)) {
                    return 2; 
                } else if (u_p.equals(password)) {
                    return 3; 
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        } catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }finally{
            prepare.close();
            result.close();  
        }
        return 0; 
    }
    
    public String getUserId(String u_name,String u_pass) throws SQLException{
        String query = "SELECT "+userscolumns[0]+" FROM "+userstable+" WHERE "
                + userscolumns[3] + " = ? AND "+userscolumns[4]+" = ?";
        try{
            prepare = connection.prepareStatement(query);
            prepare.setString(1, u_name);
            prepare.setString(2, u_pass);
            
            result = prepare.executeQuery();
            
            if(result.next()){
                return result.getString(userscolumns[0]);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }finally{
            prepare.close();
            result.close();  
        }
        return null;        
    } 
    
    public boolean checkCurrentUser(String value) throws SQLException {
        String query = "SELECT " + userscolumns[0] + " FROM " + userstable +
                       " WHERE " + userscolumns[0] + " = ?";
        try {
            prepare = connection.prepareStatement(query);
            prepare.setString(1, value);
            result = prepare.executeQuery();

            if (result.next()) {
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }finally{
            prepare.close();
            result.close();  
        }
        return false;
    }
    
    public String getImagePath(String _id) throws SQLException{
        String query = "SELECT "+userscolumns[7]+" FROM "+userstable+" WHERE "
                + userscolumns[0] + " = ?";
        try{
            prepare = connection.prepareStatement(query);
            prepare.setString(1, _id);
            result = prepare.executeQuery();
            if(result.next()){
                return result.getString(userscolumns[7]);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }finally{
            prepare.close();
            result.close();  
        }
        return null;        
    }
    
    public String getFName(String _id) throws SQLException{
        String query = "SELECT "+userscolumns[1]+" FROM "+userstable+" WHERE "
                + userscolumns[0] + " = ?";
        try{
            prepare = connection.prepareStatement(query);
            prepare.setString(1, _id);          
            result = prepare.executeQuery();
            if(result.next()){
                return result.getString(userscolumns[1]);
            }
        }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }finally{
            prepare.close();
            result.close();  
        }
        return null;        
    }        
        
    public String getLName(String _id) throws SQLException{
        String query = "SELECT "+userscolumns[2]+" FROM "+userstable+" WHERE "
                + userscolumns[0] + " = ?";
        try{
            prepare = connection.prepareStatement(query);
            prepare.setString(1, _id);
            result = prepare.executeQuery();
            
            if(result.next()){
                return result.getString(userscolumns[2]);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }finally{
            prepare.close();
            result.close();  
        }
        return null;        
    }  
    
    public String getUName(String _id) throws SQLException{
        String query = "SELECT "+userscolumns[3]+" FROM "+userstable+" WHERE "
                + userscolumns[0] + " = ?";
        try{
            prepare = connection.prepareStatement(query);
            prepare.setString(1, _id);
            result = prepare.executeQuery();
            if(result.next()){
                return result.getString(userscolumns[3]);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }finally{
            prepare.close();
            result.close();  
        }
        return null;        
    }    
    
    public String getGender(String _id) throws SQLException{
        String query = "SELECT "+userscolumns[6]+" FROM "+userstable+" WHERE "
                + userscolumns[0] + " = ?";
        try{
            prepare = connection.prepareStatement(query);
            prepare.setString(1, _id);
            result = prepare.executeQuery();
            if(result.next()){
                return result.getString(userscolumns[6]);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }finally{
            prepare.close();
            result.close();  
        }
        return null;        
    }
    
    public String getUserType(String id) throws SQLException{
        String query = "SELECT "+userscolumns[8]+" FROM "+userstable+
                " WHERE "+userscolumns[0]+" = ?";
        try{
            prepare = connection.prepareStatement(query);
            prepare.setString(1, id);
            result = prepare.executeQuery();
            if(result.next()){
                return result.getString(userscolumns[8]);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error Code: " + e.getErrorCode(), JOptionPane.ERROR_MESSAGE);
        }finally{
            prepare.close();
            result.close();  
        }
        return null;        
    } 
}