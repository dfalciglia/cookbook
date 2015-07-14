package it.dfalciglia.cookbook.services.repositories;

import it.dfalciglia.cookbook.model.Recipe;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RecipeRepository extends PagingAndSortingRepository<Recipe, Integer>{
	
}
