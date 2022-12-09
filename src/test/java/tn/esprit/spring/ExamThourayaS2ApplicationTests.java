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
import tn.esprit.spring.entities.Train;
import tn.esprit.spring.entities.etatTrain;
import tn.esprit.spring.repository.TrainRepository;

//

@ExtendWith(MockitoExtension.class)
class ExamThourayaS2ApplicationTests {
//
	@Mock
	private TrainRepository trainRepository;
	private TrainServiceImpl trainService;
	void contextLoads() {
	}
	

	Date date = new Date();
	
	@BeforeEach
    void setUp() {
		trainService = new TrainServiceImpl(trainRepository);
    }

	@Test
    void canRetrieveAllTrainsEnGare() {
        // when
		trainService.TrainsEnGare();
        // then
        verify(trainRepository).findAllByetat(etatTrain.en_gare);
    }
	
	 @Test
    void canAddTrain() {
        // given
		 Train v = new Train(etatTrain.en_gare,2);

        // when
        trainService.ajouterTrain(v);

        // then
        ArgumentCaptor<Train> trainArgumentCaptor =
                ArgumentCaptor.forClass(Train.class);
        
        verify(trainRepository).save(trainArgumentCaptor.capture());

        Train capturedtrain = trainArgumentCaptor.getValue();

        assertThat(capturedtrain).isEqualTo(v);
        
        
    }
//
}
