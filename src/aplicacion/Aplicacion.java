package aplicacion;

import empresaT.Trabajadores;
import javax.swing.JOptionPane;

public class Aplicacion {
    
 public static void main(String[] args) {
        int num;
        
        num=Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el numero del empleado a consultar\n1.Juan = 1\n2.Jesus = 2\n3. Maria = 3\n4.Ana = 4\n5.Brandon = 5"));
        
        Trabajadores empleado1 = new Trabajadores();
        Trabajadores empleado2 = new Trabajadores();
        Trabajadores empleado3 = new Trabajadores();
        Trabajadores empleado4 = new Trabajadores();
        Trabajadores empleado5 = new Trabajadores();
        
        
        
        empleado1.setNombre("Juan");
        empleado1.setEdad(25);
        empleado1.setDireccion("Su direccion es Cra 7 #12-75 Santa Helena");
        empleado1.setNumero(8251342);
        
        empleado2.setNombre("Jesus");
        empleado2.setEdad(23);
        empleado2.setDireccion("Su direccion es Cra 12 #13-30 Sol Naciente");
        empleado2.setNumero(8252128);
        
        empleado3.setNombre("Maria");
        empleado3.setEdad(18);
        empleado3.setDireccion("Su direccion es Cra 7 #9-32 San Agustin");
        empleado3.setNumero(8612451);
        
        empleado4.setNombre("Ana");
        empleado4.setEdad(19);
        empleado4.setDireccion("Su direccion es Cra 34 #12-54 Los Angeles");
        empleado4.setNumero(8756154);
        
        empleado5.setNombre("Brandon");
        empleado5.setEdad(21);
        empleado5.setDireccion("Su direccion es Cra 5 #12-76 Santa Matilde ");
        empleado5.setNumero(8254330);
        
        switch (num){
            case 1:
                System.out.println("El nombre del empleado es "+empleado1.nombre+" \n Su edad es "+empleado1.edad+" \n "+empleado1.direccion+"\n Su numero de telefono es "+empleado1.telefono);
                break;
            case 2:
                System.out.println("El nombre del empleado es "+empleado2.nombre+" \n Su edad es "+empleado2.edad+" \n "+empleado2.direccion+"\n Su numero de telefono es "+empleado2.telefono);
                break;
            case 3:
                 System.out.println("El nombre del empleado es "+empleado3.nombre+" \n Su edad es "+empleado3.edad+" \n "+empleado3.direccion+"\n Su numero de telefono es "+empleado3.telefono);     
                break;
            case 4:
                System.out.println("El nombre del empleado es "+empleado4.nombre+" \n Su edad es "+empleado4.edad+" \n "+empleado4.direccion+"\n Su numero de telefono es "+empleado4.telefono);    
                break;
            case 5:
                System.out.println("El nombre del empleado es "+empleado5.nombre+" \n Su edad es "+empleado5.edad+" \n "+empleado5.direccion+"\n Su numero de telefono es "+empleado5.telefono);    
                break;
        
        
        }
        
     }
}
