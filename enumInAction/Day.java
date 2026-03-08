package enumInAction;
public enum Day {
    MONDAY(1), THUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6),SUNDAY(7);

    private final int dayNumber;

    Day(int dayNumber){
       this.dayNumber = dayNumber;
    }
    public int getDaynumber(){
        return dayNumber;
    }
}
