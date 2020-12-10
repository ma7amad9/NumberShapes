package com.example.numbershapes;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    class Number {
        int number;

        public boolean isTriangle(){
            int x =1;
            int trianglr=1;
            while (number>trianglr) {
                x++;
                trianglr=trianglr+x;

            }
            if (trianglr==number) {
                return true;
            }
            else{
                return false;
            }
        }
        public Boolean isSqare(){
            double sqare = Math.sqrt(number);

            if (Math.floor(sqare)==sqare){
                return true;
            }
            else{
                return false;
            }
        }



    }

    public void Numcheck(View view){
        String message="";
        EditText myNumber = (EditText) findViewById(R.id.userNumber);
        Number num= new Number();
         num.number = Integer.parseInt(myNumber.getText().toString());

        if (num.isTriangle() && num.isSqare()){
            message = num.number+" is Triangle and Square number";

        }
        else if (num.isSqare()){
            message = num.number+" is Square number";
        }
        else if (num.isTriangle()){
            message = num.number+" is Triangle Number";
        }
        else {
          message =  num.number+" Neither Triangle nor Square number";
        }

        Toast.makeText(getApplicationContext(), " "+message , LENGTH_LONG).show();


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}