import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestShapes{

    private final double TOL = 0.05;

    @Test
    public void testShapeInit(){
	assertNotNull("Should not be null", new Circle(3));
    }

    @Test
    public void testCircleArea(){
	Circle tCircle = new Circle(3);
	assertEquals(28.26, tCircle.getArea(), TOL);
    }

    @Test
    public void testSquareArea(){
	Square tSquare = new Square(4);
	assertEquals(16.0, tSquare.getArea(), TOL);
    }

    @Test
    public void testRectangleArea(){
	Rectangle tRectangle = new Rectangle(4, 6);
	assertEquals(24.0, tRectangle.getArea(), TOL);
    }

    @Test
    public void testTriangleArea(){
	Triangle tTriangle = new Triangle(3, 7);
	assertEquals(10.5, tTriangle.getArea(), TOL);
    }

    @Test
    public void testSphereVolume(){
	Sphere tSphere = new Sphere(8);
	assertEquals(2143.57, tSphere.getVolume(), TOL);
    }
    
    @Test
    public void testCubeVolume(){
	Cube tCube = new Cube(10);
	assertEquals(1000.0, tCube.getVolume(), TOL);
    }

    @Test
    public void testConeVolume(){
	Cone tCone = new Cone(8, 5);
	assertEquals(334.9, tCone.getVolume(), TOL);
    }

    @Test
    public void testCylinderVolume(){
	Cylinder tCylinder = new Cylinder(11, 20);
	assertEquals(7598.8, tCylinder.getVolume(), TOL);
    }

    @Test
    public void testTorusVolume(){
	Torus tTorus = new Torus(10, 3);
	assertEquals(1774.73, tTorus.getVolume(), TOL);
    }
    
}//end TestShapes
