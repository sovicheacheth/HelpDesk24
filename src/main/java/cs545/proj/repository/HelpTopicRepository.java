package cs545.proj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cs545.proj.domain.HelpTopic;


@Repository
public interface HelpTopicRepository extends JpaRepository<HelpTopic, Long>{

}
