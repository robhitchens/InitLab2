package io.zipcoder.tests; /**
 * Created by roberthitchens3 on 1/20/16.
 */
import io.zipcoder.ColorfulThing;
import io.zipcoder.ThingContainer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class ThingContainerTest {
    private ColorfulThing col;
    private ColorfulThing col2;
    private ColorfulThing col3;
    private ColorfulThing col4;

    @Before
    public void instantiateTestObjects() {
        col = new ColorfulThing(ColorfulThing.Color.RED);
        col2 = new ColorfulThing(ColorfulThing.Color.GREEN);
        col3 = new ColorfulThing(ColorfulThing.Color.YELLOW);
        col4 = new ColorfulThing(ColorfulThing.Color.CYAN);
    }
    @Test
    public void addThingFullArrayTest(){

        ThingContainer thingArr = new ThingContainer(3);
        int count = 0;
        while(count < 4) {
            thingArr.addThing(col);
            count++;
        }
        boolean empT = thingArr.isEmpty();
        assertFalse("result should be false", empT);

    }
    @Test
    public void addThingEmptyArrayTest(){

        ThingContainer thingArr = new ThingContainer(3);
        boolean empT = thingArr.isEmpty();
        assertTrue("result should be true initially", empT);
        thingArr.addThing(col2);
        empT = thingArr.isEmpty();
        assertFalse("result should be false after adding to ThingContainer", empT);
    }

    @Test
    public void popTest(){

        ThingContainer thingArr = new ThingContainer(3);
        thingArr.addThing(col3);
        thingArr.addThing(col4);
        ColorfulThing poppedItem = thingArr.pop();
        assertEquals("the two numbers should be equal: ", poppedItem, col4);
    }

    @Test
    public void removeColorTest(){
        ThingContainer things = new ThingContainer(3);
        things.addThing(col);
        things.addThing(col2);
        ColorfulThing removed = things.remove(ColorfulThing.Color.BLUE);
        System.out.println("removed item: " + removed.toString());
        assertEquals("removed ColorfulThing should be equal to initial ColorfulThing", removed, col2);
    }
    @Test
    public void removeColorfulThingTest(){
        ThingContainer things = new ThingContainer(3);
        things.addThing(col);
        things.addThing(col2);
        ColorfulThing removed = things.remove(col);
        assertEquals("removed ColorfulThing should be equal to initial ColorfulThing", removed, col);
    }
}
