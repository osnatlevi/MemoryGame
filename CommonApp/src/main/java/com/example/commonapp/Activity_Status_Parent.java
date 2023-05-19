package com.example.commonapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textview.MaterialTextView;


public abstract class Activity_Status_Parent extends AppCompatActivity {

    private MaterialTextView result;




    // replace picture .
    // every application need to add here 6 other picture.



    protected abstract String getData();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_parent);
        findViews();
        updateUI();
    }

    private void updateUI() {
        result.setText(getData());
    }

    private void findViews() {
        result = findViewById(R.id.result);
    }


    // texting //


   protected abstract void getPicture();
}