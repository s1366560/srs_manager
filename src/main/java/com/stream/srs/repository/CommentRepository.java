package com.stream.srs.repository;

import com.stream.srs.domain.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "comment",path = "comment")
public interface CommentRepository extends PagingAndSortingRepository<Comment, Long> {

    @Query("select c from Comment c where c.videoId =:videoId")
    Page<Comment> findByVideoId(@Param("videoId") long videoId, Pageable page);
}
