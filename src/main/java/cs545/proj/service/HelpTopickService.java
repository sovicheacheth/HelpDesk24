package cs545.proj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cs545.proj.domain.HelpTopic;


@Service
public interface HelpTopickService {

	public void saveTopic(HelpTopic staff);
	public List<HelpTopic> getTopickList();
	public HelpTopic getTopic(int id);
	
}
