package com.example.math;

import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DevActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev);

        Intent inf = getIntent();
        String name = inf.getStringExtra("name");
        String level = inf.getStringExtra("level");
        String datebegin = inf.getStringExtra("datebegin");
        String dateend = inf.getStringExtra("dateend");
        String regotb = inf.getStringExtra("regotb");
        String regsak = inf.getStringExtra("regsak");

        ((TextView)findViewById(R.id.name)).setText(name);
        ((TextView)findViewById(R.id.level)).setText(level);
        ((TextView)findViewById(R.id.datebegin)).setText(datebegin);
        ((TextView)findViewById(R.id.dateend)).setText(dateend);
        ((TextView)findViewById(R.id.regotb)).setText(regotb);
        ((TextView)findViewById(R.id.regsak)).setText(regsak);

    }
}