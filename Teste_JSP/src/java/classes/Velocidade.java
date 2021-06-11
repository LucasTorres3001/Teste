package classes;

import java.text.DecimalFormat;


public class Velocidade {
    
    private double V,Vo,a,S;

    public double getV() {
        return V;
    }

    public void setV(double V) {
        this.V = V;
    }
    public double getVo() {
        return Vo;
    }

    public void setVo(double Vo) {
        this.Vo = Vo;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getS() {
        return S;
    }

    public void setS(double S) {
        this.S = S;
    }
    
    public String InfoV(){
        
        DecimalFormat f = new DecimalFormat();
        
        String Msg = "";
        
        if(getV() < 11.111){
            Msg += "O usuário será multado por tragefar abaixo de limite permitido.<br/>Portanto, o motorista terá que pagar uma multa no valor de R$ " + f.format((11.111 - getV()) * (65/10)) + " reais";
        }
        else if(getV() >= 11.111 && getV() < 22.222){
            Msg += "O usuário está trafegando dentro do limite permitido.<br/>Portanto, o motorista não será multado!";
        }
        else{
            if(getV() >= 22.222){
                Msg += "O usuário será multado por tafegar acima do limite permitido.<br/>Portanto, o motrista terá que pagar uma multa no valor de R$ " + f.format((getV() - 22.222) * (65/10)) + " reais.";
            }
        }
        
        String Dados = "";
        
        Dados += "<table>";
        Dados += "  <th colspan='2'>Velocidade</th>";
        Dados += "  <tr>";
        Dados += "      <th>Velocidade inicial</th>";
        Dados += "      <td>" + f.format(getVo()) + " m/s</td>";
        Dados += "  </tr>";
        Dados += "  <tr>";
        Dados += "      <th>Aceleração</th>";
        Dados += "      <td>" + f.format(getA()) + " m/s²</td>";
        Dados += "  </tr>";
        Dados += "  <tr>";
        Dados += "      <th>Distância</th>";
        Dados += "      <td>" + f.format(getS()) + " m</td>";
        Dados += "  </tr>";
        Dados += "  <tr>";
        Dados += "      <th>Velocidade final</th>";
        Dados += "      <td>" + f.format(getV()) + " m/s</td>";
        Dados += "  </tr>";
        Dados += "  <th colspan='2'>Resposta</th>";
        Dados += "  <tr>";
        Dados += "      <td colspan='2'>" + Msg + "</td>";
        Dados += "  </tr>";
        Dados += "</table>";
        
        return Dados;
    }
}
