// 1.try 2.catch 3.finally
public class Exception {
    public static void main(String args[])
    {
        //try-catch block
        try{
            int d=90/0;
        }
        catch(ArithmeticException v)
        {
            System.out.println("bad request");
        }
        //try-catch and finally
        try{
            int d=90/0;
        }
        catch(ArithmeticException v)
        {
            System.out.println("catch block is running");
        }
        finally{
            System.out.println("finally is running");
        }
        }
    }
