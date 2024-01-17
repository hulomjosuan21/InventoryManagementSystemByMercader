
import javax.swing.ImageIcon;

public interface AppInitializer {
    default void initializer(){
        users_call();
    }
    
    public void users_call();
    
    default void setImageToAvatar(ImageAvatar imgAvatar, String imageName){
        ImageIcon img = new ImageIcon("src/images/"+imageName);
        imgAvatar.setIcon(img);
        imgAvatar.repaint();
    }
}
