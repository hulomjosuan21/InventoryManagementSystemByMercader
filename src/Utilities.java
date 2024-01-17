import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.text.DefaultFormatter;

public class Utilities extends Database{
    
    public Object get_RecordID(javax.swing.JTable tb){
        try{
            return tb.getValueAt(tb.getSelectedRow(), 0);
        }catch(ArrayIndexOutOfBoundsException e){
            return null;
        }
    }    
    
    public Object[] get_RecordIDs(javax.swing.JTable tb){
        Object[] recordIDs = new Object[tb.getSelectedRowCount()];
        int[] selectedRows = tb.getSelectedRows();

        for (int i = 0; i < selectedRows.length; i++) {
            try {
                recordIDs[i] = tb.getValueAt(selectedRows[i], 0);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
                recordIDs[i] = 0; 
            }
        }
        return recordIDs;
    } 
    
    public String getEditedValue1(javax.swing.JTable table){
        int editedRow = table.getEditingRow();
        int editedColumn = table.getEditingColumn();
        
        table.editCellAt(table.getSelectedRow(), table.getSelectedColumn());
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        String editedValue = null;
        
        if (editedRow != -1 && editedColumn != -1) {
            TableCellEditor editor = table.getCellEditor(editedRow, editedColumn);
            if (editor != null) {
                editor.stopCellEditing();
            }
            editedValue = model.getValueAt(editedRow, editedColumn).toString();
        }
        
        return editedValue;
    }
  
    public Object get_AddedDate(JDateChooser g_date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if(g_date.getDate() != null){
            return dateFormat.format(g_date.getDate());
        }
        return java.sql.Date.valueOf(LocalDate.now());
    }    
    
    public String first_LetterUpperCase(String text){
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }
    
}
