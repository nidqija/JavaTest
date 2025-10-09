/*
    Question:
    You are asked to create a program that demonstrates INHERITANCE and POLYMORPHISM 
    using a shape hierarchy.

    Requirements:
    1. Create a parent class called "Shape" that has:
       - a method called "area()" that prints "Calculating area..."
       - a method called "display()" that prints "This is a shape."

    2. Create two subclasses:
       - "Circle" with:
           • an instance variable 'radius'
           • a constructor to set the radius
           • override area() to print "Area of Circle: <computed area>"
       - "Rectangle" with:
           • instance variables 'length' and 'width'
           • a constructor to set them
           • override area() to print "Area of Rectangle: <computed area>"

    3. In the main method:
       - Create an array of Shape references that store different Shape objects.
       - Use a loop to call area() and display() on each object.
         (Demonstrate polymorphism.)

    Expected Output Example:
    This is a shape.
    Area of Circle: 78.5
    This is a shape.
    Area of Rectangle: 40.0
*/



package CP.Area;



// ======================================shape class============================================//

 class Shape {
    public void area(){
        System.out.println("Calculating area...");
    }

    public void display(){
        System.out.println("This is a shape.");
    }


}

// =====================================circle class============================================//

class Circle extends Shape{
    

    private double radius;
    private double formula;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

   

    public double getArea(){
        formula = Math.PI * radius * radius;
        return formula;
    }

// print area of Circle //
    @Override
    public void area(){
        System.out.println("Area of Circle: " + getArea() );
    }
}



// ===================================rectangle class============================================//

class Rectangle extends Shape{
    private double length;
    private double width;
    private double formula;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return length;

    }

    public double getWidth(){
        return width;
    }

    public double getArea(){
        formula = length * width;
        return formula;
    }



    @Override
    public void area(){ 
        
        System.out.println("Area of Rectangle: " + getArea());
    }
}


class Testshape {
     public static void main(String[] args){
        Shape [] shapes = new Shape[3];
        shapes[0] = new Shape();
        shapes[1] = new Circle(5);
        shapes[2] = new Rectangle(3 , 4);

        for (int i = 0 ; i < shapes.length; i++){
            shapes[i].display();
            shapes[i].area();
          

        }

     }
}
