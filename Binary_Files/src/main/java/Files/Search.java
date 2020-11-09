package Files;

import static Files.Data_Files.p;

/**
 *
 * @author Juan_K
 */
public class Search {
    public static int searchByID(String ID){
        for ( int i = 0 ; i < p.size() ; i++ ){
            if(p.get(i).getID().equals(ID)){
                return i;
            }
        }
        return -1;
    }
}
