package com.Springboot.topic;

import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class TopicService
{
List <Topics> topics = Arrays.asList(
        new Topics("1","Java","Learning Java"),
        new Topics("2","Spring","Learn Spring Framework"),
        new Topics("3","Spring Boot","Learn Spring Boot"));

    public List<Topics> getAllTopics()
    {
        return topics;
    }

    public Topics getTopic(String id)
    {
        return topics.stream().filter(t -> t.getid().equals(id)).findFirst().get();
    }


}
