package liczyd�o;
 
// priorytet(String) zwraca priorytet dla poszczeg�lnych operator�w.
 
public class Priorytet extends kalkulator
{
    public int priorytet(String opPro)
    {      
        if (opPro.equals("+") || opPro.equals("-"))
        {
            return 1;
        }
        else if (opPro.equals("*") || opPro.equals("/"))
        {
            return 2;
        }
        else
        {
            return 0;
        }              
    }    
}