public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    VERDE("Verde"),
    GRIS_OSCURO("Gris oscuro"),
    NARANJA("Naranja");

    private final String color;

    Color(String color) {//constructor
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
