package aaronbuehne.a5echaracters;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class StartScreen extends AppCompatActivity {

    public static ArrayList<Character> characterBank = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
    }

    public void goNew(View view)
    {
        Intent intent = new Intent(this, newRace.class);
        startActivity(intent);
    }

}
