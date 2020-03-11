package interview.array.test;

import interview.array.PascalTriangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PascalTriangleTest {

    @Test
    void pascalValue(){
        PascalTriangle pascalTriangle = new PascalTriangle();
        assertEquals(pascalTriangle.pascalValue(2),"1 \n1 1 ");
    }
    @Test
    void pascalValue5(){
        PascalTriangle pascalTriangle = new PascalTriangle();
        assertEquals(pascalTriangle.pascalValue(5),"1 \n1 1 \n1 2 1 \n1 3 3 1 \n1 4 6 4 1 ");
    }
    @Test
    void pascalValueList(){
        PascalTriangle pascalTriangle = new PascalTriangle();
        assertEquals(pascalTriangle.solve(5).toString(),"[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]");
    }
}