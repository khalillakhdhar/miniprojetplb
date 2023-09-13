package com.demonstration.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demonstration.model.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

}
