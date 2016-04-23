package com.example.sandicarobert.junittests;

/**
 * Created by Sandica Robert on 4/7/2016.
 */

import android.test.suitebuilder.annotation.SmallTest;

import com.example.sandicarobert.junittests.NumberOperations;

import junit.framework.Assert;
import junit.framework.TestCase;
/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class SimpleTest extends  TestCase  {
    @Override
    protected void setUp()throws Exception{super.setUp();
    }

    @SmallTest
    public void testNumberAdder()
    {
        NumberOperations testObj=new NumberOperations();
        int result=testObj.AddTwoNumbers(9,3);
        Assert.assertEquals(result, 12);
    }
    public void testNumberSubtraction() {
        NumberOperations testObj = new NumberOperations();
        int result = testObj.SubtractTwoNumbers(9,3);
        Assert.assertEquals(result, 6);
    }
    public void testNumberMultiply() {
        NumberOperations testObj = new NumberOperations();
        int result = testObj.MultiplyTwoNumbers(9, 3);
        Assert.assertEquals(result, 27);
    }
    public void testNumberDivision() {
        NumberOperations testObj = new NumberOperations();
        int result = testObj.divideTwoNumbers(9, 3);
        Assert.assertEquals(result, 3);
    }
        @Override
    protected void tearDown() throws Exception{
        super.tearDown();
    }
}
