
package Database;

import java.sql.ResultSet;
import  models.User;

/**
 *
 * @author ELCOT
 */
public class UserDB {
    public static void reg(User user1){
        String query = "insert into user1( First_name , Last_name  ,Gender , phone_number , email_id , password,ConfirmPassword ) VALUES ('"+user1.getFirst_name()+"','"+user1.getLast_name()+"','"+user1.getGender()+"','"+user1.getPhone_number()+"','"+user1.getEmail_id()+"','"+user1.getPassword()+"','"+user1.getConfirmPassword()+"')";
        DbOperations.setDataOrDelete( query , "Registerd Successfully! Wait For Admin Approval!");
    }
 
}
