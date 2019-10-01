
package generarexcepciones;

import javax.swing.JOptionPane;


public class GenerarExcepciones{

    
    public static void main(String[] args) {
        double a;
        double b;
        
        
        try{
        a=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del entero"));
        b=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del divisor"));
        double c=a/b;
        if(a<10){
            throw new NumberFormatException();
            
        }
     
        
        
        JOptionPane.showMessageDialog(null, "Digitaste como entero: "+a+"\n"+
                                            "Digitaste como divisor: "+b+"\n"+
                                            "El resultado de la division es: "+c);
                }catch(NumberFormatException ex){
                    System.out.println("El valor del entero debe ser mayor a 10 "+ex.getMessage());
                }catch(ArrayIndexOutOfBoundsException ar){
                    System.out.println("El numero es invalido "+ar.getMessage());
                }catch(ArithmeticException as){
                    System.out.println("Imposible dividir entre 0 "+as.getMessage());
                }
        
            }
    
}
