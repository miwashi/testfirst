package net.miwashi.testfirst;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class HashMapTest {

    Map<String, Animal> aMap;

    @Before
    public void setUp(){
        aMap = new HashMap();
        aMap.put("Missan", new Animal());
        aMap.put("Majsan", new Animal());
        aMap.put("Plutten", new Animal());
        aMap.put("King", new Animal());
    }

    @Test
    public void shouldAddItems() throws Exception {
        int numberOfItemsBeforeAdd = aMap.size();
        aMap.put("Queen", new Animal());
        assertTrue(numberOfItemsBeforeAdd < aMap.size());
    }

    @Test
    public void shouldRemoveItems() throws Exception {
        String key = "Queen";
        aMap.put(key, new Animal());
        int numberOfItemsBeforeRemove = aMap.size();
        aMap.remove(key);
        assertTrue(numberOfItemsBeforeRemove > aMap.size());
    }

    private void printHashMap(Map<String, Animal> aMap){
        for(String key : aMap.keySet()){
            System.out.print(key);
            System.out.print("->");
            System.out.println(aMap.get(key));
        }

        for(Animal entry : aMap.values()){
            System.out.println(entry);
        }
    }


}
