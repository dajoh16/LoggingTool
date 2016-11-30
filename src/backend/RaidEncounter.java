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
public class RaidEncounter {
    
    private RaidGroup raidGroup;
    private Difficulty diff; 
    
    public RaidEncounter(RaidGroup raidGroup, Difficulty diff){
        this.raidGroup = raidGroup;
        this.diff = diff;
    }

    /**
     * @return the raidGroup
     */
    public RaidGroup getRaidGroup() {
        return raidGroup;
    }

    /**
     * @param raidGroup the raidGroup to set
     */
    public void setRaidGroup(RaidGroup raidGroup) {
        this.raidGroup = raidGroup;
    }

    /**
     * @return the diff
     */
    public Difficulty getDiff() {
        return diff;
    }

    /**
     * @param diff the diff to set
     */
    public void setDiff(Difficulty diff) {
        this.diff = diff;
    }
}
