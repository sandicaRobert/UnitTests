package com.example.sandicarobert.junittests;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.TextView;

/**
 * Created by Sandica Robert on 4/6/2016.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity activity;
    public MainActivityTest() {
        super(MainActivity.class);
    }
    @Override
    protected  void setUp()throws Exception{
        super.setUp();
        activity=getActivity();
    }
    @SmallTest
    public  void testTextViewANotNull(){
        TextView textView=(TextView) activity.findViewById(R.id.textA);
        assertNotNull(textView);
    }
    @SmallTest
    public  void testTextViewSNotNull(){
        TextView textView=(TextView) activity.findViewById(R.id.textS);
        assertNotNull(textView);
    }
    @SmallTest
    public  void testTextViewMNotNull(){
        TextView textView=(TextView) activity.findViewById(R.id.textM);
        assertNotNull(textView);
    }
    @SmallTest
    public  void testTextViewDNotNull(){
        TextView textView=(TextView) activity.findViewById(R.id.textS);
        assertNotNull(textView);
    }

}
