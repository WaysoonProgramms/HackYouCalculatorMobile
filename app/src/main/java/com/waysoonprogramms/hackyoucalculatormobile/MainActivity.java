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
    String text = "";
    int errcode = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextInput = findViewById(R.id.TextInput);
    }

    public void clickBtn(View view) {
        String txt = TextInput.getText().toString();
        txt = txt.toLowerCase();
        for (int i = txt.length() - 1; i != 1; i--) {
            switch (txt.charAt(i)) {
                case 'o':
                    text += '0';
                    break;
                case 'i':
                    text += '1';
                    break;
                case 'l':
                    text += '1';
                    break;
                case 'e':
                    text += '3';
                    break;
                case 'h':
                    text += '4';
                    break;
                case 's':
                    text += '5';
                    break;
                case 'g':
                    text += '6';
                    break;
                case 'b':
                    text += '9';
                    break;
                default:
                    errcode = 1;
                    break;
            }
        }
        if (errcode == 0) {
            Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(MainActivity.this, "Недопустимые символы!", Toast.LENGTH_SHORT).show();
        }
        text = "";
        txt = "";
    }
}