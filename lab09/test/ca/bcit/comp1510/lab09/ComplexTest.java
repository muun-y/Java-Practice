package ca.bcit.comp1510.lab09;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ComplexTest {

    @Test
    void testComplexConstructor() {
        Complex c = new Complex(3, 2);
        assertEquals(3, c.re, "Real part should be 3");
        assertEquals(2, c.im, "Imaginary part should be 2");
    }

    @Test
    void testPolarComplex() {
        Complex c = Complex.polarComplex(5, Math.PI / 4);
        assertEquals(5 * Math.cos(Math.PI / 4), c.re, 1e-9, "Real part should match polar conversion");
        assertEquals(5 * Math.sin(Math.PI / 4), c.im, 1e-9, "Imaginary part should match polar conversion");
    }

    @Test
    void testAbs() {
        Complex c = new Complex(3, 4);
        assertEquals(5, c.abs(), "Absolute value should be 5");
    }

    @Test
    void testArg() {
        Complex c = new Complex(1, 1);
        assertEquals(Math.PI / 4, c.arg(), "Argument should be PI/4");
    }

    @Test
    void testConjugate() {
        Complex c = new Complex(3, 2);
        Complex conj = c.conjugate();
        assertEquals(3, conj.re, "Real part should be 3");
        assertEquals(-2, conj.im, "Imaginary part should be -2");
    }

    @Test
    void testAdd() {
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(1, 4);

        Complex result = c1.add(c2);

        assertEquals(4, result.re, "Real part of the sum should be 4");
        assertEquals(6, result.im, "Imaginary part of the sum should be 6");
    }

    @Test
    void testAddReal() {
        Complex c1 = new Complex(3, 2);
        double real = 5;

        Complex result = c1.add(real);

        assertEquals(8, result.re, "Real part of the sum should be 8");
        assertEquals(2, result.im, "Imaginary part of the sum should be 2");
    }

    @Test
    void testSubtract() {
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(1, 4);

        Complex result = c1.subtract(c2);

        assertEquals(2, result.re, "Real part of the difference should be 2");
        assertEquals(-2, result.im, "Imaginary part of the difference should be -2");
    }

    @Test
    void testSubtractReal() {
        Complex c1 = new Complex(3, 2);
        double real = 2;

        Complex result = c1.subtract(real);

        assertEquals(1, result.re, "Real part of the difference should be 1");
        assertEquals(2, result.im, "Imaginary part of the difference should be 2");
    }
    @Test
    void testMultiply() {
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(1, 4);

        Complex result = c1.multiply(c2);

        assertEquals(-5, result.re, "Real part of the product should be -5");
        assertEquals(14, result.im, "Imaginary part of the product should be 14");
    }

    @Test
    void testMultiplyScalar() {
        Complex c1 = new Complex(3, 2);
        double scalar = 2;

        Complex result = c1.multiply(scalar);

        assertEquals(6, result.re, "Real part of the product should be 6");
        assertEquals(4, result.im, "Imaginary part of the product should be 4");
    }

    @Test
    void testReciprocal() {
        Complex c1 = new Complex(3, 4);

        Complex result = c1.reciprocal();

        assertEquals(3.0 / 25, result.re, 1e-9, "Real part of the reciprocal should be 3/25");
        assertEquals(-4.0 / 25, result.im, 1e-9, "Imaginary part of the reciprocal should be -4/25");
    }

    @Test
    void testReciprocalZero() {
        Complex zero = new Complex(0, 0);
        assertThrows(IllegalArgumentException.class, zero::reciprocal, "Reciprocal of zero should throw IllegalArgumentException");
    }
    @Test
    public void testExp() {
        Complex c1 = new Complex(0, 1); // i
        Complex result = c1.exp();
        assertEquals(Math.exp(0) * Math.cos(1), result.re, 0.0001);
        assertEquals(Math.exp(0) * Math.sin(1), result.im, 0.0001);

        Complex c2 = new Complex(-1, 2); // -1+2i
        result = c2.exp();
        assertEquals(Math.exp(-1) * Math.cos(2), result.re, 0.0001);
        assertEquals(Math.exp(-1) * Math.sin(2), result.im, 0.0001);
    }
    @Test
    void testDivideComplex() {
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(1, 1);

        Complex result = c1.divide(c2);

        assertEquals(2.5, result.re, 1e-9, "실수 부분이 2.5 여야 합니다.");
}

    @Test
    void testDivideComplexByZero() {
        Complex c1 = new Complex(3, 2);
        Complex zero = new Complex(0, 0);
        assertThrows(IllegalArgumentException.class, () -> c1.divide(zero), "Dividing by zero should throw IllegalArgumentException");
    }

    @Test
    void testEquals() {
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(3, 2);
        Complex c3 = new Complex(4, 2);
        Complex c4 = new Complex(3, 4);

        assertTrue(c1.equals(c2), "c1 and c2 must be the same complex number.");
        assertFalse(c1.equals(c3), "c1 and c3 must be different complex number.");
        assertFalse(c1.equals(c4), "c1 and c4 must be different complex number.");
        assertFalse(c1.equals(null), "c1 and null should be another object.");
    }
    @Test
    void testDivideScalar() {
        Complex c1 = new Complex(4, 2);
        double scalar = 2;

        Complex result = c1.divide(scalar);

        assertEquals(2, result.re, 1e-9, "The real number must be 2.");
}

    @Test
    void testDivideScalarByZero() {
        Complex c1 = new Complex(3, 2);
        double scalar = 0.0;

        assertThrows(IllegalArgumentException.class, () -> c1.divide(scalar), "Divided by 0, you must cause IllegalArgumentException.");
    }

 
    @Test
    void testLog() {
        Complex c1 = new Complex(1, 0);
        Complex result = c1.log();

        assertEquals(0, result.re, 1e-9, "The real part should be 0.");
        assertEquals(0, result.im, 1e-9, "The imaginary part should be 0.");

        Complex c2 = new Complex(0, 1);
        Complex result2 = c2.log();

        assertEquals(Math.log(1), result2.re, 1e-9, "The real part should be 0.");
        assertEquals(Math.PI / 2, result2.im, 1e-9, "The imaginary part should be close to π/2.");
    }

    @Test
    void testHashCode() {
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(3, 2);
        Complex c3 = new Complex(1, 4);

        assertEquals(c1.hashCode(), c2.hashCode(), "Equal complex numbers should have the same hash code.");
        assertNotEquals(c1.hashCode(), c3.hashCode(), "Different complex numbers should have different hash codes.");
    }

    
    @Test
    void testSqrt() {
        Complex c1 = new Complex(4, 0);
        Complex result = c1.sqrt();

        assertEquals(2, result.re, "Real part of the square root should be 2");
        assertEquals(0, result.im, "Imaginary part of the square root should be 0");
    }
    
    @Test
    void testToString() {
        Complex c1 = new Complex(3, 0);
        assertEquals("3.0", c1.toString(), "When the imaginary part is 0, only the real part should be displayed.");

        Complex c2 = new Complex(0, 2);
        assertEquals("2.0i", c2.toString(), "When the real part is 0, only the imaginary part and 'i' should be displayed.");

        Complex c3 = new Complex(1, 4);
        assertEquals("1.0 + 4.0i", c3.toString(), "When the imaginary part is positive, the real part and imaginary part should be displayed with a + sign.");

        Complex c4 = new Complex(1, -4);
        assertEquals("1.0 - 4.0i", c4.toString(), "When the imaginary part is negative, the real part and imaginary part should be displayed with a - sign.");
    }


}

