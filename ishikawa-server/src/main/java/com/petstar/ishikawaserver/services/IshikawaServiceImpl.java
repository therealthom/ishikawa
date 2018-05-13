package com.petstar.ishikawaserver.services;

import com.petstar.ishikawaserver.domain.Ishikawa;
import com.petstar.ishikawaserver.repositories.IshikawaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IshikawaServiceImpl implements IshikawaService {

    @Autowired
    IshikawaRepository ishikawaRepository;

    @Override
    public Ishikawa findById(Long id) {
        Optional<Ishikawa> ishikawa = ishikawaRepository.findById(id);
        return ishikawa.get();
    }

    @Override
    public List<Ishikawa> findAll() {
        return (List<Ishikawa>) ishikawaRepository.findAll();
    }

    @Override
    public void delete(Ishikawa ishikawa) {
        ishikawaRepository.delete(ishikawa);
    }

    @Override
    public Ishikawa save(Ishikawa ishikawa) {
        Ishikawa i = ishikawaRepository.save(ishikawa);
        return i;
    }
}
