package com.madonasyombua.solvealgorithms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.reverse_edittext)
    EditText reverseEdittext;

    @BindView(R.id.reverse)
    Button buttonReverse;

    @BindView(R.id.reverse_textView)
    TextView reverseTextView;

    @BindView(R.id.clear)
    Button clearButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);


        buttonReverse.setOnClickListener(view -> ReverseString());
        clearButton.setOnClickListener( view -> reverseEdittext.getText().clear()

        );



    }


    static String reverseString(myString string, String str){

        return string.myStringFunction(str);
    }


    private void ReverseString(){

        myString reverse = (String str)->{

            int n = str.length() - 1;

            StringBuilder results = new StringBuilder();

            for(int i = n; i >= 0; i--){

                results.append(str.charAt(i));

            }

            return results.toString();
        };


        reverseTextView.append(reverseString(reverse, String.valueOf(reverseEdittext.getText())));

        reverseTextView.setText(" ");
    }

    interface myString{

        String myStringFunction(String str);
    }

}
