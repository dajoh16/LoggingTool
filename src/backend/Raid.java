/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author Daniel Johansen
 */
public enum Raid {
    EN("Emerald Nightmare"), TOV("Trial of Valor");
    
    String raidTypeString;
    private Raid(String raidTypeString){
      this.raidTypeString = raidTypeString;
    }
    @Override
    public String toString(){
        return raidTypeString;
    }
}
