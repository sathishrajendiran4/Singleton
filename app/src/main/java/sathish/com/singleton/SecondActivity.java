package sathish.com.singleton;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Sathish on 19-03-2016.
 */
public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Singleton.getInstance().setMtest("Android");
        Toast.makeText(getApplicationContext(), Singleton.getInstance().getString()+" "+Singleton.getInstance().getMtest()
                , Toast.LENGTH_LONG).show();
    }
}
