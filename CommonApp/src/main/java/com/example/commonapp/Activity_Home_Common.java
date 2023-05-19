package com.example.commonapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import com.example.commonapp.utils.MSP;
public class Activity_Home_Common extends AppCompatActivity  {

    //UI Variables
    TextView title, sub_title, result;
    Button BTN_stats;
    ImageView iv_00, iv_01, iv_02, iv_03,
              iv_10, iv_11, iv_12, iv_13,
              iv_20, iv_21, iv_22, iv_23;

    //Array for the images
    Integer[] cardArray = {101, 102, 103, 104,
            105, 106, 201, 202,
            203, 204, 205, 206};

    // actual images
    int bird101, deer102, dolphin103, elephant104, gorilla105, rhino106,
            bird201, deer202, dolphin203, elephant204, gorilla205, rhino206;


    int firstCard, secondCard;
    int firstClick, secondClick;

    int cardNumber = 1;

    int numOfMisses = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_common);


        findViews();
        setTags();
        setMisses();
        //connect between the numberOfImage to the image - load the card image.
        frontOfCardsResources();

        //shuffle the images
        Collections.shuffle(Arrays.asList(cardArray));

        initButtons();
    }

    private void setMisses() {
        MSP.getInstance().putInt("MISSES", 0);
    }

    private void findViews() {

        title = findViewById(R.id.title);
        sub_title = findViewById(R.id.sub_title);
        BTN_stats = findViewById(R.id.BTN_stats);
        result = findViewById(R.id.result);


        iv_00 = findViewById(R.id.iv_00);
        iv_01 = findViewById(R.id.iv_01);
        iv_02 = findViewById(R.id.iv_02);
        iv_03 = findViewById(R.id.iv_03);
        iv_10 = findViewById(R.id.iv_10);
        iv_11 = findViewById(R.id.iv_11);
        iv_12 = findViewById(R.id.iv_12);
        iv_13 = findViewById(R.id.iv_13);
        iv_20 = findViewById(R.id.iv_20);
        iv_21 = findViewById(R.id.iv_21);
        iv_22 = findViewById(R.id.iv_22);
        iv_23 = findViewById(R.id.iv_23);

    }

    private void setTags() {
        iv_00.setTag("0");
        iv_01.setTag("1");
        iv_02.setTag("2");
        iv_03.setTag("3");

        iv_10.setTag("4");
        iv_11.setTag("5");
        iv_12.setTag("6");
        iv_13.setTag("7");

        iv_20.setTag("8");
        iv_21.setTag("9");
        iv_22.setTag("10");
        iv_23.setTag("11");

    }

    //connect between the numberOfImage to the image - load the card image.
    private void frontOfCardsResources() {

        //-------- common-------//
        bird101 = R.drawable.ic_bird101;
        deer102 = R.drawable.ic_deer102;
        dolphin103 = R.drawable.ic_dolphin103;
        elephant104 = R.drawable.ic_elephant104;
        gorilla105 = R.drawable.ic_gorilla105;
        rhino106 = R.drawable.ic_rhino106;





        //-------- replace--------//
        //bird201 = MSP.getInstance().getInt("bird201", 0);


        if (title.getText().toString().equals("Pic And Word Memory Game") ){
            bird201 = R.drawable.b;
            deer202 = R.drawable.d;
            dolphin203 = R.drawable.d;
            elephant204 = R.drawable.e;
            gorilla205 = R.drawable.g;
            rhino206 = R.drawable.r;
        }
        else{
        bird201 = R.drawable.ic_bird201;
        deer202 = R.drawable.ic_deer202;
        dolphin203 = R.drawable.ic_dolphin203;
        elephant204 = R.drawable.ic_elephant204;
        gorilla205 = R.drawable.ic_gorilla205;
        rhino206 = R.drawable.ic_rhino206;
        }






    }
    private void initButtons() {

        BTN_stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity_Home_Common.this, App_Parent.statsClass));
            }
        });



        //----------------------------- images------------------------------//
        iv_00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // theCard is the number of the tag of iv_00
                // the card can get number between 0- 11;
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_00, theCard);
            }
        });

        iv_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // theCard is the number of the tag of iv_00
                // the card can get number between 0- 11;
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_01, theCard);
            }
        });

        iv_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // theCard is the number of the tag of iv_00
                // the card can get number between 0- 11;
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_02, theCard);
            }
        });

        iv_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // theCard is the number of the tag of iv_00
                // the card can get number between 0- 11;
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_03, theCard);
            }
        });

        iv_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // theCard is the number of the tag of iv_00
                // the card can get number between 0- 11;
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_10, theCard);
            }
        });

        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // theCard is the number of the tag of iv_00
                // the card can get number between 0- 11;
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_11, theCard);
            }
        });

        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // theCard is the number of the tag of iv_00
                // the card can get number between 0- 11;
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_12, theCard);
            }
        });

        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // theCard is the number of the tag of iv_00
                // the card can get number between 0- 11;
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_13, theCard);
            }
        });

        iv_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // theCard is the number of the tag of iv_00
                // the card can get number between 0- 11;
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_20, theCard);
            }
        });

        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // theCard is the number of the tag of iv_00
                // the card can get number between 0- 11;
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_21, theCard);
            }
        });
        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // theCard is the number of the tag of iv_00
                // the card can get number between 0- 11;
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_22, theCard);
            }
        });

        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // theCard is the number of the tag of iv_00
                // the card can get number between 0- 11;
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_23, theCard);
            }
        });


    }









    private void doStuff(ImageView iv, int card) {
        // cardArray = { 101, 102, 103, 104,
        //               105, 106, 201, 202,
        //               203, 204, 205, 206   };


        if (cardArray[card] == 101) {
            iv.setImageResource(bird101);
        } else if (cardArray[card] == 102) {
            iv.setImageResource(deer102);
        } else if (cardArray[card] == 103) {
            iv.setImageResource(dolphin103);
        } else if (cardArray[card] == 104) {
            iv.setImageResource(elephant104);
        } else if (cardArray[card] == 105) {
            iv.setImageResource(gorilla105);
        } else if (cardArray[card] == 106) {
            iv.setImageResource(rhino106);
        } else if (cardArray[card] == 201) {
            iv.setImageResource(bird201);
        } else if (cardArray[card] == 202) {
            iv.setImageResource(deer202);
        } else if (cardArray[card] == 203) {
            iv.setImageResource(dolphin203);
        } else if (cardArray[card] == 204) {
            iv.setImageResource(elephant204);
        } else if (cardArray[card] == 205) {
            iv.setImageResource(gorilla205);
        } else if (cardArray[card] == 206) {
            iv.setImageResource(rhino206);
        }

        //cardNumber is  -> how match card we press.
        if (cardNumber == 1) {
            firstCard = cardArray[card];
            if (firstCard > 200) {
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            // card can be between 0-11;
            firstClick = card;
            //after we clicked the first card we need to enable him.
            iv.setEnabled(false);
        } else if (cardNumber == 2) {
            secondCard = cardArray[card];
            if (secondCard > 200) {
                secondCard = secondCard - 100;
            }
            cardNumber = 1;
            secondClick = card;

            iv_00.setEnabled(false);
            iv_01.setEnabled(false);
            iv_02.setEnabled(false);
            iv_03.setEnabled(false);
            iv_10.setEnabled(false);
            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_20.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
            iv_23.setEnabled(false);


            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // check if the selected images is equals
                    calculate();
                }
            }, 1000);
        }

    }

    private void calculate() {

        // if the images is equals remove them.
        if (firstCard == secondCard) {
            if (firstClick == 0) {
                iv_00.setVisibility(View.INVISIBLE);
            } else if (firstClick == 1) {
                iv_01.setVisibility(View.INVISIBLE);
            } else if (firstClick == 2) {
                iv_02.setVisibility(View.INVISIBLE);
            } else if (firstClick == 3) {
                iv_03.setVisibility(View.INVISIBLE);
            } else if (firstClick == 4) {
                iv_10.setVisibility(View.INVISIBLE);
            } else if (firstClick == 5) {
                iv_11.setVisibility(View.INVISIBLE);
            } else if (firstClick == 6) {
                iv_12.setVisibility(View.INVISIBLE);
            } else if (firstClick == 7) {
                iv_13.setVisibility(View.INVISIBLE);
            } else if (firstClick == 8) {
                iv_20.setVisibility(View.INVISIBLE);
            } else if (firstClick == 9) {
                iv_21.setVisibility(View.INVISIBLE);
            } else if (firstClick == 10) {
                iv_22.setVisibility(View.INVISIBLE);
            } else if (firstClick == 11) {
                iv_23.setVisibility(View.INVISIBLE);
            }


            if (secondClick == 0) {
                iv_00.setVisibility(View.INVISIBLE);
            } else if (secondClick == 1) {
                iv_01.setVisibility(View.INVISIBLE);
            } else if (secondClick == 2) {
                iv_02.setVisibility(View.INVISIBLE);
            } else if (secondClick == 3) {
                iv_03.setVisibility(View.INVISIBLE);
            } else if (secondClick == 4) {
                iv_10.setVisibility(View.INVISIBLE);
            } else if (secondClick == 5) {
                iv_11.setVisibility(View.INVISIBLE);
            } else if (secondClick == 6) {
                iv_12.setVisibility(View.INVISIBLE);
            } else if (secondClick == 7) {
                iv_13.setVisibility(View.INVISIBLE);
            } else if (secondClick == 8) {
                iv_20.setVisibility(View.INVISIBLE);
            } else if (secondClick == 9) {
                iv_21.setVisibility(View.INVISIBLE);
            } else if (secondClick == 10) {
                iv_22.setVisibility(View.INVISIBLE);
            } else if (secondClick == 11) {
                iv_23.setVisibility(View.INVISIBLE);
            }


        } else {
            // if firstCard != secondCard
            iv_00.setImageResource(R.drawable.ic_puzzle);
            iv_01.setImageResource(R.drawable.ic_puzzle);
            iv_02.setImageResource(R.drawable.ic_puzzle);
            iv_03.setImageResource(R.drawable.ic_puzzle);
            iv_10.setImageResource(R.drawable.ic_puzzle);
            iv_11.setImageResource(R.drawable.ic_puzzle);
            iv_12.setImageResource(R.drawable.ic_puzzle);
            iv_13.setImageResource(R.drawable.ic_puzzle);
            iv_20.setImageResource(R.drawable.ic_puzzle);
            iv_21.setImageResource(R.drawable.ic_puzzle);
            iv_22.setImageResource(R.drawable.ic_puzzle);
            iv_23.setImageResource(R.drawable.ic_puzzle);

            addMisses();


        }
        iv_00.setEnabled(true);
        iv_01.setEnabled(true);
        iv_02.setEnabled(true);
        iv_03.setEnabled(true);
        iv_10.setEnabled(true);
        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_20.setEnabled(true);
        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);

        //check if the game is over
        checkEnd();
    }// end calculate

    private void addMisses() {
        numOfMisses = MSP.getInstance().getInt("MISSES", 0);
        MSP.getInstance().putInt("MISSES", numOfMisses + 1);

    }

    private void checkEnd() {
        if (iv_00.getVisibility() == View.INVISIBLE&&
                iv_01.getVisibility() == View.INVISIBLE&&
                iv_02.getVisibility() == View.INVISIBLE&&
                iv_03.getVisibility() == View.INVISIBLE&&
                iv_10.getVisibility() == View.INVISIBLE&&
                iv_11.getVisibility() == View.INVISIBLE&&
                iv_12.getVisibility() == View.INVISIBLE&&
                iv_13.getVisibility() == View.INVISIBLE&&
                iv_20.getVisibility() == View.INVISIBLE&&
                iv_21.getVisibility() == View.INVISIBLE&&
                iv_22.getVisibility() == View.INVISIBLE&&
                iv_23.getVisibility() == View.INVISIBLE){


            onBackPressed();

        }


    }
    public void onBackPressed() {

                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder
                    .setMessage("game over" )
                    .setCancelable(false)
                    .setPositiveButton("new", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getApplicationContext(), Activity_Home_Common.class);
                            startActivity(intent);
                            finish();
                        }
                    }).setNegativeButton("exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
    }


}// end class
