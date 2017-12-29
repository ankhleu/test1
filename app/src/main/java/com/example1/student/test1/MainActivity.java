package com.example1.student.test1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView tv;
    EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed =(EditText)findViewById(R.id.editText);
        tv = (TextView) findViewById(R.id.textView2);
        tv.setText("HELLO WORLD");
    }
        public void click1(View v)
    {
        String str=ed.getText().toString();
        tv.setText("Good afternoon......."+str);

    }


}
