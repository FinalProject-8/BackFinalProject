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
@Table(name = "commentary")
public class Commentary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commentary_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "class_id")
    private Class classId;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "instructor_name")
    private String instructorName;

    @Column(name = "instructor_img")
    private String instructorImg;

    @Column(name = "title")
    private String title;

    @Column(name = "overall_video")
    private String overallVideo;

    @Column(name = "video1_link")
    private String video1Link;

    @Column(name = "video2_link")
    private String video2Link;

    @Column(name = "file_path")
    private String filePath;

    @Column(name = "commentary_view")
    private Long views;
}
