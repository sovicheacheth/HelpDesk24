package cs545.proj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cs545.proj.domain.TicketProgress;



@Service
public interface TicketProgressService {

	public void saveProgress(TicketProgress progress);
	public List<TicketProgress> getProgressList();
	public TicketProgress getProgressTicketId(int id);
	public TicketProgress getProgressByStaffId(String name);
}
