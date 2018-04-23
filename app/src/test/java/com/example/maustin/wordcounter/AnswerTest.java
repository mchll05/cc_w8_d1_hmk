package com.example.maustin.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by maustin on 23/04/2018.
 */

public class AnswerTest {

    private Answer answer;

    @Before
    public void before() {
        answer = new Answer();
    }

    @Test
    public void canCount(){
        assertEquals(5, answer.getCount("Alice"));
    }
}
