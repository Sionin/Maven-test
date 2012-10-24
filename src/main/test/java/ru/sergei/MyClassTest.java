

package ru.sergei;

import org.junit.Assert;
import org.junit.Test;

public class MyClassTest {

    @Test
    public void testMain() throws Exception {
        MyClass c = new MyClass();
        Assert.assertEquals(MyClass.MESSAGE, c.getMessage());
    }
}
