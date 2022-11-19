package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bZero, bOne, bTwo, bThree, bFour, bFive, bSix, bSeven, bEight, bNine, bAdd, bSub, bMul, bDiv,
            bEqual, bMod, bDeci, bSqrt, bCrt, bExp, bClear, bBackspace;
    TextView view1, view2;
    boolean doAdd=false, doSub=false, doMul=false, doDiv=false, doSqrt=false, doCrt=false, doMod=false, doExp=false, check=false;
    float v1,v2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        bZero = (Button) findViewById(R.id.zero);
        bOne = (Button) findViewById(R.id.one);
        bTwo = (Button) findViewById(R.id.two);
        bThree = (Button) findViewById(R.id.three);
        bFour = (Button) findViewById(R.id.four);
        bFive = (Button) findViewById(R.id.five);
        bSix = (Button) findViewById(R.id.six);
        bSeven = (Button) findViewById(R.id.seven);
        bEight = (Button) findViewById(R.id.eight);
        bNine = (Button) findViewById(R.id.nine);
        bDeci = (Button) findViewById(R.id.decimal);
        bAdd = (Button) findViewById(R.id.addition);
        bSub = (Button) findViewById(R.id.subtract);
        bMul = (Button) findViewById(R.id.multiply);
        bDiv = (Button) findViewById(R.id.divide);
        bClear = (Button) findViewById(R.id.clear);
        bEqual = (Button) findViewById(R.id.equal);
        bMod = (Button) findViewById(R.id.mod);
        bSqrt = (Button) findViewById(R.id.sqroot);
        bCrt = (Button) findViewById(R.id.cuberoot);
        bExp = (Button) findViewById(R.id.exponent);
        bBackspace = (Button) findViewById(R.id.backspace);

        view1 = findViewById(R.id.textView1);
        view2 = findViewById(R.id.textView2);

        bZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1.setText(view1.getText()+"0");
            }
        });
        bOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1.setText(view1.getText()+"1");
            }
        });
        bTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1.setText(view1.getText()+"2");
            }
        });
        bThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1.setText(view1.getText()+"3");
            }
        });
        bFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1.setText(view1.getText()+"4");
            }
        });
        bFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1.setText(view1.getText()+"5");
            }
        });
        bSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1.setText(view1.getText()+"6");
            }
        });
        bSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1.setText(view1.getText()+"7");
            }
        });
        bEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1.setText(view1.getText()+"8");
            }
        });
        bNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1.setText(view1.getText()+"9");
            }
        });
        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = view1.getText().toString();
                if(str.length()==0);
                else if(check);
                else if(str=="-");
                else{
                    v1 = Float.parseFloat(view1.getText().toString());
                    view1.setText("");
                    view2.setText(str + " " + "+");
                    check = true;
                    doAdd = true;
                }
            }
        });
        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = view1.getText().toString();
                if(str.length()==0) view1.setText("-");
                else if(check);
                else if(str=="-");
                else{
                    v1 = Float.parseFloat(view1.getText().toString());
                    view1.setText("");
                    view2.setText(str + " " + "-");
                    doSub = true;
                    check = true;
                }
            }
        });
        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = view1.getText().toString();
                if(str.length()==0);
                else if(check);
                else if(str=="-");
                else{
                    v1 = Float.parseFloat(view1.getText().toString());
                    view1.setText("");
                    view2.setText(str + " " + "×");
                    check = true;
                    doMul = true;
                }
            }
        });
        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = view1.getText().toString();
                if(str.length()==0);
                else if(check);
                else if(str=="-");
                else{
                    v1 = Float.parseFloat(view1.getText().toString());
                    view1.setText("");
                    view2.setText(str + " " + "/");
                    check = true;
                    doDiv = true;
                }
            }
        });
        bDeci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1.setText(view1.getText()+".");
            }
        });
        bSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = view1.getText().toString();
                if(str.length()==0);
                else if(check);
                else if(str=="-");
                else{
                    v1 = Float.parseFloat(view1.getText().toString());
                    view1.setText("");
                    view2.setText(Math.sqrt(v1)+"");
                }
            }
        });
        bCrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = view1.getText().toString();
                if(str.length()==0);
                else if(check);
                else if(str=="-");
                else{
                    v1 = Float.parseFloat(view1.getText().toString());
                    view1.setText("");
                    view2.setText(Math.cbrt(v1)+"");
                }
            }
        });
        bMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = view1.getText().toString();
                if(str.length()==0);
                else if(check);
                else if(str=="-");
                else{
                    v1 = Float.parseFloat(view1.getText().toString());
                    view1.setText("");
                    view2.setText(str + " " + "%");
                    check = true;
                    doMod = true;
                }
            }
        });
        bExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = view1.getText().toString();
                if(str.length()==0);
                else if(check);
                else if(str=="-");
                else{
                    v1 = Float.parseFloat(view1.getText().toString());
                    view1.setText("");
                    view2.setText(str + " " + "^");
                    check = true;
                    doExp = true;
                }
            }
        });
        bEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = view1.getText().toString();
                if(str.length()==0);
                else if(!check);
                else if(str=="-");
                else{
                    v2 = Float.parseFloat(view1.getText().toString());
                    if(doAdd){
                        view2.setText(v1+v2 + "");
                        check = false;
                        doAdd = false;
                    }
                    if(doSub){
                        view2.setText(v1-v2 + "");
                        check = false;
                        doSub = false;
                    }
                    if(doMul){
                        view2.setText(v1*v2 + "");
                        check = false;
                        doMul = false;
                    }
                    if(doDiv){
                        view2.setText(v1/v2 + "");
                        check = false;
                        doDiv = false;
                    }
                    if(doExp){
                        view2.setText(Math.pow(v1,v2) + "");
                        check = false;
                        doExp = false;
                    }
                    if(doMod){
                        view2.setText(v1%v2 + "");
                        check = false;
                        doMod = false;
                    }
                    view1.setText(view2.getText().toString());
                    view2.setText("");
                }
            }
        });
        bClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view1.setText("");
                view2.setText("");
                doAdd = false;
                doSub = false;
                doMul = false;
                doDiv = false;
                doMod = false;
                doExp = false;
                doSqrt = false;
                doCrt = false;
            }
        });
        bBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = view1.getText().toString();
                if(str.length()>=1){
                    str = str.substring(0,str.length()-1);
                    view1.setText(str);
                }
            }
        });
    }
}