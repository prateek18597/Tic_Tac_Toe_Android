package com.example.ttt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SinglePlayer extends AppCompatActivity {

    Button[] btn= new Button[10];
    TextView tv;
    Boolean turn = true;//false represents X
    int[] A = new int[9];//value 0 equal X
    int left = 9;
    List<Integer> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}
        setContentView(R.layout.activity_single_player);
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
            list.add(i);
        }
        Collections.shuffle(list);
    }

    public void goBack(View view){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void fillA(){
        for(int i = 0; i < 9; i++){
            A[i]=2;
        }
    }
    public int checkWinner(){
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
            fillA();
            return 0;
        }
        if(o) {
            tv.setText("O wins");
            fillA();
            return 1;
        }
        if(!x && !o && left==0) {
            tv.setText("Draw");
            return 2;
        }
        return -1;
    }

    public void compTurn() {
        if(!list.isEmpty()){
            int i = list.get(0);
            list.remove(0);
            A[i]=0;
            left--;
            btn[i].setText("X");
            checkWinner();
        }
    }

    public void button1(View view) {
        if(A[0]==-1) {
            A[0]=1;
            int i = list.indexOf(0);
            list.remove(i);
            btn[0].setText("O");
            left--;
            int k = checkWinner();
            if(k==-1)
                compTurn();
        }
    }

    public void button2(View view){
        if(A[1]==-1) {
            A[1]=1;
            int i = list.indexOf(1);
            list.remove(i);
            btn[1].setText("O");
            left--;
            int k = checkWinner();
            if(k==-1)
                compTurn();
        }
    }

    public void button3(View view) {
        if(A[2]==-1) {
            A[2]=1;
            int i = list.indexOf(2);
            list.remove(i);
            btn[2].setText("O");
            left--;
            int k = checkWinner();
            if(k==-1)
                compTurn();
        }
    }

    public void button4(View view) {
        if(A[3]==-1) {
            A[3]=1;
            int i = list.indexOf(3);
            list.remove(i);
            btn[3].setText("O");
            left--;
            int k = checkWinner();
            if(k==-1)
                compTurn();
        }
    }

    public void button5(View view) {
        if(A[4]==-1) {
            A[4]=1;
            int i = list.indexOf(4);
            list.remove(i);
            btn[4].setText("O");
            left--;
            int k = checkWinner();
            if(k==-1)
                compTurn();
        }
    }

    public void button6(View view) {
        if(A[5]==-1) {
            A[5]=1;
            int i = list.indexOf(5);
            list.remove(i);
            btn[5].setText("O");
            left--;
            int k = checkWinner();
            if(k==-1)
                compTurn();
        }
    }

    public void button7(View view) {
        if(A[6]==-1) {
            A[6]=1;
            int i = list.indexOf(6);
            list.remove(i);
            btn[6].setText("O");
            left--;
            int k = checkWinner();
            if(k==-1)
                compTurn();
        }

    }

    public void button8(View view) {
        if(A[7]==-1) {
            int i = list.indexOf(7);
            list.remove(i);
            A[7]=1;
            btn[7].setText("O");
            left--;
            int k = checkWinner();
            if(k==-1)
                compTurn();
        }
    }

    public void button9(View view) {
        if(A[8]==-1) {
            A[8]=1;
            int i = list.indexOf(8);
            list.remove(i);
            btn[8].setText("O");
            left--;
            int k = checkWinner();
            if(k==-1)
                compTurn();
        }
    }

    public void reset(View view){
        list.clear();
        for(int i = 0; i < 9;i++){
            btn[i].setText("");
            A[i]=-1;
            list.add(i);
        }
        left=9;
        turn=true;
        tv.setText("");
    }
}
