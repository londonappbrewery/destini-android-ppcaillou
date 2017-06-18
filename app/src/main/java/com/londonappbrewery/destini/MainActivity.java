package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button redButton;
    Button blueButton;
    TextView storyTextView;
    int storyNumber = 1;
    boolean choice = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        redButton = (Button) findViewById(R.id.buttonTop);
        blueButton = (Button) findViewById(R.id.buttonBottom);
        storyTextView = (TextView) findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice = true;
                updateStory(choice);
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        blueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice = false;
                updateStory(choice);
            }
        });

    }

    public void updateStory(boolean choice) {

        if (storyNumber == 1 && choice) {
            storyTextView.setText(R.string.T3_Story);
            redButton.setText(R.string.T3_Ans1);
            blueButton.setText(R.string.T3_Ans2);
            storyNumber =3;
        }
        else if (storyNumber == 1 && !choice){
            storyTextView.setText(R.string.T2_Story);
            redButton.setText(R.string.T2_Ans1);
            blueButton.setText(R.string.T2_Ans2);
            storyNumber =2;
        }
        else if (storyNumber == 3 && choice){
            storyTextView.setText(R.string.T6_End);
            redButton.setVisibility(View.GONE);
            blueButton.setVisibility(View.GONE);
        }
        else if (storyNumber == 3 && !choice){
            storyTextView.setText(R.string.T5_End);
            redButton.setVisibility(View.GONE);
            blueButton.setVisibility(View.GONE);
        }
        else if (storyNumber == 2 && choice){
            storyTextView.setText(R.string.T3_Story);
            redButton.setText(R.string.T3_Ans1);
            blueButton.setText(R.string.T3_Ans2);
            storyNumber =3;
        }
        else if (storyNumber == 2 && !choice){
            storyTextView.setText(R.string.T4_End);
            redButton.setVisibility(View.GONE);
            blueButton.setVisibility(View.GONE);
            storyNumber =4;
        }

    }
}
