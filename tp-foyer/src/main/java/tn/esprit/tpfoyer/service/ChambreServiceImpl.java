package tn.esprit.tpfoyer.service;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.entity.TypeChambre;
import tn.esprit.tpfoyer.repository.ChambreRepository;

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


@Service
@AllArgsConstructor
@Slf4j
public class ChambreServiceImpl implements IChambreService {

    ChambreRepository chambreRepository;

    public List<Chambre> retrieveAllChambres() {
        log.info("In Methodo retrieveAllChambres : ");
        List<Chambre> listC = chambreRepository.findAll();
        log.info("Out of retrieveAllChambres : ");

        return listC;
    }

    public Chambre retrieveChambre(Long chambreId) {
        Chambre c = chambreRepository.findById(chambreId).get();
        return c;
    }

    public Chambre addChambre(Chambre c) {
        Chambre chambre = chambreRepository.save(c);
        return chambre;
    }

    public Chambre modifyChambre(Chambre c) {
        Chambre chambre = chambreRepository.save(c);
        return c;
    }

    public void removeChambre(Long chambreId) {
        chambreRepository.deleteById(chambreId);
    }







    public List<Chambre> recupererChambresSelonTyp(TypeChambre tc)
    {
        return chambreRepository.findAllByTypeC(tc);
    }






















    public Chambre trouverchambreSelonEtudiant(long cin) {
       //

        return chambreRepository.trouverChselonEt(cin);
    }
}
