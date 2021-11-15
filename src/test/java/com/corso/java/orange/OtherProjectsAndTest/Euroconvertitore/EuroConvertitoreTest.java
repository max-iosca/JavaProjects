package com.corso.java.orange.OtherProjectsAndTest.Euroconvertitore;

import com.corso.java.orange.OtherProjectsAndTest.Euroconvertitore.max.EuroConvertitore;
import com.corso.java.orange.OtherProjectsAndTest.Euroconvertitore.max.FakeSitoCambi;
import com.corso.java.orange.OtherProjectsAndTest.Euroconvertitore.max.SitoCambi;
import org.junit.Test;

import static org.junit.Assert.*;
/*
@RunWith(MockitoJUnitRunner.class)
 */
public class EuroConvertitoreTest {

    // si può fare anche così
    /*
    @Mock
    private SitoCambi sitoCambi;

    oppure
    @InjectMocks
    private EuroConvertitore euroConvertitore;
     */



    @Test
    public void convertiInEuroVerificaSeConversionCorretta() {
     //e commentare riga 19.
        SitoCambi sitoCambi = new FakeSitoCambi(1.0d);
        EuroConvertitore euroConvertitore = new EuroConvertitore(sitoCambi);
     //e fare così
     // when(sitocambi.ottieniCambio("USD)).thenReturn(1,1d);
        double risultato = euroConvertitore.convertiInEuro(10d,"USD");
        assertTrue(risultato==10d);
    }
}