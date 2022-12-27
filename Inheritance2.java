class Vehicle 
{
    int maxSpeed = 70;
}
class Car extends Vehicle 
{
    int maxSpeed = 100;
 
    void display()
    {
	System.out.println("Maximum Speed: "+ super.maxSpeed);
    }
}
class Test {
    public static void main(String[] args)
    {
        Car small = new Car();
        small.display();
    }
}

//super Keyword in variables