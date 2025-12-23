package com.codenuts.accounts.entity;

import io.micrometer.common.util.StringUtils;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@MappedSuperclass //The @MappedSuperclass annotation in Java Persistence API (JPA) is used to designate a class whose mapping information is applied to the entity subclasses that inherit from it. It allows you to reuse common fields and mapping logic without the superclass itself being a persistent entity or having its own table in the database.
@Getter
@Setter
@ToString
public class BaseEntity {

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @CreatedBy
    @Column(updatable = false)
    private String createdBy;

    @LastModifiedDate
    @Column(insertable = false)
    private LocalDateTime updatedAt;

    @LastModifiedBy
    @Column(insertable = false)
    private String updatedBy;

    @PrePersist
    public void save(){
         setCreatedAt(LocalDateTime.now());
         if(StringUtils.isBlank(getCreatedBy())){
             setCreatedBy("Anonymous");
         }

    }

    @PreUpdate
    public void update(){
        setUpdatedAt(LocalDateTime.now());
        if(StringUtils.isBlank(getUpdatedBy())){
            setUpdatedBy("Anonymous");
        }
    }

}