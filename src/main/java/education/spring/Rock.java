package education.spring;

import org.springframework.stereotype.Component;

//@Component
public class Rock extends AbstractGenre implements IGenre{

    public Rock(String... str) {
        super(str);
    }

    @Override
    public void playGenre() {
        System.out.println("Rock is chosen");
        if (trackMusic.size() > 0) {
            System.out.println("Playing music:");
            for (String track:this.trackMusic) {
                System.out.println(track);
            }
        }
    }
}
