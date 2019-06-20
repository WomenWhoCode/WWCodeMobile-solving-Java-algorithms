package com.madonasyombua.solvealgorithms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 *
 *
 * @author madona
 */
public class MainActivity extends AppCompatActivity {


    @BindView(R.id.reverse_edit_text)
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

        //clearing the textView and EditText
        clearButton.setOnClickListener(view -> {
            reverseEdittext.getText().clear();
            reverseTextView.setText(" ");
        });


    }


    static String reverseString(myString string, String str) {

        return string.myStringFunction(str);
    }

    //Reverse string
    private void ReverseString() {

        myString reverse = (String str) -> {

            int n = str.length() - 1;

            StringBuilder results = new StringBuilder();

            for (int i = n; i >= 0; i--) {

                results.append(str.charAt(i));

            }

            return results.toString();
        };

        //appending the reversed String to the text view;
        reverseTextView.append(reverseString(reverse, String.valueOf(reverseEdittext.getText())));

    }

    interface myString {

        String myStringFunction(String str);
    }



    //Reverse string

}


