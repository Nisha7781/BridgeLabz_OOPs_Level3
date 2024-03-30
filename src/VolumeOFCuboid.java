public class VolumeOFCuboid
{
     static  double calculateVolume()
    {
        double length = 15;
        double breadth = 12;
        double height = 10;
        return length * breadth * height;
    }

    public static void main(String[] args)
    {
        double volume = calculateVolume();
        System.out.println("Volume of cuboid is :"+ volume);
    }
}
