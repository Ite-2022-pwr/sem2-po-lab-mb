import org.example.RootsCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RootsCalculatorTest {

    @Test
    @DisplayName("delta dodatnia, dwa rozwiązania")
    void test1(){
        ArrayList<Double> roots = new ArrayList<>(RootsCalculator.calculate_roots(1,-5,-6));
        assertEquals(roots.size(), 2);
        assertEquals(roots.get(0), -1.0);
        assertEquals(roots.get(1), 6.0);
    }

    @Test
    @DisplayName("delta 0, jedno rozwiązanie")
    void test2(){
        ArrayList<Double> roots = new ArrayList<>(RootsCalculator.calculate_roots(1,-4,4));
        assertEquals(roots.size(), 1);
        assertEquals(roots.get(0), 2.0);
    }

    @Test
    @DisplayName("ujemna delta, zero rozwiązań")
    void test3() {
        ArrayList<Double> roots = new ArrayList<>(RootsCalculator.calculate_roots(1,1,6));
        assertEquals(roots.size(), 0);
    }

    @Test
    @DisplayName("równanie liniowe z 1 rozwiązaniem")
    void test4(){
        ArrayList<Double> roots = new ArrayList<>(RootsCalculator.calculate_roots(0,1,6));
        assertEquals(roots.size(), 1);
        assertEquals(roots.get(0), -6.0);
    }

    @Test
    @DisplayName("funkcja liniowa bez rozwiązań")
    void test5(){
        ArrayList<Double> roots = new ArrayList<>(RootsCalculator.calculate_roots(0,0,7));
        assertEquals(roots.size(), 0);
    }

    @Test
    @DisplayName("równanie liniowe z niesk. wieloma rozwiązaniami")
    void test6(){
        ArrayList<Double> roots = new ArrayList<>(RootsCalculator.calculate_roots(0,0,0));
        assertEquals(roots.size(), 1);
        assertEquals(roots.get(0), Double.POSITIVE_INFINITY);
    }

}