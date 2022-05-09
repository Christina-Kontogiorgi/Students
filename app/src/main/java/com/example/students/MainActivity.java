package com.example.students;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import com.example.students.models.Student;
import com.example.students.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binder;
    //public String thisStudent="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binder = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binder.getRoot());

        binder.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Student alldata = new Student();
                alldata.setName(binder.name.getText().toString());
                alldata.setSurname(binder.surname.getText().toString());
                alldata.setAm(Integer.parseInt(binder.am.getText().toString()));
                alldata.setYears(Integer.parseInt(binder.yearOfIntro.getText().toString()));
                alldata.setMo(Double.parseDouble(binder.average.getText().toString())) ;
                //thisStudent+=alldata.getTheBigString()+"\n";
                //binder.text.setText(thisStudent);
                binder.text.setText(binder.text.getText().toString()+alldata.getTheBigString()+"\n");




            }
        });
    }
}