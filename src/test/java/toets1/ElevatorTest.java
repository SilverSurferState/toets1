package toets1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ElevatorTest {

    @Test
    void testRoomBadge(){
        Elevator elevator = new Elevator("405", 0);
        assertArrayEquals(new Integer[]{4, 10}, elevator.activeButtons());
    }
}
