package com.fub.springboot.db.wikimedia.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "recent_changes")
@ToString
@Data
public class RecentChange {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String uri;

    @Column(nullable = false)
    private UUID requestId;

    @Column(nullable = false)
    private UUID metaId;

    @Column(nullable = false)
    private LocalDateTime dt;

    @Column(nullable = false)
    private String domain_wiki;

    @Column(nullable = false)
    private String stream;

    @Column(nullable = false)
    private String topic;

    @Column(nullable = false)
    private int partition_wiki;

    @Column(nullable = false)
    private long offset_wiki;


}