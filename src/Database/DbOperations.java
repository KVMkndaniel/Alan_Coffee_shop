
package Database;
//import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author ELCOT
 */
public class DbOperations {
    public static void setDataOrDelete(String Query,String msg) {
        try{
            Connection  con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate(Query);
            if(!msg.equals("") ) {
                JOptionPane.showMessageDialog(null, msg);
        }
    }
        catch (Exception e){
          JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
        }
    }
}
