package pl.delevel.mdl.mdl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button enterApp = (Button) findViewById(R.id.enterAppActivityBtn);
        enterApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent enterIntent = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(enterIntent);
            }
        });
    }
}
