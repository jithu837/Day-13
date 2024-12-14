//throw example
public class Throw1{
public static void main(String args[]){
//try-catch
try
{
    throw new Exception("error");
}catch(Exception e)
{
    System.out.println(e.getMessage());
}}
}
