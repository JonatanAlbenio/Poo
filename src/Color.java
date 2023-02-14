public enum Color {

    ROJO("rojo"),
    AMARILLO("amarillo"),
    AZUL("azul"),
    BLANCO("blanco"),
    GRIS("gris"),
    NARANJO("naranjo");

    private final String color;

    public String getColor() {
        return color;
    }

    Color(String color) {
        this.color = color;
    }
}
