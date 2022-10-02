public class Parrot extends Bird{
    public Parrot(int y){super(y);} //un constructor no tiene sentido que sea de tipo portected

    public Parrot fly() { //se cambia el
        return new Parrot(2);
    }
}
