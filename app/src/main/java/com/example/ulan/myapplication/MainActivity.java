package com.example.ulan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText,editText2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView =(TextView) findViewById(R.id.text);
        editText=(EditText) findViewById(R.id.edit);
        button=(Button) findViewById(R.id.button);
editText2=(EditText)findViewById(R.id.edit2);
    }


    public void onClick(View view) {

        int a = 0;
        int b = 0;
        try {
            a=Integer.parseInt(editText.getText().toString());
            b=Integer.parseInt(editText2.getText().toString());

            textView.setText(a+b+"");
        }catch (Exception e){
            textView.setText("SAN KATA");
        }

       /* String nureles=editText2.getText().toString();

        String ulan=editText.getText().toString();
        textView.setText(nureles+" "+ulan);*/

    }



   /* public void onClick(View view) {
       String s=editText.getText().toString();
        button.setText(s);
    }*/
}
