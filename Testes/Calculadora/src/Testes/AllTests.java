package Testes;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Fontes.MensagemBoasVindasTeste;

@RunWith(Suite.class)
@SuiteClasses({ CalculadoraTeste.class, MensagemBoasVindasTeste.class })
public class AllTests {

}
