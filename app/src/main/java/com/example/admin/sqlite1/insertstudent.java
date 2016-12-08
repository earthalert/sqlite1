package com.example.admin.sqlite1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class insertstudent extends AppCompatActivity {

    TB_Student tb_student;
    Mod_Student mod_student;
    EditText name,lastname,nickname;
    Button ok,cancel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertstudent);

        tb_student = new TB_Student();
        mod_student = new Mod_Student(this);

        name = (EditText) findViewById(R.id.editText);
        lastname = (EditText) findViewById(R.id.editText2);
        nickname = (EditText) findViewById(R.id.editText3);

        ok = (Button) findViewById(R.id.ok);
        cancel = (Button) findViewById(R.id.cancel);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               tb_student.name = name.getText().toString();
               tb_student.lastname = lastname.getText().toString();
                tb_student.nickname = nickname.getText().toString();

               mod_student.insert(tb_student);

                finish();

            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });

    }
}
