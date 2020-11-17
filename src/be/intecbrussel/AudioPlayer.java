package be.intecbrussel;

public class AudioPlayer implements MediaPlayer {


    public MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        mediaAdapter=new MediaAdapter(audioType);
        mediaAdapter.play(audioType,fileName);
    }
}
