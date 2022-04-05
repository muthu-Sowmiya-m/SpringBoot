package com.SpringBoot.DataTier.Service;

import com.SpringBoot.DataTier.Controller.Topics;
import com.SpringBoot.DataTier.Exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class TopicService
{
//List <Topics> topics = new ArrayList<>(Arrays.asList(
//        new Topics("1","Java","Learning Java"),
//        new Topics("2","Spring","Learn Spring Framework"),
//        new Topics("3","Spring Boot","Learn Spring Boot")));

    @Autowired
    private TopicRepository topicRepository;

    public List<Topics> getAllTopics()
    {
        List <Topics> topics1 = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics1::add);
        return topics1;
    }

    public Topics getTopic(String id)
    {
        Topics topic = topicRepository.findById(id).get();
        return topic;
    }


    public void addTopic(Topics topic)
    {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topics topic)
    {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id)
    {
        topicRepository.deleteById(id);
    }
}
