package classes;

import java.text.DecimalFormat;


public class QntdDeMov {
    
    private double Q,m,v;

    public double getQ() {
        return Q;
    }

    public void setQ(double Q) {
        this.Q = Q;
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
    
    public String InfoQ(){
        
        DecimalFormat f = new DecimalFormat();
        
        String Dados = "";
        
        Dados += "<table>";
        Dados += "  <th colspan='2'>Quantidade de Movimento</th>";
        Dados += "  <tr>";
        Dados += "      <th>Massa</th>";
        Dados += "      <td>" + f.format(getM()) + " kg</td>";
        Dados += "  </tr>";
        Dados += "  <tr>";
        Dados += "      <th>Velocidade</th>";
        Dados += "      <td>" + f.format(getV()) + " m/s</td>";
        Dados += "  </tr>";
        Dados += "  <tr>";
        Dados += "      <th>Qntd. de Movimento</th>";
        Dados += "      <td>" + f.format(getQ()) + " kg.m/s</td>";
        Dados += "  </tr>";
        Dados += "</table>";
        
        return Dados;
    }
}
