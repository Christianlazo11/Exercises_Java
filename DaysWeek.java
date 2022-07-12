import java.util.Locale;

public enum DaysWeek {
    LUNES(true),
    MARTES(true),
    MIERCOLES(true),
    JUEVES(true),
    VIERNES(true),
    SABADO(false),
    DOMINGO(false);

    private boolean isWork;

    private DaysWeek(boolean isWork) {
        this.isWork = isWork;
    }

    @Override
    public String toString() {
        if(isWork) {
            return "El Día " + this.name().toLowerCase() + " Si Es laborable";
        } else {
            return "El Día " + this.name().toLowerCase() + "No es Laborable";
        }
    }

}
