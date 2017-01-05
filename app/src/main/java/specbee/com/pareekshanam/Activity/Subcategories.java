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

    GridView gridView;
    GridAdapter gridAdapter;
    ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subcategories);

        arrayList = new ArrayList<String>();
        arrayList.add("Six");
        arrayList.add("Seven");
        arrayList.add("Eight");
        arrayList.add("Nine");
        arrayList.add("Ten");

        gridView = (GridView)findViewById(R.id.gridView);
        gridAdapter = new GridAdapter(Subcategories.this, arrayList);
        gridView.setAdapter(gridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
