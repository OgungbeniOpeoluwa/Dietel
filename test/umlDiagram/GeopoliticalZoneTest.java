package umlDiagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeopoliticalZoneTest {
    @Test
    public void getGeographicalZone(){
        String state = "Kaduna";
        GeopoliticalZone numb = GeopoliticalZone.NORTHWEST;
        assertSame(numb,GeopoliticalZone.getGeogrphicalZone(state));
    }
    @Test
    public void getAnotherGeographicalZone(){
        String state = "EKITI";
        GeopoliticalZone numb = GeopoliticalZone.SOUTHWEST;
        assertSame(numb,GeopoliticalZone.getGeogrphicalZone(state));
    }

}