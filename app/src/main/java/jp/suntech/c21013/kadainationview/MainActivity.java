package jp.suntech.c21013.kadainationview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lvCountry = findViewById(R.id.lvCountry);
        lvCountry.setOnItemClickListener(new ListItemClickListener());
    }
    private class ListItemClickListener implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            //String item = (String) parent.getItemAtPosition(position);
            TextView tvText = (TextView)view;
            String item = tvText.getText().toString();
            TextView output = findViewById(R.id.tvOutput);
            output.setText(item);
        }
    }
}
