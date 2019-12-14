package com.example.ttt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button[] btn= new Button[10];
    TextView tv;
    Boolean turn = false;//false represents X
    int[] A = new int[9];//value 0 equal X
    int left = 9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}
        setContentView(R.layout.activity_main);
        btn[0]=(Button)findViewById(R.id.btn1);
        btn[1]=(Button)findViewById(R.id.btn2);
        btn[2]=(Button)findViewById(R.id.btn3);
        btn[3]=(Button)findViewById(R.id.btn4);
        btn[4]=(Button)findViewById(R.id.btn5);
        btn[5]=(Button)findViewById(R.id.btn6);
        btn[6]=(Button)findViewById(R.id.btn7);
        btn[7]=(Button)findViewById(R.id.btn8);
        btn[8]=(Button)findViewById(R.id.btn9);

        btn[9]=(Button)findViewById(R.id.resetBtn);

        tv = (TextView)findViewById(R.id.resultTV);

        for(int i = 0; i<9;i++){
            A[i]=-1;
        }
    }

    public void goBack(View view){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    void fillA(){
        for(int i = 0; i < 9; i++){
            A[i]=2;
        }
    }
    int checkWinner(){
        //X Winner
        Boolean x = (A[0]==0 && A[1]==0 && A[2]==0) ||
                    (A[0]==0 && A[3]==0 && A[6]==0) ||
                    (A[0]==0 && A[4]==0 && A[8]==0) ||
                    (A[1]==0 && A[4]==0 && A[7]==0) ||
                    (A[2]==0 && A[5]==0 && A[8]==0) ||
                    (A[3]==0 && A[4]==0 && A[5]==0) ||
                    (A[2]==0 && A[4]==0 && A[6]==0) ||
                    (A[6]==0 && A[7]==0 && A[8]==0)
                ;
        Boolean o = (A[0]==1 && A[1]==1 && A[2]==1) ||
                (A[0]==1 && A[3]==1 && A[6]==1) ||
                (A[0]==1 && A[4]==1 && A[8]==1) ||
                (A[1]==1 && A[4]==1 && A[7]==1) ||
                (A[2]==1 && A[5]==1 && A[8]==1) ||
                (A[3]==1 && A[4]==1 && A[5]==1) ||
                (A[2]==1 && A[4]==1 && A[6]==1) ||
                (A[6]==1 && A[7]==1 && A[8]==1)
                ;
        if(x) {
            tv.setText("X wins");
            Toast t = Toast.makeText(getApplicationContext(),"X Wins",Toast.LENGTH_LONG);//.setGravity(Gravity.TOP,0,0);
            t.setGravity(Gravity.TOP,0,0);
            t.show();
            fillA();
        }
        if(o) {
            tv.setText("O wins");
            Toast t = Toast.makeText(getApplicationContext(),"O Wins",Toast.LENGTH_LONG);//.setGravity(Gravity.TOP,0,0);
            t.setGravity(Gravity.BOTTOM,0,0);
            t.show();
            fillA();
        }
        if(!x && !o && left==0) {
            tv.setText("Draw");
            Toast t = Toast.makeText(getApplicationContext(),"Draw",Toast.LENGTH_LONG);//.setGravity(Gravity.TOP,0,0);
            t.setGravity(Gravity.CENTER,0,0);
            t.show();
        }
        return 0;
    }

    public void button1(View view){
        if(A[0]==-1) {
            if (turn) {
                A[0]=1;
                btn[0].setText("O");
            } else {
                A[0]=0;
                btn[0].setText("X");
            }
            left--;
            turn=!turn;
            checkWinner();
        }
    }

    public void button2(View view){
        if(A[1]==-1) {
            if (turn) {
                A[1]=1;
                btn[1].setText("O");
            } else {
                A[1]=0;
                btn[1].setText("X");
            }
            left--;
            turn=!turn;
            checkWinner();
        }
    }

    public void button3(View view){
        if(A[2]==-1) {
            if (turn) {
                A[2]=1;
                btn[2].setText("O");
            } else {
                A[2]=0;
                btn[2].setText("X");
            }
            left--;
            turn=!turn;
            checkWinner();
        }
    }

    public void button4(View view){
        if(A[3]==-1) {
            if (turn) {
                A[3]=1;
                btn[3].setText("O");
            } else {
                A[3]=0;
                btn[3].setText("X");
            }
            left--;
            turn=!turn;
            checkWinner();
        }
    }

    public void button5(View view){
        if(A[4]==-1) {
            if (turn) {
                A[4]=1;
                btn[4].setText("O");
            } else {
                A[4]=0;
                btn[4].setText("X");
            }
            left--;
            turn=!turn;
            checkWinner();
        }
    }

    public void button6(View view){
        if(A[5]==-1) {
            if (turn) {
                A[5]=1;
                btn[5].setText("O");
            } else {
                A[5]=0;
                btn[5].setText("X");
            }
            left--;
            turn=!turn;
            checkWinner();
        }
    }

    public void button7(View view){
        if(A[6]==-1) {
            if (turn) {
                A[6]=1;
                btn[6].setText("O");
            } else {
                A[6]=0;
                btn[6].setText("X");
            }
            left--;
            turn=!turn;
            checkWinner();
        }

    }

    public void button8(View view){
        if(A[7]==-1) {
            if (turn) {
                A[7]=1;
                btn[7].setText("O");
            } else {
                A[7]=0;
                btn[7].setText("X");
            }
            left--;
            turn=!turn;
            checkWinner();
        }
    }

    public void button9(View view){
        if(A[8]==-1) {
            if (turn) {
                A[8]=1;
                btn[8].setText("O");
            } else {
                A[8]=0;
                btn[8].setText("X");
            }
            left--;
            turn=!turn;
            checkWinner();
        }
    }

    public void reset(View view){
        for(int i = 0; i < 9;i++){
            btn[i].setText("");
            A[i]=-1;
        }
        left=9;
        turn=false;
        tv.setText("");
    }
}
