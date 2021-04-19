package edu.ithaca;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import edu.ithaca.QualatativeStats.alignment;
import edu.ithaca.QualatativeStats.size;

import java.util.*;

public class Enemy {
    private boolean isHumanoid;
    private boolean isMagicUser;
    private String terrain;
    private String movementType;
    private QuantativeStats quanStats;
    private QualatativeStats qualStats;


    public boolean getIsHumanoid(){
        return isHumanoid;
    }

    public boolean getIsMagicUser(){
        return isMagicUser;
    }

    public String getTerrain(){
        return terrain;
    }

    public String getMovementType(){
        return movementType;
    }

    //qualitative stats
    public alignment getAlignment(){
        return qualStats.getAlign();
    }

    public size getSize(){
        return qualStats.getSize();
    }

    public ArrayList<String> getLanguages(){
        return qualStats.getLanguages();
    }

    //quantitative stats
    public int getMoveSpeed(){
        return quanStats.getMoveSpeed();
    }

    public int getArmorClass(){
        return quanStats.getArmorClass();
    }

    public int getHP(){
        return quanStats.getHp();
    }

    public int getCon(){
        return quanStats.getCon();
    }

    public int getStr(){
        return quanStats.getStr();
    }

    public int getWis(){
        return quanStats.getWis();
    }

    public int getIntel(){
        return quanStats.getIntel();
    }

    public int getDex(){
        return quanStats.getDex();
    }

    public int getCha(){
        return quanStats.getCha();
    }

    /**
     * Constructor
     * @param isHumanoid - gives a clue to the default behavior of the creatures
     * @param isMagicUser - size of creature, how much space it occupies
     * @param terrain - list of languages the character can speak
     * @param movementType - the char used to seperate in the languages parameter
     */
    public Enemy(boolean isHumanoid, boolean isMagicUser, String terrain, String movementType,
    QuantativeStats qualStats, QuantativeStats quanStats){
        this.isHumanoid = isHumanoid;
        this.isMagicUser = isMagicUser;
        this.terrain = terrain;
        this.movementType = movementType;        
        this.qualStats = qualStats;
        this.quanStats = quanStats;
        }
    }
