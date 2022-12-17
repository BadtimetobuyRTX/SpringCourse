package kz.quhan.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("musicPlayer.properties")
public class SpringConfig {
    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public PopMusic popMusic() {
        return new PopMusic();
    }

    @Bean
    public List<Music> musicList() {
        return new ArrayList<>(List.of(popMusic(), rockMusic(), classicalMusic()));
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }
}
