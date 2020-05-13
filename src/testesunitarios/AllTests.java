package testesunitarios;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Test2Calculadora.class, TestCalculadora.class })
public class AllTests {

}
