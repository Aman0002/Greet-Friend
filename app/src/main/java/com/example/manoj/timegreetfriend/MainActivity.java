package com.example.manoj.timegreetfriend;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button greetingButton;
    Calendar calendar;
    int currentHour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        greetingButton=(Button)findViewById(R.id.greetingFriend);
        greetingButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        TextView textMessage=(TextView)findViewById(R.id.textMessage);
        EditText editFriendName=(EditText)findViewById(R.id.editFriendName);
        String friend=editFriendName.getText().toString();
        switch (view.getId())
        {
            case R.id.greetingFriend:
                      calendar=Calendar.getInstance();
                      currentHour=calendar.get(Calendar.HOUR_OF_DAY);//gives us the hour of the day from 0-23
                      if(currentHour>=0&&currentHour<6)
                      {
                          textMessage.setText("Good Night "+friend+"!");
                      }else if(currentHour>=6&&currentHour<12)
                      {
                          textMessage.setText("Good Morning "+friend+"!");
                      }else if(currentHour>=12&&currentHour<16)
                      {
                          textMessage.setText("Good Afternoon "+friend+"!");
                      }else if(currentHour>=16&&currentHour<20)
                      {
                          textMessage.setText("Good Evening "+friend+"!");
                      }else if(currentHour>=20&&currentHour<24)
                      {
                          textMessage.setText("Good Night "+friend+"!");
                      }

                break;
            default :
                break;
        }
    }
}