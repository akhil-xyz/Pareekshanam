package specbee.com.pareekshanam.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import specbee.com.pareekshanam.R;

/**
 * Created by PC on 03-01-2017.
 */

public class SplashScreen extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            startActivity(new Intent(SplashScreen.this,HomeActivity.class));
                            finish();
                        }
                    });

                } catch (Throwable e) {
                    Log.e("Thread",e.getMessage()+"");
                }
            }
        }).start();
    }
}
