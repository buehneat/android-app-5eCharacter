package aaronbuehne.a5echaracters;

/**
 * Created by aaronbuehne on 11/12/17.
 */

public class Race {

    public String name;
    public String size;
    public int strMod;
    public int dexMod;
    public int conMod;
    public int intMod;
    public int wisMod;
    public int chrMod;
    public String raceSkillProficiencies;
    public String raceLanguages;
    public String raceExtras;
    public int raceSpeed;

    public Race(String name, String size, int strMod, int dexMod, int conMod, int intMod, int wisMod,
                int chrMod, String raceSkillProficiencies, String raceLanguages, String raceExtras, int raceSpeed)
    {
        setName(name);
        setSize(size);
        setStrMod(strMod);
        setDexMod(dexMod);
        setConMod(conMod);
        setIntMod(intMod);
        setWisMod(wisMod);
        setChrMod(chrMod);
        setRaceSkillProficiencies(raceSkillProficiencies);
        setRaceLanguages(raceLanguages);
        setRaceExtras(raceExtras);
        setRaceSpeed(raceSpeed);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getStrMod() {
        return strMod;
    }

    public int getDexMod() {
        return dexMod;
    }

    public int getConMod() {
        return conMod;
    }

    public int getIntMod() {
        return intMod;
    }

    public int getWisMod() {
        return wisMod;
    }

    public int getChrMod() {
        return chrMod;
    }

    public String getRaceSkillProficiencies() {
        return raceSkillProficiencies;
    }

    public String getRaceLanguages() {
        return raceLanguages;
    }

    public String getRaceExtras() {
        return raceExtras;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setStrMod(int strMod) {
        this.strMod = strMod;
    }

    public void setDexMod(int dexMod) {
        this.dexMod = dexMod;
    }

    public void setConMod(int conMod) {
        this.conMod = conMod;
    }

    public void setIntMod(int intMod) {
        this.intMod = intMod;
    }

    public void setWisMod(int wisMod) {
        this.wisMod = wisMod;
    }

    public void setChrMod(int chrMod) {
        this.chrMod = chrMod;
    }

    public void setRaceSkillProficiencies(String raceSkillProficiencies) {
        this.raceSkillProficiencies = raceSkillProficiencies;
    }

    public void setRaceLanguages(String raceLanguages) {
        this.raceLanguages = raceLanguages;
    }

    public void setRaceExtras(String raceExtras) {
        this.raceExtras = raceExtras;
    }

    public int getRaceSpeed() {
        return raceSpeed;
    }

    public void setRaceSpeed(int raceSpeed) {
        this.raceSpeed = raceSpeed;
    }
}
