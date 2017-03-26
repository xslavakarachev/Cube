/**
 * Created by пк on 20.03.2017.
 */
public class Cube {
    private EnumColors[][][] condition = new EnumColors[6][3][3]; //Состояние

    private Cube() {
        EnumColors[] allColors = new EnumColors[6];
        allColors[0] = EnumColors.Yellow;
        allColors[1] = EnumColors.Red;
        allColors[2] = EnumColors.Blue;
        allColors[3] = EnumColors.Green;
        allColors[4] = EnumColors.Orange;
        allColors[5] = EnumColors.White;
    }
}
