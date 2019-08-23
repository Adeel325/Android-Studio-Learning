package adeelsafdar.eightball;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button askButton;
        final ImageView eightBall;
        eightBall = (ImageView) findViewById(R.id.image_eightBall);
        askButton = (Button) findViewById(R.id.askButton);
        final int[] ballArray = new int[] {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(5);
                eightBall.setImageResource(ballArray[number]);
            }
        });
    }
}
