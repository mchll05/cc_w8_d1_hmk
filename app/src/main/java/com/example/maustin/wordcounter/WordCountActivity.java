package com.example.maustin.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class WordCountActivity extends AppCompatActivity {

    Answer answer;
    EditText editText;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);
        answer = new Answer();
        editText = (EditText) findViewById(R.id.editTextID);
        result = (TextView) findViewById(R.id.resultID);
    }

    public void getAnswer(View view){
        String countedWords = editText.getText().toString();
        result.setText(answer.getCount(countedWords));
    }
}
