//SERKAN KOÇOĞLU 17070006004
package TaxCalculation;

import org.w3c.dom.ls.LSOutput;

//Base Code
public class Tax {

    public double CalculateTax(double input) throws Exception {
if( ( input <= Double.MAX_VALUE ) && ( input >= -Double.MAX_VALUE )){
    if (input < 0) {
        //Homework says display an error message ,it is not clear so both ways are;
        System.out.println("input value is less than zero !");
      // throw new Exception("input value is less than zero !");
        return 0;
    } else if (input <= 22000) {
        return  input * 0.15;
    } else if (input <= 49000 && input > 22000) {
        return  (input - 22000) * 0.2 + 3300;
    } else if (input <= 120000 && input > 49000) {
        return (input - 49000) * 0.27 + 8700;
    } else if (input <= 600000 && input > 120000) {
        return   (input - 120000) * 0.35 + 27870;
    } else if (input > 600000) {
        return   (input - 600000) * 0.40 + 195870;
    }

}
        return -1;
    }





    public static void main(String[] args) throws Exception {
        Tax t = new Tax();
    try{
        System.out.println(t.CalculateTax("ABC"));
    }
    catch (Exception e){
        throw new Exception("HATA MESAJIM NEREDE !1!1!");;
    }
    }



}

