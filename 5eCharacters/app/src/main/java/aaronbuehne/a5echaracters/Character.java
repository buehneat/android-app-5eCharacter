package aaronbuehne.a5echaracters;

/**
 * Created by aaronbuehne on 11/12/17.
 */

public class Character {
    public  String name;
    public int str;
    public int dex;
    public int con;
    public int inteli;
    public int wis;
    public int chr;
    public Race race;

    public int speed;

    public Character() {
        name = null;
        str = -1;
        dex = -1;
        con = -1;
        inteli = -1;
        wis = -1;
        chr = -1;
        race = null;
    }

    public Character(String name, Race race, int str, int dex, int con, int intelli, int wis, int chr) {
        this.name = name;
        this.race = race;
        this.str = str;
        this.dex = dex;
        this.con = con;
        this.inteli = intelli;
        this.wis = wis;
        this.chr = chr;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
