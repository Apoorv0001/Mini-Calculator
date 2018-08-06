package com.example.minicalculator;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;

import com.udojava.evalex.Expression;

public class MainActivity extends AppCompatActivity {
    /******Declaring Variables***********/
    Button btnClear;
    TextView tvProcessor, tvResult;
    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero;
    String processor;
    Boolean isSmallBracketOpen;
    Button btnMultiply, btnSubtract, btnAdd, btnDivide, btnDecimal, btnBack, btnSmallBracket, btnEqual, btnPercentage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        isSmallBracketOpen = false;

        /*******************Assigning VAriables************/


        btnClear = findViewById(R.id.btn_delete);
        tvProcessor = findViewById(R.id.tv_process);
        tvResult = findViewById(R.id.tv_result);
        tvProcessor.setText("");
        tvResult.setText("");


        btnOne = findViewById(R.id.btn_one);
        btnTwo = findViewById(R.id.btn_two);
        btnThree = findViewById(R.id.btn_three);
        btnFour = findViewById(R.id.btn_four);
        btnFive = findViewById(R.id.btn_five);
        btnSix = findViewById(R.id.btn_six);
        btnSeven = findViewById(R.id.btn_seven);
        btnEight = findViewById(R.id.btn_eight);
        btnNine = findViewById(R.id.btn_nine);
        btnZero = findViewById(R.id.btn_zero);

        btnMultiply = findViewById(R.id.btn_multiply);
        btnSubtract = findViewById(R.id.btn_subtract);
        btnAdd = findViewById(R.id.btn_add);
        btnDivide = findViewById(R.id.btn_divide);
        btnDecimal = findViewById(R.id.btn_dot);
        btnBack = findViewById(R.id.btn_back);

        btnSmallBracket = findViewById(R.id.btn_small_bracket);
        btnEqual = findViewById(R.id.btn_equal);
        btnPercentage = findViewById(R.id.btn_percentage);


        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvProcessor.setText("");
                tvResult.setText("");
            }

        });


        /****************Numbering the buttons on onclick***********************/

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "1");

            }

        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "2");

            }

        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "3");

            }

        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "4");

            }

        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "5");

            }

        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "6");

            }

        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "7");

            }

        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "8");

            }

        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "9");

            }

        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "0");
            }

        });


        /****************Functional buttons on onclick***********************/

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "*");


            }
        });
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "-");

            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "+");

            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "/");

            }
        });
        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + ".");

            }
        });
        btnPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "%");

            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                if (processor.length() > 0) {
                    processor = processor.substring(0, processor.length() - 1);
                    tvProcessor.setText(processor);
                }
            }
        });
        btnSmallBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isSmallBracketOpen) {
                    processor = tvProcessor.getText().toString();
                    tvProcessor.setText(processor + ")");
                    isSmallBracketOpen = false;
                } else {
                    processor = tvProcessor.getText().toString();
                    tvProcessor.setText(processor + "(");
                    isSmallBracketOpen = true;
                }
            }
        });


        /****************EQUAL buttons on onclick***********************/

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvResult.setText(new Expression(processor).eval().toPlainString());
            }
        });
    }


    @Override
    public void onBackPressed() {
        AlertDialog exit = new AlertDialog.Builder(this)
                .setTitle("Exit confirm")
                .setMessage("Sure to Exit ?")
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        MainActivity.super.onBackPressed();
                    }
                })
                .setNegativeButton("About me", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        Intent intent = new Intent(MainActivity.this, Aboutme.class);
                        startActivity(intent);
                    }
                }).show();
    }
}
