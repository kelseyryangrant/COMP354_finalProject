package edu.ithaca;

/**
 * extended by Character class
 * Includes a constructor to set inital stats
 * Includes public getters and setters for all stats to allow the DungeonMaster to edit stats w/o creating a new character
 **/
public class QuantativeStats {
    public int moveSpeed;
    public int armorClass;
    public int hp;
    public int con;
    public int str;
    public int wis;
    public int intel;
    public int dex;
    public int cha;

    /**
     * Contructor
     * @param moveSpeed - Range a character can move in a single turn
     * @param armorClass - armor class, how difficult the creature is to hit
     * @param hp - hit points, how much damage the creature must take before being defeated
     * @param con - Consititution ability score
     * @param str - Strength ability score
     * @param wis - Wisdom ability score
     * @param intel - Intelligence ability score
     * @param dex - Dexterity ability score
     * @param cha - Charisma ability score
     */
    public QuantativeStats(int moveSpeed, int armorClass, int hp, int con, int str, int wis, int intel, int dex,
            int cha) {
        this.moveSpeed = moveSpeed;
        this.armorClass = armorClass;
        this.hp = hp;
        this.con = con;
        this.str = str;
        this.wis = wis;
        this.intel = intel;
        this.dex = dex;
        this.cha = cha;
    }
    public int getMoveSpeed() {
        return this.moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public int getArmorClass() {
        return this.armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getCon() {
        return this.con;
    }

    public void setCon(int con) {
        this.con = con;
    }

    public int getStr() {
        return this.str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getWis() {
        return this.wis;
    }

    public void setWis(int wis) {
        this.wis = wis;
    }

    public int getIntel() {
        return this.intel;
    }

    public void setIntel(int intel) {
        this.intel = intel;
    }

    public int getDex() {
        return this.dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getCha() {
        return this.cha;
    }

    public void setCha(int cha) {
        this.cha = cha;
    }

}