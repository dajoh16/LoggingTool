/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;

/**
 *
 * @author Daniel Johansen
 */
public class LoadRaider implements LoadFile<Raider> {
    String raiderName;
    @Override
    public ObservableList<Raider> loadObservableList(String fileToRead){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileToRead));
            while(reader.ready()){
                String evaluateString = reader.readLine();
                String[] stringArray = evaluateString.split("=");
                
                switch(stringArray[0]){
                    case "name":
                        raiderName = stringArray[stringArray.length-1];
                }
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LoadRaider.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LoadRaider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
