public class Polygon {

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


