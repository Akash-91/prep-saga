package com.prep_saga.PrepSaga.controller.topic;
// com.prepsaga.controller.TopicController.java
import com.prep_saga.PrepSaga.entity.topic.Topic;
import com.prep_saga.PrepSaga.service.topic.TopicService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/topics")
@RequiredArgsConstructor
public class TopicController {

    private final TopicService topicService;

    @GetMapping("/{title}")
    public ResponseEntity<?> getTopic(@PathVariable String title) {
        return topicService.getTopicByTitle(title)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Topic> saveTopic(@RequestBody Topic topic) {
        return ResponseEntity.ok(topicService.saveTopic(topic));
    }
}
