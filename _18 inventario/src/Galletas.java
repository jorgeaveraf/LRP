import javax.swing.*;

public class Galletas {
    private int i = 30;
    private int Piezas_V;
    private double Venta;
    private double Precio = 17.5;
    private int Input = -1;
    private Object[] opciones = {"Salir", "Ver piezas vendidas", "Ver monto vendido", "Ingresar una venta"};


    public void Inventario(){
        while (Input!=0){
            Input = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Inventario", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
            switch (Input){
                case 0:
                    JOptionPane.showMessageDialog(null,"El total de piezas en el inventario es de "+i
                            +"\nEl total de piezas vendidas es de "+Piezas_V
                            +"\nEl total en $ es de "+Venta);
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null,"El total de piezas vendidas es de "+Piezas_V);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"El total en $ es de "+Venta);
                    break;
                case 3:
                    int j=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las piezas a vender"));
                    if(i<j){
                        JOptionPane.showMessageDialog(null,"No hay suficientes piezas para vender");
                    } else if (i<=j+3) {
                        Piezas_V+=j;
                        i -= j;
                        Venta +=j*Precio;
                        JOptionPane.showMessageDialog(null,"Quedan "+i+" paquetes de galletas en el inventario");
                    }else {
                        Piezas_V += j;
                        i -= j;
                        Venta +=j*Precio;
                    }
            }
        }
    }


}
