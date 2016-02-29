package TP2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/02/29.
 */
public class Testhelloworld {

    Helloworld h = new Helloworld();
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testhelloworld() throws Exception {
        int result = h.add(1,2);
        Assert.assertEquals(3, result);

    }
}
