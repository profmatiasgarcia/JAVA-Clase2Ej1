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
public class Test {

    public static void main(String[] args) {
        // LLama a constructor sin parametros
        CuentaBancaria CuentaNormal1 = new CuentaBancaria();
        CuentaNormal1.mostrarDatosCuenta();
        // LLama a constructor con parametro que modifica el limite
        CuentaBancaria CuentaEspecial1 = new CuentaBancaria(5000);
        CuentaEspecial1.mostrarDatosCuenta();
        // LLama a constructor con parametros que modifican el saldo y el limite
        CuentaBancaria CuentaConSaldoInicial1 = new CuentaBancaria(2500, 8000);
        CuentaConSaldoInicial1.mostrarDatosCuenta();
    }
}
