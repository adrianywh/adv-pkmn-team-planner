/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advpkmnteamplanner;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ADRIAN
 */
public class Data {

    public static final int MAX_PKMN = 6;
    public static final double[][] WeaknessTable = {
        {1, 1, 1, 1, 1, 0.5, 1, 0, 0.5, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {2, 1, 0.5, 0.5, 1, 2, 0.5, 0, 2, 1, 1, 1, 1, 0.5, 2, 1, 2, 0.5},
        {1, 2, 1, 1, 1, 0.5, 2, 1, 0.5, 1, 1, 2, 0.5, 1, 1, 1, 1, 1},
        {1, 1, 1, 0.5, 0.5, 0.5, 1, 0.5, 0, 1, 1, 2, 1, 1, 1, 1, 1, 2},
        {1, 1, 0, 2, 1, 2, 0.5, 1, 2, 2, 1, 0.5, 2, 1, 1, 1, 1, 1},
        {1, 0.5, 2, 1, 0.5, 1, 2, 1, 0.5, 2, 1, 1, 1, 1, 2, 1, 1, 1},
        {1, 0.5, 0.5, 0.5, 1, 1, 1, 0.5, 0.5, 0.5, 1, 2, 1, 2, 1, 1, 2, 0.5},
        {0, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 0.5, 1},
        {1, 1, 1, 1, 1, 2, 1, 1, 0.5, 0.5, 0.5, 1, 0.5, 1, 2, 1, 1, 2},
        {1, 1, 1, 1, 1, 0.5, 2, 1, 2, 0.5, 0.5, 2, 1, 1, 2, 0.5, 1, 1},
        {1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 0.5, 0.5, 1, 1, 1, 0.5, 1, 1},
        {1, 1, 0.5, 0.5, 2, 2, 0.5, 1, 0.5, 0.5, 2, 0.5, 1, 1, 1, 0.5, 1, 1},
        {1, 1, 2, 1, 0, 1, 1, 1, 1, 1, 2, 0.5, 0.5, 1, 1, 0.5, 1, 1},
        {1, 2, 1, 2, 1, 1, 1, 1, 0.5, 1, 1, 1, 1, 0.5, 1, 1, 0, 1},
        {1, 1, 2, 1, 2, 1, 1, 1, 0.5, 0.5, 0.5, 2, 1, 1, 0.5, 2, 1, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 0.5, 1, 1, 1, 1, 1, 1, 2, 1, 0},
        {1, 0.5, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 0.5, 0.5},
        {1, 2, 1, 0.5, 1, 1, 1, 1, 0.5, 0.5, 1, 1, 1, 1, 1, 2, 2, 1}};

    public static final String NORMAL_TEXT = "Normal";
    public static final String FIGHT_TEXT = "Fight";
    public static final String FLYING_TEXT = "Flying";
    public static final String POISON_TEXT = "Poison";
    public static final String GROUND_TEXT = "Ground";
    public static final String ROCK_TEXT = "Rock";
    public static final String BUG_TEXT = "Bug";
    public static final String GHOST_TEXT = "Ghost";
    public static final String STEEL_TEXT = "Steel";
    public static final String FIRE_TEXT = "Fire";
    public static final String WATER_TEXT = "Water";
    public static final String GRASS_TEXT = "Grass";
    public static final String ELECTRIC_TEXT = "Electric";
    public static final String PSYHIC_TEXT = "Psyhic";
    public static final String ICE_TEXT = "Ice";
    public static final String DRAGON_TEXT = "Dragon";
    public static final String DARK_TEXT = "Dark";
    public static final String FAIRY_TEXT = "Fairy";
    public static final String NONE_TEXT = "(NONE)";
    public static final String[] TYPE_ARRAY = {NONE_TEXT,NORMAL_TEXT, FIGHT_TEXT, FLYING_TEXT,
        POISON_TEXT, GROUND_TEXT, ROCK_TEXT,
        BUG_TEXT, GHOST_TEXT, STEEL_TEXT,
        FIRE_TEXT, WATER_TEXT, GRASS_TEXT,
        ELECTRIC_TEXT, PSYHIC_TEXT, ICE_TEXT,
        DRAGON_TEXT, DARK_TEXT, FAIRY_TEXT};
    public static final List<String> TYPE_LIST = Arrays.asList(TYPE_ARRAY);

    public static final int NORMAL_INDEX = 0;
    public static final int FIGHT_INDEX = 1;
    public static final int FLYING_INDEX = 2;
    public static final int POISON_INDEX = 3;
    public static final int GROUND_INDEX = 4;
    public static final int ROCK_INDEX = 5;
    public static final int BUG_INDEX = 6;
    public static final int GHOST_INDEX = 7;
    public static final int STEEL_INDEX = 8;
    public static final int FIRE_INDEX = 9;
    public static final int WATER_INDEX = 10;
    public static final int GRASS_INDEX = 11;
    public static final int ELECTRIC_INDEX = 12;
    public static final int PSYHIC_INDEX= 13;
    public static final int ICE_INDEX = 14;
    public static final int DRAGON_INDEX = 15;
    public static final int DARK_INDEX = 16;
    public static final int FAIRY_INDEX = 17;

    public static final String RESIST_TEXT = "RESIST";
    public static final String IMMUNE_TEXT ="IMMUNE";
    public static final String WEAK_TEXT ="WEAK";
    
    public static final int ConvertTypeStringToInt(String type){
        for(int i=0;i<TYPE_LIST.size();i++){
            if(type.equals(TYPE_LIST.get(i))){
                return i-1;
            }
        }
        System.out.println("Type does not exist- "+type);
        return 999;
    }
}
