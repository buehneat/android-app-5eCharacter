package aaronbuehne.a5echaracters;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class newRace extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] raceArray = new String[28];
    public static ArrayList<Race> raceList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_race);

        this.populateList();

        raceArray[0] = "Dwarf\n";
        raceArray[1] = "Elf\n";
        raceArray[2] = "Halfling\n";
        raceArray[3] = "Human\n";
        raceArray[4] = "Dragonborn\n";
        raceArray[5] = "Gnome\n";
        raceArray[6] = "Half-Elf\n";
        raceArray[7] = "Half-Orc\n";
        raceArray[8] = "Tiefling\n";
        raceArray[9] = "Aasimar\n";
        raceArray[10] = "Firbolg\n";
        raceArray[11] = "Goliath\n";
        raceArray[12] = "Kenku\n";
        raceArray[13] = "Lizardfolk\n";
        raceArray[14] = "Tabaxi\n";
        raceArray[15] = "Triton\n";
        raceArray[16] = "Bugbear\n";
        raceArray[17] = "Goblin\n";
        raceArray[18] = "Hobgoblin\n";
        raceArray[19] = "Kobold\n";
        raceArray[20] = "Yuan-Ti Pureblood\n";
        raceArray[21] = "Tortle\n";
        raceArray[22] = "Changeling\n";
        raceArray[23] = "Minotaur\n";
        raceArray[24] = "Shifter\n";
        raceArray[25] = "Warforged\n";
        raceArray[26] = "Gith\n";
        raceArray[27] = "Make Your Own\n";

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, R.id.listTextView, raceArray);

        ListView listView = (ListView) findViewById(R.id.raceList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = null;
    }

    public void back(View view)
    {
        Intent intent = new Intent(this, StartScreen.class);
        startActivity(intent);
    }

    public void populateList()
    {
        raceList = new ArrayList<>();

        raceList.add(new Race("Hill Dwarf", "Medium", 0, 0, 2, 0, 1, 0, "", "Common;Dwarvish",
                "Darkvision. Accustomed to life underground, you have superior vision in dark " +
                        "and dim conditions. You can see in dim light within 60 feet of you as if " +
                        "it were bright light, and in darkness as if it were dim light. " +
                        "You can't discern color in darkness, only shades of gray.\n" +
                        "Dwarven Resilienee. Vou have advantage on saving throws against poison, " +
                        "and you have resistance against poison damage.\n" +
                        "Dwarven Combat Training. You have proficiency with " +
                        "the battleaxe, handaxe, throwing hammer, and warhammer.\n" +
                        "Tool Proficieney. You gain proficiency with the artisan's tools of your choice: " +
                        "smith's toolss, brewer's supplies, or mason's tools.\n" +
                        "Stonecunning. Whenever you make an Intelligence (History) check related to the origin of " +
                        "stonework, you are considered proficient in the History skill and add double " +
                        "your proficiency bonus to the check, instead of your normal proficiency bonus.\n" +
                        "Dwarven Toughness. Your hit point maximum increases by 1, " +
                        "and it increases by 1 every time you gain a level.", 25));

        raceList.add(new Race("Mountain Dwarf", "Medium", 2, 0, 2, 0, 0, 0, "", "Common;Dwarvish",
                "Darkvision. Accustomed to life underground, you have superior vision in dark " +
                        "and dim conditions. You can see in dim light within 60 feet of you as if " +
                        "it were bright light, and in darkness as if it were dim light. " +
                        "You can't discern color in darkness, only shades of gray.\n" +
                        "Dwarven Resilienee. Vou have advantage on saving throws against poison, " +
                        "and you have resistance against poison damage.\n" +
                        "Dwarven Combat Training. You have proficiency with " +
                        "the battleaxe, handaxe, throwing hammer, and warhammer.\n" +
                        "Tool Proficieney. You gain proficiency with the artisan's tools of your choice: " +
                        "smith's toolss, brewer's supplies, or mason's tools.\n" +
                        "Stonecunning. Whenever you make an Intelligence (History) check related to the origin of " +
                        "stonework, you are considered proficient in the History skill and add double " +
                        "your proficiency bonus to the check, instead of your normal proficiency bonus.\n" +
                        "Dwarven Armor Training. You have proficiency with light and medium armor.", 25));

        raceList.add(new Race("Revenant Dwarf", "Medium", 0, 0, 3, 0, 0, 0, "", "Common;Dwarvish",
                "Darkvision. Accustomed to life underground, you have superior vision in dark " +
                        "and dim conditions. You can see in dim light within 60 feet of you as if " +
                        "it were bright light, and in darkness as if it were dim light. " +
                        "You can't discern color in darkness, only shades of gray.\n" +
                        "Dwarven Resilienee. Vou have advantage on saving throws against poison, " +
                        "and you have resistance against poison damage.\n" +
                        "Dwarven Combat Training. You have proficiency with " +
                        "the battleaxe, handaxe, throwing hammer, and warhammer.\n" +
                        "Tool Proficieney. You gain proficiency with the artisan's tools of your choice: " +
                        "smith's toolss, brewer's supplies, or mason's tools.\n" +
                        "Stonecunning. Whenever you make an Intelligence (History) check related to the origin of " +
                        "stonework, you are considered proficient in the History skill and add double " +
                        "your proficiency bonus to the check, instead of your normal proficiency bonus.\n" +
                        "Relentless Nature. " +
                        "Your DM assigns a goal to you—typically, one " +
                        "related to your character’s death. The goal must be " +
                        "a specific task you can complete, such as slaying an " +
                        "enemy or liberating an area and its people. Until " +
                        "you fulfill that goal, you gain the following " +
                        "benefits:\n" +
                        "• If you are below half your hit point maximum at " +
                        "the start of your turn, you regain 1 hit point.\n" +
                        "• If you die, you return to life 24 hours after death. " +
                        "If your body is destroyed, you reform within 1 " +
                        "mile of the place of your death at a spot " +
                        "determined by the DM. If your equipment was " +
                        "also destroyed, you do not regain it.\n" +
                        "• You know the distance and direction between " +
                        "you and any creature involved in your goal, such " +
                        "as a person you seek vengeance against or " +
                        "someone you pledged to defend. This awareness " +
                        "fails if the creature is on another plane of " +
                        "existence.\n" +
                        "When your goal is complete, you finally find rest. " +
                        "You die and cannot be restored to life.", 25));

        raceList.add(new Race("High Elf", "Medium", 0, 2, 0, 1, 0, 0, "Perception", "Common;Elvish;Extra",
            "Darkvision. Accustomed to twilit forests and the night sky, you have superior vision io dark aod dim cooditions. " +
                    "You can see in dim light within 60 feet of you as if " +
                    "it were bright light, and in darkness as if it were dim light. " +
                    "You can't discern color in darkness, only shades of gray.\n" +
                    "Fey Ancestry. You have advantage on saving throws against " +
                    "being charmed, and magic can't put you to sleep.\n" +
                    "Trance. Elves don't need to sleep. Instead, they meditate deeply, remaining " +
                    "semiconscious, for 4 hours a day. (The Common word for such meditation is \"trance.\") " +
                    "While meditating, you can dream after a fashion; such dreams are actually mental exercises " +
                    "that have become reflexive through years of practice. After resting io this way, you gain" +
                    " the same benefit that a humao does from 8 hours of sleep.\n" +
                    "Elf Weapon Training. You have proficiency with lhe longsword, shortsword, shortbow, and longbow.\n" +
                    "Cantrip. You know one cantrip of your choice from the wizard spell list. " +
                    "Intelligence is your spellcasting modifier for it\n", 30));

        raceList.add(new Race("Wood Elf", "Medium", 0, 2, 0, 0, 1, 0, "Perception", "Common;Elvish",
                "Darkvision. Accustomed to twilit forests and the night sky, you have superior vision io dark aod dim cooditions. " +
                        "You can see in dim light within 60 feet of you as if " +
                        "it were bright light, and in darkness as if it were dim light. " +
                        "You can't discern color in darkness, only shades of gray.\n" +
                        "Fey Ancestry. You have advantage on saving throws against " +
                        "being charmed, and magic can't put you to sleep.\n" +
                        "Trance. Elves don't need to sleep. Instead, they meditate deeply, remaining " +
                        "semiconscious, for 4 hours a day. (The Common word for such meditation is \"trance.\") " +
                        "While meditating, you can dream after a fashion; such dreams are actually mental exercises " +
                        "that have become reflexive through years of practice. After resting io this way, you gain" +
                        " the same benefit that a human does from 8 hours of sleep.\n" +
                        "Elf Weapon Training. You have proficiency with lhe longsword, shortsword, shortbow, and longbow.\n" +
                        "Mask of the Wild. You can attempt to hide even when you are only lightly obscured by " +
                        "foliage, heavy rain, falling snow, mist, and other natural phenomena.\n", 35));

        raceList.add(new Race("Dark Elf", "Medium", 0, 2, 0, 0, 0, 1, "Perception", "Common;Elvish",
                "Darkvision. Accustomed to twilit forests and the night sky, you have superior vision io dark aod dim cooditions. " +
                        "You can see in dim light within 60 feet of you as if " +
                        "it were bright light, and in darkness as if it were dim light. " +
                        "You can't discern color in darkness, only shades of gray.\n" +
                        "Fey Ancestry. You have advantage on saving throws against " +
                        "being charmed, and magic can't put you to sleep.\n" +
                        "Trance. Elves don't need to sleep. Instead, they meditate deeply, remaining " +
                        "semiconscious, for 4 hours a day. (The Common word for such meditation is \"trance.\") " +
                        "While meditating, you can dream after a fashion; such dreams are actually mental exercises " +
                        "that have become reflexive through years of practice. After resting io this way, you gain" +
                        " the same benefit that a human does from 8 hours of sleep.\n" +
                        "Superior Darkvision. Your darkvision has a radius of 120 feet\n" +
                        "Sunlight Sensitivity. You have disadvantage on attack rolls and on Wisdom (Perception) checks " +
                        "that rely on sight when you, lhe targel of your attack, or whatever you are trying to perceive " +
                        "is in direct sunlight.\n" +
                        "Drow Magic. You know lhe dancing lights cantrip. When you reach 3rd level, you can " +
                        "cast the faerie fire spell once per day. When you reach 5th level, you can also cast lhe " +
                        "darkness spell once per day. Charisma is your spellcasting ability for these spells.\n" +
                        "Drow Weapon Training. You have proficiency with rapiers, shortswords, and hand crossbows.", 30));

        raceList.add(new Race("Revenant Elf", "Medium", 0, 2, 1, 0, 0, 0, "Perception", "Common;Elvish",
                "Darkvision. Accustomed to twilit forests and the night sky, you have superior vision io dark aod dim cooditions. " +
                        "You can see in dim light within 60 feet of you as if " +
                        "it were bright light, and in darkness as if it were dim light. " +
                        "You can't discern color in darkness, only shades of gray.\n" +
                        "Fey Ancestry. You have advantage on saving throws against " +
                        "being charmed, and magic can't put you to sleep.\n" +
                        "Trance. Elves don't need to sleep. Instead, they meditate deeply, remaining " +
                        "semiconscious, for 4 hours a day. (The Common word for such meditation is \"trance.\") " +
                        "While meditating, you can dream after a fashion; such dreams are actually mental exercises " +
                        "that have become reflexive through years of practice. After resting io this way, you gain" +
                        " the same benefit that a human does from 8 hours of sleep.\n" +
                        "Relentless Nature. " +
                        "Your DM assigns a goal to you—typically, one " +
                        "related to your character’s death. The goal must be " +
                        "a specific task you can complete, such as slaying an " +
                        "enemy or liberating an area and its people. Until " +
                        "you fulfill that goal, you gain the following " +
                        "benefits:\n" +
                        "• If you are below half your hit point maximum at " +
                        "the start of your turn, you regain 1 hit point.\n" +
                        "• If you die, you return to life 24 hours after death. " +
                        "If your body is destroyed, you reform within 1 " +
                        "mile of the place of your death at a spot " +
                        "determined by the DM. If your equipment was " +
                        "also destroyed, you do not regain it.\n" +
                        "• You know the distance and direction between " +
                        "you and any creature involved in your goal, such " +
                        "as a person you seek vengeance against or " +
                        "someone you pledged to defend. This awareness " +
                        "fails if the creature is on another plane of " +
                        "existence.\n" +
                        "When your goal is complete, you finally find rest. " +
                        "You die and cannot be restored to life.", 30));

        raceList.add(new Race("Lightfoot Halfling", "Small", 0, 2, 0, 0, 0, 1, "", "Common;Halfing",
                "Lucky. When you roll a 1 on an attack roll, ability check, or saving throw, you can reroll " +
                        "the die and must use the new roll.\n" +
                        "Brave. You have advantage on saving throws against being frightened.\n" +
                        "Halfling Nimbleness. You can move through the space of any creature that is " +
                        "of a size larger than yours.\n" +
                        "Naturally Stealthy. You can attempt to hide even when you are obscured " +
                        "only by a creature that is at least one size larger than you.", 25));

        raceList.add(new Race("Stout Halfling", "Small", 0, 2, 1, 0, 0, 0, "", "Common;Halfing",
                "Lucky. When you roll a 1 on an attack roll, ability check, or saving throw, you can reroll " +
                        "the die and must use the new roll.\n" +
                        "Brave. You have advantage on saving throws against being frightened.\n" +
                        "Halfling Nimbleness. You can move through the space of any creature that is " +
                        "of a size larger than yours.\n" +
                        "Stout Resilience. You have advantage on saving throws against poison, " +
                        "and you have resistance against poison damage.", 25));

        raceList.add(new Race("Revenant Halfling", "Small", 0, 2, 1, 0, 0, 0, "", "Common;Halfing",
                "Lucky. When you roll a 1 on an attack roll, ability check, or saving throw, you can reroll " +
                        "the die and must use the new roll.\n" +
                        "Brave. You have advantage on saving throws against being frightened.\n" +
                        "Halfling Nimbleness. You can move through the space of any creature that is " +
                        "of a size larger than yours.\n" +
                        "Relentless Nature. " +
                        "Your DM assigns a goal to you—typically, one " +
                        "related to your character’s death. The goal must be " +
                        "a specific task you can complete, such as slaying an " +
                        "enemy or liberating an area and its people. Until " +
                        "you fulfill that goal, you gain the following " +
                        "benefits:\n" +
                        "• If you are below half your hit point maximum at " +
                        "the start of your turn, you regain 1 hit point.\n" +
                        "• If you die, you return to life 24 hours after death. " +
                        "If your body is destroyed, you reform within 1 " +
                        "mile of the place of your death at a spot " +
                        "determined by the DM. If your equipment was " +
                        "also destroyed, you do not regain it.\n" +
                        "• You know the distance and direction between " +
                        "you and any creature involved in your goal, such " +
                        "as a person you seek vengeance against or " +
                        "someone you pledged to defend. This awareness " +
                        "fails if the creature is on another plane of " +
                        "existence.\n" +
                        "When your goal is complete, you finally find rest. " +
                        "You die and cannot be restored to life.", 25));

        raceList.add(new Race("Human", "Medium", 1, 1, 1, 1, 1, 1, "", "Common;Extra", "", 30));

        raceList.add(new Race("Variant Human", "Medium", 0, 0, 0, 0, 0, 0, "Choice,1", "Common;Extra",
                "Feat. You gain one feat of your choice.", 30));

        raceList.add(new Race("Revenant Human", "Medium", 0, 0, 1, 0, 0, 0, "", "Common;Extra", "Relentless Nature. " +
                "Your DM assigns a goal to you—typically, one " +
                "related to your character’s death. The goal must be " +
                "a specific task you can complete, such as slaying an " +
                "enemy or liberating an area and its people. Until " +
                "you fulfill that goal, you gain the following " +
                "benefits:\n" +
                "• If you are below half your hit point maximum at " +
                "the start of your turn, you regain 1 hit point.\n" +
                "• If you die, you return to life 24 hours after death. " +
                "If your body is destroyed, you reform within 1 " +
                "mile of the place of your death at a spot " +
                "determined by the DM. If your equipment was " +
                "also destroyed, you do not regain it.\n" +
                "• You know the distance and direction between " +
                "you and any creature involved in your goal, such " +
                "as a person you seek vengeance against or " +
                "someone you pledged to defend. This awareness " +
                "fails if the creature is on another plane of " +
                "existence.\n" +
                "When your goal is complete, you finally find rest. " +
                "You die and cannot be restored to life.", 30));
    }

}
