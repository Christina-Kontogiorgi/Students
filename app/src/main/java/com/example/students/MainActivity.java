package com.example.students;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.students.databinding.ActivityMainBinding;



public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binder;
    Student alldata= new Student();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binder= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binder.getRoot());

        binder.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 alldata.name=binder.name.getText().toString();
                 alldata.surname=binder.surname.getText().toString();
                 alldata.am=Integer.parseInt(binder.am.getText().toString());
                 alldata.years=Integer.parseInt(binder.yearOfIntro.getText().toString());
                 alldata.mo=Double.parseDouble(binder.average.getText().toString());

                 binder.text.setText(alldata.Student());



            }
        });
    }
}