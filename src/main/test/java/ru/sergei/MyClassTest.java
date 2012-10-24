

package ru.sergei;

import org.junit.Assert;
import org.junit.Test;

public class MyClassTest {

    @Test
    public void testMain() throws Exception {
        MyClass c = new MyClass();

        Assert.assertTrue(MyClass.MESSAGE.contains(MyClass.SUFFIX));
        Assert.assertEquals(MyClass.MESSAGE, c.getMessage());
    }

    @Test
    public void testgetLongMessage() throws Exception {
        MyClass c = new MyClass();
        Assert.assertTrue(MyClass.LONG_MESSAGE.contains(MyClass.SUFFIX));
        Assert.assertEquals(MyClass.LONG_MESSAGE, c.getLongMessage());
    }
}
