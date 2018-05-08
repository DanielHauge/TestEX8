package TriangleWithCucumber;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.Assert.*;

public class PolygonHandlerImplTest {

    PolygonHandlerImpl PH;

    @BeforeEach
    void Setup(){
        PH = new PolygonHandlerImpl();
    }

    @ParameterizedTest(name = "{0},{1},{2},{3},{4}")
    @CsvFileSource(resources = "/data.csv", delimiter = ';')
    public void calculateTriangleType(String id, String a, String b, String c, String expected) throws Exception {
        Polygon p = new Polygon(); // Creating cheat polygon, since implementation throws exception
        p.sides = new double[]{Double.parseDouble(a),Double.parseDouble(b),Double.parseDouble(c)};
        String result = PH.CalculateTriangleType(p);
        assertEquals(expected,result);
    }
}