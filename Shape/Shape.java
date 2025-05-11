package Shape;


        // Tính trừu tượng và đa hình
abstract class Shape {
    // Tính đóng gói: thuộc tính private
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Tính trừu tượng: phương thức trừu tượng
    public abstract double getArea();
}

// Tính kế thừa: Hình vuông kế thừa Shape
class Square extends Shape {
    private double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

// Tính kế thừa: Hình tròn kế thừa Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Tính kế thừa: Hình tam giác cân kế thừa Shape
class IsoscelesTriangle extends Shape {
    private double base;
    private double height;

    public IsoscelesTriangle(double base, double height) {
        super("Isosceles Triangle");
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }
}



