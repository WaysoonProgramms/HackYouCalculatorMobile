package com.waysoonprogramms.hackyoucalculatormobile;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Formatter;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText TextInput;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextInput = findViewById(R.id.TextInput);
    }

    public void clickBtn(View view) {
        String txt = TextInput.getText().toString();
        txt = txt.toLowerCase();
        char[] textArr = txt.toCharArray();
        for (int i = txt.length(); i != 1; i--) {
            if (textArr[i] == 'l') {text += "1";}
            if (textArr[i] == 'b') {text += "9";}
            if (textArr[i] == 'h') {text += "4";}
            if (textArr[i] == 's') {text += "5";}
            if (textArr[i] == 'g') {text += "6";}
            if (textArr[i] == 'e') {text += "3";}
            if (textArr[i] == 'i') {text += "1";}
            if (textArr[i] == 'o') {text += "0";}
            else { Toast.makeText(this, "Недопустимые символы!", Toast.LENGTH_SHORT).show(); break; }

        }

    }
}