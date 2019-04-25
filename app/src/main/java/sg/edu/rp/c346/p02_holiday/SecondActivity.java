package sg.edu.rp.c346.p02_holiday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    TextView title;
    ListView lvHolidays;
    ArrayList<Holiday> holidays;
    ArrayAdapter<Holiday> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        title = findViewById(R.id.textView);
        lvHolidays = findViewById(R.id.lvHolidays);

        Intent i = getIntent();
        int selected = i.getIntExtra("selected",0);
        holidays = new ArrayList<>();

        if(selected == 1){
            title.setText("Secular");
            holidays.add(new Holiday("New Year's Day", "1 Jan 2017", R.drawable.newyear));
            holidays.add(new Holiday("Labour Day", "1 May 2017", R.drawable.labour));
            aa = new HolidayAdapter(this, R.layout.row, holidays);
            lvHolidays.setAdapter(aa);

            lvHolidays.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Toast.makeText(SecondActivity.this, holidays.get(i).getTitle() + " Date: " + holidays.get(i).getDate(),Toast.LENGTH_LONG).show();
                }
            });

        }else{
            title.setText("Ethnic & Religion");
            holidays.add(new Holiday("Chinese New Year's", "28-29 Jan 2017", R.drawable.cny));
            holidays.add(new Holiday("Good Friday ", "14 April 2017", R.drawable.goodfriday));
            aa = new HolidayAdapter(this, R.layout.row, holidays);
            lvHolidays.setAdapter(aa);

            lvHolidays.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Toast.makeText(SecondActivity.this, holidays.get(i).getTitle() + "Date: " + holidays.get(i).getDate(),Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}
