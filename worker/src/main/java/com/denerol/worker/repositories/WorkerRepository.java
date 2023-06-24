package com.denerol.worker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.denerol.worker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
