public class Macaw extends Parrot{
    public Macaw(int z){super(2);}
    public Macaw fly()
    {
        return new Macaw(3);
    }
}
