package com.example.memorygame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.commonapp.Activity_Status_Parent;
import com.example.commonapp.utils.MSP;

public class MainActivity extends Activity_Status_Parent {



    @Override
    protected String getData() {
        int numOfMisses = MSP.getInstance().getInt("MISSES", 0);
        return "you miss " + numOfMisses + " times";
    }

    @Override
    protected void getPicture() {

    }


}