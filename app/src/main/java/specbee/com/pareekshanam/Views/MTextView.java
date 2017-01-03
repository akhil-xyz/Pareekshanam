package specbee.com.pareekshanam.Views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import specbee.com.pareekshanam.Utils.GlobalConstants;

/**
 * Created by PC on 16-12-2016.
 */

public class MTextView extends TextView
{
    public MTextView(Context context) {
        super(context);
        setCustomTypeFace(this);
    }

    public MTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setCustomTypeFace(this);
    }

    public MTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setCustomTypeFace(this);
    }

    public MTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
        setCustomTypeFace(this);
    }

    private void setCustomTypeFace(MTextView mTextView) {
        if(GlobalConstants.malayalam ==null)
            GlobalConstants.malayalam = Typeface.createFromAsset(mTextView.getContext().getAssets(),"fonts/rachanabold.ttf");
         mTextView.setTypeface(GlobalConstants.malayalam);
    }
}
