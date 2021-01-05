import TaxCalculation.Tax;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class TaxTest {
    Tax t=new Tax();
    @Test
    void calculateTax() throws Exception {
        //Boundary Tests

        assertEquals(0,t.CalculateTax(-654892));  //Displayed error message!!

        assertEquals(0,t.CalculateTax(0));
        assertEquals(150,t.CalculateTax(1000));
        assertEquals(3299.85,t.CalculateTax(21999));
        assertEquals(3300,t.CalculateTax(22000));

        assertEquals(3300.2,t.CalculateTax(22001));
        assertEquals(5900,t.CalculateTax(35000));
        assertEquals(8699.8,t.CalculateTax(48999));
        assertEquals(8700,t.CalculateTax(49000));

        assertEquals(8700.27,t.CalculateTax(49001));
        assertEquals(22470.27,t.CalculateTax(100001));
        assertEquals(27869.73,t.CalculateTax(119999));
        assertEquals(27870,t.CalculateTax(120000));

        assertEquals(27870.35,t.CalculateTax(120001));
        assertEquals(90870.7,t.CalculateTax(300002));
        assertEquals(195869.65,t.CalculateTax(599999));
        assertEquals(195870,t.CalculateTax(600000));

        assertEquals(195870.4,t.CalculateTax(600001));
        assertEquals(355870,t.CalculateTax(1000000));
        assertEquals(7.190772539449263E307,t.CalculateTax(Double.MAX_VALUE));

} }

// BEST REGARDS..