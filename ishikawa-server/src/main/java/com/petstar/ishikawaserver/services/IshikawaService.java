package com.petstar.ishikawaserver.services;

import com.petstar.ishikawaserver.domain.Ishikawa;
import java.util.List;

public interface IshikawaService {
    Ishikawa findById(Long id);
    List<Ishikawa> findAll();
    void delete(Ishikawa ishikawa);
    Ishikawa save(Ishikawa ishikawa);
}
