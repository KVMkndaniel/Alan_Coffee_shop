
package Database;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author ELCOT
 */
public class tables {
    public static void main(String[] args){
        try{
            String userTable="CREATE TABLE  user1(First_name VARCHAR(200),Last_name VARCHAR(200),User_name VARCHAR(200),Gender varchar(1),phone_number VARCHAR(10),email_id VARCHAR(100) UNIQUE ,password VARCHAR(150),ConfirmPassword VARCHAR(150))";
            DbOperations.setDataOrDelete(userTable,"User table  Created Successfully");
          
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public ResultSet loginpage(String table, String column1, String User_name, String column2, String password) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public ResultSet user(String table, String column1, String User_name, String column2, String password) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
