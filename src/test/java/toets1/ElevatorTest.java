package toets1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ElevatorTest {

    @Test
    void testRoomBadge(){
        Elevator elevator = new Elevator("405", 0);
        assertArrayEquals(new Integer[]{4, 10}, elevator.activeButtons());
    }

    @Test
    void testPersonelBadge(){
        Elevator elevator = new Elevator("p", -1);
        assertArrayEquals(new Integer[]{-2,0,1,2,3,4,5,6,7,8,9,10}, elevator.activeButtons());
    }
}
