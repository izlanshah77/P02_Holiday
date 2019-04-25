package sg.edu.rp.c346.p02_holiday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvType;
    ArrayList<String> types;
    ArrayAdapter<String> aaTypes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvType = findViewById(R.id.lvHolidayType);

        types = new ArrayList<>();
        types.add("secular");
        types.add("ethnic and religion");

        aaTypes = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, types);
        lvType.setAdapter(aaTypes);

        lvType.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("selected", i+1);
                startActivity(intent);
            }
        });

    }
}
