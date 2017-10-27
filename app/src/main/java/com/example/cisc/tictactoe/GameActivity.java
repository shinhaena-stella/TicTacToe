package com.example.cisc.tictactoe;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    Button buttons[][] = new Button[3][3];
    TextView whosturn;
    private boolean xTurn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        whosturn = (TextView) findViewById(R.id.whosturn);
        xTurn = true;

        buttons[0][0] = (Button) findViewById(R.id.r0c0);
        buttons[0][1] = (Button) findViewById(R.id.r0c1);
        buttons[0][2] = (Button) findViewById(R.id.r0c2);
        buttons[1][0] = (Button) findViewById(R.id.r1c0);
        buttons[1][1] = (Button) findViewById(R.id.r1c1);
        buttons[1][2] = (Button) findViewById(R.id.r1c2);
        buttons[2][0] = (Button) findViewById(R.id.r2c0);
        buttons[2][1] = (Button) findViewById(R.id.r2c1);
        buttons[2][2] = (Button) findViewById(R.id.r2c2);




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    public void buttonAction(View v){
        int x = 0;
        int y = 0;
        boolean empty = false;
        String compare = " ";

        switch (v.getId()) {
            case R.id.r0c0:
                if(compare.equals(buttons[0][0].getText())) {
                    if (xTurn == true) {
                        buttons[0][0].setText("X");
                        xTurn = false;
                        whosturn.setText("Now O's turn");
                    } else {
                        buttons[0][0].setText("O");
                        xTurn = true;
                        whosturn.setText("Now X's turn");
                    }
                }
                else
                {
                    AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                    dlgAlert.setMessage("Choose another box.");
                    dlgAlert.setTitle("Error");
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                    return;
                }
                break;

            case R.id.r0c1:
                if(compare.equals(buttons[0][1].getText())) {
                    if (xTurn == true) {
                        buttons[0][1].setText("X");
                        xTurn = false;
                        whosturn.setText("Now O's turn");
                    } else {
                        buttons[0][1].setText("O");
                        xTurn = true;
                        whosturn.setText("Now X's turn");
                    }
                }
                else
                {
                    AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                    dlgAlert.setMessage("Choose another box.");
                    dlgAlert.setTitle("Error");
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                    return;
                }
                break;

            case R.id.r0c2:
                if(compare.equals(buttons[0][2].getText())) {
                    if (xTurn == true) {
                        buttons[0][2].setText("X");
                        xTurn = false;
                        whosturn.setText("Now O's turn");
                    } else {
                        buttons[0][2].setText("O");
                        xTurn = true;
                        whosturn.setText("Now X's turn");
                    }
                }
                else
                {
                    AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                    dlgAlert.setMessage("Choose another box.");
                    dlgAlert.setTitle("Error");
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                    return;
                }
                break;

            case R.id.r1c0:
                if(compare.equals(buttons[1][0].getText())) {
                    if (xTurn == true) {
                        buttons[1][0].setText("X");
                        xTurn = false;
                        whosturn.setText("Now O's turn");
                    } else {
                        buttons[1][0].setText("O");
                        xTurn = true;
                        whosturn.setText("Now X's turn");
                    }
                }
                else
                {
                    AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                    dlgAlert.setMessage("Choose another box.");
                    dlgAlert.setTitle("Error");
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                    return;
                }
                break;

            case R.id.r1c1:
                if(compare.equals(buttons[1][1].getText())) {
                    if (xTurn == true) {
                        buttons[1][1].setText("X");
                        xTurn = false;
                        whosturn.setText("Now O's turn");
                    } else {
                        buttons[1][1].setText("O");
                        xTurn = true;
                        whosturn.setText("Now X's turn");
                    }
                }
                else
                {
                    AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                    dlgAlert.setMessage("Choose another box.");
                    dlgAlert.setTitle("Error");
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                    return;
                }
                break;

            case R.id.r1c2:
                if(compare.equals(buttons[1][2].getText())) {
                    if (xTurn == true) {
                        buttons[1][2].setText("X");
                        xTurn = false;
                        whosturn.setText("Now O's turn");
                    } else {
                        buttons[1][2].setText("O");
                        xTurn = true;
                        whosturn.setText("Now X's turn");
                    }
                }
                else
                {
                    AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                    dlgAlert.setMessage("Choose another box.");
                    dlgAlert.setTitle("Error");
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                    return;
                }
                break;

            case R.id.r2c0:
                if(compare.equals(buttons[2][0].getText())) {
                    if (xTurn == true) {
                        buttons[2][0].setText("X");
                        xTurn = false;
                        whosturn.setText("Now O's turn");
                    } else {
                        buttons[2][0].setText("O");
                        xTurn = true;
                        whosturn.setText("Now X's turn");
                    }
                }
                else
                {
                    AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                    dlgAlert.setMessage("Choose another box.");
                    dlgAlert.setTitle("Error");
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                    return;
                }
                break;

            case R.id.r2c1:
                if(compare.equals(buttons[2][1].getText())) {
                    if (xTurn == true) {
                        buttons[2][1].setText("X");
                        xTurn = false;
                        whosturn.setText("Now O's turn");
                    } else {
                        buttons[2][1].setText("O");
                        xTurn = true;
                        whosturn.setText("Now X's turn");
                    }
                }
                else
                {
                    AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                    dlgAlert.setMessage("Choose another box.");
                    dlgAlert.setTitle("Error");
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                    return;
                }
                break;

            case R.id.r2c2:
                if(compare.equals(buttons[2][2].getText())) {
                    if (xTurn == true) {
                        buttons[2][2].setText("X");
                        xTurn = false;
                        whosturn.setText("Now O's turn");
                    } else {
                        buttons[2][2].setText("O");
                        xTurn = true;
                        whosturn.setText("Now X's turn");
                    }
                }
                else
                {
                    AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                    dlgAlert.setMessage("Choose another box.");
                    dlgAlert.setTitle("Error");
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                    return;
                }
                break;
        }
        checkResult();
    }

    private void checkResult() {
        String xValue = "X";
        String oValue = "O";

        boolean empty = false;
        AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);

        //check horizontal lines
        for (int i = 0; i != 3; ++i)
        {
            if (xValue.equals(buttons[i][0].getText())  && xValue.equals(buttons[i][1].getText())  && xValue.equals(buttons[i][2].getText()))
            {
                dlgAlert.setMessage("X won!");
                dlgAlert.setTitle("congratulations");

                dlgAlert.setCancelable(true);
                dlgAlert.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
                dlgAlert.create().show();

            }
            if (oValue.equals(buttons[i][0].getText()) && oValue.equals(buttons[i][1].getText()) && oValue.equals(buttons[i][2].getText()))
            {
                dlgAlert.setMessage("O won!");
                dlgAlert.setTitle("congratulations");
                dlgAlert.setCancelable(true);
                dlgAlert.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
                dlgAlert.create().show();

            }
        }

        //check vertical lines
        for (int i = 0; i != 3; ++i)
        {
            if (xValue.equals(buttons[0][i].getText()) && xValue.equals(buttons[1][i].getText()) && xValue.equals(buttons[2][i].getText()))
            {
                dlgAlert.setMessage("X won!");
                dlgAlert.setTitle("congratulations");
                dlgAlert.setCancelable(true);
                dlgAlert.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
                dlgAlert.create().show();

            }
            if (oValue.equals(buttons[0][i].getText()) && oValue.equals(buttons[1][i].getText()) && oValue.equals(buttons[2][i].getText()))
            {
                dlgAlert.setMessage("O won!");
                dlgAlert.setTitle("congratulations");
                dlgAlert.setCancelable(true);
                dlgAlert.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
                dlgAlert.create().show();

            }
        }

        //check diagonals
        if (oValue.equals(buttons[0][0].getText()) && oValue.equals(buttons[1][1].getText()) && oValue.equals(buttons[2][2].getText()))
        {
            dlgAlert.setMessage("O won!");
            dlgAlert.setTitle("congratulations");

            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
            dlgAlert.create().show();

        }
        if (xValue.equals(buttons[0][0].getText()) && xValue.equals(buttons[1][1].getText()) && xValue.equals(buttons[2][2].getText()))
        {
            dlgAlert.setMessage("X won!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
            dlgAlert.create().show();

        }
        if (oValue.equals(buttons[0][2].getText()) && oValue.equals(buttons[1][1].getText()) && oValue.equals(buttons[2][0].getText()))
        {
            dlgAlert.setMessage("O won!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
            dlgAlert.create().show();

        }
        if (xValue.equals(buttons[0][2].getText()) && xValue.equals(buttons[1][1].getText()) && xValue.equals(buttons[2][0].getText()))
        {
            dlgAlert.setMessage("X won!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
            dlgAlert.create().show();

        }
    }


}

