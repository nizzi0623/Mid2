package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private final static int FUNCTION = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.button1);
    }


    Button b2 = (Button) findViewById(R.id.button2);
    Button b3 = (Button) findViewById(R.id.button3);
    Button b4 = (Button) findViewById(R.id.button4);
    Button b5 = (Button) findViewById(R.id.button5);
    Button b6 = (Button) findViewById(R.id.button6);
    Button b7 = (Button) findViewById(R.id.button7);
    Button b8 = (Button) findViewById(R.id.button8);

    public void func1 (View view){
        Intent intent = new Intent(this, Func1Activity.class);
        startActivityForResult(intent, FUNCTION);
    }
    public void func2 (View view){
        Intent intent = new Intent(this, Func2Activity.class);
        startActivityForResult(intent, FUNCTION);
    }
    public void func3 (View view){
        Intent intent = new Intent(this, Func3Activity.class);
        startActivityForResult(intent, FUNCTION);
    }
    public void func4 (View view){
        Intent intent = new Intent(this, Func4Activity.class);
        startActivityForResult(intent, FUNCTION);
    }
    public void func5 (View view){
        Intent intent = new Intent(this, Func5Activity.class);
        startActivityForResult(intent, FUNCTION);
    }
    public void func6 (View view){
        Intent intent = new Intent(this, Func6Activity.class);
        startActivityForResult(intent, FUNCTION);
    }
    public void func7 (View view){
        Intent intent = new Intent(this, Func7Activity.class);
        startActivityForResult(intent, FUNCTION);
    }
    public void func8 (View view){
        Intent intent = new Intent(this, Func8Activity.class);
        startActivityForResult(intent, FUNCTION);
    }


}
