package com.example.mungchi1.Repository;

import com.example.mungchi1.Entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfoEntity, Long> {
    UserInfoEntity findByUserId(String userId);
}
