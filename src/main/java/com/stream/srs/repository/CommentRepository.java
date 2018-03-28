package com.stream.srs.repository;

import com.stream.srs.domain.Comment;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "comment",path = "comment")
public interface CommentRepository extends PagingAndSortingRepository<Comment, Long> {

    List<Comment> findByVideoId(@Param("videoId") long videoId);
}
