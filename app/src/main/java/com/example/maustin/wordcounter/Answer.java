package com.example.maustin.wordcounter;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by maustin on 23/04/2018.
 */

public class Answer {

        private String words;

        public Answer(String words){
            this.words = words;
        }

        private String[] spaceWords(){
            return this.words.split(" ");
        }

        public int getCount(){
            return spaceWords().length;
        }

    }
