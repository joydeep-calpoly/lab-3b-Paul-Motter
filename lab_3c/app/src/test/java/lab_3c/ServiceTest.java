package lab_3c;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito.Then;

public class ServiceTest{
    
    @Test
    public void getDatabaseIDTest(){
        Database dbMock = mock(Database.class);
        when(dbMock.getUniqueId()).thenReturn(4);
        Service serv = new Service(dbMock);
        String result = serv.getDatabaseID();
        String expected = "Using database with id: 4";
        assertEquals(expected, result);
    }



}
