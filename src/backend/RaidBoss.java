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
public class RaidBoss {
    private String m_name;
    
    RaidBoss(String name){
        m_name=name;
    }

    /**
     * @return the m_name
     */
    public String getM_name() {
        return m_name;
    }

    /**
     * @param m_name the m_name to set
     */
    public void setM_name(String m_name) {
        this.m_name = m_name;
    }
    
}
