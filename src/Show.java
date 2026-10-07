import java.util.ArrayList;
import java.util.Objects;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }


    public void addActor(Actor newActor) {
        for (Actor actor : listOfActors) {
//            if (actor.getName().equals(newActor.getName()) && actor.getSurname().equals(newActor.getSurname())
//                    && actor.getHeight() == newActor.getHeight()) {
//                System.out.println("Такой актёр уже участвует в спектакле.");
//                return;
//            }
            if (actor.equals(newActor)) {
                System.out.println("Такой актёр уже участвует в спектакле.");
                return;
            }
        }
        listOfActors.add(newActor);
    }

    public void printActorList() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void changeActor(Actor actor, String surnameForChange) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (Objects.equals(listOfActors.get(i).getSurname(), surnameForChange)) {
                listOfActors.set(i, actor);
                return;
            }
        }
        System.out.println("Актёр с такой фамилией не участвует в спектакле");
    }
}






