package object;
//将anInteg6erRepresentingColors这个示例改写成一个程序，然后反编译，运行
public class E10_AlltheColorsOfTheRainbow {
    int anInteg6erRepresentingColors;

    void changeTheHueOfTheColor(int newHue) {
        anInteg6erRepresentingColors = newHue;
    }

    public static void main(String[] args) {
        E10_AlltheColorsOfTheRainbow e = new E10_AlltheColorsOfTheRainbow();
        e.changeTheHueOfTheColor(60);
    }
}
