package education.spring;

import org.springframework.stereotype.Component;

public class Player {
    private IGenre genre;
    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Player() {}

    //IoC Inversion of Control. Внедряем зависимость IGenre
    Player(IGenre iGenre){
        this.genre = iGenre;
    };

    public void play(){
        genre.playGenre();
    }

    //Обязательное наличие метода для задания поля IGenre при создании бина
    public void setGenre(IGenre genre) {
        this.genre = genre;
    }
}
