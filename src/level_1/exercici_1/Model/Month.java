package level_1.exercici_1.Model;

public class Month{
    private final String monthName;


    public Month(String monthName){
        this.monthName = monthName;
    }

    public String getMonthName(){
        return monthName;
    }

    @Override
    public String toString(){
        return monthName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Month) {
            Month m = (Month) obj;
            return m.monthName.equals(monthName);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return monthName.hashCode();
    }
}
