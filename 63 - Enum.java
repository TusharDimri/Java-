enum Status{
    Running,
    Failed,
    Sending,
    Success;
}

class Demo{
    public static void main(String[] args){
    //    Status s1 = Status.Running;
    //    System.out.println(s1);
    //    System.out.println(s1.ordinal());

    //    Status s2 = Status.Failed;
    //    System.out.println(s2);
    //    System.out.println(s2.ordinal());

       Status [] all_status = Status.values();
       for (Status s : all_status) {
           System.out.println(s + " " + s.ordinal());
       }
    }
}