package com.examen.ids.service;

import com.examen.ids.model.Language;
import com.examen.ids.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LanguageServiceImpl implements  LanguageService{

    @Autowired
    LanguageRepository languageRepository;

    @Override
    public Language findById(int id) {
        return (Language) languageRepository.findById(id).get();
    }

    @Override
    public List<Language> findAll() {
        return languageRepository.findAll();
    }

    @Override
    public void delete(Language language) {
        languageRepository.delete(language);
    }

    @Override
    public void update(Language language) {
        try{
            Language language1=languageRepository.findById(language.getIdLanguage()).get();
            language1.setName(language.getName());
            language1.setCode(language.getCode());

            languageRepository.save(language);
        }catch (NullPointerException ex){
            System.out.println("Error en update language");
        }

    }

    @Override
    public Language save(Language language) {
        return languageRepository.save(language);
    }
}
