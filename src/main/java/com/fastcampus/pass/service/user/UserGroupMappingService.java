package com.fastcampus.pass.service.user;

import com.fastcampus.pass.repository.user.UserEntity;
import com.fastcampus.pass.repository.user.UserGroupMappingEntity;
import com.fastcampus.pass.repository.user.UserGroupMappingRepository;
import com.fastcampus.pass.repository.user.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserGroupMappingService {
    private final UserGroupMappingRepository userGroupMappingRepository;

    public UserGroupMappingService(UserGroupMappingRepository userGroupMappingRepository) {
        this.userGroupMappingRepository = userGroupMappingRepository;
    }

    public List<String> getAllUserGroupIds() {
        return userGroupMappingRepository.findDistinctUserGroupId();
        //List<UserGroupMappingEntity> userGroupMappingEntities = userGroupMappingRepository.findAllDistinctByUserGroupId();
        //return userGroupMappingEntities.stream().map(UserGroupMappingEntity::getUserGroupId).toList();

    }
}
