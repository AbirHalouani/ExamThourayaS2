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
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.test.context.junit4.SpringRunner;



import org.junit.jupiter.api.Assertions;



import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(SpringRunner.class)
@Slf4j
@ExtendWith(MockitoExtension.class)

@MockitoSettings(strictness = Strictness.LENIENT)
class ExamThourayaS2ApplicationTests {
//
	@Mock
	private TrainRepository trainRepository;
	 @InjectMocks
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
