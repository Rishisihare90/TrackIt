package com.manage.TrackIt.repositories;

import com.manage.TrackIt.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
