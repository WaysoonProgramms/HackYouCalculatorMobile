package com.waysoonprogramms.hackyoucalculatormobile;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
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
        for (int i = txt.length() - 1; i >= 0; i--) {
            if (errcode == 1) {
                break;
            }
            switch (txt.charAt(i)) {
                case 'o':
                    text += '0';
                    continue;
                case 'i':
                    text += '1';
                    continue;
                case 'l':
                    text += '1';
                    continue;
                case 'e':
                    text += '3';
                    continue;
                case 'h':
                    text += '4';
                    continue;
                case 's':
                    text += '5';
                    continue;
                case 'g':
                    text += '6';
                    continue;
                case 'b':
                    text += '9';
                    continue;
                default:
                    errcode = 1;
                    break;
            }
        }
        if (errcode == 0 && !(text.contentEquals(""))) {
            Formatter f = new Formatter();
            f.format("Введи %s на калькуляторе и переверни его!", text);
            GetMessage(f.toString(), "Реузльтат");
        }
        else {
            Toast.makeText(MainActivity.this, "Недопустимые символы!", Toast.LENGTH_SHORT).show();
        }
        text = "";
        txt = "";
        errcode = 0;
        TextInput.setText("");
    }

    public void GetMessage(String message, String title) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle(title)
                .setMessage(message)
                .setPositiveButton("ОК", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}