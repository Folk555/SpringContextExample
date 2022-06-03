package education.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        //получение контектса по аннотациям
        //ApplicationContext contextAnnotation = new AnnotationConfigApplicationContext("education.spring");

        //Получение контекста по XML
        ApplicationContext context2 = new ClassPathXmlApplicationContext("appContext.xml");

        Player pl = (Player) context2.getBean("player");
        pl.play();
        System.out.println(pl.getName());
        System.out.println(pl.getVolume());
        ((ConfigurableApplicationContext)context2).close();
    }
}
