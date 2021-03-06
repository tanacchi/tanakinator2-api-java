package com.example.tanakinator2.service;

import com.example.tanakinator2.domain.Choice;
import com.example.tanakinator2.repository.Tanakinator2Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Tanakinator2ServiceImpl implements Tanakinator2Service {
    private static final Logger logger = LoggerFactory.getLogger(Tanakinator2ServiceImpl.class);
    private final Tanakinator2Repository repository;

    public Tanakinator2ServiceImpl(Tanakinator2Repository repository) {
        this.repository = repository;
    }

    @Override
    public Choice getChoice(int choiceId) {
        return repository.getChoice(choiceId);
    }

    @Override
    public List<Choice> getAllChoices() {
        return repository.find(null);
    }
}
