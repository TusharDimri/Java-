class Demo {
    // Basically, with thr throw keyword, we are creating a custom exception that shows if some condition (which we choose) is met.
    public static void main(String[] args) {
        int j=0;
        int i=10;

        try {
            j=j/i;
            if(j==0){
                throw new ArithmeticException("Zero is not allowed, default value is: "+ 1);
            }
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }    
}
