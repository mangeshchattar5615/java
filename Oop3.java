class Vehicle{
    String colour;
    private int number;
}

class Car extends Vehicle{
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.colour = "black";
        v.number = 8486;
        System.out.println(v.number + " " + v.colour);
    }
}