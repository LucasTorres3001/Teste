package classes;

import java.text.DecimalFormat;


public class Forca {
    
    private double F,m,a;

    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getF() {
        return F;
    }

    public void setF(double F) {
        this.F = F;
    }
    
    public String InfoF(){
        
        DecimalFormat f = new DecimalFormat();
        
        String Dados = "";
        
        Dados += "<table>";
        Dados += "  <th colspan='2'>Força resultante</th>";
        Dados += "  <tr>";
        Dados += "      <th>Massa</th>";
        Dados += "      <td>" + f.format(getM()) + " kg</td>";
        Dados += "  </tr>";
        Dados += "  <tr>";
        Dados += "      <th>Aceleração</th>";
        Dados += "      <td>" + f.format(getA()) + " m/s²</td>";
        Dados += "  </tr>";
        Dados += "  <tr>";
        Dados += "      <th>Força resultante</th>";
        Dados += "      <td>" + f.format(getF()) + " N</td>";
        Dados += "  </tr>";
        Dados += "</table>";
        
        return Dados;
    }
}
