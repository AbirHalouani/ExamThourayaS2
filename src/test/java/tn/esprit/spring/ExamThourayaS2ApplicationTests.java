package tn.esprit.spring;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.services.*;
import tn.esprit.spring.entities.Voyage;
import tn.esprit.spring.repository.VoyageRepository;

import tn.esprit.spring.services.VoyageServiceImpl;
//

@ExtendWith(MockitoExtension.class)
class ExamThourayaS2ApplicationTests {
//
	@Mock
	private VoyageRepository voyageRepository;
	private VoyageServiceImpl VoyageService;
	void contextLoads() {
	}
	

	Date date = new Date();
	
	@BeforeEach
    void setUp() {
		VoyageService = new VoyageServiceImpl(voyageRepository);
    }

	@Test
    void canRetrieveAllFactures() {
        // when
		VoyageService.recupererAll();
        // then
        verify(voyageRepository).findAll();
    }
	
	 @Test
    void canAddFacture() {
        // given
		 Voyage v = new Voyage();

        // when
        VoyageService.ajouterVoyage(v);

        // then
        ArgumentCaptor<Voyage> voyageArgumentCaptor =
                ArgumentCaptor.forClass(Voyage.class);
        
        verify(voyageRepository).save(voyageArgumentCaptor.capture());

        Voyage capturedvoyage = voyageArgumentCaptor.getValue();

        assertThat(capturedvoyage).isEqualTo(v);
        
        
    }
//
}
