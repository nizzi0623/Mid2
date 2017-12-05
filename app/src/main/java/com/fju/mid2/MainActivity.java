package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final static int FUNCTION = 1;
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == FUNCTION){
            Toast.makeText(this, "特殊功能", Toast.LENGTH_LONG);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        Button b4 = (Button) findViewById(R.id.button4);
        Button b5 = (Button) findViewById(R.id.button5);
        Button b6 = (Button) findViewById(R.id.button6);
        Button b7 = (Button) findViewById(R.id.button7);
        Button b8 = (Button) findViewById(R.id.button8);
    }





    public void func1 (View view){
        Intent intent = new Intent(this, Func1Activity.class);
        startActivity(intent);
    }
    public void Func2 (View view){
        Intent intent = new Intent(this, Func2Activity.class);
        startActivity(intent);
    }
    public void Func3 (View view){
        Intent intent = new Intent(this, Func3Activity.class);
        startActivityForResult(intent, FUNCTION);
    }
    public void Func4 (View view){
        Intent intent = new Intent(this, Func4Activity.class);
        startActivity(intent);
    }
    public void Func5 (View view){
        Intent intent = new Intent(this, Func5Activity.class);
        startActivity(intent);
    }
    public void Func6 (View view){
        Intent intent = new Intent(this, Func6Activity.class);
        startActivity(intent);
    }
    public void Func7 (View view){
        Intent intent = new Intent(this, Func7Activity.class);
        startActivityForResult(intent, FUNCTION);
    }
    public void Func8 (View view){
        Intent intent = new Intent(this, Func8Activity.class);
        startActivityForResult(intent, FUNCTION);
    }


}
