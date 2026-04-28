interface Mango{
    void taste();
}
class Winter implements Mango{
    public void taste()
    {
        System.out.println("Winter Mango is Sweet");    
    }
}
class Summer implements Mango{
    public void taste()
    {
        System.out.println("Summer Mango is very sweet");
    }
}
public class Mango_interface{
    public static void main(String[] args) {
        Summer ob1=new Summer();
        ob1.taste();
        Winter ob2=new Winter();
        ob2.taste();
    }
}