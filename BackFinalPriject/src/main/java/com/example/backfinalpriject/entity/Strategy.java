package com.example.backfinalpriject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "strategy")
public class Strategy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "strategy_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "class_id")
    private Class classId;

    @Column(name = "lecture_name")
    private String lectureName;

    @Column(name = "instructor_name")
    private String instructorName;

    @Column(name = "created_date")
    private LocalDateTime createdDate = LocalDateTime.now();

    @Column(name = "strategy_views")
    private Long views;

    @Column(name = "download_count")
    private Long downloadCount;

    @Column(name = "content", columnDefinition = "TEXT")
    private String content;

    @Column(name = "video_link")
    private String videoLink;

    @Column(name = "video_img")
    private String videoImg;

}
