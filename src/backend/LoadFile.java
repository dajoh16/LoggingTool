/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import javafx.collections.ObservableList;

/**
 *
 * @author Danieln Johansen
 */
public interface LoadFile<T> {
	
    public ObservableList<T> loadObservableList(String fileToRead);
    
}
