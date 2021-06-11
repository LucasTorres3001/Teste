package classes;

import java.text.DecimalFormat;


public class EnergiaCinetica {
    
    private double Ec,m,v;

    public double getEc() {
        return Ec;
    }

    public void setEc(double Ec) {
        this.Ec = Ec;
    }

    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }
    
    public String InfoEc(){
        
        DecimalFormat f = new DecimalFormat();
        
        String Dados = "";
        
        Dados += "<table>";
        Dados += "  <th colspan='2'>Energia Cinética</th>";
        Dados += "  <tr>";
        Dados += "      <th>Massa</th>";
        Dados += "      <td>" + f.format(getM()) + " kg</td>";
        Dados += "  </tr>";
        Dados += "  <tr>";
        Dados += "      <th>Velocidade</th>";
        Dados += "      <td>" + f.format(getV()) + " m/s</td>";
        Dados += "  </tr>";
        Dados += "  <tr>";
        Dados += "      <th>Energia cinética</th>";
        Dados += "      <td>" + f.format(getEc()) + " N</td>";
        Dados += "  </tr>";
        Dados += "</table>";
        
        return Dados;
    }
}
