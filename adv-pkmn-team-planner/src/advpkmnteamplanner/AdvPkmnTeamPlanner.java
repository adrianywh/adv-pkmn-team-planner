/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advpkmnteamplanner;

import java.util.List;

/**
 *
 * @author ADRIAN
 */
public class AdvPkmnTeamPlanner {
    
    public List<String> getTypeList(){
        return Data.TYPE_LIST;
    }
    
    public double getWeaknessMultiplier(int atkIndex, int defIndex){
        return Data.WeaknessTable[atkIndex][defIndex];
    }
    
    public int getTypeInt(String type){
        return Data.ConvertTypeStringToInt(type);
    }
}
