import java.util.*;
class TempratureConvertor
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("           ********* Temprature Convertor***********");
        System.out.println();
        System.out.print("Enter Temp in c");
        float cel = sc.nextFloat();
        System.out.println(" 1.Kevin  2.fahrenhiet  3.Rankine   4. Reaumur  ");
        System.out.print("Enter An option");
        int option = sc.nextInt();

        if(option ==1)
        {
            float kelvin = cel+273.15f;
            System.out.print(cel+"c =" +kelvin + "K");
    
        }
        else if(option==2)
        {
            float fah = (cel*(9/5f))+32;
            System.out.print( cel+"c = " +fah +"F");

        }
        else if(option==3)
        {
            double ran = (cel*(9/5d))+491.67;
            System.out.print( cel+"c = " +ran +"R");

        }
        else if(option==4)
        {
            float rea = cel*(4/5f);
            System.out.print( cel+"c = " +rea +"Re");

        }

    
        else{
            System.out.print("Wrong Input");
        }
    }

}
