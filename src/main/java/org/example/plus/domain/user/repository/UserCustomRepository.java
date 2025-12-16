package org.example.plus.domain.user.repository;

import org.example.plus.domain.user.model.request.UserSearchRequest;
import org.example.plus.domain.user.model.response.UserSearchResponse;

import java.util.List;

public interface UserCustomRepository {

    List<UserSearchResponse> searchUserByMultiCondition(UserSearchRequest request);
}
