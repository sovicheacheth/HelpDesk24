package cs545.proj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cs545.proj.domain.HelpTopic;
import cs545.proj.repository.HelpTopicRepository;
import cs545.proj.service.HelpTopickService;



public class HelptopicServiceImpl  implements HelpTopickService{

	@Autowired
	HelpTopicRepository topicRepo;
	@Override
	public void saveTopic(HelpTopic topic) {
	 topicRepo.save(topic);
		
	}

	@Override
	public List<HelpTopic> getTopickList() {
		return topicRepo.findAll();
	}

	@Override
	public HelpTopic getTopic(int id) {
		return topicRepo.findOne((long)id);
	}


}
