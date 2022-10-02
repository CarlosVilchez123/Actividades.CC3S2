public class Bird {
    int feathers=0;
    public Bird(int x) {super(); this.feathers=x;}
    public Bird(){} //Se colocó el constructor vacio
    public Bird fly()
    {
        return new Bird(1);
    }
}
