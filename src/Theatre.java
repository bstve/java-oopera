import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        ArrayList<Actor> showActors = new ArrayList<>();
        ArrayList<Actor> operaActors = new ArrayList<>();
        ArrayList<Actor> balletActors = new ArrayList<>();
        Actor actor1 = new Actor("Александр", "Волков", Gender.MALE, 182);
        Actor actor2 = new Actor("Мария", "Соколова", Gender.FEMALE, 168);
        Actor actor3 = new Actor("Михаил", "Орлов", Gender.MALE, 178);

        Director director1 = new Director("Василий", "Иванов", Gender.MALE, 24);
        Director director2 = new Director("Анна", "Седых", Gender.FEMALE, 19);

        Person operaMusicAuthor = new Person("Джузеппе", "Верди", Gender.MALE);
        Person balletMusicAuthor = new Person("Пётр", "Чайковский", Gender.MALE);
        Person choreographer = new Person("Мариус", "Петипа", Gender.MALE);

        String operaLibrettoText = "Куртизанка Виолетта Валери влюбляется в молодого Альфреда Жермона. \n" +
                "Ради него она оставляет прежнюю жизнь, но под давлением его отца вынуждена расстаться с\n" +
                "возлюбленным. Альфред узнаёт правду слишком поздно и возвращается к смертельно больной Виолетте.";
        String balletLibrettoText = "Принц Зигфрид встречает на берегу озера Одетту, превращённую злым волшебником в лебедя.\n" +
                "Разрушить чары может только искренняя любовь. На балу волшебник обманывает Зигфрида, представив ему свою дочь\n" +
                "Одиллию в облике Одетты.";

        Show show = new Show("Постанова", 120, director1, showActors);
        Opera opera = new Opera("Травиата",
                165,
                director2,
                operaActors,
                operaMusicAuthor,
                operaLibrettoText, 40);
        Ballet ballet = new Ballet("Лебединое озеро",
                150,
                director2,
                balletActors, balletMusicAuthor,
                balletLibrettoText, choreographer);


        show.addActor(actor1);
        show.addActor(actor3);
        opera.addActor(actor1);
        opera.addActor(actor2);
        ballet.addActor(actor2);
        ballet.addActor(actor3);

        System.out.println("Список режиссёров:");
        System.out.println(director1);
        System.out.println(director2);
        System.out.println("__________");

        System.out.println("Актеры спектакля:");
        show.printActorList();
        System.out.println("__________");
        System.out.println("Актеры оперы:");
        opera.printActorList();
        System.out.println("__________");
        System.out.println("Актеры балета:");
        ballet.printActorList();
        System.out.println("__________");

        opera.changeActor(actor3, actor1.surname);
        System.out.println("Новый состав актеров оперы:");
        opera.printActorList();
        System.out.println("__________");

        ballet.changeActor(actor2, actor1.surname);
        System.out.println("__________");

        System.out.println("Текст либретто оперы:");
        opera.printLibretto();
        System.out.println("__________");
        System.out.println("Текст либретто балета:");
        ballet.printLibretto();

    }
}