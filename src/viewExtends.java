import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import view.ScreenBaseCadastro;

public class viewExtends extends ScreenBaseCadastro {
    
    private Image background;
    
    public viewExtends() {
        super();
        
        // Carrega a imagem de fundo
        ImageIcon backgroundIcon = new ImageIcon("/img/Coringou_1.png");
        background = backgroundIcon.getImage();
        
        // Define as propriedades da janela interna
        setTitle("Minha janela interna");
        setSize(400, 300);
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setVisible(true);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
    }
    
}