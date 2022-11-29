
package sistema.punto.de.ventas;

import Views.Sistema;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.UIManager;

public class SistemaPuntoDeVentas {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ex) {
            System.err.println("Error: "+ex);
        }
        Sistema sistema = new Sistema();
        sistema.setExtendedState(MAXIMIZED_BOTH);
        sistema.setVisible(true);
    }
    
}
