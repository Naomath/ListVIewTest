package com.lifeistech.naoto.listviewtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListViewSetUp listViewSetUp;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewSetUp = new ListViewSetUp(this, R.layout.listviewsetup);
        listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(listViewSetUp);
        TwoWords two_words = new TwoWords("Mac", "Windows");
        listViewSetUp.add(two_words);
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                ArrayAdapter adapter = (ArrayAdapter)listView.getAdapter();
                TwoWords item = (TwoWords) adapter.getItem(i);
                String japanese = item.getJapanese();
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Test",japanese);
                startActivity(intent);
                return false;
            }
        });
    }

    public void add(View view){
        int firstVisibleIndex = listView.getFirstVisiblePosition();
        View itemView = listView.getChildAt(firstVisibleIndex);
        String message = itemView.toString();
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();

    }
}
