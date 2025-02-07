public class Main {
    public static void main(String[] args) {

        // create an object of Square
        Square s1 = new Square();
        s1.render(); // Output: Rendering Square...

        // create an object of Circle
        Circle c1 = new Circle();
        c1.render(); // Output: Rendering Circle... followed by Rendering Polygon...

    }
}
class Polygon {

    // method to render a shape
    public void render() {
        System.out.println("Rendering Polygon...");
    }
}

class Square extends Polygon {

    // renders Square
    @Override
    public void render() {
        System.out.println("Rendering Square...");
    }
}

class Circle extends Polygon {

    // renders Circle
    @Override
    public void render() {
        System.out.println("Rendering Circle...");
        // Call the render method of the parent class
        super.render();
    }
}

