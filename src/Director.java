public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
//        String stringGender;
//        switch (getGender()) {
//            case MALE:
//                stringGender = "Мужской";
//                break;
//            case FEMALE:
//                stringGender = "Женский";
//                break;
//            default:
//                stringGender = "Пол не указан";
//        }
        return getName() + " "
                + getSurname();
    }
}
