
public class enumPrac{

    public Day days;

    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY

    }

    public static void main(String[] args) {
        Day favoriteDay = Day.FRIDAY;
        Day leastDay = Day.MONDAY;

        switch(leastDay){

            case MONDAY:
                System.out.println("I hate that day!");
                break;
            case FRIDAY:
                System.out.println("My fav day!");
                break;
            default:
                System.out.println("A regular day.");
        }
    }

}