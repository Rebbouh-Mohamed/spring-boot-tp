import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    private Point point;

    @BeforeEach
    void setUp() {
        System.out.println("BeforeAll");

        point = new Point(5, 10);
    }

    @AfterEach
    void tearDown() {
        System.out.println("BeforeAll");
        point = null;
    }
    @Test 
    void  corr_neg(){
        Point p2=new Point(-1,-2);
        assertEquals(0,p2.getX());
        assertEquals(0,p2.getY());
    }
    @Test
    void getX() {
        assertEquals(5, point.getX());
    }

    @Test
    void setX() {
        point.setX(15);
        assertEquals(15, point.getX());

        // Test avec valeur négative
        point.setX(-5);
        assertEquals(0, point.getX());
    }

    @Test
    void getY() {
        assertEquals(10, point.getY());
    }

    @Test
    void setY() {
        point.setY(25);
        assertEquals(25, point.getY());

        // Test avec valeur négative
        point.setY(-10);
        assertEquals(0, point.getY());
    }
    @Test
    void testDistance(){
        Point p1=new Point(1,2);
        Point p2=new Point(1,2);
        assertEquals(p1.DistanceSquared(p2),0);


    }
}