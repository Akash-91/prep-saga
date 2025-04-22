package com.prep_saga.PrepSaga.service.topic;

import com.prep_saga.PrepSaga.entity.topic.Topic;
import com.prep_saga.PrepSaga.repository.TopicRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TopicService {

    private final TopicRepository topicRepository;

    public Optional<Topic> getTopicByTitle(String title) {
        return topicRepository.findByTitle(title);
    }

    public Topic saveTopic(Topic topic) {
        return topicRepository.save(topic);
    }
}
