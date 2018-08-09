package com.marcospivetta.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcospivetta.workshopmongo.domain.Post;
import com.marcospivetta.workshopmongo.repository.PostRepository;
import com.marcospivetta.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public Optional<Post> findById(String id) {
		Optional<Post> user = repo.findById(id);
		if ( user == null) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		}
		return user;
	}
}