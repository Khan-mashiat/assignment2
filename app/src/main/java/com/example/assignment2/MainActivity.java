package com.example.assignment2;



import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox checkBox = findViewById(R.id.checkbox_example);
        RadioButton radioButton1 = findViewById(R.id.radioButton1);
        RadioButton radioButton2 = findViewById(R.id.radioButton2);
        RatingBar ratingBar = findViewById(R.id.ratingBar);
        SeekBar seekBar = findViewById(R.id.seekBar);
        Switch switchExample = findViewById(R.id.switch_example);

        // CheckBox listener
        checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            String message = isChecked ? "CheckBox checked" : "CheckBox unchecked";
            Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
        });

        // RadioButton listener
        radioButton1.setOnClickListener(v -> Toast.makeText(MainActivity.this, "Option 1 selected", Toast.LENGTH_SHORT).show());
        radioButton2.setOnClickListener(v -> Toast.makeText(MainActivity.this, "Option 2 selected", Toast.LENGTH_SHORT).show());

        // RatingBar listener
        ratingBar.setOnRatingBarChangeListener((ratingBar1, rating, fromUser) ->
                Toast.makeText(MainActivity.this, "Rating: " + rating, Toast.LENGTH_SHORT).show());

        // SeekBar listener
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(MainActivity.this, "SeekBar progress: " + progress, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Do something
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Do something
            }
        });

        // Switch listener
        switchExample.setOnCheckedChangeListener((buttonView, isChecked) -> {
            String message = isChecked ? "Switch ON" : "Switch OFF";
            Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
        });
    }
}


