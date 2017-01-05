package specbee.com.pareekshanam.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import specbee.com.pareekshanam.Adapter.GridAdapter;
import specbee.com.pareekshanam.R;

/**
 * Created by PC on 05-01-2017.
 */

public class Subcategories extends Activity
{

    GridView mGridView;
    GridAdapter mGridAdapter;
    ArrayList<String> mArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subcategories);

        mArrayList = new ArrayList<String>();
        mArrayList.add("Six");
        mArrayList.add("Seven");
        mArrayList.add("Eight");
        mArrayList.add("Nine");
        mArrayList.add("Ten");

        mGridView = (GridView)findViewById(R.id.gridView);
        mGridAdapter = new GridAdapter(Subcategories.this,mArrayList);
        mGridView.setAdapter(mGridAdapter);

        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView = (TextView)view.findViewById(R.id.tvTitle);
                if(textView.getText().toString().equals("Ten"))
                {
                    startActivity(new Intent(Subcategories.this,HomeActivity.class));
                    finish();
                    return;
                }
                Toast.makeText(Subcategories.this, ""+textView.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
