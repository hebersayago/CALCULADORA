/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MULTIPLICACION;

/**
 *
 * @author Eber
 */
public class OPERACIONES {

    public int EmpezarMultiplicacion;
    public int TerminarMultiplicacion;

    public OPERACIONES() {
    }

    public OPERACIONES(int EmpezarMultiplicacion, int TerminarMultiplicacion) {
        this.EmpezarMultiplicacion = EmpezarMultiplicacion;
        this.TerminarMultiplicacion = TerminarMultiplicacion;
    }

    public String Resultado() {
        StringBuilder resultado = new StringBuilder();
        for (int i = 1; i <= 12; i++) {
            resultado.append("Tabla del ").append(i).append("\n");
            for (int t = EmpezarMultiplicacion; t <= TerminarMultiplicacion; t++) {
                int res = i * t;
                resultado.append(i).append(" x ").append(t).append(" = ").append(res).append("\n");
            }
            resultado.append("\n"); // Agregar una línea en blanco entre tablas
        }
        return resultado.toString();
    }
}
