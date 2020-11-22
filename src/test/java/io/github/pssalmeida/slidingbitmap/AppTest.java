package io.github.pssalmeida.slidingbitmap;

import org.junit.Test;

public class AppTest 
{

    @Test
    public void test1()  {
        SlidingBitmap s = new SlidingBitmap(20);
        s.extendTo(10);
        assert s.start() == 0;
        assert s.end() == 10;
        assert s.size() == 10;
        assert s.contains(0);
        assert s.contains(3);
        assert s.contains(9);
        assert !s.contains(10);
        assert !s.contains(11);
        assert !s.contains(-1);
        assert s.remove(3);
        assert !s.contains(3);
        assert s.start() == 0;
        assert s.end() == 10;
        assert s.size() == 9;
        assert s.remove(1);
        assert s.start() == 0;
        assert s.remove(2);
        assert s.start() == 0;
        assert s.remove(0);
        assert s.start() == 4;
        assert s.end() == 10;
        assert s.size() == 6;
        assert !s.remove(0);
        s.extendTo(30);
        assert s.start() == 4;
        assert s.end() == 30;
        assert s.size() == 26;
    }

    @Test
    public void test2()  {
        SlidingBitmap s = new SlidingBitmap(62);
        s.extendTo(63);
        assert s.remove(0);
        assert s.start() == 1;
        assert s.end() == 63;
        assert s.size() == 62;
        assert s.contains(62);
        assert !s.contains(63);
        s.extendTo(64);
        assert s.end() == 64;
        assert s.size() == 63;
        assert s.contains(63);
        assert !s.contains(64);
        s.extendTo(65);
        assert s.end() == 65;
        assert s.size() == 64;
        assert s.contains(64);
        assert !s.contains(65);
    }

    @Test
    public void test3()  {
        SlidingBitmap s = new SlidingBitmap(300);
        s.extendTo(260);
        s.removeSmallerThan(60);
        assert s.start() == 60;
        assert s.size() == 200;
        for (long i = 61; i < 128; ++i)
            s.remove(i);
        s.remove(128);
        s.remove(129);
        s.removeSmallerThan(62);
        assert s.start() == 130;
        assert s.size() == 260 - 130;
    }

}
