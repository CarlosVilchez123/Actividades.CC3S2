public class Main {
    public static void main(String[] args)
    {
        Bird p = new Macaw(4);
        System.out.println(
                ((Parrot)p.fly()).feathers
        );
    }
}