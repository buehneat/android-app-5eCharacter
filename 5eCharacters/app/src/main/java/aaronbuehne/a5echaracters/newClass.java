package aaronbuehne.a5echaracters;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class newClass extends AppCompatActivity implements AdapterView.OnItemClickListener{

    String[] classArray = new String[12];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_class);

        classArray[0] = "Barbarian\n";
        classArray[1] = "Bard\n";
        classArray[2] = "Cleric\n";
        classArray[3] = "Druid\n";
        classArray[4] = "Fighter\n";
        classArray[5] = "Monk\n";
        classArray[6] = "Paladin\n";
        classArray[7] = "Ranger\n";
        classArray[8] = "Rogue\n";
        classArray[9] = "Sorcerer\n";
        classArray[10] = "Warlock\n";
        classArray[11] = "Wizard\n";

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, R.id.listTextView, classArray);

        ListView listView = (ListView) findViewById(R.id.classList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = null;
    }
}
