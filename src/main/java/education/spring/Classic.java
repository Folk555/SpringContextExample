package education.spring;

import org.springframework.stereotype.Component;

@Component
public class Classic extends AbstractGenre implements IGenre{
    @Override
    public void playGenre() {
        System.out.println("Classic is chosen");
        if (trackMusic.size() > 0) {
            System.out.println("Playing music:");
            for (String track:this.trackMusic) {
                System.out.println(track);
            }
        }
    }
}
