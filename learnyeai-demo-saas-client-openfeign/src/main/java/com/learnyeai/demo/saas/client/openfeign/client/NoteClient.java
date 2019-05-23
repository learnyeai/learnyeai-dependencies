package com.learnyeai.demo.saas.client.openfeign.client;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.learnyeai.demo.saasclient.resource.NoteResource;

@Component
@FeignClient(name = "learnyeaidemo-saas-client")
@RequestMapping("/notes")
public interface NoteClient {

	@RequestMapping(method = RequestMethod.GET, value = "/search")
	ResponseEntity<PagedResources<NoteResource>> findAll(Pageable pageable);

	@RequestMapping(method = RequestMethod.GET)
	ResponseEntity<PagedResources<NoteResource>> findAll();

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	ResponseEntity<NoteResource> findById(@PathVariable String id);

	@RequestMapping(method = RequestMethod.POST)
	ResponseEntity<NoteResource> create(@RequestBody NoteDetails note);

	@RequestMapping(method = RequestMethod.PUT)
	ResponseEntity<NoteResource> put(@PathVariable String id, @RequestBody NoteDetails note);

	@RequestMapping(method = RequestMethod.PATCH)
	ResponseEntity<NoteResource> patch(@PathVariable String id, @RequestBody NoteDetails note);

	boolean destroy(@PathVariable String id);
}
