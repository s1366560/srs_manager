package com.stream.srs.tests;


import com.stream.srs.domain.Comment;
import com.stream.srs.domain.Video;
import com.stream.srs.repository.CommentRepository;
import com.stream.srs.repository.VideoRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentRepositoryTest {


    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private VideoRepository videoRepository;

    @Before
    public void initData(){

        Video v1 = new Video();
        v1.setId(1);
        videoRepository.save(v1);
        List<Comment> comments = new ArrayList<>();
        for(int i =10;i <110 ;i++){
            Comment c = new Comment();
            c.setContent(i + "comment");
            c.setVideoId(v1.getId());
            c.setId(i);
            comments.add(c);
        }

        commentRepository.saveAll(comments);

    }


    @Test
    public void pageTest(){


        Page<Comment> page1 = commentRepository.findByVideoId(1,PageRequest.of(0,10));

        assertEquals(10,page1.getSize());

        assertEquals(10,page1.getTotalPages());

        assertEquals(100,page1.getTotalElements());


    }

}
