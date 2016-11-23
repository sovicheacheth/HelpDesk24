package cs545.proj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cs545.proj.domain.Status;
import cs545.proj.domain.TicketProgress;
import cs545.proj.repository.TicketProgressRepository;
import cs545.proj.service.TicketProgressService;

@Service

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
		return progressRepo.findOne(id);
	}

	@Override
	//we should implement @query here !!!!!!!
	public TicketProgress getProgressByStaffId(String name) {
		
		return null;
	}

	@Override
	public List<Status> getTicketStatus(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
