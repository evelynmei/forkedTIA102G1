package com.tia102g1.member.service;

import com.tia102g1.member.dto.MemberLoginRequest;
import com.tia102g1.member.dto.MemberQueryParams;
import com.tia102g1.member.dto.MemberRegisterRequest;
import com.tia102g1.member.dto.MemberUpdateDto;
import com.tia102g1.member.model.Member;

import java.util.List;


public interface MemberService {
    /**
     * 新增一筆會員資料的方法
     *
     * @param memberRegisterRequest 由前端發送過來的參數
     */
    Integer register(MemberRegisterRequest memberRegisterRequest);

    /**
     * 會員登入的方法
     *
     * @param memberLoginRequest 會員登入的帳密
     * @return 返回登入的帳號
     */
    Member login(MemberLoginRequest memberLoginRequest);

    /**
     * 藉由會員ID查詢會員的方法
     *
     * @param memberId 要查詢的會員ID
     * @return 返回該會員的相關資料
     */
    Member getMemberById(Integer memberId);

    /**
     * 查詢所有會員的方法
     *
     * @return 返回一個包含所有會員的List
     */
    List<Member> getAll(MemberQueryParams memberQueryParams);

    /**
     * 查詢所有黑名單的方法
     *
     * @param memberQueryParams 查詢條件
     * @return 返回一個包含所有黑名單的list
     */
    List<Member> getBlockedList(MemberQueryParams memberQueryParams);

    /**
     * 更新某會員ID地址的方法
     */
    Integer updateMember(Integer memberId, MemberUpdateDto memberUpdateDto);

    /**
     * 刪除某會員ID的方法
     *
     * @param memberId 要刪除的會員ID
     */
    Integer deleteMemberById(Integer memberId);

    /**
     * 查詢會員總數(分頁)
     *
     * @param memberQueryParams 要查詢的會員參數
     * @return 返回查詢條件下的會員總數
     */
    Integer countMember(MemberQueryParams memberQueryParams);

    /**
     * 查詢黑名單的總數(分頁)
     * @param memberQueryParams  要查詢的黑名單參數
     * @return 返回查詢條件下的黑名單總數
     */
    Integer countBlockedMember(MemberQueryParams memberQueryParams);

    /**
     * 解除某會員的黑名單
     * @param memberId 要解除的會員ID
     * @return 解除的會員ID
     */
    Integer unblockMember(Integer memberId);
}
