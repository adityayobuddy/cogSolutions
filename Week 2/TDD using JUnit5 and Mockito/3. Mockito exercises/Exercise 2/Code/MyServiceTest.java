package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Hello Mock");

        MyService service = new MyService(mockApi);


        String result = service.fetchData();


        assertEquals("Hello Mock", result);
        verify(mockApi).getData();
    }
}
