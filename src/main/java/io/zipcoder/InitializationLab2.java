package io.zipcoder; /**
 * Created by roberthitchens3 on 1/20/16.
 */
//import io.zipcoder.ColorfulThing;

public class InitializationLab2 {
    public static void main(String[] args) {
        ThingContainer con1 = new ThingContainer(4);
        ThingContainer con2 = new ThingContainer(4);
        ThingContainer con3 = new ThingContainer(5);

        int i = 0;
        ColorfulThing ranColor = new ColorfulThing(ColorfulThing.Color.getRandom());
        while(i < 5){
            con1.addThing(ranColor);
            System.out.println("color: "+ ranColor.getColor());
            con2.addThing(ranColor);
            con3.addThing(ranColor);
            ranColor = new ColorfulThing(ColorfulThing.Color.getRandom());
            i++;
        }
        con1.printThings();
        con2.printThings();
        con3.printThings();
        ColorfulThing[] colArr = new ColorfulThing[3];
        colArr[0] = new ColorfulThing(ColorfulThing.Color.BLUE);
        colArr[1] = new ColorfulThing(ColorfulThing.Color.RED);
        colArr[2] = new ColorfulThing(ColorfulThing.Color.GREEN);
        ThingContainer anthrThng = new ThingContainer(colArr);
        anthrThng.printThings();
    }
}
