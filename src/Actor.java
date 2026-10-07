import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }
//    public int getHeight() {
//        return height;
//    }

    @Override
    public String toString() {
        return getName() + " " +
        getSurname() + " " +
        "(" + height + ")";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Actor actor = (Actor) object;
        return Objects.equals(getName(), actor.getName()) &&
                Objects.equals(getSurname(), actor.getSurname()) &&
                (height == actor.height);
    }

    @Override
    public int hashCode() {
        int hash = 11;
        if (getName() != null) {
            hash = getName().hashCode();
        }
        if (getSurname() != null) {
            hash = hash + getSurname().hashCode();
        }
            hash = hash + height;
        return hash;
    }
}
