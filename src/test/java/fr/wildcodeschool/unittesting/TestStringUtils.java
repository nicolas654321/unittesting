package fr.wildcodeschool.unittesting;

import org.junit.Test;

public class TestStringUtils {

    @Test
    public void test1() {

        assert(StringUtils.uniqueVowels("ABCA").equals("A"));
    }

    @Test
    public void test2() {
        assert(StringUtils.uniqueVowels("ABaaC").equals("A"));
    }

    @Test
    public void test3() {
        assert(StringUtils.uniqueVowels("ABbbbCccc").equals("A"));
    }

    @Test
    public void test4() {
        assert(StringUtils.vowels("ABCa").equals("Aa"));
    }


}
