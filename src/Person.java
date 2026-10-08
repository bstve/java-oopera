public class Person {
    protected String name;
    protected String surname;
    protected Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    @Override
    public String toString() {
        String stringGender;
        switch (gender) {
            case MALE:
                stringGender = "Мужской";
                break;
            case FEMALE:
                stringGender = "Женский";
                break;
            default:
                stringGender = "Пол не указан";
        }
        return name + " "
                + surname +
                " " + stringGender;
    }
}
