package specbee.com.pareekshanam.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import specbee.com.pareekshanam.Adapter.GridAdapter;
import specbee.com.pareekshanam.R;

public class HomeActivity extends AppCompatActivity {

    GridView mGridView;
    GridAdapter mGridAdapter;
    ArrayList<String> mArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mArrayList = new ArrayList<String>();
        mArrayList.add("One");
        mArrayList.add("Two");
        mArrayList.add("Three");
        mArrayList.add("Four");
        mArrayList.add("Five");

        mGridView = (GridView) findViewById(R.id.gridView);
        mGridAdapter = new GridAdapter(HomeActivity.this, mArrayList);
        mGridView.setAdapter(mGridAdapter);

        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView = (TextView) view.findViewById(R.id.tvTitle);
                if(textView.getText().toString().equals("Five"))
                {
                    startActivity(new Intent(HomeActivity.this,Subcategories.class));
                    finish();
                    return;
                }
                Toast.makeText(HomeActivity.this, "" + textView.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });


    }
}
