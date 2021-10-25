package katas.bbarreto;

import katas.CountingDuplicates;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountingDuplicateTest {

    @Test
    public void datoEntradaRetornaCero(){
        assertEquals(0, katas.CountingDuplicates.duplicateCount("abcde"));
    }


    @Test
    public void datoEntradaRetornaDos(){
        assertEquals(2, katas.CountingDuplicates.duplicateCount("aabbcde"));
    }

    @Test
    public void datoEntradaRetornaDosCaseSensitive(){
        assertEquals(2, katas.CountingDuplicates.duplicateCount("aabBcde"));
    }

    @Test
    public void datoEntradaLimiteAlfabetico(){
        assertEquals(-1, katas.CountingDuplicates.duplicateCount("##aabb%%+"));
    }

    @Test
    public void datoEntradaRetornaUno(){
        assertEquals(1, CountingDuplicates.duplicateCount("iiiiii"));
    }
}
