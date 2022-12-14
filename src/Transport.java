public class Transport {
    protected String name;
    protected String Model;
    protected int year;

    public Transport ( String name, String model, int year){
        this.name =name;
        this.Model = model;
        this.year = year;
    }

    public void Display ()
    {
        System.out.println("Name: " + this.name + " Model: " + this.Model + " Year: " + this.year);
    }


}
