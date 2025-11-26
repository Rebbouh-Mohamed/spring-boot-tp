import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CercelTest {
    @Test
    void testPointInside() {
        Point center = new Point(0, 0);  
        Cercel circle = new Cercel(center, 5);
        Point inside = new Point(3, 4);
        assertTrue(circle.PointBelongCercel(inside));
    }

    @Test
    void testPointOutside() {
        Point center = new Point(0, 0);
        Cercel circle = new Cercel(center, 5);
        Point outside = new Point(6, 0);
        assertFalse(circle.PointBelongCercel(outside));
    }
}