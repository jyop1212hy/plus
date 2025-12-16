package org.example.plus.domain.user.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.example.plus.domain.user.model.request.UserSearchRequest;
import org.example.plus.domain.user.model.response.UserSearchResponse;

import java.util.List;

@RequiredArgsConstructor

public class UserCustomRepositoryImpl implements UserCustomRepository {

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<UserSearchResponse> searchUserByMultiCondition(UserSearchRequest request) {
        return List.of();
    }
}
