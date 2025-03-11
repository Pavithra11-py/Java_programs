package ENUM;

public class Enum_colors {
    public static void main(String[] args) {
        System.out.println(colors.IndianRed.getHexcode());
    }

}
enum colors{
    IndianRed("#CD5C5C"),
    LightCoral("#F08080"),
    Salmon("#FA8072"),
    DarkSalmon("#E9967A"),
    LightSalmon("#FFA07A");

    private String hexcode;

    colors(String hexcode){
        this.hexcode=hexcode;

    }
    String getHexcode()
    {
        return this.hexcode;
    }
}

