package com.stream.srs.controller;

import com.stream.srs.domain.Comment;
import com.stream.srs.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentRepository commentRepository;

    @GetMapping("/getByVideoId")
    public Page<Comment> getByVideoId(long videoId,int pageIndex,int pageSize){

        return commentRepository.findByVideoId(videoId,PageRequest.of(pageIndex,pageSize));
    }

}
