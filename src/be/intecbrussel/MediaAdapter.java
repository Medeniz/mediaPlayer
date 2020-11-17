package be.intecbrussel;

public class MediaAdapter implements MediaPlayer{

    public static AdvancedMediaPlayer advanceMusicPlayer;



    public MediaAdapter(String audioType) {
       this.advanceMusicPlayer=audioType.equalsIgnoreCase("mp4") ? new Mp4Player()
               : audioType.equalsIgnoreCase("vlc") ? new VlcPlayer()
               : null;
    }



    @Override
    public void play(String audioType, String fileName) {
            if (audioType.equalsIgnoreCase("mp4")){
               advanceMusicPlayer.playMp4(fileName);
            }else if (audioType.equalsIgnoreCase("vlc")) {
                advanceMusicPlayer.playVlc(fileName);
            }else if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name :"+ fileName);
            }else{
                System.out.println("Invalid media "+ audioType+ " is not supported");
            }


    }
}
