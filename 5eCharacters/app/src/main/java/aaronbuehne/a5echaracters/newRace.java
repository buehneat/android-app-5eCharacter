package aaronbuehne.a5echaracters;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class newRace extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] raceArray = new String[28];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_race);

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
}
