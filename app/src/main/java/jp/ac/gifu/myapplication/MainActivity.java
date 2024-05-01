package jp.ac.gifu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Toast.makeText(this, "アプリを終了しました", Toast.LENGTH_SHORT).show();
        finish();
    }
}