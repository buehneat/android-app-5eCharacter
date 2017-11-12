package aaronbuehne.a5echaracters;

/**
 * Created by aaronbuehne on 11/12/17.
 */

public class Character {
    public int str;
    public int dex;
    public int con;
    public int inteli;
    public int wis;
    public int chr;

    public Character() {
        int str = -1;
        int dex = -1;
        int con = -1;
        int inteli = -1;
        int wis = -1;
        int chr = -1;
    }

    public Character(int str, int dex, int con, int intelli, int wis, int chr) {
        this.str = str;
        this.dex = dex;
        this.con = con;
        this.inteli = intelli;
        this.wis = wis;
        this.chr = chr;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public void setCon(int con) {
        this.con = con;
    }

    public void setInteli(int inteli) {
        this.inteli = inteli;
    }

    public void setWis(int wis) {
        this.wis = wis;
    }

    public void setChr(int chr) {
        this.chr = chr;
    }

    public int getStr() {
        return str;
    }

    public int getDex() {
        return dex;
    }

    public int getCon() {
        return con;
    }

    public int getInteli() {
        return inteli;
    }

    public int getWis() {
        return wis;
    }

    public int getChr() {
        return chr;
    }
}
