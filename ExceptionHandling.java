

public class ExceptionHandling {
    public static void main(String[] args) {
        NullPointerException e = null;
        try{
            System.out.println("Throwing exception");
            assert e != null;
            throw e;
        }
        catch (NullPointerException err){
            System.out.println("Exception caught.");
        }
        finally {
            System.out.println("Inside Finally.");
        }
    }
}
