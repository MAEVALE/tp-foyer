package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Foyer;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    @Mock
    private DependencyService dependencyService;

    @InjectMocks
    private MyService myService;

    public MyServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testServiceMethod() {
        when(dependencyService.someMethod()).thenReturn("mocked result");

        String result = myService.serviceMethod();

        assertEquals("mocked result", result);
    }
}

public interface IFoyerService {

    public List<Foyer> retrieveAllFoyers();
    public Foyer retrieveFoyer(Long foyerId);
    public Foyer addFoyer(Foyer f);
    public void removeFoyer(Long foyerId);
    public Foyer modifyFoyer(Foyer foyer);

    // Here we will add later methods calling keywords and methods calling JPQL

}
