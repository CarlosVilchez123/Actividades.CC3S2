import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


/*En el tablero solo se puden colocar fichas no hemos agregado las funciones de turno, movimiento, etc
* NOTA: para poder visualizar la la GUI se deben ejecutar en el terminal los siguiente comandos:
*cd src/main/java
*java ./GUI.java
* */
public class GUI{
    public static void main(String[] args) {
        Front game = new Front("MILL GAME");
        game.setVisible(true);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class Front extends JFrame{
    public static int width=700, height=700;
    public Front(String title){
        setTitle(title);
        setResizable(false);
        setSize(width,height);
        setLocationRelativeTo(null);
        add(new Content());
    }
}

class Content extends JPanel{
    public int num=6;
    public int cant=0;
    Fichas fichas[]=new Fichas[num];
    public Content(){
        setLayout(null);
        putFicha();
        image("Img/Background.jpg",0,0,Front.width-15,Front.height-35);
    }
    public void image(String dir,int x, int y, int width, int height){
        JLabel image=new JLabel();
        ImageIcon ico= new ImageIcon(dir);
        image.setBounds(x,y,width,height);
        image.setIcon(new ImageIcon(ico.getImage().getScaledInstance(image.getWidth(),image.getHeight(), Image.SCALE_SMOOTH)));
        add(image);
    }

    public void putFicha(){
        for (int i=0; i<num; i++){
            fichas[i]=new Fichas();
            add(fichas[i]);
        }

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(cant<num){
                    int x=e.getX(), y=e.getY();
                    int df=fichas[cant].getDimFicha();
                    fichas[cant].setLocation(x-df/2,y-df/2);
                    fichas[cant].setVisible(true);
                    cant++;
                }
            }

        });
    }
}
class Fichas extends JLabel{
    private int dimFicha=50;
    public Fichas(){
        ImageIcon ico= new ImageIcon("Img/ficha.png");
        setBounds(-100,100,dimFicha,dimFicha);
        setIcon(new ImageIcon(ico.getImage().getScaledInstance(getWidth(),getHeight(), Image.SCALE_SMOOTH)));
        setVisible(false);
    }

    public int getDimFicha(){
        return dimFicha;
    }
}
