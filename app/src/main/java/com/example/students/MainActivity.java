package com.example.students;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.students.databinding.ActivityMainBinding;

class Student{
    String name;
    String surname;
    int am;
    int years;
    double mo;
    public Student(){
        String all;
        all=name+""+surname+""+am+""+years+""+mo;
        Log.e("",all);
    }
}

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
                 alldata.am=binder.am.getText().length();//CHECK AGAIN
                 alldata.years=binder.yearOfIntro.getText().length(); //CHECK AGAIN
                 alldata.mo=binder.average.getText().length(); // not right



            }
        });
    }
}