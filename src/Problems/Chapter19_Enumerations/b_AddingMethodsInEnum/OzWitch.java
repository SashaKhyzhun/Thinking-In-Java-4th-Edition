package Problems.Chapter19_Enumerations.b_AddingMethodsInEnum;

/**
 * @author SashaKhyzhun on 8/28/17.
 * Ведьмы из страны Оз.
 * Page 814.
 */
public enum OzWitch {
    // Определения экземпляров должны предшествовать
    // определениям методов:
    WEST("Mass Gulch, aka the Wicked Witch of the West"),
    NORTH("Glinda, the Good Witch of the North"),
    EAST("Wicked Witch of the East, wearer of the Ruby " + "Slippers, crushed by Dorothy's house"),
    SOUTH("Good by inference, but missing");

    private String description;

    // Конструктор должен быть закрытым или объявлен
    // закрытым или с доступом уровня пакета:
    private OzWitch(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        for (OzWitch witch : OzWitch.values()) {
            System.out.println(witch + ": " + witch.getDescription());
        }
    }
}
