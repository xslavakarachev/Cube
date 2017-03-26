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

        /**  Sides
         * Front - фронтальная (фасадная, передняя)
         * Upper - верхняя
         * Right - правая
         * Rear - тыловая (задняя)
         * Lower - нижняя
         * Left - левая
         */
        EnumSides[] nameSides = new EnumSides[6];
        nameSides[0] = EnumSides.Front;
        nameSides[1] = EnumSides.Upper;
        nameSides[2] = EnumSides.Right;
        nameSides[3] = EnumSides.Rear;
        nameSides[4] = EnumSides.Lower;
        nameSides[5] = EnumSides.Left;
    }
}
