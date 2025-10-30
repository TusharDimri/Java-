
enum Status{
    Running,
    Pending,
    Failed,
    Success;
}

// In Java , everything is trated as a class, and so is Enum.

class Demo{
    public static void main(String[] args){
        Status s = Status.Running;

        // Note: Enum extends from Enum class and that is where we get all the methods form.
        System.out.println(s.getClass().getSuperclass()); 
        // s belongs to Status class and that class extends Enum class by default.

        // if (s==Status.Running) {    
        //     System.out.println("Running");
        // }
        // else if( s==Status.Pending) {
        //     System.out.println("Pending");
        // }
        // else if (s==Status.Failed) {
        //     System.out.println("Failed");   
        // }
        // else{
        //     System.out.println("Success");
        // }

        switch (s) {
            case Running:
                System.out.println("Running");
                break;
            case Pending:
                System.out.println("Pending");
                break;
            case Failed:
                System.out.println("Failed");
                break;
            default:
                System.out.println("Success");
                break;
        }       

    }
}