package com.example.maustin.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class WordCountActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);

        editText = (EditText) findViewById(R.id.editTextID);
        textView = (TextView) findViewById(R.id.resultID);
    }

    public void getAnswer(View view){
        String countWords = editText.getText().toString();
        Answer answer = new Answer(countWords);
        String wordCount = String.valueOf(answer.getCount());
        textView.setText(wordCount);
    }
}
