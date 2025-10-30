class CustomException extends Exception {
    public CustomException(String msg) {
        super(msg);
    }
}

class Demo {
    public static void main(String[] args) {
        try{
            int num = 1;        
            if (num < 10) {
                throw new CustomException("Number is less than 10");
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
