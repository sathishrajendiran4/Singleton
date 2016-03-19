package sathish.com.singleton;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toast.makeText(getApplicationContext(), Singleton.getInstance().getmString(), Toast.LENGTH_LONG).show();
        Intent intent = new Intent(MainActivity.this
                , SecondActivity.class);
        startActivity(intent);
    }
}
