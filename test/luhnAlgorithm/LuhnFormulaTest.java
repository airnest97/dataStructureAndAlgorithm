package luhnAlgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LuhnFormulaTest {

    private  LuhnFormula luhnFormula;

    @BeforeEach
    void setUp() {
        luhnFormula = new LuhnFormula();
    }

    @Test
    void luhnFormulaCanBeCreated(){
        assertNotNull(luhnFormula);
    }

    @Test
    void shouldReturnTrueForValidNumbersTest(){
        assertAll(
                () -> assertTrue(luhnFormula.validate("4388576018410707")),
                () -> assertTrue(luhnFormula.validate("5277 0291 2077 3860")),
                () -> assertTrue(luhnFormula.validate("4556-0690-9685-2293")),
                () -> assertTrue(luhnFormula.validate("4852789106979220268"))
        );
    }

    @Test
    void shouldReturnFalseForInvalidNumbersTest(){
        assertAll(
                () -> assertFalse(luhnFormula.validate("4388576018402626")),
                () -> assertFalse(luhnFormula.validate("4852 7891 0697 922 0261")),
                () -> assertFalse(luhnFormula.validate("3543-6933-8731-4139")),
                () -> assertFalse(luhnFormula.validate("6759310784561226"))
        );
    }
}
