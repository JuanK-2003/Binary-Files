package Class;

import java.io.File;

/**
 *
 * @author Juan_K
 */
public class Directory {
        
    public static String filesPath = System.getProperty("user.home");
    
    public static String[] getDirectoriesAsArrayString() {
        File f = new File(filesPath);
        String[] a = f.list();
        return a;
    }
}
