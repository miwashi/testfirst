package net.miwashi.testfirst;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

public class CollectionTest {

    private Collection<String> aCollection;

    @Before
    public void setUp(){
        aCollection = new ArrayList();
        aCollection.add("Hej1");
        aCollection.add("Hej2");
        aCollection.add("Hej3");
        aCollection.add("Hej4");
    }

    @Test
    public void shouldAddItems() throws Exception {
        final int numberOfObjectsBeforeAdding = aCollection.size();
        aCollection.add("Hej5");
        assertEquals(numberOfObjectsBeforeAdding + 1, aCollection.size());
    }

    @Test
    public void shouldRemoveItems() throws Exception {
        final String testItem = "Hej5";
        aCollection.add(testItem);
        final int numberOfObjectsBeforeAdding = aCollection.size();
        aCollection.remove(testItem);
        assertEquals(numberOfObjectsBeforeAdding - 1, aCollection.size());
    }

    private void printCollection(Collection<String> aCollection){
        for(String aString : aCollection){
            System.out.println(aString);
        }
    }

}
