package com.example.rodry.mvpdemo.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.example.rodry.mvpdemo.R;
import com.example.rodry.mvpdemo.Services.Home.ContactModel;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class HomeDetail extends AppCompatActivity {

    @InjectView(R.id.edtContactId)
    EditText edtContactId;

    @InjectView(R.id.edtName)
    EditText edtName;

    @InjectView(R.id.edtGender)
    EditText edtGender;

    @InjectView(R.id.edtAge)
    EditText edtAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_detail);
        ButterKnife.inject(this);

        ContactModel contactModel = getIntent().getParcelableExtra("Parcelable");
        if(contactModel == null){
            return;
        }

        edtContactId.setText(String.valueOf(contactModel.getContactId()));
        edtName.setText(contactModel.getName());
        edtGender.setText(contactModel.getGender());
        edtAge.setText(String.valueOf(contactModel.getAge()));
    }
}
