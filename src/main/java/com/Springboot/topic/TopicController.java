package com.Springboot.topic;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
class TopicController
{
    @Autowired
    private TopicService topicservice;

    @RequestMapping("/topics")
   List <Topics> getAllTopics()
    {
        return topicservice.getAllTopics();
    }
     @RequestMapping("/topics/{id}")
    public Topics getTopic(@PathVariable String id)
    {
        return topicservice.getTopic(id);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopic()
    {

    }

}
