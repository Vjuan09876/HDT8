import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;

public class MainJCF {
    public static void main(String[] args) {
        PriorityQueue<Paciente> colaEmergencias = new PriorityQueue<>();
        System.out.println("leyendo pacientes");
        try (BufferedReader br = new BufferedReader(new FileReader("pacientes.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 3) {
                    Paciente p = new Paciente(partes[0], partes[1], partes[2]);
                    colaEmergencias.add(p);
                }
            }
        }
        }
        System.out.println("\n atendiendo pacientes");
        while (!colaEmergencias.isEmpty()) {
            Paciente atendido = colaEmergencias.poll(); 
            System.out.println(atendido.toString());
        }
    }