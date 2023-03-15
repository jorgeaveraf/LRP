import javax.swing.*;

public class calculo {
    int i;
    public void calculadora(){
        while (i!=5){
            double j=0;
            double n=1;
            double k=1;
            JOptionPane.showMessageDialog(null,"Bienvenido a la calculadora, por favor selecciona alguna de las siguientes opciones:" +
                    "\n1: Suma\n2: Resta\n3: Multiplicación\n4: División\n5: Salir");
            i=Integer.parseInt(JOptionPane.showInputDialog("Introduce una de las opciones numéricas"));
            switch (i){
                case 1:
                    JOptionPane.showMessageDialog(null,"Bienvenido a la opción de suma\nintroduzca los números a sumar, una vez que termine digite '0'");
                    while(n!=0){
                        n=Double.parseDouble(JOptionPane.showInputDialog("Digite un número"));
                        j+=n;
                    }
                    JOptionPane.showMessageDialog(null,"El resultado de la suma es "+j);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Bienvenido a la opción de resta\nintroduzca los números a restar, una vez que termine digite '0'");
                    while(n!=0){
                        n=Double.parseDouble(JOptionPane.showInputDialog("Digite un número"));
                        j=n-j;
                    }
                    JOptionPane.showMessageDialog(null,"El resultado de la resta es "+j);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Bienvenido a la opción de multiplicación\nintroduzca los números a multiplicar, una vez que termine digite '0'");
                    while(n!=0){
                        n=Double.parseDouble(JOptionPane.showInputDialog("Digite un número"));
                        if(n==0){
                            continue;}
                        k=k*n;
                    }
                    JOptionPane.showMessageDialog(null,"El resultado de la multiplicación es "+k);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Bienvenido a la opción de división\nintroduzca los números a dividir, una vez que termine digite '0'");
                    double m =Double.parseDouble(JOptionPane.showInputDialog("Digite un número"));
                    while(n!=0){
                        n=Double.parseDouble(JOptionPane.showInputDialog("Digite un número"));
                        if(n==0){
                            continue;}
                        m=m/n;
                    }
                    JOptionPane.showMessageDialog(null,"El resultado de la división es "+m);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"Gracias por usar la calculadora");
                    break;
            }
        }
    }
}
