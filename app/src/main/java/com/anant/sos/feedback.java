package com.anant.sos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class feedback extends AppCompatActivity {
    TextView tvFeedback;
    RatingBar rbStars;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        tvFeedback = findViewById(R.id.tvFeedback);
        rbStars = findViewById(R.id.rbStars);
        btnSend = findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                tvFeedback.setText("");
//                rbStars.setText("")
                Toast.makeText(feedback.this, "Thanks for your Feedback ! ", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(feedback.this,HomeActivity.class);
                startActivity(intent);
            }
        });

        rbStars.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (rating == 0) {
                    tvFeedback.setText("Very Dissatisfied");
                } else if (rating == 1) {
                    tvFeedback.setText("Dissatisfied");
                } else if (rating == 2 || rating == 3) {
                    tvFeedback.setText("OK");
                } else if (rating == 4) {
                    tvFeedback.setText("Satisfied");
                } else if (rating == 5) {
                    tvFeedback.setText("Very Satisfied");
                }
                else {

                }
            }
        });
    }
}
