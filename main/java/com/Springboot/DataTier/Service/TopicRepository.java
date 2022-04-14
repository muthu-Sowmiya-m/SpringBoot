package com.SpringBoot.DataTier.Service;

import com.SpringBoot.DataTier.Controller.Topics;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topics,String>
{

}
