package kz.quhan.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;


public class MusicPlayer {
    private List<Music> music;

    private String name;
    private int volume;

    public MusicPlayer() {}


    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("playing: " + music.get(new Random().nextInt(2)).getSong());
    }

    public void setMusic(List<Music> music) {
        this.music = music;
    }

    public List<Music> getMusic() {
        return music;
    }

    public String getName() {
        return name;
    }

    @Value("${musicPlayer.name}")
    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    @Value("${musicPlayer.volume}")
    public void setVolume(int volume) {
        this.volume = volume;
    }
}
