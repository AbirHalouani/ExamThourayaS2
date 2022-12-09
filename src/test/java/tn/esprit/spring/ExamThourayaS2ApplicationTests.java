package tn.esprit.spring;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
@ExtendWith(MockitoExtension.class)

@MockitoSettings(strictness = Strictness.LENIENT)
@RunWith(SpringRunner.class)
class ExamThourayaS2ApplicationTests {
//
	@Mock
	private TrainRepository trainRepository;
	
	 @InjectMocks
	private TrainServiceImpl trainService;
	

	Date date = new Date();
	
		

	@Test
    void getAllTrainsEnGare() throws Exception{
        // when
		
		//trainService.TrainsEnGare();
        // then
		

        Optional<Train> t = Optional.of(mock(Train.class));
	//	Mockito.when(trainRepository.findAllByetat(etatTrain.en_gare)).thenReturn([new Train(etatTrain.en_gare,3),new Train(etatTrain.en_gare,5)]);
	//	assertNotNull(trainService.AllTrain());
		
		//assertNotNull(t);
       // verify(trainRepository).findAllByetat(etatTrain.en_gare);
    }
	
	 @Test
    void AddTrain()throws Exception {
        // given
		 Train v = new Train(6,etatTrain.en_gare,2);
		 

        // when
		 Mockito.when(trainRepository.save(v)).thenReturn(v);
		//Train v2 =trainService.ajouterTrain(v);
		//assertEquals(v,trainService.ajouterTrain(v));
		//assertTrue(v2 instanceof Train);
		//trainService.ajouterTrain(v);

        // then
        //Optional<Train> actualResult = trainRepository.findById(new Long(6));
       // assertNotNull(v2);
       /* assertThat(actualResult.isPresent()).isTrue();*/
        
        
        
    }
//
}
