package com.example.arjun27.lyndaandroidsdkunittesting;

import org.junit.Test;
import org.mockito.Mockito;

public class MockTest {


    @Test
    public void name() {

        SimpleMath simpleMath=new SimpleMath();
        int sum=simpleMath.add(9,5);
        System.out.print(sum);
    }

    @Test
    public void mockname() {
        SimpleMath simpleMath= Mockito.mock(SimpleMath.class);
        System.out.println(simpleMath.getClass());
        int sum=simpleMath.add(9,5);
        System.out.print(sum);
    }

    @Test
    public void mockcurrect() {
        SimpleMath simpleMath= Mockito.mock(SimpleMath.class);
        System.out.println(simpleMath.getClass());
        Mockito.when(simpleMath.add(9,5)).thenReturn(14);
        Mockito.when(simpleMath.add(4,15)).thenReturn(19);
        int sum=simpleMath.add(9,5);
        System.out.print(sum);
         sum=simpleMath.add(4,15);
        System.out.print(sum);
    }

    @Test
    public void testaddiscalled() {

        SimpleMath simpleMath= Mockito.mock(SimpleMath.class);
        Mockito.when(simpleMath.add(9,5)).thenReturn(14);
        MathUser mathUser=new MathUser(simpleMath);
        mathUser.doSomeMath();
        Mockito.verify(simpleMath).add(4,5);

    }
}
