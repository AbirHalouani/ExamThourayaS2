package tn.esprit.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Train;
import tn.esprit.spring.entities.Voyage;
import tn.esprit.spring.repository.TrainRepository;
import tn.esprit.spring.repository.VoyageRepository;

import java.util.List;
import java.util.Optional;

@Service
public class VoyageServiceImpl implements IVoyageService {
    @Autowired
    VoyageRepository voyageRepository;
    @Autowired
    TrainRepository trainRepository;
    
    public VoyageServiceImpl(VoyageRepository repository){}
    @Override
    public void ajouterVoyage(Voyage v) {
        voyageRepository.save(v);
    }

    @Override
    public void modifierVoyage(Voyage v) {
		voyageRepository.save(v);
    }


    public void affecterTrainAVoyage(Long idTrain, Long idVoyage) {
       Optional<Train> t1 =  trainRepository.findById(idTrain);
       Optional<Voyage> v1 =  voyageRepository.findById(idVoyage);
       if(t1.isPresent() && v1.isPresent())
        {Train t =t1.get();
        Voyage v = v1.get();
        v.setTrain(t);
        voyageRepository.save(v);}
    }

    @Override
    public List<Voyage> recupererAll() {
        List<Voyage> list = (List<Voyage>) voyageRepository.findAll();
        return list;
    }

    @Override
    public Voyage recupererVoyageParId(long idVoyage) {
        Voyage v = voyageRepository.findById(idVoyage).orElse(null);
        return v;
    }

    @Override
    public void supprimerVoyage(Voyage v) {
        //TODO method
    }

}
