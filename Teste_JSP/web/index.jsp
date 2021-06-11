<%@page import="classes.EnergiaCinetica"%>
<%@page import="classes.Impulso"%>
<%@page import="classes.QntdDeMov"%>
<%@page import="classes.Forca"%>
<%@page import="classes.Velocidade"%>
<%@page import="classes.Accessory"%>
<%@page import="java.util.Random"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            table,th,td{
                border: 1px solid #aaa;
                border-radius: 6px;
            }
            th,td{
                padding: 5px;
            }
            table{
                margin: 10px;
            }
        </style>
        <title>Program-Test</title>
    </head>
    
    <body>
        <header>
            <h1>Teste</h1>
        </header>
        <section>
        <%
            double Massa,Space,Vini;

            double Ec,F,I,Q,V,Vo,a,S,m;
            int n1,n2,n3,s;

            Random Numero_aleatorio = new Random();

            n3 = Numero_aleatorio.nextInt(9000);
            n2 = Numero_aleatorio.nextInt(26);
            n1 = Numero_aleatorio.nextInt(1000);
            Vini = Numero_aleatorio.nextDouble();
            Space = Numero_aleatorio.nextDouble();
            Massa = Numero_aleatorio.nextDouble();

            Vo = Accessory.Vo(n2, Vini);
            a = Numero_aleatorio.nextDouble();
            S = Accessory.S(n1, Space);
            s = Numero_aleatorio.nextInt(60);
            m = Accessory.Massa(n3, Massa);

            V = Accessory.V(Vo, a, S);
            Q = Accessory.Q(m, V);
            F = Accessory.Forca(m, a);
            I = Accessory.Impuso(F, s);
            Ec = Accessory.Ecinetica(m, V);

            Velocidade velocidade = new Velocidade();
            Forca forca = new Forca();
            QntdDeMov QntdMov = new QntdDeMov();
            Impulso impulso = new Impulso();
            EnergiaCinetica energia = new EnergiaCinetica();
            
            velocidade.setVo(Vo);
            velocidade.setA(a);
            velocidade.setS(S);
            velocidade.setV(V);

            forca.setM(m);
            forca.setA(a);
            forca.setF(F);
            
            QntdMov.setM(m);
            QntdMov.setV(V);
            QntdMov.setQ(Q);
            
            impulso.setF(F);
            impulso.setS(s);
            impulso.setI(I);
            
            energia.setM(m);
            energia.setV(V);
            energia.setEc(Ec);
            
            out.print(velocidade.InfoV());
            out.print(forca.InfoF());
            out.print(QntdMov.InfoQ());
            out.print(impulso.InfoI());
            out.print(energia.InfoEc());
        
        %>
        </section>
    </body>
</html>
