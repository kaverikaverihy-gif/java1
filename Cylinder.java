class Cylinder {
    private double radius;
    private double height;
    public double getRadius() {
        return radius;
    }
    public double getHeight() {
        return height;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double surfaceArea() {
        return 2 * Math.PI * radius * (height + radius);
    }
    public double volume() {
        return Math.PI * radius * radius * height;
    }
    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    Cylinder(int length, int breadth) { 
        System.out.println("Rectangle initialized:");
        System.out.println("Length: " + length + ", Breadth: " + breadth);
    }
}
