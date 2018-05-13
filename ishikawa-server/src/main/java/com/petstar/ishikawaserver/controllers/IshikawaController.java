package com.petstar.ishikawaserver.controllers;

import com.petstar.ishikawaserver.domain.Ishikawa;
import com.petstar.ishikawaserver.services.IshikawaService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
public class IshikawaController {

    @Autowired
    IshikawaService ishikawaService;

    @RequestMapping(method=RequestMethod.GET, value="/ishikawa")
    public Iterable<Ishikawa> ishikawa() {
        return ishikawaService.findAll();
    }

    @RequestMapping(method=RequestMethod.POST, value="/ishikawa")
    public Ishikawa save(@RequestBody Ishikawa ishikawa) {
        ishikawaService.save(ishikawa);
        return ishikawa;
    }

    @RequestMapping(method=RequestMethod.GET, value="/ishikawa/{id}")
    public Ishikawa show(@PathVariable Long id) {
        return ishikawaService.findById(id);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/ishikawa/{id}")
    public Ishikawa update(@PathVariable Long id, @RequestBody Ishikawa ishikawa) {
        Ishikawa i = ishikawaService.findById(id);
        if(ishikawa.getQue() != null)
            i.setQue(ishikawa.getQue());
        if(ishikawa.getComo() != null)
            i.setComo(ishikawa.getComo());
        if(ishikawa.getCuando() != null)
            i.setCuando(ishikawa.getCuando());
        if(ishikawa.getDonde() != null)
            i.setDonde(ishikawa.getDonde());
        if(ishikawa.getDefinicionDelProblema() != null)
            i.setDefinicionDelProblema(ishikawa.getDefinicionDelProblema());
        if(ishikawa.getFechaDeAnalisis() != null)
            i.setFechaDeAnalisis(ishikawa.getFechaDeAnalisis());
        if(ishikawa.getNombreEtad() != null)
            i.setNombreEtad(ishikawa.getNombreEtad());
        ishikawaService.save(i);
        return ishikawa;
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/ishikawa/{id}")
    public String delete(@PathVariable Long id) {
        Ishikawa ishikawa = ishikawaService.findById(id);
        ishikawaService.delete(ishikawa);
        return "";
    }
}
