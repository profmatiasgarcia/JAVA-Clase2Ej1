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
public class Profesor extends Persona {

    private String materia;

    private int Antiguedad;

    public Profesor() {
    }

    public Profesor(String materia, int Antiguedad) {
        this.materia = materia;
        this.Antiguedad = Antiguedad;
    }

    public Profesor(String materia, int Antiguedad, String nombre, int edad, String apellido) {
        super(nombre, edad, apellido);
        this.materia = materia;
        this.Antiguedad = Antiguedad;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getAntiguedad() {
        return Antiguedad;
    }

    public void setAntiguedad(int Antiguedad) {
        this.Antiguedad = Antiguedad;
    }

    public void mostrarDatos() {
        System.out.println("---- El Profesor ----");
        System.out.println("Apellido: " + this.getApellido()); 
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("materia: " + this.materia);
        System.out.println("Antiguedad: " + this.Antiguedad);
    }

}
