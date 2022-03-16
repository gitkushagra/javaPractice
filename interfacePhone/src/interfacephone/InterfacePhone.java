
package interfacephone;

class phone
{
    public void call(){System.out.println("The phone is calling..");}
    public void sms() {System.out.println("Sending sms..");}
    
}

interface icamera
{
    void clickPhoto();
    void recordVideo();
}

interface imusicPlayer
{
    void playMusic();
    void pauseMusic();
}

class smartPhone extends phone implements icamera,imusicPlayer
{
    @Override
    public void clickPhoto()
    {
        System.out.println("Clicking photo...");
    }
    @Override
    public void recordVideo()
    {
        System.out.println("Recording video...");
    }
    @Override
     public void playMusic()
     {
          System.out.println("Playing music...");
     }
     @Override
    public void pauseMusic()
    {
        System.out.println("Music is paused...");
    }
    
    
    public void videoCall()
    {
        System.out.println("Video calling...");
    }
}

public class InterfacePhone {

    
    public static void main(String[] args) {
        
        icamera s1 = new smartPhone();
        s1.recordVideo();
    }
    
}
