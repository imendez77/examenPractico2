package israelreyes;

import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 * Nombre de la clase: IsraelReyes
 * fecha: 18-04-18
 * version: 2.5.2
 * CopyRight: Israel Reyes
 * @author Israel Reyes
 */
public class IsraelReyes {

    public static void main(String[] args) {
        
        int menu;
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        
        int opc = 2;
        
        do{
            
        menu = Integer.parseInt(JOptionPane.showInputDialog("MENU \nSeleccione el número de la opción: \n[1]Agregar Empleado \n[2]Calcular planilla \n[3]Salir"));
        int num = 40;
        String nombre[] = new String[num];
        double precioHora[] = new double[num];
        int horasTrabajadas[] = new int[num];
        double salario[] = new double[num];
        double salarioTotal[] = new double[num];
        int i=0;
        switch(menu)
        {
            case 1:
                
                int opcion = 2;
                do{
                    nombre[i] = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
                    precioHora[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario por Hora:"));
                    horasTrabajadas[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas que ha trabajado el empleado:"));
                    
                    salario[i] = precioHora[i] * horasTrabajadas[i];
                    salarioTotal[i] = salario[i] - (salario[i] * 0.1);
                    
                    opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Desea Agregar otro Empleado? \n[1]Sí \n[2]No"));
                    
                    if(opcion == 1)
                    {
                        i++;
                    }else if(opcion == 2)   
                    {
                        opcion = 2;
                        for(int j=0; j<=i; j++)
                        {
                            JOptionPane.showMessageDialog(null, "Empleado: "+nombre[j]+"\nPrecio de Hora: "+nf.format(precioHora[j])
                                    +"\nHoras Trabajadas: "+horasTrabajadas[j]+"\nSalario Calculado: "+nf.format(salario[j])+"\nSalario Final: "+nf.format(salarioTotal[j]));
                        }
                    }
                    
                }while(opcion == 1);
                break;
                
            case 2:
                /*for(int j=0; j<=i; j++)
                        {
                            JOptionPane.showMessageDialog(null, "Empleado: "+nombre[j]+"\nPrecio de Hora: "+nf.format(precioHora[j])
                                    +"\nHoras Trabajadas: "+horasTrabajadas[j]+"\nSalario Calculado: "+nf.format(salario[j])+"\nSalario Final: "+nf.format(salarioTotal[j]));
                        }*/
                JOptionPane.showMessageDialog(null, " ");
                break;
                
            case 3:
                opc = 2;
                break;
                
            default:
                opc = 2;
                break;
        }
        
        opc = Integer.parseInt(JOptionPane.showInputDialog("¿Desea Regresar al Menu? \n[1] Si \n[2] No"));
        
        }while(opc == 1);
        
        
    }
    
}
