package com.josrangel.viewdinamic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TableLayout tableLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tableLayout = findViewById(R.id.tabla);
        metodoDoWhile();

    }

    public void metodoFor(){
        for (int i=0; i<10; i++){
            TableRow row= new TableRow(this);
            TextView textView = new TextView(this);
            textView.setText("Texto"+i);

            row.addView(textView);
            tableLayout.addView(row,new TableRow.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT));
        }
    }

    public void metodoWhile(){
        int i =0;
        while (i<10){
            TableRow row= new TableRow(this);
            TextView textView = new TextView(this);
            textView.setText("Texto"+i);

            row.addView(textView);
            tableLayout.addView(row,new TableRow.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT));
            i++;
        }
    }

    public void metodoDoWhile(){
        int i =0;
        do{
            TableRow row= new TableRow(this);
            ImageView imageView = new ImageView(this);

            imageView.setImageResource(R.mipmap.ic_launcher);
            row.addView(imageView);

            tableLayout.addView(row,new TableRow.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT));
            i++;
        }while (i<10);
    }
}