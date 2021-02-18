package Banco;
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
public class CuentaBancaria {
    // Constante

    private static final double LIMITE_NORMAL = 3000.00;
    // Variables de instancia
    private double saldo;
    private double limite;

    // Constructor sin parámetros
    public CuentaBancaria() {
        this.saldo = 0;
        this.limite = LIMITE_NORMAL;
    }

    // Constructor con parámetros
    public CuentaBancaria(double limit) {
        this.saldo = 0;
        this.limite = limit;
    }

    // Constructor con parámetros
    public CuentaBancaria(double saldoInicial, double limit) {
        this.saldo = saldoInicial;
        this.limite = limit;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    // Metodo para depositar
    public void depositar(double importe) {
        this.saldo = this.saldo + importe;
    }

    // Metodo para extraer
    public void extraer(double importe) {
        this.saldo = this.saldo - importe;
    }

    public void mostrarDatosCuenta() {
        System.out.println("Saldo de cuenta " + this.saldo);
        System.out.println("Limite de cuenta " + this.limite);
    }

}
