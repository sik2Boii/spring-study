package com.example.springstudy.member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long id);

}
