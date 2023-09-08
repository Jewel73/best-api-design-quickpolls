package com.jewel.poll.controller;

import com.jewel.poll.persistence.entity.Poll;
import com.jewel.poll.persistence.repository.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
public class PollController {

    @Autowired
    private PollRepository pollRepository;

    @GetMapping("/polls")
    public ResponseEntity<Iterable<Poll>> getAllPolls(){
        Iterable<Poll> polls = pollRepository.findAll();
        return  new ResponseEntity<>(polls, HttpStatus.OK);
    }

    @PostMapping("/polls")
    public ResponseEntity<?> createPoll(@RequestBody Poll poll){
        poll = pollRepository.save(poll);
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setLocation(getURILocation(poll.getId()));
        return new ResponseEntity<>(poll, responseHeaders, HttpStatus.CREATED);
    }


    public URI getURILocation(Long id){
        return ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(id)
                .toUri();
    }
}
