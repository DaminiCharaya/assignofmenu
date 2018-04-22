package com.example.damini.assignofmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText ed, ed2, ed3, ed4;
    Button btn, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed = findViewById(R.id.editText);
        ed2 = findViewById(R.id.editText2);
        ed3 = findViewById(R.id.editText3);
        ed4 = findViewById(R.id.editText4);
        btn = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
//btn2.setVisibility(View.INVISIBLE);
        btn2.setEnabled(false);
        // Integer i=Integer.parseInt(a);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = ed3.getText().toString();
                if (!a.equals("")) {
                    Random rand = new Random();
                    int r = rand.nextInt(10)+1;
String s=String.valueOf(r);
                    ed4.setText(s);
                    String v = ed4.getText().toString();
                    if (a.equals(v)) {
                        String z = ed2.getText().toString();
                        String x = ed.getText().toString();
                        Integer i = Integer.parseInt(z);
                        Integer m = Integer.parseInt(x);
                        i = i + 1;
                        m = m + 1;
                        String d=String.valueOf(i);
                        String d1=String.valueOf(m);
                        ed2.setText(d);
                        ed.setText(d1);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "enter new number", Toast.LENGTH_SHORT).show();
                        String z = ed2.getText().toString();
                        String x = ed.getText().toString();
                        Integer i = Integer.parseInt(z);
                        Integer m = Integer.parseInt(x);
                        i = i ;
                        m = m - 1;
                        String d=String.valueOf(i);
                        String d1=String.valueOf(m);
                        ed2.setText(d);
                        ed.setText(d1);
                        String f=ed.getText().toString();
                    Integer t= Integer.parseInt(f);
                        if(t==0)
                        {
                            //btn2.setVisibility(View.VISIBLE);
                          //  btn.setVisibility(View.INVISIBLE);
                            btn2.setEnabled(true);
                            btn.setEnabled(false);
                        }
                    }

                }
            }
        });
btn2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        btn.setEnabled(true);
        ed.setText("5");
        ed2.setText("0");
        btn2.setEnabled(false);
        ed3.setText("");
        ed4.setText("");
    }
});
    }
}