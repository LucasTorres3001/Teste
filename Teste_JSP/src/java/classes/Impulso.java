package classes;

import java.text.DecimalFormat;


public class Impulso {
    
    private double I,F,s;

    public double getI() {
        return I;
    }

    public void setI(double I) {
        this.I = I;
    }

    public double getF() {
        return F;
    }

    public void setF(double F) {
        this.F = F;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }
    
    public String InfoI(){
        
        DecimalFormat f = new DecimalFormat();
        
        String Dados = "";
        
        Dados += "<table>";
        Dados += "  <th colspan='2'>Impulso</th>";
        Dados += "  <tr>";
        Dados += "      <th>Força</th>";
        Dados += "      <td>" + f.format(getF()) + " N</td>";
        Dados += "  </tr>";
        Dados += "  <tr>";
        Dados += "      <th>Tempo</th>";
        Dados += "      <td>" + f.format(getS()) + " s</td>";
        Dados += "  </tr>";
        Dados += "  <tr>";
        Dados += "      <th>Impulso</th>";
        Dados += "      <td>" + f.format(getI()) + " N.s</td>";
        Dados += "  </tr>";
        Dados += "</table>";
        
        return Dados;
    }
}
