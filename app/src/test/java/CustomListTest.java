import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @Before
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount(); //4
        list.addCity(new City("Halifax","NS"));
        assertEquals(listSize+1,list.getCount());
    }
    /*
    hasCity(City city)
    - When given a city, return whether or not it belongs in the list
    - Test to see whether your method is correct
    */
    @Test
    public void testHasCity(){
        City city = new City("Regina", "Saskatchewan");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }
    /*
delete(City city)
- Check if a city is present in the list. If it does then remove it from the list, if not then throw an exception
- Test to see if your method actually removes it from the list
- Test to see if the exception is actually thrown
*/
    @Test
    public void testDelete(){
        City city = new City("Regina", "Saskatchewan");
        list.addCity(city);
        assertTrue(list.hasCity(city));
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
    }

}
