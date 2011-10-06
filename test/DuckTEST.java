import java.io.*;
import java.lang.reflect.*;
import org.junit.*;
import static org.junit.Assert.*;

public class DuckTEST {
    
    Class classDecoyDuck;
    Class classMallardDuck;
    Class classRedHeadDuck;
    Class classRubberDuck;
    Class classModelDuck;

    Method methodDisplayOfClassDuck;
    Method methodFlyOfClassDuck;
    Method methodQuackOfClassDuck;
    Method methodSwimOfClassDuck;
    Method methodUseRocketOfClassDuck;

    @Before
    public void setUp() throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("test\\groupID.txt"));
        String groupID = in.readLine();
        classDecoyDuck = Class.forName("hw02." + groupID + ".DecoyDuck");
        classMallardDuck = Class.forName("hw02." + groupID + ".MallardDuck");
        classRedHeadDuck = Class.forName("hw02." + groupID + ".RedHeadDuck");
        classRubberDuck = Class.forName("hw02." + groupID + ".RubberDuck");
        classModelDuck = Class.forName("hw02." + groupID + ".ModelDuck");
        Class classDuck = Class.forName("hw02." + groupID + ".Duck");
        methodDisplayOfClassDuck = classDuck.getMethod("display");
        methodFlyOfClassDuck = classDuck.getMethod("fly");
        methodQuackOfClassDuck = classDuck.getMethod("quack");
        methodSwimOfClassDuck = classDuck.getMethod("swim");
        methodUseRocketOfClassDuck = classDuck.getMethod("useRocket");
        
        System.out.println("Test for \"" + classDuck.getName() + "\"");
    }

    @Test
    public void testDuckBehavior() throws Exception {
        Object duck;
        
        duck = classDecoyDuck.newInstance();
        assertEquals("I'm a duck Decoy", methodDisplayOfClassDuck.invoke(duck));
        assertEquals("I can't fly", methodFlyOfClassDuck.invoke(duck));
        assertEquals("<< Silence >>", methodQuackOfClassDuck.invoke(duck));
        assertEquals("All ducks float, even decoys!", methodSwimOfClassDuck.invoke(duck));

        duck = classMallardDuck.newInstance();
        assertEquals("I'm a real Mallard duck", methodDisplayOfClassDuck.invoke(duck));
        assertEquals("I'm flying!!", methodFlyOfClassDuck.invoke(duck));
        assertEquals("Quack", methodQuackOfClassDuck.invoke(duck));
        assertEquals("All ducks float, even decoys!", methodSwimOfClassDuck.invoke(duck));
        
        duck = classRedHeadDuck.newInstance();
        assertEquals("I'm a real Red Headed duck", methodDisplayOfClassDuck.invoke(duck));
        assertEquals("I'm flying!!", methodFlyOfClassDuck.invoke(duck));
        assertEquals("Quack", methodQuackOfClassDuck.invoke(duck));
        assertEquals("All ducks float, even decoys!", methodSwimOfClassDuck.invoke(duck));
        
        duck = classRubberDuck.newInstance();
        assertEquals("I'm a rubber duckie", methodDisplayOfClassDuck.invoke(duck));
        assertEquals("I can't fly", methodFlyOfClassDuck.invoke(duck));
        assertEquals("Squeak", methodQuackOfClassDuck.invoke(duck));
        assertEquals("All ducks float, even decoys!", methodSwimOfClassDuck.invoke(duck));
        
        duck = classModelDuck.newInstance();
        assertEquals("I'm a model duck", methodDisplayOfClassDuck.invoke(duck));
        assertEquals("I can't fly", methodFlyOfClassDuck.invoke(duck));
        assertEquals("Quack", methodQuackOfClassDuck.invoke(duck));
        assertEquals("All ducks float, even decoys!", methodSwimOfClassDuck.invoke(duck));
        methodUseRocketOfClassDuck.invoke(duck);
        assertEquals("I'm flying with a rocket", methodFlyOfClassDuck.invoke(duck));
    }

}