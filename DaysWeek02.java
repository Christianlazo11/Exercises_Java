import java.util.Locale;

public enum DaysWeek02 {
    ENERO(1,31),
    FEBRERO(2,28),
    MARZO(3,31),
    ABRIL(4,30),
    MAYO(5,31),
    JUNIO(6,30),
    JULIO(7,31),
    AGOSTO(8,31),
    SEPTIEMBRE(9,30),
    OCTUBRE(10,31),
    NOVIEMBRE(11,30),
    DICIEMBRE(12,31);

    private int order;
    private int numDays;

    private DaysWeek02(int order, int numDays) {
        this.order = order;
        this.numDays = numDays;
    }

    public int getOrder() {
        return order;
    }

    public int getNumDays() {
        return numDays;
    }

    @Override
    public String toString() {
        return "El mes " + this.name().toUpperCase() + " Es el mes " + order + " Y tiene " + numDays + " Dias";
    }
}
