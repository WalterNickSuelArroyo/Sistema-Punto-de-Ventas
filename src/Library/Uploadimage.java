package Library;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Uploadimage extends javax.swing.JFrame {

    private File archivo;
    private JFileChooser abrirArchivo;
    private static String urlOrigen = null;
    private static byte[] imageByte = null;

    public static byte[] getImageByte() {
        return imageByte;
    }

    public void CargarImagen(JLabel label) {
        abrirArchivo = new JFileChooser();
        abrirArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de Imagen", "jpg", "png", "gif"));
        int respuesta = abrirArchivo.showOpenDialog(this);
        if (respuesta == JFileChooser.APPROVE_OPTION) {
            archivo = abrirArchivo.getSelectedFile();
            urlOrigen = archivo.getAbsolutePath();
            Image foto = getToolkit().getImage(urlOrigen);
            foto = foto.getScaledInstance(140, 140, 1);
            label.setIcon(new ImageIcon(foto));
            try {
                BufferedImage bImage = ImageIO.read(archivo);
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                ImageIO.write(bImage, "png", bos);
                imageByte = bos.toByteArray();
            } catch (IOException ex) {
                
            }
        }
    }
    public byte[] getTransFoto(JLabel label){
        ByteArrayOutputStream baos = null;
        try {
            Icon ico = label.getIcon();
            BufferedImage bufferedImage = new BufferedImage(ico.getIconWidth(), ico.getIconHeight(), BufferedImage.TYPE_INT_BGR);
            baos = new ByteArrayOutputStream();
            ImageIO.write(bufferedImage, "png", baos);
        } catch (IOException e) {
            
        }
        return baos.toByteArray();
    }
}
