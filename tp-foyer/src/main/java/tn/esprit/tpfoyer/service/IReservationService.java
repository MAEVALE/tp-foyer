package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Reservation;

import java.util.Date;
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

public interface IReservationService {

    public List<Reservation> retrieveAllReservations();
    public Reservation retrieveReservation(String reservationId);
    public Reservation addReservation(Reservation r);
    public void removeReservation(String reservationId);
    public Reservation modifyReservation(Reservation reservation);

    // Here we will add later methods calling keywords and methods calling JPQL
    public List<Reservation> trouverResSelonDateEtStatus(Date d, boolean b);
}
