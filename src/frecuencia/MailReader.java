package frecuencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MailReader {
    
    private final String filepath;

    public MailReader(String filepath) {
        this.filepath = filepath;
    }
    
    public String[] readDomains() {
        ArrayList<String> domainsList = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            while (true) {
                String line = reader.readLine();
                if (line == null) break;
                if (line.contains("@")) domainsList.add(line.split("@")[1]);
            }
        } catch (IOException ex) {
            Logger.getLogger(MailReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return domainsList.toArray(new String[domainsList.size()]);
    }
    
}
