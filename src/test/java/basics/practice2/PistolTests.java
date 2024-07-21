package basics.practice2;

import oop.work2.Pistol;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PistolTests {
    static Pistol pistol;
    private int maxAmmosAmmount=10;
    private int maxAmmoCapacity=15;
    @BeforeAll
    static void setup(){
         pistol = new Pistol();
    }
    @Test
    public void pistolHasAmmo(){
Assertions.assertNotNull(pistol.getCurrentAmmo(), "В пистолете нет обоймы");

    }
    @Test
    public void pistolHasDefaultAmmosAmount(){
        assertEquals(maxAmmosAmmount, pistol.getAmmosCount(),
                STR."ожидаемое количество магазинов\{maxAmmosAmmount}не совпадает с инициализированным изначально \{pistol.getAmmosCount()}");
    }
    @Test
    public void pistolAmmoMaxCapacityHasAmmount(){
        assertEquals(maxAmmoCapacity, pistol.getCurrentAmmo().getShots());
    }

}
