package Instituto;
/**
 * @author Prof Matias Garcia.
 * <p> Copyright (C) 2017 para <a href = "https://www.profmatiasgarcia.com.ar/"> www.profmatiasgarcia.com.ar </a>
 * - con licencia GNU GPL3.
 * <p> Este programa es software libre. Puede redistribuirlo y/o modificarlo bajo los términos de la
 * Licencia Pública General de GNU según es publicada por la Free Software Foundation, 
 * bien con la versión 3 de dicha Licencia o bien (según su elección) con cualquier versión posterior. 
 * Este programa se distribuye con la esperanza de que sea útil, pero SIN NINGUNA GARANTÍA, 
 * incluso sin la garantía MERCANTIL implícita o sin garantizar la CONVENIENCIA PARA UN PROPÓSITO
 * PARTICULAR. Véase la Licencia Pública General de GNU para más detalles.
 * Debería haber recibido una copia de la Licencia Pública General junto con este programa. 
 * Si no ha sido así ingrese a <a href = "http://www.gnu.org/licenses/"> GNU org </a>
 */
public class Test {

    public static void main(String[] args) {
        Estudiante est1 = new Estudiante();
        est1.setApellido("Garcia");
        est1.setNombre("Matias");
        est1.setLegajo(1234);
        est1.setCarrera("Informatica");
        est1.setEdad(40);

        Estudiante est2 = new Estudiante(2345, "Geografia", "Angie", 30, "Citterio");
        
        Profesor prof1 = new Profesor("Programacion III", 10);
        prof1.setApellido("Perez");
        prof1.setNombre("Lucas");
        prof1.setEdad(50);
        
        System.out.println(est1);
        
        System.out.println(est2);
        
        prof1.mostrarDatos();
        
        System.out.println(prof1);

    }
}
