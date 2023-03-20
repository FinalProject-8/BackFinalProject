package com.example.backfinalpriject.service;

import com.example.backfinalpriject.dto.request.MemberSignupRequest;
import com.example.backfinalpriject.dto.response.MemberLoginResponse;
import com.example.backfinalpriject.entity.Member;
import com.example.backfinalpriject.repository.MemberRepository;
import com.example.backfinalpriject.dto.request.MemberLoginRequest;
import com.example.backfinalpriject.exception.ErrorCode;
import com.example.backfinalpriject.exception.GlobalException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder encoder;

//    public MemberLoginResponse login(MemberLoginRequest request){
//        Member member = memberRepository.findByEmail(request.getEmail()).orElseThrow(()
//                -> new GlobalException(ErrorCode.USER_NOT_FOUND, "해당 아이디가 존재하지 않습니다"));
//        if (!encoder.matches(request.getPassword(), member.getPassword())){
//            throw new GlobalException(ErrorCode.INVALID_PASSWORD, "비밀번호가 일치하지 않습니다");
//        }
//        return MemberLoginResponse.toDto(member);
//    }
//
//    public String signup(MemberSignupRequest request){
//        memberRepository.findByEmail(request.getEmail()).ifPresent(x -> {
//            throw new GlobalException(ErrorCode.DUPLICATED_USER_EMAIL, request.getEmail()+" already exists");
//            });
//        String encryptedPwd = encoder.encode(request.getPassword());
//        memberRepository.save(Member.of(request, encryptedPwd));
//        return "success";
//    }
}