
import jdk.dynalink.beans.StaticClass;

import javax.swing.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
     static int option;
     static String menu;

    public static void main(String[] args)
    {
        OperacionesBasicas object = new OperacionesBasicas();
        do
        {
         menu = JOptionPane.showInputDialog("MENU PRINCIPAL\n" + "1. Suma\n" + "2. Resta\n" + "3. Division\n" + "4. Multiplicacion\n" + "5. Salir");
         option = Integer.parseInt(menu);
         switch (option)
         {
             case 1:
                 object.suma();
                 break;
             case 2:
                 object.resta();
                 break;
             case 3:
                 object.division();
                 break;
             case 4:
                 object.multiplicacion();
                 break;
             case 5:
                 break;
             default:
                 JOptionPane.showMessageDialog(null,"La opcion " + option + " es incorrecta XD");
         }

        }while (option != 5);

    }
}