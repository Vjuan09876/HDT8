import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VectorHeapTest {

    @Test
    public void testAdd() {
        VectorHeap<Paciente> heap = new VectorHeap<>();
        
        heap.add(new Paciente("Pedro", "Fiebre", "E"));
        assertEquals("E", heap.peek().getCodigoEmergencia(), "la raiz deberia ser E");
        
        heap.add(new Paciente("Maria", "Infarto", "A"));
        assertEquals("A", heap.peek().getCodigoEmergencia(), "la raiz ahora deberia ser A");
        
        assertEquals(2, heap.size(), "deberia haber 2 elementos en el heap");
    }

    @Test
    public void testRemove() {
        VectorHeap<Paciente> heap = new VectorHeap<>();
        
        heap.add(new Paciente("Juan", "Fractura", "C"));
        heap.add(new Paciente("Maria", "Apendicitis", "A"));
        heap.add(new Paciente("Lorenzo", "Gripe", "E"));
        heap.add(new Paciente("Carmen", "Dolores", "B"));

        Paciente p1 = heap.remove();
        assertEquals("A", p1.getCodigoEmergencia());
        assertEquals("Maria", p1.getNombre());

        Paciente p2 = heap.remove();
        assertEquals("B", p2.getCodigoEmergencia());
        assertEquals("Carmen", p2.getNombre());
        
        Paciente p3 = heap.remove();
        assertEquals("C", p3.getCodigoEmergencia());
        
        assertEquals(1, heap.size());
    }
}