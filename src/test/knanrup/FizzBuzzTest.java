package knanrup;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void forNumber3Fizz(){
        FizzBuzz fb = new FizzBuzz(3);
        String str = fb.findFizzBuzz();
        Assert.assertEquals("Fizz",str);
    }

    @Test
    public void forNumber5buzz(){
        FizzBuzz fb = new FizzBuzz(5);
        String str = fb.findFizzBuzz();
        Assert.assertEquals("Buzz",str);
    }
}
