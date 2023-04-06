package com.example.backfinalpriject.admin.commentary.service;

import com.example.backfinalpriject.admin.commentary.dto.CommentaryRequest;
import com.example.backfinalpriject.admin.commentary.dto.CommentaryResponse;
import com.example.backfinalpriject.admin.commentary.dto.VideoUrlRequest;
import com.example.backfinalpriject.admin.commentary.entity.Commentary;
import com.example.backfinalpriject.admin.commentary.entity.CommentaryFile;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CommentaryService {
    Long create(CommentaryRequest request, MultipartFile instructorImg, MultipartFile file, List<VideoUrlRequest> videoUrlRequest) throws Exception;

    // 비디오 업로드
    void uploadCommentaryVideos(Commentary commentary, List<VideoUrlRequest> videos);

    CommentaryResponse getCommentaryDetail(Long id);

    //이미지 저장
    Long saveImg(MultipartFile imageFile, Commentary commentary) throws Exception;

    //이미지 조회
    byte[] getImage(Commentary commentary) throws Exception;

    CommentaryFile getFile(Long id);
}
