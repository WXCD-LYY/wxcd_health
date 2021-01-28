package com.itheima.service;

import com.itheima.pojo.Member;

import java.util.List;

/**
 * @Company: CUG
 * @Description: TODO
 * @Author: LiYangyong
 * @Date: 2021/1/26/026 12:51
 **/
public interface MemberService {
    // 根据手机号查询会员
    public Member findByTelephone(String telephone);

    public void add(Member member);

    public List<Integer> findMemberCountByMonths(List<String> months);
}
