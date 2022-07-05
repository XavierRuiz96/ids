package com.examen.ids.service;

import com.examen.ids.model.Language;

import java.util.List;

public interface LanguageService {
    Language findById(int id);
    List<Language> findAll();
    void delete(Language language);
    void update(Language language);
    Language save(Language language);
}
