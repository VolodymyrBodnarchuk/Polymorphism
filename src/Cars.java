public class Cars extends Transport {

    private double speed;

    public Cars(String name, String model, int year, double speed) {
        super(name, model, year);
        setSpeed(speed);
    }

    public void Display(){
        System.out.println("Name: " + name + " Model: " + this.Model + " Year: " + year + " Speed: " + speed);
    }

    public void Display(int number){
        System.out.println(number +" Name: " + name + " Model: " + this.Model + " Year: " + year + " Speed: " + speed);
    }

    public double getSpeed(){
        return speed;
    }

    public void setSpeed(double maxSpeed){
        if(maxSpeed > speed)
            speed = maxSpeed;
    }

}
