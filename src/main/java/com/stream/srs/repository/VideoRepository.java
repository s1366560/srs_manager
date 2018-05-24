package com.stream.srs.repository;

import com.stream.srs.domain.Comment;
import com.stream.srs.domain.Video;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "video",path = "video")
public interface VideoRepository extends PagingAndSortingRepository<Video, Long> {

    List<Video> findByAuthorId(@Param("authorId") long authorId);
}
