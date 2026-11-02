package com.xgil.free.quest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private boolean isModActive = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnToggle = findViewById(R.id.btnToggle);
        btnToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isModActive = !isModActive;
                if (isModActive) {
                    btnToggle.setText("Toggle Mod: ON");
                    btnToggle.setBackgroundColor(0xFF00FFCC);
                } else {
                    btnToggle.setText("Toggle Mod: OFF");
                    btnToggle.setBackgroundColor(0xFF333333);
                }
            }
        });
    }
}
