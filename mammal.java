
class animal//super class
{
    static void animaltype()
    {
        System.out.println("This is a blue whale.");
    }
}
public class mammal extends animal//inhereting super class
    {
        static void animaltype()//overriding
        {
            System.out.println("It is a mammal.");
        }
        public static void main(String args[])
        {
            animal ob1=new animal();
            ob1.animaltype();
            mammal.animaltype();
        }
    }
