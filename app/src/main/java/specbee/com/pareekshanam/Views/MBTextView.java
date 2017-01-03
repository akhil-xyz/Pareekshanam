package specbee.com.pareekshanam.Views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import specbee.com.pareekshanam.Utils.GlobalConstants;

/**
 * Created by PC on 16-12-2016.
 */

public class MBTextView extends TextView {
    public MBTextView(Context context) {
        super(context);
        setCustomTypeFace(this);
    }

    public MBTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setCustomTypeFace(this);
    }

    public MBTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setCustomTypeFace(this);
    }

    public MBTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
        setCustomTypeFace(this);
    }

    private void setCustomTypeFace(MBTextView MBTextView) {
        if (GlobalConstants.malayalamBold == null)
            GlobalConstants.malayalamBold = Typeface.createFromAsset(MBTextView.getContext().getAssets(), "fonts/rachanabold.ttf");
        MBTextView.setTypeface(GlobalConstants.malayalamBold);
    }
}
