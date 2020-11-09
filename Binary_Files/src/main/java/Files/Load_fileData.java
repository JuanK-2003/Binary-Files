package Files;

import Class.person;
import static Files.Data_Files.filePath;
import static Files.Data_Files.p;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Juan_K
 */
public class Load_fileData {
    
    public static void load () throws IOException {
        Object b = null;
        
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while( ( b = ois.readObject() ) != null){
                p.add((person) b);
            }
            ois.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Load_fileData.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(Load_fileData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    
