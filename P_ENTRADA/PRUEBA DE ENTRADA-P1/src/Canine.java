public class Canine {
    private StringBuilder logger = new StringBuilder();
    public Canine(boolean t)
    {
        logger.append("a");
    }
    public Canine() { logger.append("q"); }
    protected void print(String v) { logger.append(v); }
    protected String view() { return logger.toString(); }

}
