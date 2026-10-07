import java.util.ArrayList;
//import java.util.Scanner;

public class Theatre {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        ArrayList<Actor> showActors = new ArrayList<>();
        ArrayList<Actor> operaActors = new ArrayList<>();
        ArrayList<Actor> balletActors = new ArrayList<>();
        Actor actor1 = new Actor("Александр", "Волков", Gender.MALE, 182);
        Actor actor2 = new Actor("Мария", "Соколова", Gender.FEMALE, 168);
        Actor actor3 = new Actor("Михаил", "Орлов", Gender.MALE, 178);

        Director director1 = new Director("Василий", "Иванов", Gender.MALE, 24);
        Director director2 = new Director("Анна", "Седых", Gender.FEMALE, 19);

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
                "Джузеппе Верди",
                operaLibrettoText, 40);
        Ballet ballet = new Ballet("Лебединое озеро",
                150,
                director2,
                balletActors, "Пётр Ильич Чайковский",
                balletLibrettoText, "Мариус Петипа");


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

        opera.changeActor(actor3, actor1.getSurname());
        System.out.println("Новый состав актеров оперы:");
        opera.printActorList();
        System.out.println("__________");

        ballet.changeActor(actor2, actor1.getSurname());
        System.out.println("__________");

        System.out.println("Текст либретто оперы:");
        opera.printLibretto();
        System.out.println("__________");
        System.out.println("Текст либретто балета:");
        ballet.printLibretto();

    }

}
//        while (true) {
//            printMenu();
//            String commandValue = scanner.nextLine();
//            int command;
//            if (commandValue.isEmpty()) {
//                System.out.println("Повторите ввод");
//            } else {
//                command = Integer.parseInt(commandValue);
//                switch (command) {
//                    case 1:
//                        Actor newActor = createActor(scanner);
//                        show.addActor(newActor);
//                        break;
//                    case 2:
//                        show.printActorList();
//                        break;
//                    case 3:
//                        System.out.println("Кем вы хотите заменить одного из актёров?");
//                        Actor actorForCnange = createActor(scanner);
//                        System.out.println("Введите фамилию актёра, которого требуется заменить");
//                        String surnameForChange = scanner.nextLine();
//                        show.changeActor(actorForCnange, surnameForChange);
//                        break;
//                    case 4:
//                        musicalShow.printLibretto();
//                        break;
//                    case 5:
//                        System.out.println(show.getDirector());
//                }
//            }
//        }
//    }

//    public static void printMenu() {
//        System.out.println("Введите команду");
//        System.out.println("1 - Добавить актера");
//        System.out.println("2 - Распечатать список актеров");
//        System.out.println("3 - Заменить актёра");
//        System.out.println("4 - Распечатать текст либретто.");
//        System.out.println("5 - Распечатать информацию о режиссёре спектакля");
//    }

//    public static Actor createActor(Scanner scanner) {
//        System.out.println("Введите имя актёра");
//        String actorName = scanner.nextLine();
//        System.out.println("Введите фамилию актера");
//        String actorSurname = scanner.nextLine();
//        Gender gender;
//        while (true) {
//            System.out.println("Введите пол актера в формате 'Мужской' или 'Женский'");
//            String actorGender = scanner.nextLine();
//
//            if (actorGender.equals("Мужской")) {
//                gender = Gender.MALE;
//                break;
//            } else if (actorGender.equals("Женский")) {
//                gender = Gender.FEMALE;
//                break;
//            } else {
//                System.out.println("Пол актёра может быть в формате 'Мужской' или 'Женский'");
//            }
//        }
//        System.out.println("Введите рост актера в сантиметрах");
//        int actorHeight = Integer.parseInt(scanner.nextLine());
//        return new Actor(actorName, actorSurname, gender, actorHeight);
//    }
