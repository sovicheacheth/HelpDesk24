package cs545.proj.service;

import java.util.List;
import cs545.proj.domain.HelpTopic;


public interface HelpTopickService {

	public void saveTopic(HelpTopic staff);
	public List<HelpTopic> getTopickList();
	public HelpTopic getTopic(int id);
	public void deleteTopic(HelpTopic topic);
}
