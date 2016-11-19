package cs545.proj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cs545.proj.domain.TicketProgress;
import cs545.proj.repository.TicketProgressRepository;
import cs545.proj.service.TicketProgressService;



public class progressServiceImpl  implements TicketProgressService{

	@Autowired
	TicketProgressRepository progressRepo;
	@Override
	public void saveProgress(TicketProgress progress) {
		progressRepo.save(progress);
		
	}

	@Override
	public List<TicketProgress> getProgressList() {
		return progressRepo.findAll();
	}

	@Override
	public TicketProgress getProgressTicketId(int id) {
		return progressRepo.findOne((long)id);
	}

	@Override
	//we should implement @query here !!!!!!!
	public TicketProgress getProgressByStaffId(String name) {
		
		return null;
	}

}
