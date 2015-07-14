package it.dfalciglia.cookbook.services.repositories;

import it.dfalciglia.cookbook.model.Label;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "label", path = "label")
public interface LabelRepository extends PagingAndSortingRepository<Label, Integer>{
	
}
