package specbee.com.pareekshanam.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import specbee.com.pareekshanam.Holder.GridViewHolder;
import specbee.com.pareekshanam.R;

/**
 * Created by PC on 22-12-2016.
 */

public class GridAdapter extends BaseAdapter {
    Context mContext;
    ArrayList<String> mArrayList;
    LayoutInflater mLayoutInflater;
    GridViewHolder gridViewHolder;

    public GridAdapter(Context context, ArrayList<String> arrayList) {
        mContext = context;
        mArrayList = arrayList;
        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return mArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            View view = mLayoutInflater.inflate(R.layout.item_grid,null);
            gridViewHolder = new GridViewHolder();
            gridViewHolder.tvTitle = (TextView) view.findViewById(R.id.tvTitle);
            gridViewHolder.imgImage = (ImageView)view.findViewById(R.id.imgGrid);
            view.setTag(gridViewHolder);
            convertView = view;
        }else{
            gridViewHolder = (GridViewHolder) convertView.getTag();
        }
        gridViewHolder.tvTitle.setText(mArrayList.get(position));
        return convertView;
    }
}


