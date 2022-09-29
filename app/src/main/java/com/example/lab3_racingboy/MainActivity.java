package com.example.lab3_racingboy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtCoin;
    Button btnStartRace, btnStartBet;
    SeekBar pig1, pig2, pig3;
    CheckBox cbx1, cbx2, cbx3;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    final CountDownTimer countDownTimer = new CountDownTimer(60000, 300) {
        @Override
        public void onTick(long l) {
            Random random = new Random();
            int goal = pig1.getMax();
            pig1.setProgress(pig1.getProgress() + random.nextInt(10));
            pig2.setProgress(pig2.getProgress() + random.nextInt(10));
            pig3.setProgress(pig3.getProgress() + random.nextInt(10));
        }

        @Override
        public void onFinish() {

        }
    };
    
    private void Binding(){
        txtCoin = (TextView) findViewById(R.id.txtCoin);
        btnStartRace = (Button) findViewById(R.id.btnStart);
        btnStartBet = (Button) findViewById(R.id.button2);
        pig1 = (SeekBar) findViewById(R.id.pig1);
        pig2 = (SeekBar) findViewById(R.id.pig2);
        pig3 = (SeekBar) findViewById(R.id.pig3);
        cbx1 = (CheckBox) findViewById(R.id.checkBox);
        cbx2 = (CheckBox) findViewById(R.id.checkBox2);
        cbx3 = (CheckBox) findViewById(R.id.checkBox3);
    }

}
