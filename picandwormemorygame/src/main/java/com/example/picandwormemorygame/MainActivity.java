package com.example.picandwormemorygame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.commonapp.Activity_Status_Parent;
import com.example.commonapp.utils.MSP;

public class MainActivity extends Activity_Status_Parent {


    //testing//
    //int drawableBirdName, int drawableDeerName, int drawableDolphinName, int drawableElephantName, int drawableGorillaName, int drawableRhinoName
    int bird201, deer202, dolphin203, elephant204, gorilla205, rhino206;


    @Override
    protected void getPicture() {
//        bird201 = R.drawable.b;
//        deer202 = R.drawable.d;
//        dolphin203 = R.drawable.d;
//        elephant204 = R.drawable.e;
//        gorilla205 = R.drawable.g;
//        rhino206 = R.drawable.r;

//        MSP.getInstance().putInt( "bird201", bird201);
//
//
    }


    @Override
    protected String getData() {


        int numOfMisses = MSP.getInstance().getInt("MISSES", 0);
        return "yoy success to match all the pairs! \n" +" and you miss " + numOfMisses + " times";
    }
}