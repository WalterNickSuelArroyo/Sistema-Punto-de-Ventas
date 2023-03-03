
package ViewModels;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ClientesVM {
    private String accion = "insert";
    private final ArrayList<JLabel> _label;
    private final ArrayList<JTextField> _textField;
    
    public ClientesVM(Object[] objects, ArrayList<JLabel> label, ArrayList<JTextField> textField) {
        _label = label;
        _textField = textField;
    }
    public void RegistrarCliente(){
        if (_textField.get(0).getText().equals("")) {
            _label.get(0).setText("Ingrese el DNI");
            _label.get(0).setForeground(Color.red);
            _textField.get(0).requestFocus();
        }
    }
}
