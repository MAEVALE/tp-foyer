package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Universite;

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

public interface IUniversiteService {

    public List<Universite> retrieveAllUniversites();
    public Universite retrieveUniversite(Long universiteId);
    public Universite addUniversite(Universite f);
    public void removeUniversite(Long universiteId);
    public Universite modifyUniversite(Universite universite);

    // Here we will add later methods calling keywords and methods calling JPQL

}
