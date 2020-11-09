package Files;

import static Files.Data_Files.filePath;
import static Files.Data_Files.filePathCSV;
import static Files.Data_Files.p;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan_K
 */
public class Savefile {
    
    public static void saveObjects() {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for ( int i = 0; i < p.size(); i++ ){
                oos.writeObject(p.get(i));
            }
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Savefile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Savefile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void saveAsCSV() {
        String information = "";
        
        try {
            FileWriter w = new FileWriter(filePathCSV);
            for ( int i = 0 ; i < p.size(); i++ ) {
                information = information.concat(p.get(i).toString()) + "\n";
            }
            w.write(information);
            w.close();
        } catch (IOException ex) {
            Logger.getLogger(Savefile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
