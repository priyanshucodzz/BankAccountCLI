package Exception;
public class TryCatch {
    public static String checkAge (int age) throws IllegalAccessException {
        if(age >= 18){
            return "Allowed to drive";
        }
        else {
            throw new IllegalAccessException("Not allowed to drive");
        }
    }
    public static void main(String[] args) {
        try{
            String s = checkAge(18);
            System.out.println(s);
        }catch (IllegalAccessException e)
        {
            System.out.println(e.getLocalizedMessage());

        }
    }
}

